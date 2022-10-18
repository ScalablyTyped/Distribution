package typings.nextAuth

import typings.nextAuth.anon.Checks
import typings.nextAuth.anon.Keys
import typings.nextAuth.anon.PartialClientMetadata
import typings.nextAuth.anon.PartialOAuthConfigany
import typings.nextAuth.anon.Tokens
import typings.nextAuth.coreTypesMod.Awaitable
import typings.nextAuth.coreTypesMod.Profile
import typings.nextAuth.coreTypesMod.TokenSet
import typings.nextAuth.coreTypesMod.User
import typings.nextAuth.nextAuthStrings.oauth
import typings.nextAuth.nextAuthStrings.profile
import typings.nextAuth.providersMod.CommonProviderOptions
import typings.openidClient.mod.AuthorizationParameters
import typings.openidClient.mod.BaseClient
import typings.openidClient.mod.HttpOptions
import typings.openidClient.mod.OAuthCallbackChecks
import typings.openidClient.mod.OpenIDCallbackChecks
import typings.openidClient.mod.TypeOfGenericClient
import typings.std.InstanceType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersOauthMod {
  
  /** Gives granular control of the request to the given endpoint */
  trait AdvancedEndpointHandler[P /* <: UrlParams */, C, R] extends StObject {
    
    /** These will be prepended to the `url` */
    var params: js.UndefOr[P] = js.undefined
    
    /**
      * Control the corresponding OAuth endpoint request completely.
      * Useful if your provider relies on some custom behaviour
      * or it diverges from the OAuth spec.
      *
      * - ⚠ **This is an advanced option.**
      * You should **try to avoid using advanced options** unless you are very comfortable using them.
      */
    var request: js.UndefOr[EndpointRequest[C, R, P]] = js.undefined
    
    /** Endpoint URL. Can contain parameters. Optionally, you can use `params` */
    var url: js.UndefOr[String] = js.undefined
  }
  object AdvancedEndpointHandler {
    
    inline def apply[P /* <: UrlParams */, C, R](): AdvancedEndpointHandler[P, C, R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdvancedEndpointHandler[P, C, R]]
    }
    
    extension [Self <: AdvancedEndpointHandler[?, ?, ?], P /* <: UrlParams */, C, R](x: Self & (AdvancedEndpointHandler[P, C, R])) {
      
      inline def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRequest(value: /* context */ C & typings.nextAuth.anon.Client[P] => Awaitable[R]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type AuthorizationEndpointHandler = EndpointHandler[AuthorizationParameters, Any, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextAuth.nextAuthStrings.pkce
    - typings.nextAuth.nextAuthStrings.state
    - typings.nextAuth.nextAuthStrings.none
    - typings.nextAuth.nextAuthStrings.nonce
  */
  trait ChecksType extends StObject
  object ChecksType {
    
    inline def nonce: typings.nextAuth.nextAuthStrings.nonce = "nonce".asInstanceOf[typings.nextAuth.nextAuthStrings.nonce]
    
    inline def none: typings.nextAuth.nextAuthStrings.none = "none".asInstanceOf[typings.nextAuth.nextAuthStrings.none]
    
    inline def pkce: typings.nextAuth.nextAuthStrings.pkce = "pkce".asInstanceOf[typings.nextAuth.nextAuthStrings.pkce]
    
    inline def state: typings.nextAuth.nextAuthStrings.state = "state".asInstanceOf[typings.nextAuth.nextAuthStrings.state]
  }
  
  type Client = InstanceType[TypeOfGenericClient[BaseClient]]
  
  type EndpointHandler[P /* <: UrlParams */, C, R] = AdvancedEndpointHandler[P, C, R]
  
  type EndpointRequest[C, R, P] = js.Function1[/* context */ C & typings.nextAuth.anon.Client[P], Awaitable[R]]
  
  type OAuthChecks = OpenIDCallbackChecks | OAuthCallbackChecks
  
  trait OAuthConfig[P]
    extends StObject
       with CommonProviderOptions
       with PartialIssuer {
    
    var accessTokenUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The login process will be initiated by sending the user to this URL.
      *
      * [Authorization endpoint](https://datatracker.ietf.org/doc/html/rfc6749#section-3.1)
      */
    var authorization: js.UndefOr[String | AuthorizationEndpointHandler] = js.undefined
    
    var checks: js.UndefOr[ChecksType | js.Array[ChecksType]] = js.undefined
    
    var client: js.UndefOr[PartialClientMetadata] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    /** Read more at: https://github.com/panva/node-openid-client/tree/main/docs#customizing-http-requests */
    var httpOptions: js.UndefOr[HttpOptions] = js.undefined
    
    /**
      * If set to `true`, the user information will be extracted
      * from the `id_token` claims, instead of
      * making a request to the `userinfo` endpoint.
      *
      * `id_token` is usually present in OpenID Connect (OIDC) compliant providers.
      *
      * [`id_token` explanation](https://www.oauth.com/oauth2-servers/openid-connect/id-tokens)
      */
    var idToken: js.UndefOr[Boolean] = js.undefined
    
    var jwks: js.UndefOr[Keys] = js.undefined
    
    /**
      * The options provided by the user.
      * We will perform a deep-merge of these values
      * with the default configuration.
      */
    @JSName("options")
    var options_OAuthConfig: js.UndefOr[OAuthUserConfig[P]] = js.undefined
    
    def profile(profile: P, tokens: TokenSet): Awaitable[User]
    
    var profileUrl: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var requestTokenUrl: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String | TokenEndpointHandler] = js.undefined
    
    @JSName("type")
    var type_OAuthConfig: oauth
    
    var userinfo: js.UndefOr[String | UserinfoEndpointHandler] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    /**
      * OpenID Connect (OIDC) compliant providers can configure
      * this instead of `authorize`/`token`/`userinfo` options
      * without further configuration needed in most cases.
      * You can still use the `authorize`/`token`/`userinfo`
      * options for advanced control.
      *
      * [Authorization Server Metadata](https://datatracker.ietf.org/doc/html/rfc8414#section-3)
      */
    var wellKnown: js.UndefOr[String] = js.undefined
  }
  object OAuthConfig {
    
    inline def apply[P](id: String, name: String, profile: (P, TokenSet) => Awaitable[User]): OAuthConfig[P] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = js.Any.fromFunction2(profile))
      __obj.updateDynamic("type")("oauth")
      __obj.asInstanceOf[OAuthConfig[P]]
    }
    
    extension [Self <: OAuthConfig[?], P](x: Self & OAuthConfig[P]) {
      
      inline def setAccessTokenUrl(value: String): Self = StObject.set(x, "accessTokenUrl", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUrlUndefined: Self = StObject.set(x, "accessTokenUrl", js.undefined)
      
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
      
      inline def setIdToken(value: Boolean): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
      
      inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
      
      inline def setJwks(value: Keys): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
      
      inline def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
      
      inline def setOptions(value: OAuthUserConfig[P]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setProfile(value: (P, TokenSet) => Awaitable[User]): Self = StObject.set(x, "profile", js.Any.fromFunction2(value))
      
      inline def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
      
      inline def setProfileUrlUndefined: Self = StObject.set(x, "profileUrl", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRequestTokenUrl(value: String): Self = StObject.set(x, "requestTokenUrl", value.asInstanceOf[js.Any])
      
      inline def setRequestTokenUrlUndefined: Self = StObject.set(x, "requestTokenUrl", js.undefined)
      
      inline def setToken(value: String | TokenEndpointHandler): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setType(value: oauth): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUserinfo(value: String | UserinfoEndpointHandler): Self = StObject.set(x, "userinfo", value.asInstanceOf[js.Any])
      
      inline def setUserinfoUndefined: Self = StObject.set(x, "userinfo", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWellKnown(value: String): Self = StObject.set(x, "wellKnown", value.asInstanceOf[js.Any])
      
      inline def setWellKnownUndefined: Self = StObject.set(x, "wellKnown", js.undefined)
    }
  }
  
  type OAuthProvider = js.Function1[/* options */ PartialOAuthConfigany, OAuthConfig[Any]]
  
  /* Inlined std.Omit<std.Partial<next-auth.next-auth/providers/oauth.OAuthConfig<P>>, 'options' | 'type'> & std.Required<std.Pick<next-auth.next-auth/providers/oauth.OAuthConfig<P>, 'clientId' | 'clientSecret'>> */
  trait OAuthUserConfig[P] extends StObject {
    
    var accessTokenUrl: js.UndefOr[String] = js.undefined
    
    var authorization: js.UndefOr[String | AuthorizationEndpointHandler] = js.undefined
    
    var checks: js.UndefOr[ChecksType | js.Array[ChecksType]] = js.undefined
    
    var client: js.UndefOr[PartialClientMetadata] = js.undefined
    
    var clientId: js.UndefOr[String] & String
    
    var clientSecret: js.UndefOr[String] & String
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var httpOptions: js.UndefOr[HttpOptions] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var idToken: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var jwks: js.UndefOr[Keys] = js.undefined
    
    var jwks_endpoint: js.UndefOr[Any] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var profile: js.UndefOr[
        js.Function2[typings.nextAuth.nextAuthStrings.profile, /* tokens */ TokenSet, Awaitable[User]]
      ] = js.undefined
    
    var profileUrl: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var requestTokenUrl: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String | TokenEndpointHandler] = js.undefined
    
    var userinfo: js.UndefOr[String | UserinfoEndpointHandler] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
    
    var wellKnown: js.UndefOr[String] = js.undefined
  }
  object OAuthUserConfig {
    
    inline def apply[P](clientId: js.UndefOr[String] & String, clientSecret: js.UndefOr[String] & String): OAuthUserConfig[P] = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuthUserConfig[P]]
    }
    
    extension [Self <: OAuthUserConfig[?], P](x: Self & OAuthUserConfig[P]) {
      
      inline def setAccessTokenUrl(value: String): Self = StObject.set(x, "accessTokenUrl", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUrlUndefined: Self = StObject.set(x, "accessTokenUrl", js.undefined)
      
      inline def setAuthorization(value: String | AuthorizationEndpointHandler): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      inline def setChecks(value: ChecksType | js.Array[ChecksType]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
      
      inline def setChecksVarargs(value: ChecksType*): Self = StObject.set(x, "checks", js.Array(value*))
      
      inline def setClient(value: PartialClientMetadata): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: js.UndefOr[String] & String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: js.UndefOr[String] & String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
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
      
      inline def setProfile(value: (profile, /* tokens */ TokenSet) => Awaitable[User]): Self = StObject.set(x, "profile", js.Any.fromFunction2(value))
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setProfileUrl(value: String): Self = StObject.set(x, "profileUrl", value.asInstanceOf[js.Any])
      
      inline def setProfileUrlUndefined: Self = StObject.set(x, "profileUrl", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRequestTokenUrl(value: String): Self = StObject.set(x, "requestTokenUrl", value.asInstanceOf[js.Any])
      
      inline def setRequestTokenUrlUndefined: Self = StObject.set(x, "requestTokenUrl", js.undefined)
      
      inline def setToken(value: String | TokenEndpointHandler): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUserinfo(value: String | UserinfoEndpointHandler): Self = StObject.set(x, "userinfo", value.asInstanceOf[js.Any])
      
      inline def setUserinfoUndefined: Self = StObject.set(x, "userinfo", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWellKnown(value: String): Self = StObject.set(x, "wellKnown", value.asInstanceOf[js.Any])
      
      inline def setWellKnownUndefined: Self = StObject.set(x, "wellKnown", js.undefined)
    }
  }
  
  /* Inlined std.Partial<std.Pick<openid-client.openid-client.IssuerMetadata, 'jwks_endpoint' | 'issuer'>> */
  trait PartialIssuer extends StObject {
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var jwks_endpoint: js.UndefOr[Any] = js.undefined
  }
  object PartialIssuer {
    
    inline def apply(): PartialIssuer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIssuer]
    }
    
    extension [Self <: PartialIssuer](x: Self) {
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setJwks_endpoint(value: Any): Self = StObject.set(x, "jwks_endpoint", value.asInstanceOf[js.Any])
      
      inline def setJwks_endpointUndefined: Self = StObject.set(x, "jwks_endpoint", js.undefined)
    }
  }
  
  type TokenEndpointHandler = EndpointHandler[UrlParams, Checks, Tokens]
  
  type UrlParams = Record[String, Any]
  
  type UserinfoEndpointHandler = EndpointHandler[UrlParams, Tokens, Profile]
}
