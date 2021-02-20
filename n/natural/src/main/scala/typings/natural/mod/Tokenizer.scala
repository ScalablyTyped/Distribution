package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tokenizer extends StObject {
  
  def tokenize(text: String): js.Array[String] = js.native
}
object Tokenizer {
  
  @scala.inline
  def apply(tokenize: String => js.Array[String]): Tokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[Tokenizer]
  }
  
  @scala.inline
  implicit class TokenizerMutableBuilder[Self <: Tokenizer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTokenize(value: String => js.Array[String]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
  }
}
