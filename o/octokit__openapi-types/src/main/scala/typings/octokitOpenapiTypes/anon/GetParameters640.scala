package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters640 extends StObject {
  
  /**
    * Lists packages owned by the authenticated user within the user's namespace.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: Parameters640
}
object GetParameters640 {
  
  inline def apply(get: Parameters640): GetParameters640 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters640]
  }
  
  extension [Self <: GetParameters640](x: Self) {
    
    inline def setGet(value: Parameters640): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
