package typings.oktaOktaVue

import typings.oktaOktaVue.anon.AuthRedirectGuard
import typings.oktaOktaVue.anon.AutoRenew
import typings.oktaOktaVue.mod.OktaVuePlugin.OktaVueOptions
import typings.vue.pluginMod.PluginFunction
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @scala.inline
    def apply(): PluginFunction[VueConstructor[Vue]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[PluginFunction[VueConstructor[Vue]]]
    
    @JSImport("@okta/okta-vue", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def handleCallback(): VueConstructor[Vue] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleCallback")().asInstanceOf[VueConstructor[Vue]]
    
    @scala.inline
    def install(vm: VueConstructor[Vue], options: OktaVueOptions): PluginFunction[VueConstructor[Vue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(vm.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PluginFunction[VueConstructor[Vue]]]
  }
  
  object OktaVuePlugin {
    
    trait OktaAuthJsOptions
      extends StObject
         with OktaOpenIDOptions {
      
      var authorizeUrl: js.UndefOr[String] = js.undefined
      
      var ignoreSignature: js.UndefOr[Boolean] = js.undefined
      
      var maxClockSkew: js.UndefOr[Double] = js.undefined
      
      var pkce: js.UndefOr[Boolean] = js.undefined
      
      var postLogoutRedirectUri: js.UndefOr[String] = js.undefined
      
      var tokenManager: js.UndefOr[AutoRenew] = js.undefined
      
      var tokenUrl: js.UndefOr[String] = js.undefined
      
      var userinfoUrl: js.UndefOr[String] = js.undefined
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
    
    trait OktaOpenIDOptions extends StObject {
      
      var nonce: js.UndefOr[String] = js.undefined
      
      var responseMode: js.UndefOr[String] = js.undefined
      
      var responseType: js.UndefOr[String | js.Array[String]] = js.undefined
      
      var scopes: js.UndefOr[js.Array[String]] = js.undefined
      
      var sessionToken: js.UndefOr[String] = js.undefined
      
      var state: js.UndefOr[String] = js.undefined
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
    
    trait OktaVueOptions
      extends StObject
         with OktaAuthJsOptions {
      
      var clientId: String
      
      var issuer: String
      
      var redirectUri: String
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
    
    trait Vue extends StObject {
      
      @JSName("$auth")
      var $auth: AuthRedirectGuard
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
