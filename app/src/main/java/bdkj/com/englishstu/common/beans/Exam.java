package bdkj.com.englishstu.common.beans;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Unique;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by davidinchina on 2017/5/25.
 * 试题
 */
@Entity(indexes = {@Index(value = "updateDate DESC", unique = true)})
public class Exam {
    @Id
    @NotNull
    @Unique
    private String id;

    @NotNull
    private String name;
    private String logo;
    private String level;//试题难度
    private String type;//练习或者考试
    private String about;//试题内容类别
    private String classId;
    private String img;
    private String words;//一个或多个单词
    private String sentence;//句子
    private Date updateDate;
    private Date createDate;
    @Generated(hash = 1551818047)
    public Exam(@NotNull String id, @NotNull String name, String logo, String level,
            String type, String about, String classId, String img, String words,
            String sentence, Date updateDate, Date createDate) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.level = level;
        this.type = type;
        this.about = about;
        this.classId = classId;
        this.img = img;
        this.words = words;
        this.sentence = sentence;
        this.updateDate = updateDate;
        this.createDate = createDate;
    }
    @Generated(hash = 945526930)
    public Exam() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLogo() {
        return this.logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    public String getLevel() {
        return this.level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getAbout() {
        return this.about;
    }
    public void setAbout(String about) {
        this.about = about;
    }
    public String getClassId() {
        return this.classId;
    }
    public void setClassId(String classId) {
        this.classId = classId;
    }
    public String getImg() {
        return this.img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public String getWords() {
        return this.words;
    }
    public void setWords(String words) {
        this.words = words;
    }
    public String getSentence() {
        return this.sentence;
    }
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
    public Date getUpdateDate() {
        return this.updateDate;
    }
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    public Date getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}