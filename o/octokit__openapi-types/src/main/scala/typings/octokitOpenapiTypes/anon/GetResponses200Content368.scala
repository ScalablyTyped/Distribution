package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content368 extends StObject {
  
  /**
    * Get the authenticated user
    * @description If the authenticated user is authenticated through basic authentication or OAuth with the `user` scope, then the response lists public and private profile information.
    *
    * If the authenticated user is authenticated through OAuth without the `user` scope, then the response lists only public profile information.
    */
  var get: Responses200Content368
  
  /**
    * Update the authenticated user
    * @description **Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.
    */
  var patch: Responses200Content369
}
object GetResponses200Content368 {
  
  inline def apply(get: Responses200Content368, patch: Responses200Content369): GetResponses200Content368 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content368]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content368] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content368): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200Content369): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
