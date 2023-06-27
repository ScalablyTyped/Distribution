package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content43 extends StObject {
  
  /**
    * List accounts for a plan (stubbed)
    * @description Returns repository and organization accounts associated with the specified plan, including free plans. For per-seat pricing, you see the list of accounts that have purchased the plan, including the number of seats purchased. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  var get: Responses200Content43
}
object GetResponses200Content43 {
  
  inline def apply(get: Responses200Content43): GetResponses200Content43 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content43]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content43] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content43): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
