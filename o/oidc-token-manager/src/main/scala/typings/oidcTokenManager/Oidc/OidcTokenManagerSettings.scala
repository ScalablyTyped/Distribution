package typings.oidcTokenManager.Oidc

import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OidcTokenManagerSettings extends js.Object {
  
  var authority: js.UndefOr[String] = js.native
  
  var authorization_endpoint: js.UndefOr[String] = js.native
  
  var client_id: js.UndefOr[String] = js.native
  
  var end_session_endpoint: js.UndefOr[String] = js.native
  
  var jwks: js.UndefOr[js.Any] = js.native
  
  var jwks_uri: js.UndefOr[String] = js.native
  
  var load_user_profile: js.UndefOr[Boolean] = js.native
  
  var metadata: js.UndefOr[js.Any] = js.native
  
  var persist: js.UndefOr[Boolean] = js.native
  
  var persistKey: js.UndefOr[String] = js.native
  
  var popup_redirect_uri: js.UndefOr[String] = js.native
  
  var post_logout_redirect_uri: js.UndefOr[String] = js.native
  
  var redirect_uri: js.UndefOr[String] = js.native
  
  var request_state_key: js.UndefOr[String] = js.native
  
  var request_state_store: js.UndefOr[Storage] = js.native
  
  var response_type: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var silent_redirect_uri: js.UndefOr[String] = js.native
  
  var silent_renew: js.UndefOr[Boolean] = js.native
  
  var store: js.UndefOr[Storage] = js.native
  
  var userinfo_endpoint: js.UndefOr[String] = js.native
}
object OidcTokenManagerSettings {
  
  @scala.inline
  def apply(): OidcTokenManagerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OidcTokenManagerSettings]
  }
  
  @scala.inline
  implicit class OidcTokenManagerSettingsOps[Self <: OidcTokenManagerSettings] (val x: Self) extends AnyVal {
    
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
    def setAuthority(value: String): Self = this.set("authority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthority: Self = this.set("authority", js.undefined)
    
    @scala.inline
    def setAuthorization_endpoint(value: String): Self = this.set("authorization_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorization_endpoint: Self = this.set("authorization_endpoint", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    
    @scala.inline
    def setEnd_session_endpoint(value: String): Self = this.set("end_session_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_session_endpoint: Self = this.set("end_session_endpoint", js.undefined)
    
    @scala.inline
    def setJwks(value: js.Any): Self = this.set("jwks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwks: Self = this.set("jwks", js.undefined)
    
    @scala.inline
    def setJwks_uri(value: String): Self = this.set("jwks_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwks_uri: Self = this.set("jwks_uri", js.undefined)
    
    @scala.inline
    def setLoad_user_profile(value: Boolean): Self = this.set("load_user_profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoad_user_profile: Self = this.set("load_user_profile", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
    
    @scala.inline
    def setPersistKey(value: String): Self = this.set("persistKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistKey: Self = this.set("persistKey", js.undefined)
    
    @scala.inline
    def setPopup_redirect_uri(value: String): Self = this.set("popup_redirect_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopup_redirect_uri: Self = this.set("popup_redirect_uri", js.undefined)
    
    @scala.inline
    def setPost_logout_redirect_uri(value: String): Self = this.set("post_logout_redirect_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePost_logout_redirect_uri: Self = this.set("post_logout_redirect_uri", js.undefined)
    
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect_uri: Self = this.set("redirect_uri", js.undefined)
    
    @scala.inline
    def setRequest_state_key(value: String): Self = this.set("request_state_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest_state_key: Self = this.set("request_state_key", js.undefined)
    
    @scala.inline
    def setRequest_state_store(value: Storage): Self = this.set("request_state_store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest_state_store: Self = this.set("request_state_store", js.undefined)
    
    @scala.inline
    def setResponse_type(value: String): Self = this.set("response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse_type: Self = this.set("response_type", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSilent_redirect_uri(value: String): Self = this.set("silent_redirect_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent_redirect_uri: Self = this.set("silent_redirect_uri", js.undefined)
    
    @scala.inline
    def setSilent_renew(value: Boolean): Self = this.set("silent_renew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent_renew: Self = this.set("silent_renew", js.undefined)
    
    @scala.inline
    def setStore(value: Storage): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setUserinfo_endpoint(value: String): Self = this.set("userinfo_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserinfo_endpoint: Self = this.set("userinfo_endpoint", js.undefined)
  }
}
