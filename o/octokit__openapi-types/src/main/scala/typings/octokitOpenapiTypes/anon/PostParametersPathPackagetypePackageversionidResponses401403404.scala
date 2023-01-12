package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathPackagetypePackageversionidResponses401403404 extends StObject {
  
  /**
    * Restores a package version owned by the authenticated user.
    *
    * You can restore a deleted package version under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var post: ParametersPathPackagetypePackageversionidResponses401403404
}
object PostParametersPathPackagetypePackageversionidResponses401403404 {
  
  inline def apply(post: ParametersPathPackagetypePackageversionidResponses401403404): PostParametersPathPackagetypePackageversionidResponses401403404 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathPackagetypePackageversionidResponses401403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathPackagetypePackageversionidResponses401403404] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathPackagetypePackageversionidResponses401403404): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
