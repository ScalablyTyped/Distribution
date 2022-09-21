package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath361Responses200Content30 extends StObject {
  
  /**
    * Gets the summary of the free and paid GitHub Actions minutes used.
    *
    * Paid minutes only apply to workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for each GitHub-hosted runner operating system. Any job re-runs are also included in the usage. The usage returned includes any minute multipliers for macOS and Windows runners, and is rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * Access tokens must have the `user` scope.
    */
  var get: ParametersPath361Responses200Content30
}
object GetParametersPath361Responses200Content30 {
  
  inline def apply(get: ParametersPath361Responses200Content30): GetParametersPath361Responses200Content30 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath361Responses200Content30]
  }
  
  extension [Self <: GetParametersPath361Responses200Content30](x: Self) {
    
    inline def setGet(value: ParametersPath361Responses200Content30): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
