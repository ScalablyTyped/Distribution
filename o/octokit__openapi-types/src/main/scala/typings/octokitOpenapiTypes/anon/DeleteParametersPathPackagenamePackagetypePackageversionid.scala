package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathPackagenamePackagetypePackageversionid extends StObject {
  
  /**
    * Delete package version for a user
    * @description Deletes a specific package version for a user. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:
    * - If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    * - If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."
    */
  var delete: ParametersPathPackagenamePackagetypePackageversionid
  
  /**
    * Get a package version for a user
    * @description Gets a specific package version for a public package owned by a specified user.
    *
    * At this time, to use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var get: ParametersPathPackageversionidUsername
}
object DeleteParametersPathPackagenamePackagetypePackageversionid {
  
  inline def apply(
    delete: ParametersPathPackagenamePackagetypePackageversionid,
    get: ParametersPathPackageversionidUsername
  ): DeleteParametersPathPackagenamePackagetypePackageversionid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathPackagenamePackagetypePackageversionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPathPackagenamePackagetypePackageversionid] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPathPackagenamePackagetypePackageversionid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathPackageversionidUsername): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
