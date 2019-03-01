package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokenizer extends js.Object {
  def tokenize(text: java.lang.String): js.Array[java.lang.String]
}

object Tokenizer {
  @scala.inline
  def apply(tokenize: js.Function1[java.lang.String, js.Array[java.lang.String]]): Tokenizer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tokenize")(tokenize)
    __obj.asInstanceOf[Tokenizer]
  }
}

