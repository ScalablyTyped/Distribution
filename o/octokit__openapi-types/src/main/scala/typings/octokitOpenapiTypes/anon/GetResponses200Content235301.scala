package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content235301 extends StObject {
  
  /**
    * Enables an authenticated GitHub App to find the repository's installation information. The installation's account type will be either an organization or a user account, depending which account the repository belongs to.
    *
    * You must use a [JWT](https://docs.github.com/apps/building-github-apps/authenticating-with-github-apps/#authenticating-as-a-github-app) to access this endpoint.
    */
  var get: Responses200Content235301
}
object GetResponses200Content235301 {
  
  inline def apply(get: Responses200Content235301): GetResponses200Content235301 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content235301]
  }
  
  extension [Self <: GetResponses200Content235301](x: Self) {
    
    inline def setGet(value: Responses200Content235301): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
