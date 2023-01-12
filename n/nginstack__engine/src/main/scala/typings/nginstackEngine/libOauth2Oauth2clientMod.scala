package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOauth2Oauth2clientMod {
  
  inline def apply(options: OAuth2ClientConstructorOptions): Unit = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/oauth2/OAuth2Client", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with OAuth2Client {
    def this(options: OAuth2ClientConstructorOptions) = this()
  }
  @JSImport("@nginstack/engine/lib/oauth2/OAuth2Client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encryptClientSecret(secret: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encryptClientSecret")(secret.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait AuthorizationRequestOptions extends StObject {
    
    var codeChallenge: js.UndefOr[String] = js.undefined
    
    var redirectUri: String
    
    var responseType: js.UndefOr[String] = js.undefined
    
    var scopes: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var state: String
  }
  object AuthorizationRequestOptions {
    
    inline def apply(redirectUri: String, state: String): AuthorizationRequestOptions = {
      val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationRequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthorizationRequestOptions] (val x: Self) extends AnyVal {
      
      inline def setCodeChallenge(value: String): Self = StObject.set(x, "codeChallenge", value.asInstanceOf[js.Any])
      
      inline def setCodeChallengeUndefined: Self = StObject.set(x, "codeChallenge", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setScopes(value: String | js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeviceAuthorizationResponse extends StObject {
    
    var deviceCode: String
    
    var expiresIn: Double
    
    var userCode: String
    
    var verificationUri: String
    
    var verificationUriComplete: String
  }
  object DeviceAuthorizationResponse {
    
    inline def apply(
      deviceCode: String,
      expiresIn: Double,
      userCode: String,
      verificationUri: String,
      verificationUriComplete: String
    ): DeviceAuthorizationResponse = {
      val __obj = js.Dynamic.literal(deviceCode = deviceCode.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any], verificationUri = verificationUri.asInstanceOf[js.Any], verificationUriComplete = verificationUriComplete.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceAuthorizationResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeviceAuthorizationResponse] (val x: Self) extends AnyVal {
      
      inline def setDeviceCode(value: String): Self = StObject.set(x, "deviceCode", value.asInstanceOf[js.Any])
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
      
      inline def setVerificationUri(value: String): Self = StObject.set(x, "verificationUri", value.asInstanceOf[js.Any])
      
      inline def setVerificationUriComplete(value: String): Self = StObject.set(x, "verificationUriComplete", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OAuth2Client extends StObject {
    
    def exchangeClientCredentials(): TokenResponse = js.native
    def exchangeClientCredentials(scopes: String): TokenResponse = js.native
    def exchangeClientCredentials(scopes: js.Array[String]): TokenResponse = js.native
    
    def exchangeCode(accessCode: String, redirectUri: String): TokenResponse = js.native
    def exchangeCode(accessCode: String, redirectUri: String, codeVerifier: String): TokenResponse = js.native
    
    def exchangeDeviceAuthorization(deviceAuthResponse: DeviceAuthorizationResponse): TokenResponse = js.native
    def exchangeDeviceAuthorization(deviceAuthResponse: DeviceAuthorizationResponse, timeout: Double): TokenResponse = js.native
    
    def exchangePassword(username: String, password: String): TokenResponse = js.native
    
    def exchangeRefreshToken(refreshToken: String): TokenResponse = js.native
    def exchangeRefreshToken(refreshToken: String, scopes: String): TokenResponse = js.native
    def exchangeRefreshToken(refreshToken: String, scopes: js.Array[String]): TokenResponse = js.native
    
    def getAuthorizationUri(): String = js.native
    def getAuthorizationUri(options: AuthorizationRequestOptions): String = js.native
    
    def getCodeChallenge(verifier: String): String = js.native
    
    def getCodeVerifier(): String = js.native
    
    def getDeviceAuthorization(): DeviceAuthorizationResponse = js.native
    def getDeviceAuthorization(scopes: String): DeviceAuthorizationResponse = js.native
    def getDeviceAuthorization(scopes: js.Array[String]): DeviceAuthorizationResponse = js.native
    
    def introspect(accessToken: String): TokenIntrospectionResponse = js.native
    
    def revoke(token: String): Unit = js.native
    def revoke(token: String, tokenType: String): Unit = js.native
  }
  
  trait OAuth2ClientConstructorOptions extends StObject {
    
    var authEndpoint: js.UndefOr[String] = js.undefined
    
    var authType: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var deviceAuthorizationEndpoint: js.UndefOr[String] = js.undefined
    
    var introspectionEndpoint: js.UndefOr[String] = js.undefined
    
    var redirectUri: js.UndefOr[String] = js.undefined
    
    var revocationEndpoint: js.UndefOr[String] = js.undefined
    
    var tokenEndpoint: js.UndefOr[String] = js.undefined
  }
  object OAuth2ClientConstructorOptions {
    
    inline def apply(): OAuth2ClientConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OAuth2ClientConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OAuth2ClientConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setAuthEndpoint(value: String): Self = StObject.set(x, "authEndpoint", value.asInstanceOf[js.Any])
      
      inline def setAuthEndpointUndefined: Self = StObject.set(x, "authEndpoint", js.undefined)
      
      inline def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
      
      inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setDeviceAuthorizationEndpoint(value: String): Self = StObject.set(x, "deviceAuthorizationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setDeviceAuthorizationEndpointUndefined: Self = StObject.set(x, "deviceAuthorizationEndpoint", js.undefined)
      
      inline def setIntrospectionEndpoint(value: String): Self = StObject.set(x, "introspectionEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIntrospectionEndpointUndefined: Self = StObject.set(x, "introspectionEndpoint", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setRevocationEndpoint(value: String): Self = StObject.set(x, "revocationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setRevocationEndpointUndefined: Self = StObject.set(x, "revocationEndpoint", js.undefined)
      
      inline def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
      
      inline def setTokenEndpointUndefined: Self = StObject.set(x, "tokenEndpoint", js.undefined)
    }
  }
  
  trait TokenIntrospectionResponse extends StObject {
    
    var active: Boolean
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var expiresAt: js.UndefOr[Double] = js.undefined
    
    var issuedAt: js.UndefOr[Double] = js.undefined
    
    var notBefore: js.UndefOr[Double] = js.undefined
    
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
    
    var tokenType: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object TokenIntrospectionResponse {
    
    inline def apply(active: Boolean): TokenIntrospectionResponse = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenIntrospectionResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenIntrospectionResponse] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setExpiresAt(value: Double): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
      
      inline def setIssuedAt(value: Double): Self = StObject.set(x, "issuedAt", value.asInstanceOf[js.Any])
      
      inline def setIssuedAtUndefined: Self = StObject.set(x, "issuedAt", js.undefined)
      
      inline def setNotBefore(value: Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
      
      inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait TokenResponse extends StObject {
    
    var accessToken: String
    
    var expiresIn: js.UndefOr[Double] = js.undefined
    
    var idToken: js.UndefOr[String] = js.undefined
    
    var refreshToken: js.UndefOr[String] = js.undefined
    
    var scope: js.Array[String]
    
    var tokenType: String
  }
  object TokenResponse {
    
    inline def apply(accessToken: String, scope: js.Array[String], tokenType: String): TokenResponse = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenResponse] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    }
  }
}
