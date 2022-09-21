package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAgentPoolsResponse extends StObject {
  
  /** A list of agent pools. */
  var agentPools: js.UndefOr[js.Array[AgentPool]] = js.undefined
  
  /** The list next page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListAgentPoolsResponse {
  
  inline def apply(): ListAgentPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAgentPoolsResponse]
  }
  
  extension [Self <: ListAgentPoolsResponse](x: Self) {
    
    inline def setAgentPools(value: js.Array[AgentPool]): Self = StObject.set(x, "agentPools", value.asInstanceOf[js.Any])
    
    inline def setAgentPoolsUndefined: Self = StObject.set(x, "agentPools", js.undefined)
    
    inline def setAgentPoolsVarargs(value: AgentPool*): Self = StObject.set(x, "agentPools", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
