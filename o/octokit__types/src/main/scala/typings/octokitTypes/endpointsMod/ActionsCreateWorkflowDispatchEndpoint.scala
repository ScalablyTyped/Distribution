package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsCreateWorkflowDispatchEndpoint extends js.Object {
  
  /**
    * Input keys and values configured in the workflow file. The maximum number of properties is 10.
    */
  var inputs: js.UndefOr[ActionsCreateWorkflowDispatchParamsInputs] = js.native
  
  var owner: String = js.native
  
  /**
    * The reference of the workflow run. The reference can be a branch, tag, or a commit SHA.
    */
  var ref: String = js.native
  
  var repo: String = js.native
  
  var workflow_id: Double = js.native
}
object ActionsCreateWorkflowDispatchEndpoint {
  
  @scala.inline
  def apply(owner: String, ref: String, repo: String, workflow_id: Double): ActionsCreateWorkflowDispatchEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateWorkflowDispatchEndpoint]
  }
  
  @scala.inline
  implicit class ActionsCreateWorkflowDispatchEndpointOps[Self <: ActionsCreateWorkflowDispatchEndpoint] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow_id(value: Double): Self = this.set("workflow_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: ActionsCreateWorkflowDispatchParamsInputs): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
  }
}
