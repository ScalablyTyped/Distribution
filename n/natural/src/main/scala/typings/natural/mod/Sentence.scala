package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sentence extends StObject {
  
  def addTaggedWord(token: String, tag: String): Unit
  
  var taggedWords: js.Array[TaggedWord]
}
object Sentence {
  
  inline def apply(addTaggedWord: (String, String) => Unit, taggedWords: js.Array[TaggedWord]): Sentence = {
    val __obj = js.Dynamic.literal(addTaggedWord = js.Any.fromFunction2(addTaggedWord), taggedWords = taggedWords.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sentence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sentence] (val x: Self) extends AnyVal {
    
    inline def setAddTaggedWord(value: (String, String) => Unit): Self = StObject.set(x, "addTaggedWord", js.Any.fromFunction2(value))
    
    inline def setTaggedWords(value: js.Array[TaggedWord]): Self = StObject.set(x, "taggedWords", value.asInstanceOf[js.Any])
    
    inline def setTaggedWordsVarargs(value: TaggedWord*): Self = StObject.set(x, "taggedWords", js.Array(value*))
  }
}
