package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokenizer extends js.Object {
  def tokenize(text: String): js.Array[String]
}

object Tokenizer {
  @scala.inline
  def apply(tokenize: String => js.Array[String]): Tokenizer = {
    val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
    __obj.asInstanceOf[Tokenizer]
  }
}

