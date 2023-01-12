package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathPackagenamePackagetypeResponses401403404 extends StObject {
  
  /**
    * Deletes a package owned by the authenticated user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:delete` scopes.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var delete: ParametersPathPackagenamePackagetypeResponses401403404
  
  /**
    * Gets a specific package for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPathPackagenamePackagetype
}
object DeleteParametersPathPackagenamePackagetypeResponses401403404 {
  
  inline def apply(
    delete: ParametersPathPackagenamePackagetypeResponses401403404,
    get: ParametersPathPackagenamePackagetype
  ): DeleteParametersPathPackagenamePackagetypeResponses401403404 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathPackagenamePackagetypeResponses401403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathPackagenamePackagetypeResponses401403404] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathPackagenamePackagetypeResponses401403404): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathPackagenamePackagetype): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
