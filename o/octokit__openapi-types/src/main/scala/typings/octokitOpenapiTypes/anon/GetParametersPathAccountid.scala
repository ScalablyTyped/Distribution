package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathAccountid extends StObject {
  
  /**
    * Get a subscription plan for an account
    * @description Shows whether the user or organization account actively subscribes to a plan listed by the authenticated GitHub App. When someone submits a plan change that won't be processed until the end of their billing cycle, you will also see the upcoming pending change.
    *
    * GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  var get: ParametersPathAccountid
}
object GetParametersPathAccountid {
  
  inline def apply(get: ParametersPathAccountid): GetParametersPathAccountid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathAccountid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathAccountid] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathAccountid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
