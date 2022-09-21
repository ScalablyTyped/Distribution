package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.urlMod.URL_
import typings.oidcProvider.anon.Authorization
import typings.oidcProvider.anon.AuthorizationEncryptionAlgValues
import typings.oidcProvider.anon.BackchannelLogout
import typings.oidcProvider.anon.BitsOfOpaqueRandomness
import typings.oidcProvider.anon.Dictkey
import typings.oidcProvider.anon.Keys
import typings.oidcProvider.anon.Methods
import typings.oidcProvider.anon.Policy
import typings.oidcProvider.anon.Properties
import typings.oidcProvider.mod.errors.OIDCProviderError
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  var acrValues: js.UndefOr[js.Array[String] | Set[String]] = js.undefined
  
  var adapter: js.UndefOr[AdapterConstructor | AdapterFactory] = js.undefined
  
  // tslint:disable-line:void-return
  var allowOmittingSingleRegisteredRedirectUri: js.UndefOr[Boolean] = js.undefined
  
  var claims: js.UndefOr[StringDictionary[Null | js.Array[String]]] = js.undefined
  
  var clientBasedCORS: js.UndefOr[
    js.Function3[/* ctx */ KoaContextWithOIDC, /* origin */ String, /* client */ Client, Boolean]
  ] = js.undefined
  
  var clientDefaults: js.UndefOr[AllClientMetadata] = js.undefined
  
  var clients: js.UndefOr[js.Array[ClientMetadata]] = js.undefined
  
  var clockTolerance: js.UndefOr[Double] = js.undefined
  
  var conformIdTokenClaims: js.UndefOr[Boolean] = js.undefined
  
  var cookies: js.UndefOr[Keys] = js.undefined
  
  var discovery: js.UndefOr[UnknownObject] = js.undefined
  
  var enabledJWA: js.UndefOr[AuthorizationEncryptionAlgValues] = js.undefined
  
  var expiresWithSession: js.UndefOr[
    js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* token */ AccessToken | AuthorizationCode | DeviceCode, 
      CanBePromise[Boolean]
    ]
  ] = js.undefined
  
  var extraClientMetadata: js.UndefOr[Properties] = js.undefined
  
  var extraParams: js.UndefOr[js.Array[String]] = js.undefined
  
  var extraTokenClaims: js.UndefOr[
    js.Function2[
      /* ctx */ KoaContextWithOIDC, 
      /* token */ AccessToken | ClientCredentials, 
      CanBePromise[js.UndefOr[UnknownObject]]
    ]
  ] = js.undefined
  
  var features: js.UndefOr[BackchannelLogout] = js.undefined
  
  var findAccount: js.UndefOr[FindAccount] = js.undefined
  
  var formats: js.UndefOr[BitsOfOpaqueRandomness] = js.undefined
  
  var httpOptions: js.UndefOr[js.Function1[/* url */ URL_, HttpOptions]] = js.undefined
  
  var interactions: js.UndefOr[Policy] = js.undefined
  
  var issueRefreshToken: js.UndefOr[
    js.Function3[
      /* ctx */ KoaContextWithOIDC, 
      /* client */ Client, 
      /* code */ AuthorizationCode | DeviceCode | BackchannelAuthenticationRequest, 
      CanBePromise[Boolean]
    ]
  ] = js.undefined
  
  var jwks: js.UndefOr[JWKS] = js.undefined
  
  var loadExistingGrant: js.UndefOr[js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[js.UndefOr[Grant]]]] = js.undefined
  
  var pairwiseIdentifier: js.UndefOr[
    js.Function3[
      /* ctx */ KoaContextWithOIDC, 
      /* accountId */ String, 
      /* client */ Client, 
      CanBePromise[String]
    ]
  ] = js.undefined
  
  var pkce: js.UndefOr[Methods] = js.undefined
  
  var renderError: js.UndefOr[
    js.Function3[
      /* ctx */ KoaContextWithOIDC, 
      /* out */ ErrorOut, 
      /* error */ OIDCProviderError | js.Error, 
      CanBePromise[js.UndefOr[Unit]]
    ]
  ] = js.undefined
  
  var responseTypes: js.UndefOr[js.Array[ResponseType]] = js.undefined
  
  var revokeGrantPolicy: js.UndefOr[js.Function1[/* ctx */ KoaContextWithOIDC, Boolean]] = js.undefined
  
  var rotateRefreshToken: js.UndefOr[(js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[Boolean]]) | Boolean] = js.undefined
  
  var routes: js.UndefOr[Authorization] = js.undefined
  
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  
  var subjectTypes: js.UndefOr[js.Array[SubjectTypes]] = js.undefined
  
  var tokenEndpointAuthMethods: js.UndefOr[js.Array[ClientAuthMethod]] = js.undefined
  
  var ttl: js.UndefOr[Dictkey] = js.undefined
}
object Configuration {
  
