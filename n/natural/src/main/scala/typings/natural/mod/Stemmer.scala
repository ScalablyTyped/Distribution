package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stemmer extends StObject {
  
  def attach(): Unit
  
  def removeStopWords(moreStopWords: js.Array[String]): Unit
  
  def stem(token: String): String
  
  def tokenizeAndStem(text: String): js.Array[String]
}
object Stemmer {
  
  inline def apply(
    attach: () => Unit,
    removeStopWords: js.Array[String] => Unit,
    stem: String => String,
    tokenizeAndStem: String => js.Array[String]
  ): Stemmer = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), removeStopWords = js.Any.fromFunction1(removeStopWords), stem = js.Any.fromFunction1(stem), tokenizeAndStem = js.Any.fromFunction1(tokenizeAndStem))
    __obj.asInstanceOf[Stemmer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stemmer] (val x: Self) extends AnyVal {
    
    inline def setAttach(value: () => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction0(value))
    
    inline def setRemoveStopWords(value: js.Array[String] => Unit): Self = StObject.set(x, "removeStopWords", js.Any.fromFunction1(value))
    
    inline def setStem(value: String => String): Self = StObject.set(x, "stem", js.Any.fromFunction1(value))
    
    inline def setTokenizeAndStem(value: String => js.Array[String]): Self = StObject.set(x, "tokenizeAndStem", js.Any.fromFunction1(value))
  }
}
