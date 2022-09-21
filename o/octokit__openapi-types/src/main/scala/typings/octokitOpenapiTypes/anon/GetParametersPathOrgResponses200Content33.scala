package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathOrgResponses200Content33 extends StObject {
  
  /**
    * Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.
    *
    * Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."
    *
    * Access tokens must have the `repo` or `admin:org` scope.
    */
  var get: ParametersPathOrgResponses200Content33
}
object GetParametersPathOrgResponses200Content33 {
  
  inline def apply(get: ParametersPathOrgResponses200Content33): GetParametersPathOrgResponses200Content33 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathOrgResponses200Content33]
  }
  
  extension [Self <: GetParametersPathOrgResponses200Content33](x: Self) {
    
    inline def setGet(value: ParametersPathOrgResponses200Content33): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
