package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateAndNotificationPayload extends js.Object {
  
  /** The devices for updating state and sending notifications. */
  var devices: js.UndefOr[ReportStateAndNotificationDevice] = js.native
}
object StateAndNotificationPayload {
  
  @scala.inline
  def apply(): StateAndNotificationPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateAndNotificationPayload]
  }
  
  @scala.inline
  implicit class StateAndNotificationPayloadOps[Self <: StateAndNotificationPayload] (val x: Self) extends AnyVal {
    
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
    def setDevices(value: ReportStateAndNotificationDevice): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
  }
}
