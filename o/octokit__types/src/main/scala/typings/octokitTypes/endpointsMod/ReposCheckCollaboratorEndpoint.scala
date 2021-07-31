package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCheckCollaboratorEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
  
  var username: String
}
object ReposCheckCollaboratorEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, username: String): ReposCheckCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCheckCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ReposCheckCollaboratorEndpointMutableBuilder[Self <: ReposCheckCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
