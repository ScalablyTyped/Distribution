package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath370QueryPackagetypePage extends StObject {
  
  /**
    * List packages for a user
    * @description Lists all packages in a user's namespace for which the requesting user has access.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var get: ParametersPath370QueryPackagetypePage
}
object GetParametersPath370QueryPackagetypePage {
  
  inline def apply(get: ParametersPath370QueryPackagetypePage): GetParametersPath370QueryPackagetypePage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath370QueryPackagetypePage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath370QueryPackagetypePage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath370QueryPackagetypePage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
