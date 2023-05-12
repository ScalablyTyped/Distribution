package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPackagetypePage extends StObject {
  
  /**
    * List packages for the authenticated user's namespace
    * @description Lists packages owned by the authenticated user within the user's namespace.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var get: ParametersQueryPackagetypePage
}
object GetParametersQueryPackagetypePage {
  
  inline def apply(get: ParametersQueryPackagetypePage): GetParametersQueryPackagetypePage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPackagetypePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryPackagetypePage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPackagetypePage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
