package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesGCM extends IParams {
  var aad: js.UndefOr[nodeLib.Buffer] = js.undefined
  var iv: js.UndefOr[nodeLib.Buffer] = js.undefined
  var ivBits: scala.Double
  var tagBits: scala.Double
}

object AesGCM {
  @scala.inline
  def apply(
    ivBits: scala.Double,
    tagBits: scala.Double,
    `type`: scala.Double,
    aad: nodeLib.Buffer = null,
    iv: nodeLib.Buffer = null
  ): AesGCM = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("ivBits")(ivBits)
    __obj.updateDynamic("tagBits")(tagBits)
    if (aad != null) __obj.updateDynamic("aad")(aad)
    if (iv != null) __obj.updateDynamic("iv")(iv)
    __obj.asInstanceOf[AesGCM]
  }
}

