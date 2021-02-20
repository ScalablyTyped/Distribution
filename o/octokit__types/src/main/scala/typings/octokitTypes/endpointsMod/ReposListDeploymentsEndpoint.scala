package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposListDeploymentsEndpoint extends StObject {
  
  /**
    * The name of the environment that was deployed to (e.g., `staging` or `production`).
    */
  var environment: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  
  /**
    * The name of the ref. This can be a branch, tag, or SHA.
    */
  var ref: js.UndefOr[String] = js.native
  
  var repo: String = js.native
  
  /**
    * The SHA recorded at creation time.
    */
  var sha: js.UndefOr[String] = js.native
  
  /**
    * The name of the task for the deployment (e.g., `deploy` or `deploy:migrations`).
    */
  var task: js.UndefOr[String] = js.native
}
object ReposListDeploymentsEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ReposListDeploymentsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListDeploymentsEndpoint]
  }
  
  @scala.inline
  implicit class ReposListDeploymentsEndpointMutableBuilder[Self <: ReposListDeploymentsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
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
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    @scala.inline
    def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
