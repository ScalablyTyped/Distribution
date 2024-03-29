package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lexicon extends StObject {
  
  var defaultCategory: String
  
  def parseLexicon(data: String): Unit
  
  def tagWord(word: String): js.Array[String]
}
object Lexicon {
  
  inline def apply(defaultCategory: String, parseLexicon: String => Unit, tagWord: String => js.Array[String]): Lexicon = {
    val __obj = js.Dynamic.literal(defaultCategory = defaultCategory.asInstanceOf[js.Any], parseLexicon = js.Any.fromFunction1(parseLexicon), tagWord = js.Any.fromFunction1(tagWord))
    __obj.asInstanceOf[Lexicon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lexicon] (val x: Self) extends AnyVal {
    
    inline def setDefaultCategory(value: String): Self = StObject.set(x, "defaultCategory", value.asInstanceOf[js.Any])
    
    inline def setParseLexicon(value: String => Unit): Self = StObject.set(x, "parseLexicon", js.Any.fromFunction1(value))
    
    inline def setTagWord(value: String => js.Array[String]): Self = StObject.set(x, "tagWord", js.Any.fromFunction1(value))
  }
}
