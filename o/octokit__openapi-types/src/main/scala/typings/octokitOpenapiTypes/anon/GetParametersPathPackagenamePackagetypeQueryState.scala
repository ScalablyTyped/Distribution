package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathPackagenamePackagetypeQueryState extends StObject {
  
  /**
    * List package versions for a package owned by the authenticated user
    * @description Lists package versions for a package owned by the authenticated user.
    *
    * To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
    */
  var get: ParametersPathPackagenamePackagetypeQueryState
}
object GetParametersPathPackagenamePackagetypeQueryState {
  
  inline def apply(get: ParametersPathPackagenamePackagetypeQueryState): GetParametersPathPackagenamePackagetypeQueryState = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathPackagenamePackagetypeQueryState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathPackagenamePackagetypeQueryState] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathPackagenamePackagetypeQueryState): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
