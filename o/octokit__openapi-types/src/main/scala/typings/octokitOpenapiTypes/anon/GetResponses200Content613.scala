package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content613 extends StObject {
  
  /**
    * If the authenticated user is authenticated through basic authentication or OAuth with the `user` scope, then the response lists public and private profile information.
    *
    * If the authenticated user is authenticated through OAuth without the `user` scope, then the response lists only public profile information.
    */
  var get: Responses200Content613
  
  /** **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API. */
  var patch: Responses200Content614
}
object GetResponses200Content613 {
  
  inline def apply(get: Responses200Content613, patch: Responses200Content614): GetResponses200Content613 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content613]
  }
  
  extension [Self <: GetResponses200Content613](x: Self) {
    
    inline def setGet(value: Responses200Content613): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content614): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
