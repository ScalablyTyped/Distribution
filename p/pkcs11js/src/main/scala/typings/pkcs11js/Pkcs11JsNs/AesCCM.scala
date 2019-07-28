package typings.pkcs11js.Pkcs11JsNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesCCM extends IParams {
  var aad: js.UndefOr[Buffer] = js.undefined
  var dataLen: Double
  var macLen: Double
  var nonce: js.UndefOr[Buffer] = js.undefined
}

object AesCCM {
  @scala.inline
  def apply(dataLen: Double, macLen: Double, `type`: Double, aad: Buffer = null, nonce: Buffer = null): AesCCM = {
    val __obj = js.Dynamic.literal(dataLen = dataLen, macLen = macLen)
    __obj.updateDynamic("type")(`type`)
    if (aad != null) __obj.updateDynamic("aad")(aad)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[AesCCM]
  }
}

