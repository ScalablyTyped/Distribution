package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuerMetadata
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var authorization_endpoint: js.UndefOr[String] = js.undefined
  
  var end_session_endpoint: js.UndefOr[String] = js.undefined
  
  var introspection_endpoint_auth_methods_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  var introspection_endpoint_auth_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  var issuer: String
  
  var jwks_uri: js.UndefOr[String] = js.undefined
  
  var mtls_endpoint_aliases: js.UndefOr[MtlsEndpointAliases] = js.undefined
  
  var registration_endpoint: js.UndefOr[String] = js.undefined
  
  var request_object_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  var revocation_endpoint: js.UndefOr[String] = js.undefined
  
  var revocation_endpoint_auth_methods_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  var revocation_endpoint_auth_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  var token_endpoint: js.UndefOr[String] = js.undefined
  
  var token_endpoint_auth_methods_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  var token_endpoint_auth_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.undefined
  
  var userinfo_endpoint: js.UndefOr[String] = js.undefined
}
object IssuerMetadata {
  
  inline def apply(issuer: String): IssuerMetadata = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuerMetadata]
  }
  
  extension [Self <: IssuerMetadata](x: Self) {
    
    inline def setAuthorization_endpoint(value: String): Self = StObject.set(x, "authorization_endpoint", value.asInstanceOf[js.Any])
    
    inline def setAuthorization_endpointUndefined: Self = StObject.set(x, "authorization_endpoint", js.undefined)
    
    inline def setEnd_session_endpoint(value: String): Self = StObject.set(x, "end_session_endpoint", value.asInstanceOf[js.Any])
    
    inline def setEnd_session_endpointUndefined: Self = StObject.set(x, "end_session_endpoint", js.undefined)
    
    inline def setIntrospection_endpoint_auth_methods_supported(value: js.Array[String]): Self = StObject.set(x, "introspection_endpoint_auth_methods_supported", value.asInstanceOf[js.Any])
    
    inline def setIntrospection_endpoint_auth_methods_supportedUndefined: Self = StObject.set(x, "introspection_endpoint_auth_methods_supported", js.undefined)
    
    inline def setIntrospection_endpoint_auth_methods_supportedVarargs(value: String*): Self = StObject.set(x, "introspection_endpoint_auth_methods_supported", js.Array(value :_*))
    
    inline def setIntrospection_endpoint_auth_signing_alg_values_supported(value: js.Array[String]): Self = StObject.set(x, "introspection_endpoint_auth_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    inline def setIntrospection_endpoint_auth_signing_alg_values_supportedUndefined: Self = StObject.set(x, "introspection_endpoint_auth_signing_alg_values_supported", js.undefined)
    
    inline def setIntrospection_endpoint_auth_signing_alg_values_supportedVarargs(value: String*): Self = StObject.set(x, "introspection_endpoint_auth_signing_alg_values_supported", js.Array(value :_*))
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
    
    inline def setJwks_uriUndefined: Self = StObject.set(x, "jwks_uri", js.undefined)
    
    inline def setMtls_endpoint_aliases(value: MtlsEndpointAliases): Self = StObject.set(x, "mtls_endpoint_aliases", value.asInstanceOf[js.Any])
    
    inline def setMtls_endpoint_aliasesUndefined: Self = StObject.set(x, "mtls_endpoint_aliases", js.undefined)
    
    inline def setRegistration_endpoint(value: String): Self = StObject.set(x, "registration_endpoint", value.asInstanceOf[js.Any])
    
    inline def setRegistration_endpointUndefined: Self = StObject.set(x, "registration_endpoint", js.undefined)
    
    inline def setRequest_object_signing_alg_values_supported(value: js.Array[String]): Self = StObject.set(x, "request_object_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    inline def setRequest_object_signing_alg_values_supportedUndefined: Self = StObject.set(x, "request_object_signing_alg_values_supported", js.undefined)
    
    inline def setRequest_object_signing_alg_values_supportedVarargs(value: String*): Self = StObject.set(x, "request_object_signing_alg_values_supported", js.Array(value :_*))
    
    inline def setRevocation_endpoint(value: String): Self = StObject.set(x, "revocation_endpoint", value.asInstanceOf[js.Any])
    
    inline def setRevocation_endpointUndefined: Self = StObject.set(x, "revocation_endpoint", js.undefined)
    
    inline def setRevocation_endpoint_auth_methods_supported(value: js.Array[String]): Self = StObject.set(x, "revocation_endpoint_auth_methods_supported", value.asInstanceOf[js.Any])
    
    inline def setRevocation_endpoint_auth_methods_supportedUndefined: Self = StObject.set(x, "revocation_endpoint_auth_methods_supported", js.undefined)
    
    inline def setRevocation_endpoint_auth_methods_supportedVarargs(value: String*): Self = StObject.set(x, "revocation_endpoint_auth_methods_supported", js.Array(value :_*))
    
    inline def setRevocation_endpoint_auth_signing_alg_values_supported(value: js.Array[String]): Self = StObject.set(x, "revocation_endpoint_auth_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    inline def setRevocation_endpoint_auth_signing_alg_values_supportedUndefined: Self = StObject.set(x, "revocation_endpoint_auth_signing_alg_values_supported", js.undefined)
    
    inline def setRevocation_endpoint_auth_signing_alg_values_supportedVarargs(value: String*): Self = StObject.set(x, "revocation_endpoint_auth_signing_alg_values_supported", js.Array(value :_*))
    
    inline def setToken_endpoint(value: String): Self = StObject.set(x, "token_endpoint", value.asInstanceOf[js.Any])
    
    inline def setToken_endpointUndefined: Self = StObject.set(x, "token_endpoint", js.undefined)
    
    inline def setToken_endpoint_auth_methods_supported(value: js.Array[String]): Self = StObject.set(x, "token_endpoint_auth_methods_supported", value.asInstanceOf[js.Any])
    
    inline def setToken_endpoint_auth_methods_supportedUndefined: Self = StObject.set(x, "token_endpoint_auth_methods_supported", js.undefined)
    
    inline def setToken_endpoint_auth_methods_supportedVarargs(value: String*): Self = StObject.set(x, "token_endpoint_auth_methods_supported", js.Array(value :_*))
    
    inline def setToken_endpoint_auth_signing_alg_values_supported(value: js.Array[String]): Self = StObject.set(x, "token_endpoint_auth_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    inline def setToken_endpoint_auth_signing_alg_values_supportedUndefined: Self = StObject.set(x, "token_endpoint_auth_signing_alg_values_supported", js.undefined)
    
    inline def setToken_endpoint_auth_signing_alg_values_supportedVarargs(value: String*): Self = StObject.set(x, "token_endpoint_auth_signing_alg_values_supported", js.Array(value :_*))
    
    inline def setUserinfo_endpoint(value: String): Self = StObject.set(x, "userinfo_endpoint", value.asInstanceOf[js.Any])
    
    inline def setUserinfo_endpointUndefined: Self = StObject.set(x, "userinfo_endpoint", js.undefined)
  }
}
