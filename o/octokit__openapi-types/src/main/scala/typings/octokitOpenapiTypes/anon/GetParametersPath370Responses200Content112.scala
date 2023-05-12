package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath370Responses200Content112 extends StObject {
  
  /**
    * Get shared storage billing for a user
    * @description Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `user` scope.
    */
  var get: ParametersPath370Responses200Content112
}
object GetParametersPath370Responses200Content112 {
  
  inline def apply(get: ParametersPath370Responses200Content112): GetParametersPath370Responses200Content112 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath370Responses200Content112]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath370Responses200Content112] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath370Responses200Content112): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
