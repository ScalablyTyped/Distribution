package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostParametersPathPackageversionidResponses115 extends StObject {
  
  /**
    * Restore package version for an organization
    * @description Restores a specific package version in an organization.
    *
    * You can restore a deleted package under the following conditions:
    *   - The package was deleted within the last 30 days.
    *   - The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  var post: ParametersPathPackageversionidResponses115
}
object PostParametersPathPackageversionidResponses115 {
  
  inline def apply(post: ParametersPathPackageversionidResponses115): PostParametersPathPackageversionidResponses115 = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostParametersPathPackageversionidResponses115]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostParametersPathPackageversionidResponses115] (val x: Self) extends AnyVal {
    
    inline def setPost(value: ParametersPathPackageversionidResponses115): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
