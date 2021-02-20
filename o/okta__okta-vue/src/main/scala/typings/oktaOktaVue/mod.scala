package typings.oktaOktaVue

import typings.oktaOktaVue.anon.AuthRedirectGuard
import typings.oktaOktaVue.anon.AutoRenew
import typings.oktaOktaVue.mod.OktaVuePlugin.OktaVueOptions
import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@okta/okta-vue", JSImport.Default)
    @js.native
    def apply(): PluginFunction[VueConstructor[Vue]] = js.native
    
    @JSImport("@okta/okta-vue", "default.handleCallback")
    @js.native
    def handleCallback(): VueConstructor[Vue] = js.native
    
    @JSImport("@okta/okta-vue", "default.install")
    @js.native
    def install(vm: VueConstructor[Vue], options: OktaVueOptions): PluginFunction[VueConstructor[Vue]] = js.native
  }
  
  object OktaVuePlugin {
    
    @js.native
    trait OktaAuthJsOptions extends OktaOpenIDOptions {
      
      var authorizeUrl: js.UndefOr[String] = js.native
      
      var ignoreSignature: js.UndefOr[Boolean] = js.native
      
      var maxClockSkew: js.UndefOr[Double] = js.native
      
      var pkce: js.UndefOr[Boolean] = js.native
      
      var postLogoutRedirectUri: js.UndefOr[String] = js.native
      
      var tokenManager: js.UndefOr[AutoRenew] = js.native
      
      var tokenUrl: js.UndefOr[String] = js.native
      
      var userinfoUrl: js.UndefOr[String] = js.native
    }
    object OktaAuthJsOptions {
      
      @scala.inline
      def apply(): OktaAuthJsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OktaAuthJsOptions]
      }
      
      @scala.inline
      implicit class OktaAuthJsOptionsMutableBuilder[Self <: OktaAuthJsOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuthorizeUrl(value: String): Self = StObject.set(x, "authorizeUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthorizeUrlUndefined: Self = StObject.set(x, "authorizeUrl", js.undefined)
        
        @scala.inline
        def setIgnoreSignature(value: Boolean): Self = StObject.set(x, "ignoreSignature", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnoreSignatureUndefined: Self = StObject.set(x, "ignoreSignature", js.undefined)
        
        @scala.inline
        def setMaxClockSkew(value: Double): Self = StObject.set(x, "maxClockSkew", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxClockSkewUndefined: Self = StObject.set(x, "maxClockSkew", js.undefined)
        
        @scala.inline
        def setPkce(value: Boolean): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
        
        @scala.inline
        def setPostLogoutRedirectUri(value: String): Self = StObject.set(x, "postLogoutRedirectUri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostLogoutRedirectUriUndefined: Self = StObject.set(x, "postLogoutRedirectUri", js.undefined)
        
        @scala.inline
        def setTokenManager(value: AutoRenew): Self = StObject.set(x, "tokenManager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokenManagerUndefined: Self = StObject.set(x, "tokenManager", js.undefined)
        
        @scala.inline
        def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokenUrlUndefined: Self = StObject.set(x, "tokenUrl", js.undefined)
        
        @scala.inline
        def setUserinfoUrl(value: String): Self = StObject.set(x, "userinfoUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUserinfoUrlUndefined: Self = StObject.set(x, "userinfoUrl", js.undefined)
      }
    }
    
    @js.native
    trait OktaOpenIDOptions extends StObject {
      
      var nonce: js.UndefOr[String] = js.native
      
      var responseMode: js.UndefOr[String] = js.native
      
      var responseType: js.UndefOr[String | js.Array[String]] = js.native
      
      var scopes: js.UndefOr[js.Array[String]] = js.native
      
      var sessionToken: js.UndefOr[String] = js.native
      
      var state: js.UndefOr[String] = js.native
    }
    object OktaOpenIDOptions {
      
      @scala.inline
      def apply(): OktaOpenIDOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OktaOpenIDOptions]
      }
      
      @scala.inline
      implicit class OktaOpenIDOptionsMutableBuilder[Self <: OktaOpenIDOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
        
        @scala.inline
        def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
        
        @scala.inline
        def setResponseType(value: String | js.Array[String]): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
        
        @scala.inline
        def setResponseTypeVarargs(value: String*): Self = StObject.set(x, "responseType", js.Array(value :_*))
        
        @scala.inline
        def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
        
        @scala.inline
        def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
        
        @scala.inline
        def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
        
        @scala.inline
        def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      }
    }
    
    @js.native
    trait OktaVueOptions extends OktaAuthJsOptions {
      
      var clientId: String = js.native
      
      var issuer: String = js.native
      
      var redirectUri: String = js.native
    }
    object OktaVueOptions {
      
      @scala.inline
      def apply(clientId: String, issuer: String, redirectUri: String): OktaVueOptions = {
        val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
        __obj.asInstanceOf[OktaVueOptions]
      }
      
      @scala.inline
      implicit class OktaVueOptionsMutableBuilder[Self <: OktaVueOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object vueTypesVueAugmentingMod {
    
    @js.native
    trait Vue extends StObject {
      
      @JSName("$auth")
      var $auth: AuthRedirectGuard = js.native
    }
    object Vue {
      
      @scala.inline
      def apply($auth: AuthRedirectGuard): typings.oktaOktaVue.mod.vueTypesVueAugmentingMod.Vue = {
        val __obj = js.Dynamic.literal($auth = $auth.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.oktaOktaVue.mod.vueTypesVueAugmentingMod.Vue]
      }
      
      @scala.inline
      implicit class VueMutableBuilder[Self <: typings.oktaOktaVue.mod.vueTypesVueAugmentingMod.Vue] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set$auth(value: AuthRedirectGuard): Self = StObject.set(x, "$auth", value.asInstanceOf[js.Any])
      }
    }
  }
}
