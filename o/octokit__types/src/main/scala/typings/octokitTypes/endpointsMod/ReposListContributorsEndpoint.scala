package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposListContributorsEndpoint extends StObject {
  
  /**
    * Set to `1` or `true` to include anonymous contributors in results.
    */
  var anon: js.UndefOr[String] = js.undefined
  
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
}
object ReposListContributorsEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ReposListContributorsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListContributorsEndpoint]
  }
  
  @scala.inline
  implicit class ReposListContributorsEndpointMutableBuilder[Self <: ReposListContributorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnon(value: String): Self = StObject.set(x, "anon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonUndefined: Self = StObject.set(x, "anon", js.undefined)
    
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
  }
}
