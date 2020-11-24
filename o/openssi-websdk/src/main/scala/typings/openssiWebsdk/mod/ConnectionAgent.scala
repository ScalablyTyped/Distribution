package typings.openssiWebsdk.mod

import typings.openssiWebsdk.anon.Did
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionAgent extends js.Object {
  
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
  implicit class ConnectionAgentOps[Self <: ConnectionAgent] (val x: Self) extends AnyVal {
    
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
    def setName(value: AgentName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPairwise(value: Did): Self = this.set("pairwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: Did): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: AgentURL): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
