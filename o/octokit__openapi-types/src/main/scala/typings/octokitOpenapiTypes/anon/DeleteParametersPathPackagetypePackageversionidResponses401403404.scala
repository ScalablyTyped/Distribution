package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathPackagetypePackageversionidResponses401403404 extends StObject {
  
  /**
    * Deletes a specific package version for a package owned by the authenticated user.  If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:delete` scopes.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var delete: ParametersPathPackagetypePackageversionidResponses401403404
  
  /**
    * Gets a specific package version for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPathPackagetypePackageversionid
}
object DeleteParametersPathPackagetypePackageversionidResponses401403404 {
  
  inline def apply(
    delete: ParametersPathPackagetypePackageversionidResponses401403404,
    get: ParametersPathPackagetypePackageversionid
  ): DeleteParametersPathPackagetypePackageversionidResponses401403404 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathPackagetypePackageversionidResponses401403404]
  }
  
  extension [Self <: DeleteParametersPathPackagetypePackageversionidResponses401403404](x: Self) {
    
    inline def setDelete(value: ParametersPathPackagetypePackageversionidResponses401403404): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathPackagetypePackageversionid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
