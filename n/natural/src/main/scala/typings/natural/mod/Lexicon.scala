package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lexicon extends StObject {
  
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
  implicit class LexiconMutableBuilder[Self <: Lexicon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultCategory(value: String): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseLexicon(value: String => Unit): Self = StObject.set(x, "parseLexicon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTagWord(value: String => js.Array[String]): Self = StObject.set(x, "tagWord", js.Any.fromFunction1(value))
  }
}
