package typings.passportTwitchLatest.mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportOauth2.mod.StateStore
import typings.passportTwitchLatest.passportTwitchLatestBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined passport-twitch-latest.passport-twitch-latest.Optional<passport-oauth2.passport-oauth2.StrategyOptionsWithRequest, 'authorizationURL' | 'tokenURL'> */
@js.native
trait StrategyOptionsWithRequest extends js.Object {
  
  var authorizationURL: js.UndefOr[String] = js.native
  
  var callbackURL: js.UndefOr[String] = js.native
  
  var clientID: String with js.UndefOr[String] = js.native
  
  var clientSecret: String with js.UndefOr[String] = js.native
  
  var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  
  var passReqToCallback: `true` with js.UndefOr[`true`] = js.native
  
  var pkce: js.UndefOr[Boolean] = js.native
  
  var proxy: js.UndefOr[js.Any] = js.native
  
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  
  var scopeSeparator: js.UndefOr[String] = js.native
  
  var sessionKey: js.UndefOr[String] = js.native
  
  var skipUserProfile: js.UndefOr[js.Any] = js.native
  
  var state: js.UndefOr[js.Any] = js.native
  
  var store: js.UndefOr[StateStore] = js.native
  
  var tokenURL: js.UndefOr[String] = js.native
}
object StrategyOptionsWithRequest {
  
  @scala.inline
  def apply(
    clientID: String with js.UndefOr[String],
    clientSecret: String with js.UndefOr[String],
    passReqToCallback: `true` with js.UndefOr[`true`]
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
  
  @scala.inline
  implicit class StrategyOptionsWithRequestOps[Self <: StrategyOptionsWithRequest] (val x: Self) extends AnyVal {
    
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
    def setClientID(value: String with js.UndefOr[String]): Self = this.set("clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String with js.UndefOr[String]): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassReqToCallback(value: `true` with js.UndefOr[`true`]): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationURL(value: String): Self = this.set("authorizationURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizationURL: Self = this.set("authorizationURL", js.undefined)
    
    @scala.inline
    def setCallbackURL(value: String): Self = this.set("callbackURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallbackURL: Self = this.set("callbackURL", js.undefined)
    
    @scala.inline
    def setCustomHeaders(value: OutgoingHttpHeaders): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    
    @scala.inline
    def setPkce(value: Boolean): Self = this.set("pkce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkce: Self = this.set("pkce", js.undefined)
    
    @scala.inline
    def setProxy(value: js.Any): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setScopeSeparator(value: String): Self = this.set("scopeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeSeparator: Self = this.set("scopeSeparator", js.undefined)
    
    @scala.inline
    def setSessionKey(value: String): Self = this.set("sessionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionKey: Self = this.set("sessionKey", js.undefined)
    
    @scala.inline
    def setSkipUserProfile(value: js.Any): Self = this.set("skipUserProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipUserProfile: Self = this.set("skipUserProfile", js.undefined)
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStore(value: StateStore): Self = this.set("store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    
    @scala.inline
    def setTokenURL(value: String): Self = this.set("tokenURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenURL: Self = this.set("tokenURL", js.undefined)
  }
}
