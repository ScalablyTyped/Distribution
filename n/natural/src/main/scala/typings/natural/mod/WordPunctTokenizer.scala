package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordPunctTokenizer extends Tokenizer

object WordPunctTokenizer {
  @scala.inline
  def apply(tokenize: String => js.Array[String]): WordPunctTokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[WordPunctTokenizer]
  }
}

