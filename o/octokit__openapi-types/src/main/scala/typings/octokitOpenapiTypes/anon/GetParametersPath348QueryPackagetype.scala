package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath348QueryPackagetype extends StObject {
  
  /**
    * Lists all packages in a user's namespace for which the requesting user has access.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPath348QueryPackagetype
}
object GetParametersPath348QueryPackagetype {
  
  inline def apply(get: ParametersPath348QueryPackagetype): GetParametersPath348QueryPackagetype = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath348QueryPackagetype]
  }
  
  extension [Self <: GetParametersPath348QueryPackagetype](x: Self) {
    
    inline def setGet(value: ParametersPath348QueryPackagetype): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
