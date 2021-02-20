package typings.openssiWebsdk.mod

import typings.openssiWebsdk.anon.Did
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionAgent extends StObject {
  
  var name: AgentName = js.native
  
  var pairwise: Did = js.native
  
  var public: Did = js.native
  
  var role: String = js.native
  
  var url: AgentURL = js.native
}
object ConnectionAgent {
  
  @scala.inline
  def apply(name: AgentName, pairwise: Did, public: Did, role: String, url: AgentURL): ConnectionAgent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairwise = pairwise.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAgent]
  }
  
  @scala.inline
  implicit class ConnectionAgentMutableBuilder[Self <: ConnectionAgent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: AgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPairwise(value: Did): Self = StObject.set(x, "pairwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: Did): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: AgentURL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
