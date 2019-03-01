package typings
package nodeLib.punycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ucs2 extends js.Object {
  def decode(string: java.lang.String): js.Array[scala.Double]
  def encode(codePoints: js.Array[scala.Double]): java.lang.String
}

object ucs2 {
  @scala.inline
  def apply(
    decode: js.Function1[java.lang.String, js.Array[scala.Double]],
    encode: js.Function1[js.Array[scala.Double], java.lang.String]
  ): ucs2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(decode)
    __obj.updateDynamic("encode")(encode)
    __obj.asInstanceOf[ucs2]
  }
}

