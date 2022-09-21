package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathRoleid extends StObject {
  
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
  var delete: ParametersPathRoleid
  
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
  var patch: RequestBodyContentApplicationjsonBaseroleDescription
}
object DeleteParametersPathRoleid {
  
  inline def apply(delete: ParametersPathRoleid, patch: RequestBodyContentApplicationjsonBaseroleDescription): DeleteParametersPathRoleid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathRoleid]
  }
  
  extension [Self <: DeleteParametersPathRoleid](x: Self) {
    
    inline def setDelete(value: ParametersPathRoleid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContentApplicationjsonBaseroleDescription): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
