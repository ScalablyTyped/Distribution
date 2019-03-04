package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesCCM extends IParams {
  var aad: js.UndefOr[nodeLib.Buffer] = js.undefined
  var dataLen: scala.Double
  var macLen: scala.Double
  var nonce: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object AesCCM {
  @scala.inline
  def apply(
    dataLen: scala.Double,
    macLen: scala.Double,
    `type`: scala.Double,
    aad: nodeLib.Buffer = null,
    nonce: nodeLib.Buffer = null
  ): AesCCM = {
    val __obj = js.Dynamic.literal(dataLen = dataLen, macLen = macLen)
    __obj.updateDynamic("type")(`type`)
    if (aad != null) __obj.updateDynamic("aad")(aad)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[AesCCM]
  }
}

