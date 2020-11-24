package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuerMetadata
  extends /* key */ StringDictionary[js.Any] {
  
  var authorization_endpoint: js.UndefOr[String] = js.native
  
  var end_session_endpoint: js.UndefOr[String] = js.native
  
  var introspection_endpoint_auth_methods_supported: js.UndefOr[js.Array[String]] = js.native
  
  var introspection_endpoint_auth_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.native
  
  var issuer: String = js.native
  
  var jwks_uri: js.UndefOr[String] = js.native
  
  var mtls_endpoint_aliases: js.UndefOr[MtlsEndpointAliases] = js.native
  
  var registration_endpoint: js.UndefOr[String] = js.native
  
  var request_object_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.native
  
  var revocation_endpoint: js.UndefOr[String] = js.native
  
  var revocation_endpoint_auth_methods_supported: js.UndefOr[js.Array[String]] = js.native
  
  var revocation_endpoint_auth_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.native
  
  var token_endpoint: js.UndefOr[String] = js.native
  
  var token_endpoint_auth_methods_supported: js.UndefOr[js.Array[String]] = js.native
  
  var token_endpoint_auth_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.native
  
  var userinfo_endpoint: js.UndefOr[String] = js.native
}
object IssuerMetadata {
  
  @scala.inline
  def apply(issuer: String): IssuerMetadata = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuerMetadata]
  }
  
  @scala.inline
  implicit class IssuerMetadataOps[Self <: IssuerMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization_endpoint(value: String): Self = this.set("authorization_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorization_endpoint: Self = this.set("authorization_endpoint", js.undefined)
    
    @scala.inline
    def setEnd_session_endpoint(value: String): Self = this.set("end_session_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_session_endpoint: Self = this.set("end_session_endpoint", js.undefined)
    
    @scala.inline
    def setIntrospection_endpoint_auth_methods_supportedVarargs(value: String*): Self = this.set("introspection_endpoint_auth_methods_supported", js.Array(value :_*))
    
    @scala.inline
    def setIntrospection_endpoint_auth_methods_supported(value: js.Array[String]): Self = this.set("introspection_endpoint_auth_methods_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntrospection_endpoint_auth_methods_supported: Self = this.set("introspection_endpoint_auth_methods_supported", js.undefined)
    
    @scala.inline
    def setIntrospection_endpoint_auth_signing_alg_values_supportedVarargs(value: String*): Self = this.set("introspection_endpoint_auth_signing_alg_values_supported", js.Array(value :_*))
    
    @scala.inline
    def setIntrospection_endpoint_auth_signing_alg_values_supported(value: js.Array[String]): Self = this.set("introspection_endpoint_auth_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntrospection_endpoint_auth_signing_alg_values_supported: Self = this.set("introspection_endpoint_auth_signing_alg_values_supported", js.undefined)
    
    @scala.inline
    def setJwks_uri(value: String): Self = this.set("jwks_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwks_uri: Self = this.set("jwks_uri", js.undefined)
    
    @scala.inline
    def setMtls_endpoint_aliases(value: MtlsEndpointAliases): Self = this.set("mtls_endpoint_aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMtls_endpoint_aliases: Self = this.set("mtls_endpoint_aliases", js.undefined)
    
    @scala.inline
    def setRegistration_endpoint(value: String): Self = this.set("registration_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistration_endpoint: Self = this.set("registration_endpoint", js.undefined)
    
    @scala.inline
    def setRequest_object_signing_alg_values_supportedVarargs(value: String*): Self = this.set("request_object_signing_alg_values_supported", js.Array(value :_*))
    
    @scala.inline
    def setRequest_object_signing_alg_values_supported(value: js.Array[String]): Self = this.set("request_object_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest_object_signing_alg_values_supported: Self = this.set("request_object_signing_alg_values_supported", js.undefined)
    
    @scala.inline
    def setRevocation_endpoint(value: String): Self = this.set("revocation_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocation_endpoint: Self = this.set("revocation_endpoint", js.undefined)
    
    @scala.inline
    def setRevocation_endpoint_auth_methods_supportedVarargs(value: String*): Self = this.set("revocation_endpoint_auth_methods_supported", js.Array(value :_*))
    
    @scala.inline
    def setRevocation_endpoint_auth_methods_supported(value: js.Array[String]): Self = this.set("revocation_endpoint_auth_methods_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocation_endpoint_auth_methods_supported: Self = this.set("revocation_endpoint_auth_methods_supported", js.undefined)
    
    @scala.inline
    def setRevocation_endpoint_auth_signing_alg_values_supportedVarargs(value: String*): Self = this.set("revocation_endpoint_auth_signing_alg_values_supported", js.Array(value :_*))
    
    @scala.inline
    def setRevocation_endpoint_auth_signing_alg_values_supported(value: js.Array[String]): Self = this.set("revocation_endpoint_auth_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocation_endpoint_auth_signing_alg_values_supported: Self = this.set("revocation_endpoint_auth_signing_alg_values_supported", js.undefined)
    
    @scala.inline
    def setToken_endpoint(value: String): Self = this.set("token_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_endpoint: Self = this.set("token_endpoint", js.undefined)
    
    @scala.inline
    def setToken_endpoint_auth_methods_supportedVarargs(value: String*): Self = this.set("token_endpoint_auth_methods_supported", js.Array(value :_*))
    
    @scala.inline
    def setToken_endpoint_auth_methods_supported(value: js.Array[String]): Self = this.set("token_endpoint_auth_methods_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_endpoint_auth_methods_supported: Self = this.set("token_endpoint_auth_methods_supported", js.undefined)
    
    @scala.inline
    def setToken_endpoint_auth_signing_alg_values_supportedVarargs(value: String*): Self = this.set("token_endpoint_auth_signing_alg_values_supported", js.Array(value :_*))
    
    @scala.inline
    def setToken_endpoint_auth_signing_alg_values_supported(value: js.Array[String]): Self = this.set("token_endpoint_auth_signing_alg_values_supported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken_endpoint_auth_signing_alg_values_supported: Self = this.set("token_endpoint_auth_signing_alg_values_supported", js.undefined)
    
    @scala.inline
    def setUserinfo_endpoint(value: String): Self = this.set("userinfo_endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserinfo_endpoint: Self = this.set("userinfo_endpoint", js.undefined)
  }
}
