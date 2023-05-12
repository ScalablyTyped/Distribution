package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content390 extends StObject {
  
  /**
    * List subscriptions for the authenticated user (stubbed)
    * @description Lists the active subscriptions for the authenticated user. You must use a [user-to-server OAuth access token](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/#identifying-users-on-your-site), created for a user who has authorized your GitHub App, to access this endpoint. . OAuth Apps must authenticate using an [OAuth token](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/).
    */
  var get: Responses200Content390
}
object GetResponses200Content390 {
  
  inline def apply(get: Responses200Content390): GetResponses200Content390 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content390]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content390] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content390): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
