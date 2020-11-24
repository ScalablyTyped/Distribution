package typings.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OidcToken extends js.Object {
  
  var access_token: String = js.native
  
  var expired: Boolean = js.native
  
  var expires_at: Double = js.native
  
  var expires_in: Double = js.native
  
  var id_token: String = js.native
  
  var profile: String = js.native
  
  var scope: String = js.native
  
  var scopes: js.Array[String] = js.native
  
  var session_state: js.Any = js.native
  
  def toJSON(): String = js.native
}
object OidcToken {
  
  @scala.inline
  def apply(
    access_token: String,
    expired: Boolean,
    expires_at: Double,
    expires_in: Double,
    id_token: String,
    profile: String,
    scope: String,
    scopes: js.Array[String],
    session_state: js.Any,
    toJSON: () => String
  ): OidcToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], session_state = session_state.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[OidcToken]
  }
  
  @scala.inline
  implicit class OidcTokenOps[Self <: OidcToken] (val x: Self) extends AnyVal {
    
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
    def setExpired(value: Boolean): Self = this.set("expired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_at(value: Double): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_in(value: Double): Self = this.set("expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token(value: String): Self = this.set("id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_state(value: js.Any): Self = this.set("session_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
