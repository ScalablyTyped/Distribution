package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPackagetype extends StObject {
  
  /**
    * Lists all packages in an organization readable by the user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersQueryPackagetype
}
object GetParametersQueryPackagetype {
  
  inline def apply(get: ParametersQueryPackagetype): GetParametersQueryPackagetype = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPackagetype]
  }
  
  extension [Self <: GetParametersQueryPackagetype](x: Self) {
    
    inline def setGet(value: ParametersQueryPackagetype): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