  inline def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  extension [Self <: Configuration](x: Self) {
    
    inline def setAcrValues(value: js.Array[String] | Set[String]): Self = StObject.set(x, "acrValues", value.asInstanceOf[js.Any])
    
    inline def setAcrValuesUndefined: Self = StObject.set(x, "acrValues", js.undefined)
    
    inline def setAcrValuesVarargs(value: String*): Self = StObject.set(x, "acrValues", js.Array(value*))
    
    inline def setAdapter(value: AdapterConstructor | AdapterFactory): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterFunction1(value: /* name */ String => Adapter): Self = StObject.set(x, "adapter", js.Any.fromFunction1(value))
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setAllowOmittingSingleRegisteredRedirectUri(value: Boolean): Self = StObject.set(x, "allowOmittingSingleRegisteredRedirectUri", value.asInstanceOf[js.Any])
    
    inline def setAllowOmittingSingleRegisteredRedirectUriUndefined: Self = StObject.set(x, "allowOmittingSingleRegisteredRedirectUri", js.undefined)
    
    inline def setClaims(value: StringDictionary[Null | js.Array[String]]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    inline def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    inline def setClientBasedCORS(value: (/* ctx */ KoaContextWithOIDC, /* origin */ String, /* client */ Client) => Boolean): Self = StObject.set(x, "clientBasedCORS", js.Any.fromFunction3(value))
    
    inline def setClientBasedCORSUndefined: Self = StObject.set(x, "clientBasedCORS", js.undefined)
    
    inline def setClientDefaults(value: AllClientMetadata): Self = StObject.set(x, "clientDefaults", value.asInstanceOf[js.Any])
    
    inline def setClientDefaultsUndefined: Self = StObject.set(x, "clientDefaults", js.undefined)
    
    inline def setClients(value: js.Array[ClientMetadata]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
    
    inline def setClientsUndefined: Self = StObject.set(x, "clients", js.undefined)
    
    inline def setClientsVarargs(value: ClientMetadata*): Self = StObject.set(x, "clients", js.Array(value*))
    
    inline def setClockTolerance(value: Double): Self = StObject.set(x, "clockTolerance", value.asInstanceOf[js.Any])
    
    inline def setClockToleranceUndefined: Self = StObject.set(x, "clockTolerance", js.undefined)
    
    inline def setConformIdTokenClaims(value: Boolean): Self = StObject.set(x, "conformIdTokenClaims", value.asInstanceOf[js.Any])
    
    inline def setConformIdTokenClaimsUndefined: Self = StObject.set(x, "conformIdTokenClaims", js.undefined)
    
    inline def setCookies(value: Keys): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setDiscovery(value: UnknownObject): Self = StObject.set(x, "discovery", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryUndefined: Self = StObject.set(x, "discovery", js.undefined)
    
    inline def setEnabledJWA(value: AuthorizationEncryptionAlgValues): Self = StObject.set(x, "enabledJWA", value.asInstanceOf[js.Any])
    
    inline def setEnabledJWAUndefined: Self = StObject.set(x, "enabledJWA", js.undefined)
    
    inline def setExpiresWithSession(
      value: (/* ctx */ KoaContextWithOIDC, /* token */ AccessToken | AuthorizationCode | DeviceCode) => CanBePromise[Boolean]
    ): Self = StObject.set(x, "expiresWithSession", js.Any.fromFunction2(value))
    
    inline def setExpiresWithSessionUndefined: Self = StObject.set(x, "expiresWithSession", js.undefined)
    
    inline def setExtraClientMetadata(value: Properties): Self = StObject.set(x, "extraClientMetadata", value.asInstanceOf[js.Any])
    
    inline def setExtraClientMetadataUndefined: Self = StObject.set(x, "extraClientMetadata", js.undefined)
    
    inline def setExtraParams(value: js.Array[String]): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
    
    inline def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
    
    inline def setExtraParamsVarargs(value: String*): Self = StObject.set(x, "extraParams", js.Array(value*))
    
    inline def setExtraTokenClaims(
      value: (/* ctx */ KoaContextWithOIDC, /* token */ AccessToken | ClientCredentials) => CanBePromise[js.UndefOr[UnknownObject]]
    ): Self = StObject.set(x, "extraTokenClaims", js.Any.fromFunction2(value))
    
    inline def setExtraTokenClaimsUndefined: Self = StObject.set(x, "extraTokenClaims", js.undefined)
    
    inline def setFeatures(value: BackchannelLogout): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFindAccount(
      value: (/* ctx */ KoaContextWithOIDC, /* sub */ String, /* token */ js.UndefOr[AuthorizationCode | AccessToken | DeviceCode | BackchannelAuthenticationRequest]) => CanBePromise[js.UndefOr[Account]]
    ): Self = StObject.set(x, "findAccount", js.Any.fromFunction3(value))
    
    inline def setFindAccountUndefined: Self = StObject.set(x, "findAccount", js.undefined)
    
    inline def setFormats(value: BitsOfOpaqueRandomness): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setHttpOptions(value: /* url */ URL_ => HttpOptions): Self = StObject.set(x, "httpOptions", js.Any.fromFunction1(value))
    
    inline def setHttpOptionsUndefined: Self = StObject.set(x, "httpOptions", js.undefined)
    
    inline def setInteractions(value: Policy): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
    
    inline def setIssueRefreshToken(
      value: (/* ctx */ KoaContextWithOIDC, /* client */ Client, /* code */ AuthorizationCode | DeviceCode | BackchannelAuthenticationRequest) => CanBePromise[Boolean]
    ): Self = StObject.set(x, "issueRefreshToken", js.Any.fromFunction3(value))
    
    inline def setIssueRefreshTokenUndefined: Self = StObject.set(x, "issueRefreshToken", js.undefined)
    
    inline def setJwks(value: JWKS): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
    
    inline def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
    
    inline def setLoadExistingGrant(value: /* ctx */ KoaContextWithOIDC => CanBePromise[js.UndefOr[Grant]]): Self = StObject.set(x, "loadExistingGrant", js.Any.fromFunction1(value))
    
    inline def setLoadExistingGrantUndefined: Self = StObject.set(x, "loadExistingGrant", js.undefined)
    
    inline def setPairwiseIdentifier(
      value: (/* ctx */ KoaContextWithOIDC, /* accountId */ String, /* client */ Client) => CanBePromise[String]
    ): Self = StObject.set(x, "pairwiseIdentifier", js.Any.fromFunction3(value))
    
    inline def setPairwiseIdentifierUndefined: Self = StObject.set(x, "pairwiseIdentifier", js.undefined)
    
    inline def setPkce(value: Methods): Self = StObject.set(x, "pkce", value.asInstanceOf[js.Any])
    
    inline def setPkceUndefined: Self = StObject.set(x, "pkce", js.undefined)
    
    inline def setRenderError(
      value: (/* ctx */ KoaContextWithOIDC, /* out */ ErrorOut, /* error */ OIDCProviderError | js.Error) => CanBePromise[js.UndefOr[Unit]]
    ): Self = StObject.set(x, "renderError", js.Any.fromFunction3(value))
    
    inline def setRenderErrorUndefined: Self = StObject.set(x, "renderError", js.undefined)
    
    inline def setResponseTypes(value: js.Array[ResponseType]): Self = StObject.set(x, "responseTypes", value.asInstanceOf[js.Any])
    
    inline def setResponseTypesUndefined: Self = StObject.set(x, "responseTypes", js.undefined)
    
    inline def setResponseTypesVarargs(value: ResponseType*): Self = StObject.set(x, "responseTypes", js.Array(value*))
    
    inline def setRevokeGrantPolicy(value: /* ctx */ KoaContextWithOIDC => Boolean): Self = StObject.set(x, "revokeGrantPolicy", js.Any.fromFunction1(value))
    
    inline def setRevokeGrantPolicyUndefined: Self = StObject.set(x, "revokeGrantPolicy", js.undefined)
    
    inline def setRotateRefreshToken(value: (js.Function1[/* ctx */ KoaContextWithOIDC, CanBePromise[Boolean]]) | Boolean): Self = StObject.set(x, "rotateRefreshToken", value.asInstanceOf[js.Any])
    
    inline def setRotateRefreshTokenFunction1(value: /* ctx */ KoaContextWithOIDC => CanBePromise[Boolean]): Self = StObject.set(x, "rotateRefreshToken", js.Any.fromFunction1(value))
    
    inline def setRotateRefreshTokenUndefined: Self = StObject.set(x, "rotateRefreshToken", js.undefined)
    
    inline def setRoutes(value: Authorization): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setSubjectTypes(value: js.Array[SubjectTypes]): Self = StObject.set(x, "subjectTypes", value.asInstanceOf[js.Any])
    
    inline def setSubjectTypesUndefined: Self = StObject.set(x, "subjectTypes", js.undefined)
    
    inline def setSubjectTypesVarargs(value: SubjectTypes*): Self = StObject.set(x, "subjectTypes", js.Array(value*))
    
    inline def setTokenEndpointAuthMethods(value: js.Array[ClientAuthMethod]): Self = StObject.set(x, "tokenEndpointAuthMethods", value.asInstanceOf[js.Any])
    
    inline def setTokenEndpointAuthMethodsUndefined: Self = StObject.set(x, "tokenEndpointAuthMethods", js.undefined)
    
    inline def setTokenEndpointAuthMethodsVarargs(value: ClientAuthMethod*): Self = StObject.set(x, "tokenEndpointAuthMethods", js.Array(value*))
    
    inline def setTtl(value: Dictkey): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
