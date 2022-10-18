package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.active
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.admin
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.billing_manager
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.member_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organization extends StObject {
  
  var organization: Description
  
  /**
    * Format: uri
    * @example https://api.github.com/orgs/octocat
    */
  var organization_url: String
  
  var permissions: js.UndefOr[Cancreaterepository] = js.undefined
  
  /**
    * @description The user's membership type in the organization.
    * @example admin
    * @enum {string}
    */
  var role: admin | member_ | billing_manager
  
  /**
    * @description The state of the member in the organization. The `pending` state indicates the user has not yet accepted an invitation.
    * @example active
    * @enum {string}
    */
  var state: active | pending
  
  /**
    * Format: uri
    * @example https://api.github.com/orgs/octocat/memberships/defunkt
    */
  var url: String
  
  var user: Avatarurl | Null
}
object Organization {
  
  inline def apply(
    organization: Description,
    organization_url: String,
    role: admin | member_ | billing_manager,
    state: active | pending,
    url: String
  ): Organization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = null)
    __obj.asInstanceOf[Organization]
  }
  
  extension [Self <: Organization](x: Self) {
    
    inline def setOrganization(value: Description): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganization_url(value: String): Self = StObject.set(x, "organization_url", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Cancreaterepository): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setRole(value: admin | member_ | billing_manager): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setState(value: active | pending): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
