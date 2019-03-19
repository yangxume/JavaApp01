package study_string;

public class String01BaseUse {

    public static void main(String [] args){

        test01();


    }

    private static void test01() {
        String abc = "abc";
        System.out.println(abc);

        String cde = "cde";
        System.out.println(abc+cde);

        char [] chars = {'e','f','g'};
        System.out.println(new String(chars));

        String c = abc.substring(2,3);
        System.out.println(c);

        String d = cde.substring(1, 2);
        System.out.println(d);
    }


}
