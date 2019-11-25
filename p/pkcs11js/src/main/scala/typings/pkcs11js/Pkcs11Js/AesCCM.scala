package typings.pkcs11js.Pkcs11Js

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
    val __obj = js.Dynamic.literal(dataLen = dataLen.asInstanceOf[js.Any], macLen = macLen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (aad != null) __obj.updateDynamic("aad")(aad.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCCM]
  }
}

