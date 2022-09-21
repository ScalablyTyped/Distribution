package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentPool extends StObject {
  
  /** Specifies the bandwidth limit details. If this field is unspecified, the default value is set as 'No Limit'. */
  var bandwidthLimit: js.UndefOr[BandwidthLimit] = js.undefined
  
  /** Specifies the client-specified AgentPool description. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Required. Specifies a unique string that identifies the agent pool. Format: `projects/{project_id}/agentPools/{agent_pool_id}` */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. Specifies the state of the AgentPool. */
  var state: js.UndefOr[String] = js.undefined
}
object AgentPool {
  
  inline def apply(): AgentPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentPool]
  }
  
  extension [Self <: AgentPool](x: Self) {
    
    inline def setBandwidthLimit(value: BandwidthLimit): Self = StObject.set(x, "bandwidthLimit", value.asInstanceOf[js.Any])
    
    inline def setBandwidthLimitUndefined: Self = StObject.set(x, "bandwidthLimit", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
