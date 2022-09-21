package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryState extends StObject {
  
  /**
    * Lists package versions for a package owned by an organization.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: ParametersQueryState
}
object GetParametersQueryState {
  
  inline def apply(get: ParametersQueryState): GetParametersQueryState = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryState]
  }
  
  extension [Self <: GetParametersQueryState](x: Self) {
    
    inline def setGet(value: ParametersQueryState): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
