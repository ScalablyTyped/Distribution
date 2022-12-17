package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200401403404 extends StObject {
  
  /**
    * Lists package versions for a public package owned by a specified user.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: Responses200401403404
}
object GetResponses200401403404 {
  
  inline def apply(get: Responses200401403404): GetResponses200401403404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200401403404]
  }
  
  extension [Self <: GetResponses200401403404](x: Self) {
    
    inline def setGet(value: Responses200401403404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
