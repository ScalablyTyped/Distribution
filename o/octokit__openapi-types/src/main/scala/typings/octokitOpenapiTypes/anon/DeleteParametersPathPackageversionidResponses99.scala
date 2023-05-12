package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathPackageversionidResponses99 extends StObject {
  
  /**
    * Delete package version for an organization
    * @description Deletes a specific package version in an organization. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  var delete: ParametersPathPackageversionidResponses99
  
  /**
    * Get a package version for an organization
    * @description Gets a specific package version in an organization.
    *
    * You must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var get: ParametersPathPackageversionid
}
object DeleteParametersPathPackageversionidResponses99 {
  
  inline def apply(delete: ParametersPathPackageversionidResponses99, get: ParametersPathPackageversionid): DeleteParametersPathPackageversionidResponses99 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathPackageversionidResponses99]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathPackageversionidResponses99] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathPackageversionidResponses99): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathPackageversionid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
