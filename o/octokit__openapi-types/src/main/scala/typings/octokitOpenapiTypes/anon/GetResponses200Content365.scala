package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content365 extends StObject {
  
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  var get: Responses200Content365
}
object GetResponses200Content365 {
  
  inline def apply(get: Responses200Content365): GetResponses200Content365 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content365]
  }
  
  extension [Self <: GetResponses200Content365](x: Self) {
    
    inline def setGet(value: Responses200Content365): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
