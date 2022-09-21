package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathPackagenamePackagetypeQueryState extends StObject {
  
  /**
    * Lists package versions for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersPathPackagenamePackagetypeQueryState
}
object GetParametersPathPackagenamePackagetypeQueryState {
  
  inline def apply(get: ParametersPathPackagenamePackagetypeQueryState): GetParametersPathPackagenamePackagetypeQueryState = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathPackagenamePackagetypeQueryState]
  }
  
  extension [Self <: GetParametersPathPackagenamePackagetypeQueryState](x: Self) {
    
    inline def setGet(value: ParametersPathPackagenamePackagetypeQueryState): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
