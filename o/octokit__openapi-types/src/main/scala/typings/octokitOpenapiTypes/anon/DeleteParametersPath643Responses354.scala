package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath643Responses354 extends StObject {
  
  /**
    * Deletes a specific package version for a package owned by the authenticated user.  If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:delete` scopes.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var delete: ParametersPath643Responses354
  
  /**
    * Gets a specific package version for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPath643
}
object DeleteParametersPath643Responses354 {
  
  inline def apply(delete: ParametersPath643Responses354, get: ParametersPath643): DeleteParametersPath643Responses354 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath643Responses354]
  }
  
  extension [Self <: DeleteParametersPath643Responses354](x: Self) {
    
    inline def setDelete(value: ParametersPath643Responses354): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath643): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
