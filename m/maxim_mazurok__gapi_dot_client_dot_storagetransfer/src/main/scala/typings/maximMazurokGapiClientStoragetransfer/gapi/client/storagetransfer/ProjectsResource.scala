package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsResource extends StObject {
  
  var agentPools: AgentPoolsResource
}
object ProjectsResource {
  
  inline def apply(agentPools: AgentPoolsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(agentPools = agentPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProjectsResource] (val x: Self) extends AnyVal {
    
    inline def setAgentPools(value: AgentPoolsResource): Self = StObject.set(x, "agentPools", value.asInstanceOf[js.Any])
  }
}
