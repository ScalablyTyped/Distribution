package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackParamsType
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
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
  
  @scala.inline
  def apply(): CallbackParamsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackParamsType]
  }
  
  @scala.inline
  implicit class CallbackParamsTypeMutableBuilder[Self <: CallbackParamsType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_descriptionUndefined: Self = StObject.set(x, "error_description", js.undefined)
    
    @scala.inline
    def setError_uri(value: String): Self = StObject.set(x, "error_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_uriUndefined: Self = StObject.set(x, "error_uri", js.undefined)
    
    @scala.inline
    def setExpires_in(value: String): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
    
    @scala.inline
    def setId_token(value: String): Self = StObject.set(x, "id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_tokenUndefined: Self = StObject.set(x, "id_token", js.undefined)
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    @scala.inline
    def setSession_state(value: String): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_stateUndefined: Self = StObject.set(x, "session_state", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_typeUndefined: Self = StObject.set(x, "token_type", js.undefined)
  }
}
