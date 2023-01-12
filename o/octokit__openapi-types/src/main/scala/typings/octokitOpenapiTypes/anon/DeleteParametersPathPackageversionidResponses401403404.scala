package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathPackageversionidResponses401403404 extends StObject {
  
  /**
    * Deletes a specific package version in an organization. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  var delete: ParametersPathPackageversionidResponses401403404
  
  /**
    * Gets a specific package version in an organization.
    *
    * You must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPathPackageversionid
}
object DeleteParametersPathPackageversionidResponses401403404 {
  
  inline def apply(delete: ParametersPathPackageversionidResponses401403404, get: ParametersPathPackageversionid): DeleteParametersPathPackageversionidResponses401403404 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathPackageversionidResponses401403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathPackageversionidResponses401403404] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathPackageversionidResponses401403404): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathPackageversionid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
