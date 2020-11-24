package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Artifactsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListWorkflowRunsForRepoResponseData extends js.Object {
  
  var total_count: Double = js.native
  
  var workflow_runs: js.Array[Artifactsurl] = js.native
}
object ActionsListWorkflowRunsForRepoResponseData {
  
  @scala.inline
  def apply(total_count: Double, workflow_runs: js.Array[Artifactsurl]): ActionsListWorkflowRunsForRepoResponseData = {
    val __obj = js.Dynamic.literal(total_count = total_count.asInstanceOf[js.Any], workflow_runs = workflow_runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunsForRepoResponseData]
  }
  
  @scala.inline
  implicit class ActionsListWorkflowRunsForRepoResponseDataOps[Self <: ActionsListWorkflowRunsForRepoResponseData] (val x: Self) extends AnyVal {
    
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
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow_runsVarargs(value: Artifactsurl*): Self = this.set("workflow_runs", js.Array(value :_*))
    
    @scala.inline
    def setWorkflow_runs(value: js.Array[Artifactsurl]): Self = this.set("workflow_runs", value.asInstanceOf[js.Any])
  }
}
