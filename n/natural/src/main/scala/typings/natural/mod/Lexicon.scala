package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lexicon extends js.Object {
  var defaultCategory: String = js.native
  def parseLexicon(data: String): Unit = js.native
  def tagWord(word: String): js.Array[String] = js.native
}

object Lexicon {
  @scala.inline
  def apply(defaultCategory: String, parseLexicon: String => Unit, tagWord: String => js.Array[String]): Lexicon = {
    val __obj = js.Dynamic.literal(defaultCategory = defaultCategory.asInstanceOf[js.Any], parseLexicon = js.Any.fromFunction1(parseLexicon), tagWord = js.Any.fromFunction1(tagWord))
    __obj.asInstanceOf[Lexicon]
  }
  @scala.inline
  implicit class LexiconOps[Self <: Lexicon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultCategory(value: String): Self = this.set("defaultCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseLexicon(value: String => Unit): Self = this.set("parseLexicon", js.Any.fromFunction1(value))
    @scala.inline
    def setTagWord(value: String => js.Array[String]): Self = this.set("tagWord", js.Any.fromFunction1(value))
  }
  
}

