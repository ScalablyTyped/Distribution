package typings.nginstackEngine

import typings.nginstackEngine.libOauth2Oauth2clientMod.OAuth2ClientConstructorOptions
import typings.nginstackEngine.libOidcOpenIdClientMod.OpenIdClientConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOidcOpenIdProviderMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/oidc/OpenIdProvider", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with OpenIdProvider
  @JSImport("@nginstack/engine/lib/oidc/OpenIdProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def discover(discoverUri: String): ProviderMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("discover")(discoverUri.asInstanceOf[js.Any]).asInstanceOf[ProviderMetadata]
  
  inline def fromConfig(key: DBKey): OpenIdProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(key.asInstanceOf[js.Any]).asInstanceOf[OpenIdProvider]
  
  type CryptoPKey = typings.nginstackEngine.libCryptoCryptoPKeyMod.^
  
  type DBKey = typings.nginstackEngine.libDbkeyDbkeyMod.^
  
  @js.native
  trait OpenIdProvider extends StObject {
    
    var authorizationEndpoint: String = js.native
    
    var claimsSupported: js.Array[String] = js.native
    
    var deviceAuthorizationEndpoint: String = js.native
    
    def getSigningKey(kid: String): CryptoPKey = js.native
    
    var grantTypesSupported: js.Array[String] = js.native
    
    var idTokenSigningAlgValuesSupported: js.Array[String] = js.native
    
    var introspectionEndpoint: String = js.native
    
    var issuer: String = js.native
    
    def jwk(kid: String): String = js.native
    
    var jwks: String = js.native
    
    def newOAuth2Client(): typings.nginstackEngine.libOauth2Oauth2clientMod.^ = js.native
    def newOAuth2Client(options: OAuth2ClientConstructorOptions): typings.nginstackEngine.libOauth2Oauth2clientMod.^ = js.native
    
    def newOpenIdClient(): typings.nginstackEngine.libOidcOpenIdClientMod.^ = js.native
    def newOpenIdClient(options: OpenIdClientConstructorOptions): typings.nginstackEngine.libOidcOpenIdClientMod.^ = js.native
    
    var responseModesSupported: js.Array[String] = js.native
    
    var responseTypesSupported: js.Array[String] = js.native
    
    var revocationEndpoint: String = js.native
    
    var scopesSupported: js.Array[String] = js.native
    
    var tokenEndpoint: String = js.native
    
    var userInfoEndpoint: String = js.native
    
    var userInfoSigningAlgValuesSupported: js.Array[String] = js.native
  }
  
  trait ProviderMetadata extends StObject {
    
    var authorizationEndpoint: String
    
    var claimsSupported: js.Array[String]
    
    var deviceAuthorizationEndpoint: String
    
    var grantTypesSupported: js.Array[String]
    
    var idTokenSigningAlgValuesSupported: js.Array[String]
    
    var introspectionEndpoint: String
    
    var issuer: String
    
    var jwks: String
    
    var responseModesSupported: js.Array[String]
    
    var responseTypesSupported: js.Array[String]
    
    var revocationEndpoint: String
    
    var scopesSupported: js.Array[String]
    
    var tokenEndpoint: String
    
    var userInfoEndpoint: String
    
    var userInfoSigningAlgValuesSupported: js.Array[String]
  }
  object ProviderMetadata {
    
    inline def apply(
      authorizationEndpoint: String,
      claimsSupported: js.Array[String],
      deviceAuthorizationEndpoint: String,
      grantTypesSupported: js.Array[String],
      idTokenSigningAlgValuesSupported: js.Array[String],
      introspectionEndpoint: String,
      issuer: String,
      jwks: String,
      responseModesSupported: js.Array[String],
      responseTypesSupported: js.Array[String],
      revocationEndpoint: String,
      scopesSupported: js.Array[String],
      tokenEndpoint: String,
      userInfoEndpoint: String,
      userInfoSigningAlgValuesSupported: js.Array[String]
    ): ProviderMetadata = {
      val __obj = js.Dynamic.literal(authorizationEndpoint = authorizationEndpoint.asInstanceOf[js.Any], claimsSupported = claimsSupported.asInstanceOf[js.Any], deviceAuthorizationEndpoint = deviceAuthorizationEndpoint.asInstanceOf[js.Any], grantTypesSupported = grantTypesSupported.asInstanceOf[js.Any], idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported.asInstanceOf[js.Any], introspectionEndpoint = introspectionEndpoint.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], jwks = jwks.asInstanceOf[js.Any], responseModesSupported = responseModesSupported.asInstanceOf[js.Any], responseTypesSupported = responseTypesSupported.asInstanceOf[js.Any], revocationEndpoint = revocationEndpoint.asInstanceOf[js.Any], scopesSupported = scopesSupported.asInstanceOf[js.Any], tokenEndpoint = tokenEndpoint.asInstanceOf[js.Any], userInfoEndpoint = userInfoEndpoint.asInstanceOf[js.Any], userInfoSigningAlgValuesSupported = userInfoSigningAlgValuesSupported.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProviderMetadata] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationEndpoint(value: String): Self = StObject.set(x, "authorizationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setClaimsSupported(value: js.Array[String]): Self = StObject.set(x, "claimsSupported", value.asInstanceOf[js.Any])
      
      inline def setClaimsSupportedVarargs(value: String*): Self = StObject.set(x, "claimsSupported", js.Array(value*))
      
      inline def setDeviceAuthorizationEndpoint(value: String): Self = StObject.set(x, "deviceAuthorizationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setGrantTypesSupported(value: js.Array[String]): Self = StObject.set(x, "grantTypesSupported", value.asInstanceOf[js.Any])
      
      inline def setGrantTypesSupportedVarargs(value: String*): Self = StObject.set(x, "grantTypesSupported", js.Array(value*))
      
      inline def setIdTokenSigningAlgValuesSupported(value: js.Array[String]): Self = StObject.set(x, "idTokenSigningAlgValuesSupported", value.asInstanceOf[js.Any])
      
      inline def setIdTokenSigningAlgValuesSupportedVarargs(value: String*): Self = StObject.set(x, "idTokenSigningAlgValuesSupported", js.Array(value*))
      
      inline def setIntrospectionEndpoint(value: String): Self = StObject.set(x, "introspectionEndpoint", value.asInstanceOf[js.Any])
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setJwks(value: String): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
      
      inline def setResponseModesSupported(value: js.Array[String]): Self = StObject.set(x, "responseModesSupported", value.asInstanceOf[js.Any])
      
      inline def setResponseModesSupportedVarargs(value: String*): Self = StObject.set(x, "responseModesSupported", js.Array(value*))
      
      inline def setResponseTypesSupported(value: js.Array[String]): Self = StObject.set(x, "responseTypesSupported", value.asInstanceOf[js.Any])
      
      inline def setResponseTypesSupportedVarargs(value: String*): Self = StObject.set(x, "responseTypesSupported", js.Array(value*))
      
      inline def setRevocationEndpoint(value: String): Self = StObject.set(x, "revocationEndpoint", value.asInstanceOf[js.Any])
      
      inline def setScopesSupported(value: js.Array[String]): Self = StObject.set(x, "scopesSupported", value.asInstanceOf[js.Any])
      
      inline def setScopesSupportedVarargs(value: String*): Self = StObject.set(x, "scopesSupported", js.Array(value*))
      
      inline def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUserInfoEndpoint(value: String): Self = StObject.set(x, "userInfoEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUserInfoSigningAlgValuesSupported(value: js.Array[String]): Self = StObject.set(x, "userInfoSigningAlgValuesSupported", value.asInstanceOf[js.Any])
      
      inline def setUserInfoSigningAlgValuesSupportedVarargs(value: String*): Self = StObject.set(x, "userInfoSigningAlgValuesSupported", js.Array(value*))
    }
  }
}
