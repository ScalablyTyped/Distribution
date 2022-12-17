package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath348Responses200Content106 extends StObject {
  
  /**
    * Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `user` scope.
    */
  var get: ParametersPath348Responses200Content106
}
object GetParametersPath348Responses200Content106 {
  
  inline def apply(get: ParametersPath348Responses200Content106): GetParametersPath348Responses200Content106 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath348Responses200Content106]
  }
  
  extension [Self <: GetParametersPath348Responses200Content106](x: Self) {
    
    inline def setGet(value: ParametersPath348Responses200Content106): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
