package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lexicon extends js.Object {
  var defaultCategory: String
  def parseLexicon(data: String): Unit
  def tagWord(word: String): js.Array[String]
}

object Lexicon {
  @scala.inline
  def apply(defaultCategory: String, parseLexicon: String => Unit, tagWord: String => js.Array[String]): Lexicon = {
    val __obj = js.Dynamic.literal(defaultCategory = defaultCategory.asInstanceOf[js.Any], parseLexicon = js.Any.fromFunction1(parseLexicon), tagWord = js.Any.fromFunction1(tagWord))
  
    __obj.asInstanceOf[Lexicon]
  }
}

