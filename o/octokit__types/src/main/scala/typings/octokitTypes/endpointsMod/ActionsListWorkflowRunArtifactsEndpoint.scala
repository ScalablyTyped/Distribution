package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListWorkflowRunArtifactsEndpoint extends StObject {
  
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
  
  var run_id: Double
}
object ActionsListWorkflowRunArtifactsEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, run_id: Double): ActionsListWorkflowRunArtifactsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunArtifactsEndpoint]
  }
  
  @scala.inline
  implicit class ActionsListWorkflowRunArtifactsEndpointMutableBuilder[Self <: ActionsListWorkflowRunArtifactsEndpoint] (val x: Self) extends AnyVal {
    
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
