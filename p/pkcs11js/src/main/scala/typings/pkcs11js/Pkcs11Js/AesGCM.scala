package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesGCM extends IParams {
  var aad: js.UndefOr[Buffer] = js.undefined
  var iv: js.UndefOr[Buffer] = js.undefined
  var ivBits: Double
  var tagBits: Double
}

object AesGCM {
  @scala.inline
  def apply(ivBits: Double, tagBits: Double, `type`: Double, aad: Buffer = null, iv: Buffer = null): AesGCM = {
    val __obj = js.Dynamic.literal(ivBits = ivBits, tagBits = tagBits)
    __obj.updateDynamic("type")(`type`)
    if (aad != null) __obj.updateDynamic("aad")(aad)
    if (iv != null) __obj.updateDynamic("iv")(iv)
    __obj.asInstanceOf[AesGCM]
  }
}

