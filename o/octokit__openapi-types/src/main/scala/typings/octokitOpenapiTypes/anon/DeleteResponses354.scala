package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses354 extends StObject {
  
  /**
    * Deletes an entire package in an organization. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  var delete: Responses354
  
  /**
    * Gets a specific package in an organization.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPathOrgPackagename
}
object DeleteResponses354 {
  
  inline def apply(delete: Responses354, get: ParametersPathOrgPackagename): DeleteResponses354 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses354]
  }
  
  extension [Self <: DeleteResponses354](x: Self) {
    
    inline def setDelete(value: Responses354): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOrgPackagename): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
