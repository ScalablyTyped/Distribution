package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsCreateWorkflowDispatchEndpoint extends StObject {
  
  /**
    * Input keys and values configured in the workflow file. The maximum number of properties is 10.
    */
  var inputs: js.UndefOr[ActionsCreateWorkflowDispatchParamsInputs] = js.undefined
  
  var owner: String
  
  /**
    * The reference of the workflow run. The reference can be a branch, tag, or a commit SHA.
    */
  var ref: String
  
  var repo: String
  
  var workflow_id: Double
}
object ActionsCreateWorkflowDispatchEndpoint {
  
  @scala.inline
  def apply(owner: String, ref: String, repo: String, workflow_id: Double): ActionsCreateWorkflowDispatchEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateWorkflowDispatchEndpoint]
  }
  
  @scala.inline
  implicit class ActionsCreateWorkflowDispatchEndpointMutableBuilder[Self <: ActionsCreateWorkflowDispatchEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: ActionsCreateWorkflowDispatchParamsInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow_id(value: Double): Self = StObject.set(x, "workflow_id", value.asInstanceOf[js.Any])
  }
}
