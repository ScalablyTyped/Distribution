package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteResponse extends StObject {
  
  var agents: js.Array[AgentResponse]
}
object RouteResponse {
  
  inline def apply(agents: js.Array[AgentResponse]): RouteResponse = {
    val __obj = js.Dynamic.literal(agents = agents.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteResponse]
  }
  
  extension [Self <: RouteResponse](x: Self) {
    
    inline def setAgents(value: js.Array[AgentResponse]): Self = StObject.set(x, "agents", value.asInstanceOf[js.Any])
    
    inline def setAgentsVarargs(value: AgentResponse*): Self = StObject.set(x, "agents", js.Array(value :_*))
  }
}
