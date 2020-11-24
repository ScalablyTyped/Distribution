package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionInfo extends js.Object {
  
  var deviceError: Double = js.native
  
  var flags: Double = js.native
  
  var slotID: Buffer = js.native
  
  var state: Double = js.native
}
object SessionInfo {
  
  @scala.inline
  def apply(deviceError: Double, flags: Double, slotID: Buffer, state: Double): SessionInfo = {
    val __obj = js.Dynamic.literal(deviceError = deviceError.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], slotID = slotID.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionInfo]
  }
  
  @scala.inline
  implicit class SessionInfoOps[Self <: SessionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceError(value: Double): Self = this.set("deviceError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotID(value: Buffer): Self = this.set("slotID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
