package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjson617 extends StObject {
  
  /**
    * Lists all secrets available for a user's Codespaces without revealing their
    * encrypted values.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  var get: Responses200ContentApplicationjson617
}
object GetResponses200ContentApplicationjson617 {
  
  inline def apply(get: Responses200ContentApplicationjson617): GetResponses200ContentApplicationjson617 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjson617]
  }
  
  extension [Self <: GetResponses200ContentApplicationjson617](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjson617): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
