package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsGetWorkflowEndpoint extends StObject {
  
  var owner: String
  
  var repo: String
  
  var workflow_id: Double
}
object ActionsGetWorkflowEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, workflow_id: Double): ActionsGetWorkflowEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowEndpoint]
  }
  
  @scala.inline
  implicit class ActionsGetWorkflowEndpointMutableBuilder[Self <: ActionsGetWorkflowEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow_id(value: Double): Self = StObject.set(x, "workflow_id", value.asInstanceOf[js.Any])
  }
}
