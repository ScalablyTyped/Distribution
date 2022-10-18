package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPackagetypeVisibility extends StObject {
  
  /**
    * Lists all packages in an organization readable by the user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersQueryPackagetypeVisibility
}
object GetParametersQueryPackagetypeVisibility {
  
  inline def apply(get: ParametersQueryPackagetypeVisibility): GetParametersQueryPackagetypeVisibility = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPackagetypeVisibility]
  }
  
  extension [Self <: GetParametersQueryPackagetypeVisibility](x: Self) {
    
    inline def setGet(value: ParametersQueryPackagetypeVisibility): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
