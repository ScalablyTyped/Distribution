package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathPackagetypePackageversionidResponses99 extends StObject {
  
  /**
    * Delete a package version for the authenticated user
    * @description Deletes a specific package version for a package owned by the authenticated user.  If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes.
    * If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var delete: ParametersPathPackagetypePackageversionidResponses99
  
  /**
    * Get a package version for the authenticated user
    * @description Gets a specific package version for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var get: ParametersPathPackagetypePackageversionid
}
object DeleteParametersPathPackagetypePackageversionidResponses99 {
  
  inline def apply(
    delete: ParametersPathPackagetypePackageversionidResponses99,
    get: ParametersPathPackagetypePackageversionid
  ): DeleteParametersPathPackagetypePackageversionidResponses99 = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathPackagetypePackageversionidResponses99]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathPackagetypePackageversionidResponses99] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathPackagetypePackageversionidResponses99): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathPackagetypePackageversionid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
