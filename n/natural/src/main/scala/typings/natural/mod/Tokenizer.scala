package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tokenizer extends StObject {
  
  def tokenize(text: String): js.Array[String]
}
object Tokenizer {
  
  inline def apply(tokenize: String => js.Array[String]): Tokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[Tokenizer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tokenizer] (val x: Self) extends AnyVal {
    
    inline def setTokenize(value: String => js.Array[String]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
  }
}
