package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentOtherDeviceId extends js.Object {
  
  /** Project ID for your smart home Action. */
  var agentId: js.UndefOr[String] = js.native
  
  /** Unique third-party device ID. */
  var deviceId: js.UndefOr[String] = js.native
}
object AgentOtherDeviceId {
  
  @scala.inline
  def apply(): AgentOtherDeviceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentOtherDeviceId]
  }
  
  @scala.inline
  implicit class AgentOtherDeviceIdOps[Self <: AgentOtherDeviceId] (val x: Self) extends AnyVal {
    
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
    def setAgentId(value: String): Self = this.set("agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentId: Self = this.set("agentId", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
  }
}
