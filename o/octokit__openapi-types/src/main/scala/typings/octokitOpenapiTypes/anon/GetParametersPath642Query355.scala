package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath642Query355 extends StObject {
  
  /**
    * Lists package versions for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPath642Query355
}
object GetParametersPath642Query355 {
  
  inline def apply(get: ParametersPath642Query355): GetParametersPath642Query355 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath642Query355]
  }
  
  extension [Self <: GetParametersPath642Query355](x: Self) {
    
    inline def setGet(value: ParametersPath642Query355): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
