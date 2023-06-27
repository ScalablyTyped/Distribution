package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponses115 extends StObject {
  
  /**
    * Delete a package for an organization
    * @description Deletes an entire package in an organization. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  var delete: Responses115
  
  /**
    * Get a package for an organization
    * @description Gets a specific package in an organization.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var get: ParametersPathPackagename
}
object DeleteResponses115 {
  
  inline def apply(delete: Responses115, get: ParametersPathPackagename): DeleteResponses115 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponses115]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponses115] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses115): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathPackagename): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
