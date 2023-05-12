package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathPackagetypePackageversionidResponses99 extends StObject {
  
  /**
    * Restore a package version for the authenticated user
    * @description Restores a package version owned by the authenticated user.
    *
    * You can restore a deleted package version under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var post: ParametersPathPackagetypePackageversionidResponses99
}
object PostParametersPathPackagetypePackageversionidResponses99 {
  
  inline def apply(post: ParametersPathPackagetypePackageversionidResponses99): PostParametersPathPackagetypePackageversionidResponses99 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathPackagetypePackageversionidResponses99]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathPackagetypePackageversionidResponses99] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathPackagetypePackageversionidResponses99): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
