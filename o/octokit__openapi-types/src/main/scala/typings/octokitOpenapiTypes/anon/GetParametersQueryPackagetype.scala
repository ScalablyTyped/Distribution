package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPackagetype extends StObject {
  
  /**
    * List packages for an organization
    * @description Lists packages in an organization readable by the user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var get: ParametersQueryPackagetype
}
object GetParametersQueryPackagetype {
  
  inline def apply(get: ParametersQueryPackagetype): GetParametersQueryPackagetype = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPackagetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryPackagetype] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPackagetype): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
