package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggressiveTokenizerFa
  extends StObject
     with Tokenizer
object AggressiveTokenizerFa {
  
  @scala.inline
  def apply(tokenize: String => js.Array[String]): AggressiveTokenizerFa = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[AggressiveTokenizerFa]
  }
}
