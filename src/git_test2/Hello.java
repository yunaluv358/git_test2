package git_test2;

public class Hello {

    String message;

    public Hello() {
        this("�ȳ��ϼ���");
    }

    public Hello(String message) {
        this.message = message;
    }

    public void say() {
        System.out.println(message);
    }

}
