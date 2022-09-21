package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters386 extends StObject {
  
  /**
    * Lists packages owned by the authenticated user within the user's namespace.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: Parameters386
}
object GetParameters386 {
  
  inline def apply(get: Parameters386): GetParameters386 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters386]
  }
  
  extension [Self <: GetParameters386](x: Self) {
    
    inline def setGet(value: Parameters386): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
