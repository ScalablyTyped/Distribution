package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathPackagetypeUsernameResponses401403404 extends StObject {
  
  /**
    * Deletes an entire package for a user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:delete` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container you want to delete.
    */
  var delete: ParametersPathPackagetypeUsernameResponses401403404
  
  /**
    * Gets a specific package metadata for a public package owned by a user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPathPackagetypeUsername
}
object DeleteParametersPathPackagetypeUsernameResponses401403404 {
  
  inline def apply(
    delete: ParametersPathPackagetypeUsernameResponses401403404,
    get: ParametersPathPackagetypeUsername
  ): DeleteParametersPathPackagetypeUsernameResponses401403404 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathPackagetypeUsernameResponses401403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathPackagetypeUsernameResponses401403404] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathPackagetypeUsernameResponses401403404): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathPackagetypeUsername): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
