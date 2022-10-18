package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content288 extends StObject {
  
  /**
    * Lists all plans that are part of your GitHub Marketplace listing.
    *
    * GitHub Apps must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint. OAuth Apps must use [basic authentication](https://docs.github.com/rest/overview/other-authentication-methods#basic-authentication) with their client ID and client secret to access this endpoint.
    */
  var get: Responses200Content288
}
object GetResponses200Content288 {
  
  inline def apply(get: Responses200Content288): GetResponses200Content288 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content288]
  }
  
  extension [Self <: GetResponses200Content288](x: Self) {
    
    inline def setGet(value: Responses200Content288): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
