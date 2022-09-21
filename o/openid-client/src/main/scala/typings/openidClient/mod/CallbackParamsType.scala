package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackParamsType
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var code: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var error_description: js.UndefOr[String] = js.undefined
  
  var error_uri: js.UndefOr[String] = js.undefined
  
  var expires_in: js.UndefOr[String] = js.undefined
  
  var id_token: js.UndefOr[String] = js.undefined
  
  var response: js.UndefOr[String] = js.undefined
  
  var session_state: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  var token_type: js.UndefOr[String] = js.undefined
}
object CallbackParamsType {
  
  inline def apply(): CallbackParamsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackParamsType]
  }
  
  extension [Self <: CallbackParamsType](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
    
    inline def setError_descriptionUndefined: Self = StObject.set(x, "error_description", js.undefined)
    
    inline def setError_uri(value: String): Self = StObject.set(x, "error_uri", value.asInstanceOf[js.Any])
    
    inline def setError_uriUndefined: Self = StObject.set(x, "error_uri", js.undefined)
    
    inline def setExpires_in(value: String): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
    
    inline def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
    
    inline def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setSession_state(value: String): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
    
    inline def setSession_stateUndefined: Self = StObject.set(x, "session_state", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    
    inline def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
  }
}
