package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentOtherDeviceId extends StObject {
  
  /** Project ID for your smart home Action. */
  var agentId: js.UndefOr[String] = js.undefined
  
  /** Unique third-party device ID. */
  var deviceId: js.UndefOr[String] = js.undefined
}
object AgentOtherDeviceId {
  
  inline def apply(): AgentOtherDeviceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentOtherDeviceId]
  }
  
  extension [Self <: AgentOtherDeviceId](x: Self) {
    
    inline def setAgentId(value: String): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
  }
}
