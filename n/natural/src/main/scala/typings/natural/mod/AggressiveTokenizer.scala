package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggressiveTokenizer extends Tokenizer

object AggressiveTokenizer {
  @scala.inline
  def apply(tokenize: String => js.Array[String]): AggressiveTokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[AggressiveTokenizer]
  }
}

