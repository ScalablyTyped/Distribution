package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListRunnerApplicationsForRepoEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
}
object ActionsListRunnerApplicationsForRepoEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ActionsListRunnerApplicationsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListRunnerApplicationsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ActionsListRunnerApplicationsForRepoEndpointMutableBuilder[Self <: ActionsListRunnerApplicationsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
