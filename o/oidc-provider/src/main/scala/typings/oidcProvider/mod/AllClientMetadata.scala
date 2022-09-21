package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.oidcProviderStrings.native
import typings.oidcProvider.oidcProviderStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllClientMetadata
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var application_type: js.UndefOr[web | native] = js.undefined
  
  var authorization_encrypted_response_alg: js.UndefOr[EncryptionAlgValues] = js.undefined
  
  var authorization_encrypted_response_enc: js.UndefOr[EncryptionEncValues] = js.undefined
  
  var authorization_signed_response_alg: js.UndefOr[SigningAlgorithm] = js.undefined
  
  var backchannel_authentication_request_signing_alg: js.UndefOr[String] = js.undefined
  
  var backchannel_client_notification_endpoint: js.UndefOr[String] = js.undefined
  
  var backchannel_logout_session_required: js.UndefOr[Boolean] = js.undefined
  
  var backchannel_logout_uri: js.UndefOr[String] = js.undefined
  
  var backchannel_token_delivery_mode: js.UndefOr[CIBADeliveryMode] = js.undefined
  
  var backchannel_user_code_parameter: js.UndefOr[Boolean] = js.undefined
  
  var client_id: js.UndefOr[String] = js.undefined
  
  var client_id_issued_at: js.UndefOr[Double] = js.undefined
  
  var client_name: js.UndefOr[String] = js.undefined
  
  var client_secret: js.UndefOr[String] = js.undefined
  
  var client_secret_expires_at: js.UndefOr[Double] = js.undefined
  
  var client_uri: js.UndefOr[String] = js.undefined
  
  var contacts: js.UndefOr[js.Array[String]] = js.undefined
  
  var default_acr_values: js.UndefOr[js.Array[String]] = js.undefined
  
  var default_max_age: js.UndefOr[Double] = js.undefined
  
  var grant_types: js.UndefOr[js.Array[String]] = js.undefined
  
  var id_token_encrypted_response_alg: js.UndefOr[EncryptionAlgValues] = js.undefined
  
  var id_token_encrypted_response_enc: js.UndefOr[EncryptionEncValues] = js.undefined
  
  var id_token_signed_response_alg: js.UndefOr[SigningAlgorithmWithNone] = js.undefined
  
  var initiate_login_uri: js.UndefOr[String] = js.undefined
  
  var introspection_encrypted_response_alg: js.UndefOr[EncryptionAlgValues] = js.undefined
  
  var introspection_encrypted_response_enc: js.UndefOr[EncryptionEncValues] = js.undefined
  
  var introspection_signed_response_alg: js.UndefOr[SigningAlgorithmWithNone] = js.undefined
  
  var jwks: js.UndefOr[JWKS] = js.undefined
  
  var jwks_uri: js.UndefOr[String] = js.undefined
  
  var logo_uri: js.UndefOr[String] = js.undefined
  
  var policy_uri: js.UndefOr[String] = js.undefined
  
  var post_logout_redirect_uris: js.UndefOr[js.Array[String]] = js.undefined
  
  var redirect_uris: js.UndefOr[js.Array[String]] = js.undefined
  
  var request_object_encryption_alg: js.UndefOr[EncryptionAlgValues] = js.undefined
  
  var request_object_encryption_enc: js.UndefOr[EncryptionEncValues] = js.undefined
  
  var request_object_signing_alg: js.UndefOr[SigningAlgorithmWithNone] = js.undefined
  
  var request_uris: js.UndefOr[js.Array[String]] = js.undefined
  
  var require_auth_time: js.UndefOr[Boolean] = js.undefined
  
  var require_pushed_authorization_requests: js.UndefOr[Boolean] = js.undefined
  
  var require_signed_request_object: js.UndefOr[Boolean] = js.undefined
  
  var response_types: js.UndefOr[js.Array[ResponseType]] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var sector_identifier_uri: js.UndefOr[String] = js.undefined
  
  var subject_type: js.UndefOr[SubjectTypes] = js.undefined
  
  var tls_client_auth_san_dns: js.UndefOr[String] = js.undefined
  
  var tls_client_auth_san_email: js.UndefOr[String] = js.undefined
  
  var tls_client_auth_san_ip: js.UndefOr[String] = js.undefined
  
  var tls_client_auth_san_uri: js.UndefOr[String] = js.undefined
  
  var tls_client_auth_subject_dn: js.UndefOr[String] = js.undefined
  
  var tls_client_certificate_bound_access_tokens: js.UndefOr[Boolean] = js.undefined
  
  var token_endpoint_auth_method: js.UndefOr[ClientAuthMethod] = js.undefined
  
  var token_endpoint_auth_signing_alg: js.UndefOr[SigningAlgorithm] = js.undefined
  
  var tos_uri: js.UndefOr[String] = js.undefined
  
  var userinfo_encrypted_response_alg: js.UndefOr[EncryptionAlgValues] = js.undefined
  
  var userinfo_encrypted_response_enc: js.UndefOr[EncryptionEncValues] = js.undefined
  
  var userinfo_signed_response_alg: js.UndefOr[SigningAlgorithmWithNone] = js.undefined
  
  var web_message_uris: js.UndefOr[js.Array[String]] = js.undefined
}
object AllClientMetadata {
  
