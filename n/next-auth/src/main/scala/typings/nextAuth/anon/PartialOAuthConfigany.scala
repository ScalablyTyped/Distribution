package typings.nextAuth.anon

import typings.nextAuth.coreTypesMod.Awaitable
import typings.nextAuth.coreTypesMod.TokenSet
import typings.nextAuth.nextAuthStrings.oauth
import typings.nextAuth.providersOauthMod.AuthorizationEndpointHandler
import typings.nextAuth.providersOauthMod.ChecksType
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import typings.nextAuth.providersOauthMod.TokenEndpointHandler
import typings.nextAuth.providersOauthMod.UserinfoEndpointHandler
import typings.openidClient.mod.HttpOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<next-auth.next-auth/providers/oauth.OAuthConfig<any>> */
trait PartialOAuthConfigany extends StObject {
  
  var accessTokenUrl: js.UndefOr[String] = js.undefined
  
  var allowDangerousEmailAccountLinking: js.UndefOr[Boolean] = js.undefined
  
  var authorization: js.UndefOr[String | AuthorizationEndpointHandler] = js.undefined
  
  var checks: js.UndefOr[ChecksType | js.Array[ChecksType]] = js.undefined
  
  var client: js.UndefOr[PartialClientMetadata] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var clientSecret: js.UndefOr[String] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var httpOptions: js.UndefOr[HttpOptions] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var idToken: js.UndefOr[Boolean] = js.undefined
  
  var issuer: js.UndefOr[String] = js.undefined
  
  var jwks: js.UndefOr[Keys] = js.undefined
  
  var jwks_endpoint: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[OAuthUserConfig[Any]] = js.undefined
  
  var profile: js.UndefOr[
    js.Function2[
      /* profile */ Any, 
      /* tokens */ TokenSet, 
      Awaitable[typings.nextAuth.coreTypesMod.User]
    ]
  ] = js.undefined
  
  var profileUrl: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var requestTokenUrl: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String | TokenEndpointHandler] = js.undefined
  
  var `type`: js.UndefOr[oauth] = js.undefined
  
  var userinfo: js.UndefOr[String | UserinfoEndpointHandler] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var wellKnown: js.UndefOr[String] = js.undefined
}
object PartialOAuthConfigany {
  
  inline def apply(): PartialOAuthConfigany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOAuthConfigany]
  }
  
  extension [Self <: PartialOAuthConfigany](x: Self) {
    
    inline def setAccessTokenUrl(value: String): Self = StObject.set(x, "accessTokenUrl", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUrlUndefined: Self = StObject.set(x, "accessTokenUrl", js.undefined)
    
    inline def setAllowDangerousEmailAccountLinking(value: Boolean): Self = StObject.set(x, "allowDangerousEmailAccountLinking", value.asInstanceOf[js.Any])
    
    inline def setAllowDangerousEmailAccountLinkingUndefined: Self = StObject.set(x, "allowDangerousEmailAccountLinking", js.undefined)
    
    inline def setAuthorization(value: String | AuthorizationEndpointHandler): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setChecks(value: ChecksType | js.Array[ChecksType]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
    
    inline def setChecksVarargs(value: ChecksType*): Self = StObject.set(x, "checks", js.Array(value*))
    
    inline def setClient(value: PartialClientMetadata): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setHttpOptions(value: HttpOptions): Self = StObject.set(x, "httpOptions", value.asInstanceOf[js.Any])
    
    inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdToken(value: Boolean): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setJwks(value: Keys): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
    
    inline def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
    
    inline def setJwks_endpoint(value: Any): Self = StObject.set(x, "jwks_endpoint", value.asInstanceOf[js.Any])
    
    inline def setJwks_endpointUndefined: Self = StObject.set(x, "jwks_endpoint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: OAuthUserConfig[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setProfile(value: (/* profile */ Any, /* tokens */ TokenSet) => Awaitable[typings.nextAuth.coreTypesMod.User]): Self = StObject.set(x, "profile", js.Any.fromFunction2(value))
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
    
    inline def setProfileUrlUndefined: Self = StObject.set(x, "profileUrl", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRequestTokenUrl(value: String): Self = StObject.set(x, "requestTokenUrl", value.asInstanceOf[js.Any])
    
    inline def setRequestTokenUrlUndefined: Self = StObject.set(x, "requestTokenUrl", js.undefined)
    
    inline def setToken(value: String | TokenEndpointHandler): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setType(value: oauth): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserinfo(value: String | UserinfoEndpointHandler): Self = StObject.set(x, "userinfo", value.asInstanceOf[js.Any])
    
    inline def setUserinfoUndefined: Self = StObject.set(x, "userinfo", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWellKnown(value: String): Self = StObject.set(x, "wellKnown", value.asInstanceOf[js.Any])
    
    inline def setWellKnownUndefined: Self = StObject.set(x, "wellKnown", js.undefined)
  }
}
