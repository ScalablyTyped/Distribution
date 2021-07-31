package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.asc
import typings.octokitTypes.octokitTypesStrings.created
import typings.octokitTypes.octokitTypesStrings.desc
import typings.octokitTypes.octokitTypesStrings.full_name
import typings.octokitTypes.octokitTypesStrings.member
import typings.octokitTypes.octokitTypesStrings.owner
import typings.octokitTypes.octokitTypesStrings.public
import typings.octokitTypes.octokitTypesStrings.pushed
import typings.octokitTypes.octokitTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposListForAuthenticatedUserEndpoint extends StObject {
  
  /**
    * Comma-separated list of values. Can include:
    * \* `owner`: Repositories that are owned by the authenticated user.
    * \* `collaborator`: Repositories that the user has been added to as a collaborator.
    * \* `organization_member`: Repositories that the user has access to through being a member of an organization. This includes every repository on every team that the user is on.
    */
  var affiliation: js.UndefOr[String] = js.undefined
  
  /**
    * Can be one of `asc` or `desc`. Default: `asc` when using `full_name`, otherwise `desc`
    */
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /**
    * Can be one of `created`, `updated`, `pushed`, `full_name`.
    */
  var sort: js.UndefOr[created | updated | pushed | full_name] = js.undefined
  
  /**
    * Can be one of `all`, `owner`, `public`, `private`, `member`. Default: `all`
    *
    * Will cause a `422` error if used in the same request as **visibility** or **affiliation**. Will cause a `422` error if used in the same request as **visibility** or **affiliation**.
    */
  var `type`: js.UndefOr[all | owner | public | `private` | member] = js.undefined
  
  /**
    * Can be one of `all`, `public`, or `private`.
    */
  var visibility: js.UndefOr[all | public | `private`] = js.undefined
}
object ReposListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(): ReposListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ReposListForAuthenticatedUserEndpointMutableBuilder[Self <: ReposListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    @scala.inline
    def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setSort(value: created | updated | pushed | full_name): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setType(value: all | owner | public | `private` | member): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisibility(value: all | public | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