  inline def apply(): AllClientMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllClientMetadata]
  }
  
  extension [Self <: AllClientMetadata](x: Self) {
    
    inline def setApplication_type(value: web | native): Self = StObject.set(x, "application_type", value.asInstanceOf[js.Any])
    
    inline def setApplication_typeUndefined: Self = StObject.set(x, "application_type", js.undefined)
    
    inline def setAuthorization_encrypted_response_alg(value: EncryptionAlgValues): Self = StObject.set(x, "authorization_encrypted_response_alg", value.asInstanceOf[js.Any])
    
    inline def setAuthorization_encrypted_response_algUndefined: Self = StObject.set(x, "authorization_encrypted_response_alg", js.undefined)
    
    inline def setAuthorization_encrypted_response_enc(value: EncryptionEncValues): Self = StObject.set(x, "authorization_encrypted_response_enc", value.asInstanceOf[js.Any])
    
    inline def setAuthorization_encrypted_response_encUndefined: Self = StObject.set(x, "authorization_encrypted_response_enc", js.undefined)
    
    inline def setAuthorization_signed_response_alg(value: SigningAlgorithm): Self = StObject.set(x, "authorization_signed_response_alg", value.asInstanceOf[js.Any])
    
    inline def setAuthorization_signed_response_algUndefined: Self = StObject.set(x, "authorization_signed_response_alg", js.undefined)
    
    inline def setBackchannel_authentication_request_signing_alg(value: String): Self = StObject.set(x, "backchannel_authentication_request_signing_alg", value.asInstanceOf[js.Any])
    
    inline def setBackchannel_authentication_request_signing_algUndefined: Self = StObject.set(x, "backchannel_authentication_request_signing_alg", js.undefined)
    
    inline def setBackchannel_client_notification_endpoint(value: String): Self = StObject.set(x, "backchannel_client_notification_endpoint", value.asInstanceOf[js.Any])
    
    inline def setBackchannel_client_notification_endpointUndefined: Self = StObject.set(x, "backchannel_client_notification_endpoint", js.undefined)
    
    inline def setBackchannel_logout_session_required(value: Boolean): Self = StObject.set(x, "backchannel_logout_session_required", value.asInstanceOf[js.Any])
    
    inline def setBackchannel_logout_session_requiredUndefined: Self = StObject.set(x, "backchannel_logout_session_required", js.undefined)
    
    inline def setBackchannel_logout_uri(value: String): Self = StObject.set(x, "backchannel_logout_uri", value.asInstanceOf[js.Any])
    
    inline def setBackchannel_logout_uriUndefined: Self = StObject.set(x, "backchannel_logout_uri", js.undefined)
    
    inline def setBackchannel_token_delivery_mode(value: CIBADeliveryMode): Self = StObject.set(x, "backchannel_token_delivery_mode", value.asInstanceOf[js.Any])
    
    inline def setBackchannel_token_delivery_modeUndefined: Self = StObject.set(x, "backchannel_token_delivery_mode", js.undefined)
    
    inline def setBackchannel_user_code_parameter(value: Boolean): Self = StObject.set(x, "backchannel_user_code_parameter", value.asInstanceOf[js.Any])
    
    inline def setBackchannel_user_code_parameterUndefined: Self = StObject.set(x, "backchannel_user_code_parameter", js.undefined)
    
    inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
    
    inline def setClient_id_issued_at(value: Double): Self = StObject.set(x, "client_id_issued_at", value.asInstanceOf[js.Any])
    
    inline def setClient_id_issued_atUndefined: Self = StObject.set(x, "client_id_issued_at", js.undefined)
    
    inline def setClient_name(value: String): Self = StObject.set(x, "client_name", value.asInstanceOf[js.Any])
    
    inline def setClient_nameUndefined: Self = StObject.set(x, "client_name", js.undefined)
    
    inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
    
    inline def setClient_secret_expires_at(value: Double): Self = StObject.set(x, "client_secret_expires_at", value.asInstanceOf[js.Any])
    
    inline def setClient_secret_expires_atUndefined: Self = StObject.set(x, "client_secret_expires_at", js.undefined)
    
    inline def setClient_uri(value: String): Self = StObject.set(x, "client_uri", value.asInstanceOf[js.Any])
    
    inline def setClient_uriUndefined: Self = StObject.set(x, "client_uri", js.undefined)
    
    inline def setContacts(value: js.Array[String]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setContactsVarargs(value: String*): Self = StObject.set(x, "contacts", js.Array(value*))
    
    inline def setDefault_acr_values(value: js.Array[String]): Self = StObject.set(x, "default_acr_values", value.asInstanceOf[js.Any])
    
    inline def setDefault_acr_valuesUndefined: Self = StObject.set(x, "default_acr_values", js.undefined)
    
    inline def setDefault_acr_valuesVarargs(value: String*): Self = StObject.set(x, "default_acr_values", js.Array(value*))
    
    inline def setDefault_max_age(value: Double): Self = StObject.set(x, "default_max_age", value.asInstanceOf[js.Any])
    
    inline def setDefault_max_ageUndefined: Self = StObject.set(x, "default_max_age", js.undefined)
    
    inline def setGrant_types(value: js.Array[String]): Self = StObject.set(x, "grant_types", value.asInstanceOf[js.Any])
    
    inline def setGrant_typesUndefined: Self = StObject.set(x, "grant_types", js.undefined)
    
    inline def setGrant_typesVarargs(value: String*): Self = StObject.set(x, "grant_types", js.Array(value*))
    
    inline def setId_token_encrypted_response_alg(value: EncryptionAlgValues): Self = StObject.set(x, "id_token_encrypted_response_alg", value.asInstanceOf[js.Any])
    
    inline def setId_token_encrypted_response_algUndefined: Self = StObject.set(x, "id_token_encrypted_response_alg", js.undefined)
    
    inline def setId_token_encrypted_response_enc(value: EncryptionEncValues): Self = StObject.set(x, "id_token_encrypted_response_enc", value.asInstanceOf[js.Any])
    
    inline def setId_token_encrypted_response_encUndefined: Self = StObject.set(x, "id_token_encrypted_response_enc", js.undefined)
    
    inline def setId_token_signed_response_alg(value: SigningAlgorithmWithNone): Self = StObject.set(x, "id_token_signed_response_alg", value.asInstanceOf[js.Any])
    
    inline def setId_token_signed_response_algUndefined: Self = StObject.set(x, "id_token_signed_response_alg", js.undefined)
    
    inline def setInitiate_login_uri(value: String): Self = StObject.set(x, "initiate_login_uri", value.asInstanceOf[js.Any])
    
    inline def setInitiate_login_uriUndefined: Self = StObject.set(x, "initiate_login_uri", js.undefined)
    
    inline def setIntrospection_encrypted_response_alg(value: EncryptionAlgValues): Self = StObject.set(x, "introspection_encrypted_response_alg", value.asInstanceOf[js.Any])
    
    inline def setIntrospection_encrypted_response_algUndefined: Self = StObject.set(x, "introspection_encrypted_response_alg", js.undefined)
    
    inline def setIntrospection_encrypted_response_enc(value: EncryptionEncValues): Self = StObject.set(x, "introspection_encrypted_response_enc", value.asInstanceOf[js.Any])
    
    inline def setIntrospection_encrypted_response_encUndefined: Self = StObject.set(x, "introspection_encrypted_response_enc", js.undefined)
    
    inline def setIntrospection_signed_response_alg(value: SigningAlgorithmWithNone): Self = StObject.set(x, "introspection_signed_response_alg", value.asInstanceOf[js.Any])
    
    inline def setIntrospection_signed_response_algUndefined: Self = StObject.set(x, "introspection_signed_response_alg", js.undefined)
    
    inline def setJwks(value: JWKS): Self = StObject.set(x, "jwks", value.asInstanceOf[js.Any])
    
    inline def setJwksUndefined: Self = StObject.set(x, "jwks", js.undefined)
    
    inline def setJwks_uri(value: String): Self = StObject.set(x, "jwks_uri", value.asInstanceOf[js.Any])
    
    inline def setJwks_uriUndefined: Self = StObject.set(x, "jwks_uri", js.undefined)
    
    inline def setLogo_uri(value: String): Self = StObject.set(x, "logo_uri", value.asInstanceOf[js.Any])
    
    inline def setLogo_uriUndefined: Self = StObject.set(x, "logo_uri", js.undefined)
    
    inline def setPolicy_uri(value: String): Self = StObject.set(x, "policy_uri", value.asInstanceOf[js.Any])
    
    inline def setPolicy_uriUndefined: Self = StObject.set(x, "policy_uri", js.undefined)
    
    inline def setPost_logout_redirect_uris(value: js.Array[String]): Self = StObject.set(x, "post_logout_redirect_uris", value.asInstanceOf[js.Any])
    
    inline def setPost_logout_redirect_urisUndefined: Self = StObject.set(x, "post_logout_redirect_uris", js.undefined)
    
    inline def setPost_logout_redirect_urisVarargs(value: String*): Self = StObject.set(x, "post_logout_redirect_uris", js.Array(value*))
    
    inline def setRedirect_uris(value: js.Array[String]): Self = StObject.set(x, "redirect_uris", value.asInstanceOf[js.Any])
    
    inline def setRedirect_urisUndefined: Self = StObject.set(x, "redirect_uris", js.undefined)
    
    inline def setRedirect_urisVarargs(value: String*): Self = StObject.set(x, "redirect_uris", js.Array(value*))
    
    inline def setRequest_object_encryption_alg(value: EncryptionAlgValues): Self = StObject.set(x, "request_object_encryption_alg", value.asInstanceOf[js.Any])
    
    inline def setRequest_object_encryption_algUndefined: Self = StObject.set(x, "request_object_encryption_alg", js.undefined)
    
    inline def setRequest_object_encryption_enc(value: EncryptionEncValues): Self = StObject.set(x, "request_object_encryption_enc", value.asInstanceOf[js.Any])
    
    inline def setRequest_object_encryption_encUndefined: Self = StObject.set(x, "request_object_encryption_enc", js.undefined)
    
    inline def setRequest_object_signing_alg(value: SigningAlgorithmWithNone): Self = StObject.set(x, "request_object_signing_alg", value.asInstanceOf[js.Any])
    
    inline def setRequest_object_signing_algUndefined: Self = StObject.set(x, "request_object_signing_alg", js.undefined)
    
    inline def setRequest_uris(value: js.Array[String]): Self = StObject.set(x, "request_uris", value.asInstanceOf[js.Any])
    
    inline def setRequest_urisUndefined: Self = StObject.set(x, "request_uris", js.undefined)
    
    inline def setRequest_urisVarargs(value: String*): Self = StObject.set(x, "request_uris", js.Array(value*))
    
    inline def setRequire_auth_time(value: Boolean): Self = StObject.set(x, "require_auth_time", value.asInstanceOf[js.Any])
    
    inline def setRequire_auth_timeUndefined: Self = StObject.set(x, "require_auth_time", js.undefined)
    
    inline def setRequire_pushed_authorization_requests(value: Boolean): Self = StObject.set(x, "require_pushed_authorization_requests", value.asInstanceOf[js.Any])
    
    inline def setRequire_pushed_authorization_requestsUndefined: Self = StObject.set(x, "require_pushed_authorization_requests", js.undefined)
    
    inline def setRequire_signed_request_object(value: Boolean): Self = StObject.set(x, "require_signed_request_object", value.asInstanceOf[js.Any])
    
    inline def setRequire_signed_request_objectUndefined: Self = StObject.set(x, "require_signed_request_object", js.undefined)
    
    inline def setResponse_types(value: js.Array[ResponseType]): Self = StObject.set(x, "response_types", value.asInstanceOf[js.Any])
    
    inline def setResponse_typesUndefined: Self = StObject.set(x, "response_types", js.undefined)
    
    inline def setResponse_typesVarargs(value: ResponseType*): Self = StObject.set(x, "response_types", js.Array(value*))
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSector_identifier_uri(value: String): Self = StObject.set(x, "sector_identifier_uri", value.asInstanceOf[js.Any])
    
    inline def setSector_identifier_uriUndefined: Self = StObject.set(x, "sector_identifier_uri", js.undefined)
    
    inline def setSubject_type(value: SubjectTypes): Self = StObject.set(x, "subject_type", value.asInstanceOf[js.Any])
    
    inline def setSubject_typeUndefined: Self = StObject.set(x, "subject_type", js.undefined)
    
    inline def setTls_client_auth_san_dns(value: String): Self = StObject.set(x, "tls_client_auth_san_dns", value.asInstanceOf[js.Any])
    
    inline def setTls_client_auth_san_dnsUndefined: Self = StObject.set(x, "tls_client_auth_san_dns", js.undefined)
    
    inline def setTls_client_auth_san_email(value: String): Self = StObject.set(x, "tls_client_auth_san_email", value.asInstanceOf[js.Any])
    
    inline def setTls_client_auth_san_emailUndefined: Self = StObject.set(x, "tls_client_auth_san_email", js.undefined)
    
    inline def setTls_client_auth_san_ip(value: String): Self = StObject.set(x, "tls_client_auth_san_ip", value.asInstanceOf[js.Any])
    
    inline def setTls_client_auth_san_ipUndefined: Self = StObject.set(x, "tls_client_auth_san_ip", js.undefined)
    
    inline def setTls_client_auth_san_uri(value: String): Self = StObject.set(x, "tls_client_auth_san_uri", value.asInstanceOf[js.Any])
    
    inline def setTls_client_auth_san_uriUndefined: Self = StObject.set(x, "tls_client_auth_san_uri", js.undefined)
    
    inline def setTls_client_auth_subject_dn(value: String): Self = StObject.set(x, "tls_client_auth_subject_dn", value.asInstanceOf[js.Any])
    
    inline def setTls_client_auth_subject_dnUndefined: Self = StObject.set(x, "tls_client_auth_subject_dn", js.undefined)
    
    inline def setTls_client_certificate_bound_access_tokens(value: Boolean): Self = StObject.set(x, "tls_client_certificate_bound_access_tokens", value.asInstanceOf[js.Any])
    
    inline def setTls_client_certificate_bound_access_tokensUndefined: Self = StObject.set(x, "tls_client_certificate_bound_access_tokens", js.undefined)
    
    inline def setToken_endpoint_auth_method(value: ClientAuthMethod): Self = StObject.set(x, "token_endpoint_auth_method", value.asInstanceOf[js.Any])
    
    inline def setToken_endpoint_auth_methodUndefined: Self = StObject.set(x, "token_endpoint_auth_method", js.undefined)
    
    inline def setToken_endpoint_auth_signing_alg(value: SigningAlgorithm): Self = StObject.set(x, "token_endpoint_auth_signing_alg", value.asInstanceOf[js.Any])
    
    inline def setToken_endpoint_auth_signing_algUndefined: Self = StObject.set(x, "token_endpoint_auth_signing_alg", js.undefined)
    
    inline def setTos_uri(value: String): Self = StObject.set(x, "tos_uri", value.asInstanceOf[js.Any])
    
    inline def setTos_uriUndefined: Self = StObject.set(x, "tos_uri", js.undefined)
    
    inline def setUserinfo_encrypted_response_alg(value: EncryptionAlgValues): Self = StObject.set(x, "userinfo_encrypted_response_alg", value.asInstanceOf[js.Any])
    
    inline def setUserinfo_encrypted_response_algUndefined: Self = StObject.set(x, "userinfo_encrypted_response_alg", js.undefined)
    
    inline def setUserinfo_encrypted_response_enc(value: EncryptionEncValues): Self = StObject.set(x, "userinfo_encrypted_response_enc", value.asInstanceOf[js.Any])
    
    inline def setUserinfo_encrypted_response_encUndefined: Self = StObject.set(x, "userinfo_encrypted_response_enc", js.undefined)
    
    inline def setUserinfo_signed_response_alg(value: SigningAlgorithmWithNone): Self = StObject.set(x, "userinfo_signed_response_alg", value.asInstanceOf[js.Any])
    
    inline def setUserinfo_signed_response_algUndefined: Self = StObject.set(x, "userinfo_signed_response_alg", js.undefined)
    
    inline def setWeb_message_uris(value: js.Array[String]): Self = StObject.set(x, "web_message_uris", value.asInstanceOf[js.Any])
    
    inline def setWeb_message_urisUndefined: Self = StObject.set(x, "web_message_uris", js.undefined)
    
    inline def setWeb_message_urisVarargs(value: String*): Self = StObject.set(x, "web_message_uris", js.Array(value*))
  }
}
