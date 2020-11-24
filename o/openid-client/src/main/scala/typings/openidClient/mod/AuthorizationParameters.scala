package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openidClient.anon.Idtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationParameters
  extends /* key */ StringDictionary[js.Any] {
  
  var acr_values: js.UndefOr[String] = js.native
  
  var audience: js.UndefOr[String] = js.native
  
  var claims: js.UndefOr[String | Idtoken] = js.native
  
  var claims_locales: js.UndefOr[String] = js.native
  
  var client_id: js.UndefOr[String] = js.native
  
  var code_challenge: js.UndefOr[String] = js.native
  
  var code_challenge_method: js.UndefOr[String] = js.native
  
  var display: js.UndefOr[String] = js.native
  
  var id_token_hint: js.UndefOr[String] = js.native
  
  var login_hint: js.UndefOr[String] = js.native
  
  var max_age: js.UndefOr[Double] = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var prompt: js.UndefOr[String] = js.native
  
  var redirect_uri: js.UndefOr[String] = js.native
  
  var registration: js.UndefOr[String] = js.native
  
  var request: js.UndefOr[String] = js.native
  
  var request_uri: js.UndefOr[String] = js.native
  
  var resource: js.UndefOr[String | js.Array[String]] = js.native
  
  var response_mode: js.UndefOr[String] = js.native
  
  var response_type: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var ui_locales: js.UndefOr[String] = js.native
}
object AuthorizationParameters {
  
  @scala.inline
  def apply(): AuthorizationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationParameters]
  }
  
  @scala.inline
  implicit class AuthorizationParametersOps[Self <: AuthorizationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcr_values(value: String): Self = this.set("acr_values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcr_values: Self = this.set("acr_values", js.undefined)
    
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setClaims(value: String | Idtoken): Self = this.set("claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaims: Self = this.set("claims", js.undefined)
    
    @scala.inline
    def setClaims_locales(value: String): Self = this.set("claims_locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaims_locales: Self = this.set("claims_locales", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    
    @scala.inline
    def setCode_challenge(value: String): Self = this.set("code_challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode_challenge: Self = this.set("code_challenge", js.undefined)
    
    @scala.inline
    def setCode_challenge_method(value: String): Self = this.set("code_challenge_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode_challenge_method: Self = this.set("code_challenge_method", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setId_token_hint(value: String): Self = this.set("id_token_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId_token_hint: Self = this.set("id_token_hint", js.undefined)
    
    @scala.inline
    def setLogin_hint(value: String): Self = this.set("login_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogin_hint: Self = this.set("login_hint", js.undefined)
    
    @scala.inline
    def setMax_age(value: Double): Self = this.set("max_age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_age: Self = this.set("max_age", js.undefined)
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect_uri: Self = this.set("redirect_uri", js.undefined)
    
    @scala.inline
    def setRegistration(value: String): Self = this.set("registration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistration: Self = this.set("registration", js.undefined)
    
    @scala.inline
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    
    @scala.inline
    def setRequest_uri(value: String): Self = this.set("request_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest_uri: Self = this.set("request_uri", js.undefined)
    
    @scala.inline
    def setResourceVarargs(value: String*): Self = this.set("resource", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: String | js.Array[String]): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setResponse_mode(value: String): Self = this.set("response_mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse_mode: Self = this.set("response_mode", js.undefined)
    
    @scala.inline
    def setResponse_type(value: String): Self = this.set("response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse_type: Self = this.set("response_type", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUi_locales(value: String): Self = this.set("ui_locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUi_locales: Self = this.set("ui_locales", js.undefined)
  }
}
