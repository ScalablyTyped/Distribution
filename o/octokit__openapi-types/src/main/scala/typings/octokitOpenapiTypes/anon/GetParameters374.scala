package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters374 extends StObject {
  
  /**
    * Lists packages owned by the authenticated user within the user's namespace.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` scope.
    * If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var get: Parameters374
}
object GetParameters374 {
  
  inline def apply(get: Parameters374): GetParameters374 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters374]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters374] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters374): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
