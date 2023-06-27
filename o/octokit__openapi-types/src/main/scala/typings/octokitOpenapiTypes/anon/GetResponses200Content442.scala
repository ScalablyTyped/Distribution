package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content442 extends StObject {
  
  /**
    * Get the authenticated user
    * @description If the authenticated user is authenticated with an OAuth token with the `user` scope, then the response lists public and private profile information.
    *
    * If the authenticated user is authenticated through OAuth without the `user` scope, then the response lists only public profile information.
    */
  var get: Responses200Content442
  
  /**
    * Update the authenticated user
    * @description **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  var patch: Responses200Content443
}
object GetResponses200Content442 {
  
  inline def apply(get: Responses200Content442, patch: Responses200Content443): GetResponses200Content442 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content442]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content442] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content442): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content443): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
