package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQuery355 extends StObject {
  
  /**
    * Lists package versions for a package owned by an organization.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersQuery355
}
object GetParametersQuery355 {
  
  inline def apply(get: ParametersQuery355): GetParametersQuery355 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQuery355]
  }
  
  extension [Self <: GetParametersQuery355](x: Self) {
    
    inline def setGet(value: ParametersQuery355): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
