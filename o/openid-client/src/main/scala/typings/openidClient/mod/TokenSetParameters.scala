package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenSetParameters
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * The raw access token in JWT format
    */
  var access_token: js.UndefOr[String] = js.native
  
  /**
    * When the token set was received the expires_at field was calculated based on current timestamp
    * and the expires_in. When recalling a TokenSet instance just the expires_at should be passed in.
    */
  var expires_at: js.UndefOr[Double] = js.native
  
  /**
    * The raw id token in JWT format
    */
  var id_token: js.UndefOr[String] = js.native
  
  /**
    * Refresh token, opaque string value
    */
  var refresh_token: js.UndefOr[String] = js.native
  
  /**
    * space-separated scope(s) used for the authentication request
    */
  var scope: js.UndefOr[String] = js.native
  
  /**
    * State value passed in the authentication request
    */
  var session_state: js.UndefOr[String] = js.native
  
  /**
    * Usually "Bearer"
    */
  var token_type: js.UndefOr[String] = js.native
}
object TokenSetParameters {
  
  @scala.inline
  def apply(): TokenSetParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenSetParameters]
  }
  
  @scala.inline
  implicit class TokenSetParametersOps[Self <: TokenSetParameters] (val x: Self) extends AnyVal {
    
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setExpires_at(value: Double): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires_at: Self = this.set("expires_at", js.undefined)
    
    @scala.inline
    def setId_token(value: String): Self = this.set("id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId_token: Self = this.set("id_token", js.undefined)
    
    @scala.inline
    def setRefresh_token(value: String): Self = this.set("refresh_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefresh_token: Self = this.set("refresh_token", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSession_state(value: String): Self = this.set("session_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession_state: Self = this.set("session_state", js.undefined)
    
    @scala.inline
    def setToken_type(value: String): Self = this.set("token_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_type: Self = this.set("token_type", js.undefined)
  }
}
