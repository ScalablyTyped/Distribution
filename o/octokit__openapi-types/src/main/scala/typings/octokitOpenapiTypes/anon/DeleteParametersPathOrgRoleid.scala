package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathOrgRoleid extends StObject {
  
  /**
    * **Note**: This operation is in beta and is subject to change.
    *
    * Deletes a custom role from an organization. Once the custom role has been deleted, any
    * user, team, or invitation with the deleted custom role will be reassigned the inherited role.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization and must use an access token with `admin:org` scope.
    * GitHub Apps must have the `organization_custom_roles:write` organization permission to use this endpoint.
    *
    * For more information about custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)."
    */
  var delete: ParametersPathOrgRoleid
  
  /**
    * **Note**: This operation is in beta and subject to change.
    *
    * Updates a custom repository role that can be used by all repositories owned by the organization.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization and must use an access token with `admin:org` scope.
    * GitHub Apps must have the `organization_custom_roles:write` organization permission to use this endpoint.
    *
    * For more information about custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)."
    */
  var patch: Responses200Content326
}
object DeleteParametersPathOrgRoleid {
  
  inline def apply(delete: ParametersPathOrgRoleid, patch: Responses200Content326): DeleteParametersPathOrgRoleid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathOrgRoleid]
  }
  
  extension [Self <: DeleteParametersPathOrgRoleid](x: Self) {
    
    inline def setDelete(value: ParametersPathOrgRoleid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content326): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
