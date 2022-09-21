package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath361Responses200Content32 extends StObject {
  
  /**
    * Gets the free and paid storage used for GitHub Packages in gigabytes.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `user` scope.
    */
  var get: ParametersPath361Responses200Content32
}
object GetParametersPath361Responses200Content32 {
  
  inline def apply(get: ParametersPath361Responses200Content32): GetParametersPath361Responses200Content32 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath361Responses200Content32]
  }
  
  extension [Self <: GetParametersPath361Responses200Content32](x: Self) {
    
    inline def setGet(value: ParametersPath361Responses200Content32): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
