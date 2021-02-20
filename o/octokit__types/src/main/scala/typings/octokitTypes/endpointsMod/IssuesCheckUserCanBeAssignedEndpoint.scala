package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuesCheckUserCanBeAssignedEndpoint extends StObject {
  
  var assignee: String = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object IssuesCheckUserCanBeAssignedEndpoint {
  
  @scala.inline
  def apply(assignee: String, owner: String, repo: String): IssuesCheckUserCanBeAssignedEndpoint = {
    val __obj = js.Dynamic.literal(assignee = assignee.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCheckUserCanBeAssignedEndpoint]
  }
  
  @scala.inline
  implicit class IssuesCheckUserCanBeAssignedEndpointMutableBuilder[Self <: IssuesCheckUserCanBeAssignedEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignee(value: String): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
