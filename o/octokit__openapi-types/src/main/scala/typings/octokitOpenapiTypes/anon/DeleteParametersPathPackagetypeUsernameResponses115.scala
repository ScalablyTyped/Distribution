package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathPackagetypeUsernameResponses115 extends StObject {
  
  /**
    * Delete a package for a user
    * @description Deletes an entire package for a user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  var delete: ParametersPathPackagetypeUsernameResponses115
  
  /**
    * Get a package for a user
    * @description Gets a specific package metadata for a public package owned by a user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var get: ParametersPathPackagetypeUsername
}
object DeleteParametersPathPackagetypeUsernameResponses115 {
  
  inline def apply(delete: ParametersPathPackagetypeUsernameResponses115, get: ParametersPathPackagetypeUsername): DeleteParametersPathPackagetypeUsernameResponses115 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathPackagetypeUsernameResponses115]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathPackagetypeUsernameResponses115] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathPackagetypeUsernameResponses115): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathPackagetypeUsername): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
