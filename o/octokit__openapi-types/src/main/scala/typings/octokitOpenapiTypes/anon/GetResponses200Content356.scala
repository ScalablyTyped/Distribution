package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content356 extends StObject {
  
  /**
    * Lists package versions for a public package owned by a specified user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: Responses200Content356
}
object GetResponses200Content356 {
  
  inline def apply(get: Responses200Content356): GetResponses200Content356 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content356]
  }
  
  extension [Self <: GetResponses200Content356](x: Self) {
    
    inline def setGet(value: Responses200Content356): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
