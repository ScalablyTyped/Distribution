package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.completed
import typings.octokitTypes.octokitTypesStrings.conclusion
import typings.octokitTypes.octokitTypesStrings.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListWorkflowRunsForRepoEndpoint extends StObject {
  
  /**
    * Returns someone's workflow runs. Use the login for the user who created the `push` associated with the check suite or workflow run.
    */
  var actor: js.UndefOr[String] = js.undefined
  
  /**
    * Returns workflow runs associated with a branch. Use the name of the branch of the `push`.
    */
  var branch: js.UndefOr[String] = js.undefined
  
  /**
    * Returns workflow run triggered by the event you specify. For example, `push`, `pull_request` or `issue`. For more information, see "[Events that trigger workflows](https://docs.github.com/en/actions/automating-your-workflow-with-github-actions/events-that-trigger-workflows)."
    */
  var event: js.UndefOr[String] = js.undefined
  
  var owner: String
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  var repo: String
  
  /**
    * Returns workflow runs associated with the check run `status` or `conclusion` you specify. For example, a conclusion can be `success` or a status can be `completed`. For more information, see the `status` and `conclusion` options available in "[Create a check run](https://developer.github.com/v3/checks/runs/#create-a-check-run)."
    */
  var status: js.UndefOr[completed | typings.octokitTypes.octokitTypesStrings.status | conclusion] = js.undefined
}
object ActionsListWorkflowRunsForRepoEndpoint {
  
  inline def apply(owner: String, repo: String): ActionsListWorkflowRunsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunsForRepoEndpoint]
  }
  
  extension [Self <: ActionsListWorkflowRunsForRepoEndpoint](x: Self) {
    
    inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: completed | status | conclusion): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
