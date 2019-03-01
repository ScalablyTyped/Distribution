package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECDH1 extends IParams {
  var kdf: scala.Double
  var publicData: nodeLib.Buffer
  var sharedData: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object ECDH1 {
  @scala.inline
  def apply(
    kdf: scala.Double,
    publicData: nodeLib.Buffer,
    `type`: scala.Double,
    sharedData: nodeLib.Buffer = null
  ): ECDH1 = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("kdf")(kdf)
    __obj.updateDynamic("publicData")(publicData)
    if (sharedData != null) __obj.updateDynamic("sharedData")(sharedData)
    __obj.asInstanceOf[ECDH1]
  }
}

