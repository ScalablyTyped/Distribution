package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggressiveTokenizerRu extends Tokenizer
object AggressiveTokenizerRu {
  
  @scala.inline
  def apply(tokenize: String => js.Array[String]): AggressiveTokenizerRu = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[AggressiveTokenizerRu]
  }
}
