package typings
package pkijsLib.srcCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  var crypto: stdLib.Crypto
  var name: java.lang.String
  var subtle: stdLib.SubtleCrypto
}

object Engine {
  @scala.inline
  def apply(crypto: stdLib.Crypto, name: java.lang.String, subtle: stdLib.SubtleCrypto): Engine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("crypto")(crypto)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("subtle")(subtle)
    __obj.asInstanceOf[Engine]
  }
}

