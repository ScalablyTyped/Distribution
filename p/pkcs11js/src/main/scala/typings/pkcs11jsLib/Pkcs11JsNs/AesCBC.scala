package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesCBC extends IParams {
  var data: js.UndefOr[nodeLib.Buffer] = js.undefined
  var iv: nodeLib.Buffer
}

object AesCBC {
  @scala.inline
  def apply(iv: nodeLib.Buffer, `type`: scala.Double, data: nodeLib.Buffer = null): AesCBC = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("iv")(iv)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[AesCBC]
  }
}

