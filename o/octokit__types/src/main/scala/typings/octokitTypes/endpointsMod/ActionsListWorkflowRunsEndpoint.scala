package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.completed
import typings.octokitTypes.octokitTypesStrings.conclusion
import typings.octokitTypes.octokitTypesStrings.status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListWorkflowRunsEndpoint extends js.Object {
  
  /**
    * Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run.
    */
  var actor: js.UndefOr[String] = js.native
  
  /**
    * Returns workflow runs associated with a branch. Use the name of the branch of the `push`.
    */
  var branch: js.UndefOr[String] = js.native
  
  /**
    * Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see "[Events that trigger workflows](https://docs.github.com/en/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows)."
    */
  var event: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  
  var repo: String = js.native
  
  /**
    * Returns workflow runs associated with the check run `status` or `conclusion` you specify. For example, a conclusion can be `success` or a status can be `completed`. For more information, see the `status` and `conclusion` options available in "[Create a check run](https://developer.github.com/v3/checks/runs/#create-a-check-run)."
    */
  var status: js.UndefOr[completed | typings.octokitTypes.octokitTypesStrings.status | conclusion] = js.native
  
  var workflow_id: Double = js.native
}
object ActionsListWorkflowRunsEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, workflow_id: Double): ActionsListWorkflowRunsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], workflow_id = workflow_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunsEndpoint]
  }
  
  @scala.inline
  implicit class ActionsListWorkflowRunsEndpointOps[Self <: ActionsListWorkflowRunsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflow_id(value: Double): Self = this.set("workflow_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActor(value: String): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
    
    @scala.inline
    def setEvent(value: String): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
    
    @scala.inline
    def setStatus(value: completed | status | conclusion): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
