package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses401404 extends StObject {
  
  /**
    * List plans
    * @description Lists all plans that are part of your GitHub Marketplace listing.
    *
    * GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  var get: Responses401404
}
object GetResponses401404 {
  
  inline def apply(get: Responses401404): GetResponses401404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses401404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses401404] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses401404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
