package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openidClient.anon.Idtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationParameters
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var acr_values: js.UndefOr[String] = js.undefined
  
  var audience: js.UndefOr[String] = js.undefined
  
  var claims: js.UndefOr[String | Idtoken] = js.undefined
  
  var claims_locales: js.UndefOr[String] = js.undefined
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var code_challenge: js.UndefOr[String] = js.undefined
  
  var code_challenge_method: js.UndefOr[String] = js.undefined
  
  var display: js.UndefOr[String] = js.undefined
  
  var id_token_hint: js.UndefOr[String] = js.undefined
  
  var login_hint: js.UndefOr[String] = js.undefined
  
  var max_age: js.UndefOr[Double] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var prompt: js.UndefOr[String] = js.undefined
  
  var redirect_uri: js.UndefOr[String] = js.undefined
  
  var registration: js.UndefOr[String] = js.undefined
  
  var request: js.UndefOr[String] = js.undefined
  
  var request_uri: js.UndefOr[String] = js.undefined
  
  var resource: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var response_mode: js.UndefOr[String] = js.undefined
  
  var response_type: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  var ui_locales: js.UndefOr[String] = js.undefined
}
object AuthorizationParameters {
  
  @scala.inline
  def apply(): AuthorizationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationParameters]
  }
  
  @scala.inline
  implicit class AuthorizationParametersMutableBuilder[Self <: AuthorizationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcr_values(value: String): Self = StObject.set(x, "acr_values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcr_valuesUndefined: Self = StObject.set(x, "acr_values", js.undefined)
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setClaims(value: String | Idtoken): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    @scala.inline
    def setClaims_locales(value: String): Self = StObject.set(x, "claims_locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaims_localesUndefined: Self = StObject.set(x, "claims_locales", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    @scala.inline
    def setCode_challenge(value: String): Self = StObject.set(x, "code_challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode_challengeUndefined: Self = StObject.set(x, "code_challenge", js.undefined)
    
    @scala.inline
    def setCode_challenge_method(value: String): Self = StObject.set(x, "code_challenge_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode_challenge_methodUndefined: Self = StObject.set(x, "code_challenge_method", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setId_token_hint(value: String): Self = StObject.set(x, "id_token_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token_hintUndefined: Self = StObject.set(x, "id_token_hint", js.undefined)
    
    @scala.inline
    def setLogin_hint(value: String): Self = StObject.set(x, "login_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin_hintUndefined: Self = StObject.set(x, "login_hint", js.undefined)
    
    @scala.inline
    def setMax_age(value: Double): Self = StObject.set(x, "max_age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_ageUndefined: Self = StObject.set(x, "max_age", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
    
    @scala.inline
    def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
    
    @scala.inline
    def setRegistration(value: String): Self = StObject.set(x, "registration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationUndefined: Self = StObject.set(x, "registration", js.undefined)
    
    @scala.inline
    def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setRequest_uri(value: String): Self = StObject.set(x, "request_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_uriUndefined: Self = StObject.set(x, "request_uri", js.undefined)
    
    @scala.inline
    def setResource(value: String | js.Array[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setResourceVarargs(value: String*): Self = StObject.set(x, "resource", js.Array(value :_*))
    
    @scala.inline
    def setResponse_mode(value: String): Self = StObject.set(x, "response_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_modeUndefined: Self = StObject.set(x, "response_mode", js.undefined)
    
    @scala.inline
    def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUi_locales(value: String): Self = StObject.set(x, "ui_locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi_localesUndefined: Self = StObject.set(x, "ui_locales", js.undefined)
  }
}
