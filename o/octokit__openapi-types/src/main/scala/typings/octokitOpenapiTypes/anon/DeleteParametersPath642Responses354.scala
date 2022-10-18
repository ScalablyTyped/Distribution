package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath642Responses354 extends StObject {
  
  /**
    * Deletes a package owned by the authenticated user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:delete` scopes.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var delete: ParametersPath642Responses354
  
  /**
    * Gets a specific package for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPath642
}
object DeleteParametersPath642Responses354 {
  
  inline def apply(delete: ParametersPath642Responses354, get: ParametersPath642): DeleteParametersPath642Responses354 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath642Responses354]
  }
  
  extension [Self <: DeleteParametersPath642Responses354](x: Self) {
    
    inline def setDelete(value: ParametersPath642Responses354): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath642): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
