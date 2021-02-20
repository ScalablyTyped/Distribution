package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsGetWorkflowUsageEndpoint extends StObject {
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  var workflow_id: Double = js.native
}
object ActionsGetWorkflowUsageEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, workflow_id: Double): ActionsGetWorkflowUsageEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowUsageEndpoint]
  }
  
  @scala.inline
  implicit class ActionsGetWorkflowUsageEndpointMutableBuilder[Self <: ActionsGetWorkflowUsageEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow_id(value: Double): Self = StObject.set(x, "workflow_id", value.asInstanceOf[js.Any])
  }
}
