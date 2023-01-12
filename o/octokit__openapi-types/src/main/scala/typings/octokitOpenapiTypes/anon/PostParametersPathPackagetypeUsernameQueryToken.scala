package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathPackagetypeUsernameQueryToken extends StObject {
  
  /**
    * Restores an entire package for a user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `packages:read` and `packages:write` scopes. In addition:
    * - If `package_type` is not `container`, your token must also include the `repo` scope.
    * - If `package_type` is `container`, you must also have admin permissions to the container that you want to restore.
    */
  var post: ParametersPathPackagetypeUsernameQueryToken
}
object PostParametersPathPackagetypeUsernameQueryToken {
  
  inline def apply(post: ParametersPathPackagetypeUsernameQueryToken): PostParametersPathPackagetypeUsernameQueryToken = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathPackagetypeUsernameQueryToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathPackagetypeUsernameQueryToken] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathPackagetypeUsernameQueryToken): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
