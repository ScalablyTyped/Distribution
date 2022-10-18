package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPath642QueryToken extends StObject {
  
  /**
    * Restores a package owned by the authenticated user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. If `package_type` is not `container`, your token must also include the `repo` scope.
    */
  var post: ParametersPath642QueryToken
}
object PostParametersPath642QueryToken {
  
  inline def apply(post: ParametersPath642QueryToken): PostParametersPath642QueryToken = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPath642QueryToken]
  }
  
  extension [Self <: PostParametersPath642QueryToken](x: Self) {
    
    inline def setPost(value: ParametersPath642QueryToken): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
