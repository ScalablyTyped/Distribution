package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content40 extends StObject {
  
  /**
    * Get a subscription plan for an account (stubbed)
    * @description Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  var get: Responses200Content40
}
object GetResponses200Content40 {
  
  inline def apply(get: Responses200Content40): GetResponses200Content40 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content40]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content40] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content40): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
