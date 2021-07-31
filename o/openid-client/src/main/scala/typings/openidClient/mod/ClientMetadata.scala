package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientMetadata
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var authorization_encrypted_response_alg: js.UndefOr[String] = js.undefined
  
  var authorization_encrypted_response_enc: js.UndefOr[String] = js.undefined
  
  var authorization_signed_response_alg: js.UndefOr[String] = js.undefined
  
  // important
  var client_id: String
  
  var client_secret: js.UndefOr[String] = js.undefined
  
  var default_max_age: js.UndefOr[Double] = js.undefined
  
  // less important
  var id_token_encrypted_response_alg: js.UndefOr[String] = js.undefined
  
  var id_token_encrypted_response_enc: js.UndefOr[String] = js.undefined
  
  var id_token_signed_response_alg: js.UndefOr[String] = js.undefined
  
  var introspection_endpoint_auth_method: js.UndefOr[ClientAuthMethod] = js.undefined
  
  var introspection_endpoint_auth_signing_alg: js.UndefOr[String] = js.undefined
  
  var post_logout_redirect_uris: js.UndefOr[js.Array[String]] = js.undefined
  
  var redirect_uris: js.UndefOr[js.Array[String]] = js.undefined
  
  var request_object_encryption_alg: js.UndefOr[String] = js.undefined
  
  var request_object_encryption_enc: js.UndefOr[String] = js.undefined
  
  var request_object_signing_alg: js.UndefOr[String] = js.undefined
  
  var require_auth_time: js.UndefOr[Boolean] = js.undefined
  
  var response_types: js.UndefOr[js.Array[ResponseType]] = js.undefined
  
  var revocation_endpoint_auth_method: js.UndefOr[ClientAuthMethod] = js.undefined
  
  var revocation_endpoint_auth_signing_alg: js.UndefOr[String] = js.undefined
  
  var tls_client_certificate_bound_access_tokens: js.UndefOr[Boolean] = js.undefined
  
  var token_endpoint_auth_method: js.UndefOr[ClientAuthMethod] = js.undefined
  
  var token_endpoint_auth_signing_alg: js.UndefOr[String] = js.undefined
  
  var userinfo_encrypted_response_alg: js.UndefOr[String] = js.undefined
  
  var userinfo_encrypted_response_enc: js.UndefOr[String] = js.undefined
  
  var userinfo_signed_response_alg: js.UndefOr[String] = js.undefined
}
object ClientMetadata {
  
  @scala.inline
  def apply(client_id: String): ClientMetadata = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
  
