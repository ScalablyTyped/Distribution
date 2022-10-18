package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPath643Responses354 extends StObject {
  
  /**
    * Restores a package version owned by the authenticated user.
    *
    * You can restore a deleted package version under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var post: ParametersPath643Responses354
}
object PostParametersPath643Responses354 {
  
  inline def apply(post: ParametersPath643Responses354): PostParametersPath643Responses354 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPath643Responses354]
  }
  
  extension [Self <: PostParametersPath643Responses354](x: Self) {
    
    inline def setPost(value: ParametersPath643Responses354): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
