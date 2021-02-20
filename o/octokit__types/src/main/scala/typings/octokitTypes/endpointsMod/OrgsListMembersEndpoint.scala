package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`2fa_disabled`
import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.member
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrgsListMembersEndpoint extends StObject {
  
  /**
    * Filter members returned in the list. Can be one of:
    * \* `2fa_disabled` - Members without [two-factor authentication](https://github.com/blog/1614-two-factor-authentication) enabled. Available for organization owners.
    * \* `all` - All members the authenticated user can see.
    */
  var filter: js.UndefOr[`2fa_disabled` | all] = js.native
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  
  /**
    * Filter members returned by their role. Can be one of:
    * \* `all` - All members of the organization, regardless of role.
    * \* `admin` - Organization owners.
    * \* `member` - Non-owner organization members.
    */
  var role: js.UndefOr[all | admin | member] = js.native
}
object OrgsListMembersEndpoint {
  
  @scala.inline
  def apply(org_ : String): OrgsListMembersEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListMembersEndpoint]
  }
  
  @scala.inline
  implicit class OrgsListMembersEndpointMutableBuilder[Self <: OrgsListMembersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: `2fa_disabled` | all): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    @scala.inline
    def setRole(value: all | admin | member): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
