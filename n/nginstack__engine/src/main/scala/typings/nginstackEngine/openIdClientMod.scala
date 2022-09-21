package typings.nginstackEngine

import typings.nginstackEngine.oauth2clientMod.TokenResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openIdClientMod {
  
  inline def apply(options: OpenIdClientConstructorOptions): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/oidc/OpenIdClient", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with OpenIdClient {
    def this(options: OpenIdClientConstructorOptions) = this()
  }
  @JSImport("@nginstack/engine/lib/oidc/OpenIdClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AuthorizationRequestOptions extends StObject {
    
    var codeChallenge: js.UndefOr[String] = js.undefined
    
    var extraParams: js.UndefOr[Record[String, String]] = js.undefined
    
    var idTokenHint: js.UndefOr[String] = js.undefined
    
    var loginHint: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var prompt: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var redirectUri: String
    
    var responseMode: js.UndefOr[String] = js.undefined
    
    var responseTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var scopes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object AuthorizationRequestOptions {
    
    inline def apply(redirectUri: String): AuthorizationRequestOptions = {
      val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationRequestOptions]
    }
    
    extension [Self <: AuthorizationRequestOptions](x: Self) {
      
      inline def setCodeChallenge(value: String): Self = StObject.set(x, "codeChallenge", value.asInstanceOf[js.Any])
      
      inline def setCodeChallengeUndefined: Self = StObject.set(x, "codeChallenge", js.undefined)
      
      inline def setExtraParams(value: Record[String, String]): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
      
      inline def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
      
      inline def setIdTokenHint(value: String): Self = StObject.set(x, "idTokenHint", value.asInstanceOf[js.Any])
      
      inline def setIdTokenHintUndefined: Self = StObject.set(x, "idTokenHint", js.undefined)
      
      inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPrompt(value: String | js.Array[String]): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setPromptVarargs(value: String*): Self = StObject.set(x, "prompt", js.Array(value*))
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
      
      inline def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
      
      inline def setResponseTypes(value: js.Array[String]): Self = StObject.set(x, "responseTypes", value.asInstanceOf[js.Any])
      
      inline def setResponseTypesUndefined: Self = StObject.set(x, "responseTypes", js.undefined)
      
      inline def setResponseTypesVarargs(value: String*): Self = StObject.set(x, "responseTypes", js.Array(value*))
      
      inline def setScopes(value: String | js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait OpenIdClient extends StObject {
    
    def exchangeClientCredentials(): TokenResponse = js.native
    def exchangeClientCredentials(scopes: String): TokenResponse = js.native
    def exchangeClientCredentials(scopes: js.Array[String]): TokenResponse = js.native
    
    def exchangeCode(accessCode: String, redirectUri: String): TokenResponse = js.native
    def exchangeCode(accessCode: String, redirectUri: String, codeVerifier: String): TokenResponse = js.native
    
    def exchangePassword(username: String, password: String): TokenResponse = js.native
    
    def exchangeRefreshToken(refreshToken: String): TokenResponse = js.native
    def exchangeRefreshToken(refreshToken: String, scopes: String): TokenResponse = js.native
    def exchangeRefreshToken(refreshToken: String, scopes: js.Array[String]): TokenResponse = js.native
    
    def getAuthorizationUri(options: AuthorizationRequestOptions): String = js.native
    
    def getCodeChallenge(verifier: String): String = js.native
    
    def getCodeVerifier(): String = js.native
    
    def getSigningKey(kid: String): Any = js.native
    
    def getUserInfo(accessToken: String): Any = js.native
    def getUserInfo(accessToken: String, subject: String): Any = js.native
    
    def introspect(accessToken: String): Any = js.native
    
    def revoke(token: String): Unit = js.native
    def revoke(token: String, tokenType: String): Unit = js.native
  }
  
  trait OpenIdClientConstructorOptions extends StObject {
    
    var authEndpoint: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var introspectionEndpoint: js.UndefOr[String] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var jwks: js.UndefOr[String] = js.undefined
    
    var revocationEndpoint: js.UndefOr[String] = js.undefined
    
    var tokenEndpoint: js.UndefOr[String] = js.undefined
    
    var userInfoEndpoint: js.UndefOr[String] = js.undefined
  }
  object OpenIdClientConstructorOptions {
    
    inline def apply(): OpenIdClientConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenIdClientConstructorOptions]
    }
    
    extension [Self <: OpenIdClientConstructorOptions](x: Self) {
      
      inline def setAuthEndpoint(value: String): Self = StObject.set(x, "authEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAuthEndpointUndefined: Self = StObject.set(x, "authEndpoint", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setIntrospectionEndpoint(value: String): Self = StObject.set(x, "introspectionEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIntrospectionEndpointUndefined: Self = StObject.set(x, "introspectionEndpoint", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setJwks(value: String): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
      
      inline def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
      
      inline def setRevocationEndpoint(value: String): Self = StObject.set(x, "revocationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setRevocationEndpointUndefined: Self = StObject.set(x, "revocationEndpoint", js.undefined)
      
      inline def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
      
      inline def setTokenEndpointUndefined: Self = StObject.set(x, "tokenEndpoint", js.undefined)
      
      inline def setUserInfoEndpoint(value: String): Self = StObject.set(x, "userInfoEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUserInfoEndpointUndefined: Self = StObject.set(x, "userInfoEndpoint", js.undefined)
    }
  }
}
