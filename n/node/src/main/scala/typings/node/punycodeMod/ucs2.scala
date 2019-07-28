package typings.node.punycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ucs2 extends js.Object {
  def decode(string: java.lang.String): js.Array[Double]
  def encode(codePoints: js.Array[Double]): java.lang.String
}

object ucs2 {
  @scala.inline
  def apply(decode: java.lang.String => js.Array[Double], encode: js.Array[Double] => java.lang.String): ucs2 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[ucs2]
  }
}

