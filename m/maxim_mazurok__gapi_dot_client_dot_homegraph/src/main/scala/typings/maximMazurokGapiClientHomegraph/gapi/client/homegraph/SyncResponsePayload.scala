package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncResponsePayload extends js.Object {
  
  /** Third-party user ID */
  var agentUserId: js.UndefOr[String] = js.native
  
  /** Devices associated with the third-party user. */
  var devices: js.UndefOr[js.Array[Device]] = js.native
}
object SyncResponsePayload {
  
  @scala.inline
  def apply(): SyncResponsePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncResponsePayload]
  }
  
  @scala.inline
  implicit class SyncResponsePayloadOps[Self <: SyncResponsePayload] (val x: Self) extends AnyVal {
    
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
    def setAgentUserId(value: String): Self = this.set("agentUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentUserId: Self = this.set("agentUserId", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: Device*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[Device]): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
  }
}
