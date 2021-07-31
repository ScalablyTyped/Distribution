package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.direct
import typings.octokitTypes.octokitTypesStrings.outside
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposListCollaboratorsEndpoint extends StObject {
  
  /**
    * Filter collaborators returned by their affiliation. Can be one of:
    * \* `outside`: All outside collaborators of an organization-owned repository.
    * \* `direct`: All collaborators with permissions to an organization-owned repository, regardless of organization membership status.
    * \* `all`: All collaborators the authenticated user can see.
    */
  var affiliation: js.UndefOr[outside | direct | all] = js.undefined
  
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
object ReposListCollaboratorsEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ReposListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposListCollaboratorsEndpoint]
  }
  
  @scala.inline
  implicit class ReposListCollaboratorsEndpointMutableBuilder[Self <: ReposListCollaboratorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffiliation(value: outside | direct | all): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
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
