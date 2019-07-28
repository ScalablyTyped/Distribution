package typings.pkcs11js.Pkcs11JsNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionInfo extends js.Object {
  var deviceError: Double
  var flags: Double
  var slotID: Buffer
  var state: Double
}

object SessionInfo {
  @scala.inline
  def apply(deviceError: Double, flags: Double, slotID: Buffer, state: Double): SessionInfo = {
    val __obj = js.Dynamic.literal(deviceError = deviceError, flags = flags, slotID = slotID, state = state)
  
    __obj.asInstanceOf[SessionInfo]
  }
}

