package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content374 extends StObject {
  
  /**
    * Get public key for the authenticated user
    * @description Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  var get: Responses200Content374
}
object GetResponses200Content374 {
  
  inline def apply(get: Responses200Content374): GetResponses200Content374 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content374]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content374] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content374): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
