package typings.passportMicrosoft

import typings.node.httpMod.OutgoingHttpHeaders
import typings.passportMicrosoft.passportMicrosoftBooleans.`false`
import typings.passportMicrosoft.passportMicrosoftBooleans.`true`
import typings.passportOauth2.mod.OAuth2Strategy
import typings.passportOauth2.mod.StateStore
import typings.passportOauth2.mod.VerifyFunction
import typings.passportOauth2.mod.VerifyFunctionWithRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-microsoft", "Strategy")
  @js.native
  class Strategy protected () extends OAuth2Strategy {
    def this(options: MicrosoftStrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
    def this(options: MicrosoftStrategyOptions, verify: VerifyFunction) = this()
  }
  
  /* Inlined std.Omit<passport-oauth2.passport-oauth2.StrategyOptions, passport-microsoft.passport-microsoft.OptionalOptionParameters> & std.Partial<passport-oauth2.passport-oauth2.StrategyOptions> */
  @js.native
  trait MicrosoftStrategyOptions extends StObject {
    
    var authorizationURL: js.UndefOr[String] = js.native
    
    var callbackURL: js.UndefOr[String] = js.native
    
    var clientID: String with js.UndefOr[String] = js.native
    
    var clientSecret: String with js.UndefOr[String] = js.native
    
    var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var passReqToCallback: js.UndefOr[`false`] = js.native
    
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
  object MicrosoftStrategyOptions {
    
    @scala.inline
    def apply(clientID: String with js.UndefOr[String], clientSecret: String with js.UndefOr[String]): MicrosoftStrategyOptions = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[MicrosoftStrategyOptions]
    }
    
    @scala.inline
    implicit class MicrosoftStrategyOptionsMutableBuilder[Self <: MicrosoftStrategyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      @scala.inline
      def setClientID(value: String with js.UndefOr[String]): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String with js.UndefOr[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: `false`): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassReqToCallbackUndefined: Self = StObject.set(x, "passReqToCallback", js.undefined)
      
      @scala.inline
      def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      @scala.inline
      def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setSkipUserProfile(value: js.Any): Self = StObject.set(x, "skipUserProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUserProfileUndefined: Self = StObject.set(x, "skipUserProfile", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  /* Inlined std.Omit<passport-oauth2.passport-oauth2.StrategyOptionsWithRequest, passport-microsoft.passport-microsoft.OptionalOptionParameters> & std.Partial<passport-oauth2.passport-oauth2.StrategyOptionsWithRequest> */
  @js.native
  trait MicrosoftStrategyOptionsWithRequest extends StObject {
    
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
  object MicrosoftStrategyOptionsWithRequest {
    
    @scala.inline
    def apply(
      clientID: String with js.UndefOr[String],
      clientSecret: String with js.UndefOr[String],
      passReqToCallback: `true` with js.UndefOr[`true`]
    ): MicrosoftStrategyOptionsWithRequest = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
      __obj.asInstanceOf[MicrosoftStrategyOptionsWithRequest]
    }
    
    @scala.inline
    implicit class MicrosoftStrategyOptionsWithRequestMutableBuilder[Self <: MicrosoftStrategyOptionsWithRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationURL(value: String): Self = StObject.set(x, "authorizationURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationURLUndefined: Self = StObject.set(x, "authorizationURL", js.undefined)
      
      @scala.inline
      def setCallbackURL(value: String): Self = StObject.set(x, "callbackURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
      
      @scala.inline
      def setClientID(value: String with js.UndefOr[String]): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String with js.UndefOr[String]): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      @scala.inline
      def setPassReqToCallback(value: `true` with js.UndefOr[`true`]): Self = StObject.set(x, "passReqToCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
      
      @scala.inline
      def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparator(value: String): Self = StObject.set(x, "scopeSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeSeparatorUndefined: Self = StObject.set(x, "scopeSeparator", js.undefined)
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
      
      @scala.inline
      def setSessionKey(value: String): Self = StObject.set(x, "sessionKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionKeyUndefined: Self = StObject.set(x, "sessionKey", js.undefined)
      
      @scala.inline
      def setSkipUserProfile(value: js.Any): Self = StObject.set(x, "skipUserProfile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUserProfileUndefined: Self = StObject.set(x, "skipUserProfile", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStore(value: StateStore): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      @scala.inline
      def setTokenURL(value: String): Self = StObject.set(x, "tokenURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenURLUndefined: Self = StObject.set(x, "tokenURL", js.undefined)
    }
  }
  
  // The passport-microsoft library provides defaults for these fields, so they become optional
  // when calling the constructor. (No need to export this).
  /* Rewritten from type alias, can be one of: 
    - typings.passportMicrosoft.passportMicrosoftStrings.authorizationURL
    - typings.passportMicrosoft.passportMicrosoftStrings.tokenURL
    - typings.passportMicrosoft.passportMicrosoftStrings.scopeSeparator
    - typings.passportMicrosoft.passportMicrosoftStrings.customHeaders
  */
  trait OptionalOptionParameters extends StObject
  object OptionalOptionParameters {
    
    @scala.inline
    def authorizationURL: typings.passportMicrosoft.passportMicrosoftStrings.authorizationURL = "authorizationURL".asInstanceOf[typings.passportMicrosoft.passportMicrosoftStrings.authorizationURL]
    
    @scala.inline
    def customHeaders: typings.passportMicrosoft.passportMicrosoftStrings.customHeaders = "customHeaders".asInstanceOf[typings.passportMicrosoft.passportMicrosoftStrings.customHeaders]
    
    @scala.inline
    def scopeSeparator: typings.passportMicrosoft.passportMicrosoftStrings.scopeSeparator = "scopeSeparator".asInstanceOf[typings.passportMicrosoft.passportMicrosoftStrings.scopeSeparator]
    
    @scala.inline
    def tokenURL: typings.passportMicrosoft.passportMicrosoftStrings.tokenURL = "tokenURL".asInstanceOf[typings.passportMicrosoft.passportMicrosoftStrings.tokenURL]
  }
}
