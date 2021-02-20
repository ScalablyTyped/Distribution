package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentOtherDeviceId extends StObject {
  
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
  implicit class AgentOtherDeviceIdMutableBuilder[Self <: AgentOtherDeviceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentId(value: String): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
  }
}
