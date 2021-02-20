package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.latest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListJobsForWorkflowRunEndpoint extends StObject {
  
  /**
    * Filters jobs by their `completed_at` timestamp. Can be one of:
    * \* `latest`: Returns jobs from the most recent execution of the workflow run.
    * \* `all`: Returns all jobs for a workflow run, including from old executions of the workflow run.
    */
  var filter: js.UndefOr[latest | all] = js.native
  
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
  
  var run_id: Double = js.native
}
object ActionsListJobsForWorkflowRunEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, run_id: Double): ActionsListJobsForWorkflowRunEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListJobsForWorkflowRunEndpoint]
  }
  
  @scala.inline
  implicit class ActionsListJobsForWorkflowRunEndpointMutableBuilder[Self <: ActionsListJobsForWorkflowRunEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: latest | all): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun_id(value: Double): Self = StObject.set(x, "run_id", value.asInstanceOf[js.Any])
  }
}
