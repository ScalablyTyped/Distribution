package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathPackagetypeUsernameQueryToken extends StObject {
  
  /**
    * Restore a package for a user
    * @description Restores an entire package for a user.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
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