  @scala.inline
  implicit class ClientMetadataMutableBuilder[Self <: ClientMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization_encrypted_response_alg(value: String): Self = StObject.set(x, "authorization_encrypted_response_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization_encrypted_response_algUndefined: Self = StObject.set(x, "authorization_encrypted_response_alg", js.undefined)
    
    @scala.inline
    def setAuthorization_encrypted_response_enc(value: String): Self = StObject.set(x, "authorization_encrypted_response_enc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization_encrypted_response_encUndefined: Self = StObject.set(x, "authorization_encrypted_response_enc", js.undefined)
    
    @scala.inline
    def setAuthorization_signed_response_alg(value: String): Self = StObject.set(x, "authorization_signed_response_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization_signed_response_algUndefined: Self = StObject.set(x, "authorization_signed_response_alg", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    
    @scala.inline
    def setDefault_max_age(value: Double): Self = StObject.set(x, "default_max_age", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_max_ageUndefined: Self = StObject.set(x, "default_max_age", js.undefined)
    
    @scala.inline
    def setId_token_encrypted_response_alg(value: String): Self = StObject.set(x, "id_token_encrypted_response_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token_encrypted_response_algUndefined: Self = StObject.set(x, "id_token_encrypted_response_alg", js.undefined)
    
    @scala.inline
    def setId_token_encrypted_response_enc(value: String): Self = StObject.set(x, "id_token_encrypted_response_enc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token_encrypted_response_encUndefined: Self = StObject.set(x, "id_token_encrypted_response_enc", js.undefined)
    
    @scala.inline
    def setId_token_signed_response_alg(value: String): Self = StObject.set(x, "id_token_signed_response_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token_signed_response_algUndefined: Self = StObject.set(x, "id_token_signed_response_alg", js.undefined)
    
    @scala.inline
    def setIntrospection_endpoint_auth_method(value: ClientAuthMethod): Self = StObject.set(x, "introspection_endpoint_auth_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntrospection_endpoint_auth_methodUndefined: Self = StObject.set(x, "introspection_endpoint_auth_method", js.undefined)
    
    @scala.inline
    def setIntrospection_endpoint_auth_signing_alg(value: String): Self = StObject.set(x, "introspection_endpoint_auth_signing_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntrospection_endpoint_auth_signing_algUndefined: Self = StObject.set(x, "introspection_endpoint_auth_signing_alg", js.undefined)
    
    @scala.inline
    def setPost_logout_redirect_uris(value: js.Array[String]): Self = StObject.set(x, "post_logout_redirect_uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPost_logout_redirect_urisUndefined: Self = StObject.set(x, "post_logout_redirect_uris", js.undefined)
    
    @scala.inline
    def setPost_logout_redirect_urisVarargs(value: String*): Self = StObject.set(x, "post_logout_redirect_uris", js.Array(value :_*))
    
    @scala.inline
    def setRedirect_uris(value: js.Array[String]): Self = StObject.set(x, "redirect_uris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect_urisUndefined: Self = StObject.set(x, "redirect_uris", js.undefined)
    
    @scala.inline
    def setRedirect_urisVarargs(value: String*): Self = StObject.set(x, "redirect_uris", js.Array(value :_*))
    
    @scala.inline
    def setRequest_object_encryption_alg(value: String): Self = StObject.set(x, "request_object_encryption_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_object_encryption_algUndefined: Self = StObject.set(x, "request_object_encryption_alg", js.undefined)
    
    @scala.inline
    def setRequest_object_encryption_enc(value: String): Self = StObject.set(x, "request_object_encryption_enc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_object_encryption_encUndefined: Self = StObject.set(x, "request_object_encryption_enc", js.undefined)
    
    @scala.inline
    def setRequest_object_signing_alg(value: String): Self = StObject.set(x, "request_object_signing_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_object_signing_algUndefined: Self = StObject.set(x, "request_object_signing_alg", js.undefined)
    
    @scala.inline
    def setRequire_auth_time(value: Boolean): Self = StObject.set(x, "require_auth_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire_auth_timeUndefined: Self = StObject.set(x, "require_auth_time", js.undefined)
    
    @scala.inline
    def setResponse_types(value: js.Array[ResponseType]): Self = StObject.set(x, "response_types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_typesUndefined: Self = StObject.set(x, "response_types", js.undefined)
    
    @scala.inline
    def setResponse_typesVarargs(value: ResponseType*): Self = StObject.set(x, "response_types", js.Array(value :_*))
    
    @scala.inline
    def setRevocation_endpoint_auth_method(value: ClientAuthMethod): Self = StObject.set(x, "revocation_endpoint_auth_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocation_endpoint_auth_methodUndefined: Self = StObject.set(x, "revocation_endpoint_auth_method", js.undefined)
    
    @scala.inline
    def setRevocation_endpoint_auth_signing_alg(value: String): Self = StObject.set(x, "revocation_endpoint_auth_signing_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocation_endpoint_auth_signing_algUndefined: Self = StObject.set(x, "revocation_endpoint_auth_signing_alg", js.undefined)
    
    @scala.inline
    def setTls_client_certificate_bound_access_tokens(value: Boolean): Self = StObject.set(x, "tls_client_certificate_bound_access_tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls_client_certificate_bound_access_tokensUndefined: Self = StObject.set(x, "tls_client_certificate_bound_access_tokens", js.undefined)
    
    @scala.inline
    def setToken_endpoint_auth_method(value: ClientAuthMethod): Self = StObject.set(x, "token_endpoint_auth_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_endpoint_auth_methodUndefined: Self = StObject.set(x, "token_endpoint_auth_method", js.undefined)
    
    @scala.inline
    def setToken_endpoint_auth_signing_alg(value: String): Self = StObject.set(x, "token_endpoint_auth_signing_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_endpoint_auth_signing_algUndefined: Self = StObject.set(x, "token_endpoint_auth_signing_alg", js.undefined)
    
    @scala.inline
    def setUserinfo_encrypted_response_alg(value: String): Self = StObject.set(x, "userinfo_encrypted_response_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserinfo_encrypted_response_algUndefined: Self = StObject.set(x, "userinfo_encrypted_response_alg", js.undefined)
    
    @scala.inline
    def setUserinfo_encrypted_response_enc(value: String): Self = StObject.set(x, "userinfo_encrypted_response_enc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserinfo_encrypted_response_encUndefined: Self = StObject.set(x, "userinfo_encrypted_response_enc", js.undefined)
    
    @scala.inline
    def setUserinfo_signed_response_alg(value: String): Self = StObject.set(x, "userinfo_signed_response_alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserinfo_signed_response_algUndefined: Self = StObject.set(x, "userinfo_signed_response_alg", js.undefined)
  }
}
