package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordTokenizer extends Tokenizer

object WordTokenizer {
  @scala.inline
  def apply(tokenize: String => js.Array[String]): WordTokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[WordTokenizer]
  }
}

