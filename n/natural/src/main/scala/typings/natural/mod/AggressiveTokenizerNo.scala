package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggressiveTokenizerNo extends Tokenizer
object AggressiveTokenizerNo {
  
  @scala.inline
  def apply(tokenize: String => js.Array[String]): AggressiveTokenizerNo = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[AggressiveTokenizerNo]
  }
}
