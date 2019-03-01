package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionInfo extends js.Object {
  var deviceError: scala.Double
  var flags: scala.Double
  var slotID: nodeLib.Buffer
  var state: scala.Double
}

object SessionInfo {
  @scala.inline
  def apply(deviceError: scala.Double, flags: scala.Double, slotID: nodeLib.Buffer, state: scala.Double): SessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceError")(deviceError)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("slotID")(slotID)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[SessionInfo]
  }
}

