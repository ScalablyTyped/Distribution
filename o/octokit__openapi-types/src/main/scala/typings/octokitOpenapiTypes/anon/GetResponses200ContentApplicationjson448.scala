package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjson448 extends StObject {
  
  /**
    * List secrets for the authenticated user
    * @description Lists all secrets available for a user's Codespaces without revealing their
    * encrypted values.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  var get: Responses200ContentApplicationjson448
}
object GetResponses200ContentApplicationjson448 {
  
  inline def apply(get: Responses200ContentApplicationjson448): GetResponses200ContentApplicationjson448 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjson448]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200ContentApplicationjson448] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200ContentApplicationjson448): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
