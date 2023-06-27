package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content164 extends StObject {
  
  /**
    * Get required workflow usage
    * @description Gets the number of billable minutes used by a specific required workflow during the current billing cycle.
    *
    * Billable minutes only apply to required workflows running in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)."
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  var get: Responses200Content164
}
object GetResponses200Content164 {
  
  inline def apply(get: Responses200Content164): GetResponses200Content164 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content164]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content164] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content164): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
