package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stemmer extends StObject {
  
  def attach(): Unit
  
  def stem(token: String): String
  
  def tokenizeAndStem(text: String): js.Array[String]
}
object Stemmer {
  
  @scala.inline
  def apply(attach: () => Unit, stem: String => String, tokenizeAndStem: String => js.Array[String]): Stemmer = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), stem = js.Any.fromFunction1(stem), tokenizeAndStem = js.Any.fromFunction1(tokenizeAndStem))
    __obj.asInstanceOf[Stemmer]
  }
  
  @scala.inline
  implicit class StemmerMutableBuilder[Self <: Stemmer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttach(value: () => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStem(value: String => String): Self = StObject.set(x, "stem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTokenizeAndStem(value: String => js.Array[String]): Self = StObject.set(x, "tokenizeAndStem", js.Any.fromFunction1(value))
  }
}
