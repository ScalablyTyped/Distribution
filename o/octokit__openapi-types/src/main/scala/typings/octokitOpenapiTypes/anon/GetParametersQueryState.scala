package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryState extends StObject {
  
  /**
    * List package versions for a package owned by an organization
    * @description Lists package versions for a package owned by an organization.
    *
    * If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var get: ParametersQueryState
}
object GetParametersQueryState {
  
  inline def apply(get: ParametersQueryState): GetParametersQueryState = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryState] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryState): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
