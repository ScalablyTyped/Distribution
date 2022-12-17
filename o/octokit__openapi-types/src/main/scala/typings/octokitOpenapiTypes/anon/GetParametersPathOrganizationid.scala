package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrganizationid extends StObject {
  
  /**
    * List the custom repository roles available in this organization. In order to see custom
    * repository roles in an organization, the authenticated user must be an organization owner.
    *
    * To use this endpoint the authenticated user must be an administrator for the organization or of an repository of the organizaiton and must use an access token with `admin:org repo` scope.
    * GitHub Apps must have the `organization_custom_roles:read` organization permission to use this endpoint.
    *
    * For more information on custom repository roles, see "[Managing custom repository roles for an organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-custom-repository-roles-for-an-organization)".
    */
  var get: ParametersPathOrganizationid
}
object GetParametersPathOrganizationid {
  
  inline def apply(get: ParametersPathOrganizationid): GetParametersPathOrganizationid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrganizationid]
  }
  
  extension [Self <: GetParametersPathOrganizationid](x: Self) {
    
    inline def setGet(value: ParametersPathOrganizationid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
