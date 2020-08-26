package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientMetadata
  extends /* key */ StringDictionary[js.Any] {
  var authorization_encrypted_response_alg: js.UndefOr[String] = js.native
  var authorization_encrypted_response_enc: js.UndefOr[String] = js.native
  var authorization_signed_response_alg: js.UndefOr[String] = js.native
  // important
  var client_id: String = js.native
  var client_secret: js.UndefOr[String] = js.native
  var default_max_age: js.UndefOr[Double] = js.native
  // less important
  var id_token_encrypted_response_alg: js.UndefOr[String] = js.native
  var id_token_encrypted_response_enc: js.UndefOr[String] = js.native
  var id_token_signed_response_alg: js.UndefOr[String] = js.native
  var introspection_endpoint_auth_method: js.UndefOr[ClientAuthMethod] = js.native
  var introspection_endpoint_auth_signing_alg: js.UndefOr[String] = js.native
  var post_logout_redirect_uris: js.UndefOr[js.Array[String]] = js.native
  var redirect_uris: js.UndefOr[js.Array[String]] = js.native
  var request_object_encryption_alg: js.UndefOr[String] = js.native
  var request_object_encryption_enc: js.UndefOr[String] = js.native
  var request_object_signing_alg: js.UndefOr[String] = js.native
  var require_auth_time: js.UndefOr[Boolean] = js.native
  var response_types: js.UndefOr[js.Array[ResponseType]] = js.native
  var revocation_endpoint_auth_method: js.UndefOr[ClientAuthMethod] = js.native
  var revocation_endpoint_auth_signing_alg: js.UndefOr[String] = js.native
  var tls_client_certificate_bound_access_tokens: js.UndefOr[Boolean] = js.native
  var token_endpoint_auth_method: js.UndefOr[ClientAuthMethod] = js.native
  var token_endpoint_auth_signing_alg: js.UndefOr[String] = js.native
  var userinfo_encrypted_response_alg: js.UndefOr[String] = js.native
  var userinfo_encrypted_response_enc: js.UndefOr[String] = js.native
  var userinfo_signed_response_alg: js.UndefOr[String] = js.native
}

object ClientMetadata {
  @scala.inline
  def apply(client_id: String): ClientMetadata = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
  @scala.inline
  implicit class ClientMetadataOps[Self <: ClientMetadata] (val x: Self) extends AnyVal {
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthorization_encrypted_response_alg(value: String): Self = this.set("authorization_encrypted_response_alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization_encrypted_response_alg: Self = this.set("authorization_encrypted_response_alg", js.undefined)
    @scala.inline
    def setAuthorization_encrypted_response_enc(value: String): Self = this.set("authorization_encrypted_response_enc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization_encrypted_response_enc: Self = this.set("authorization_encrypted_response_enc", js.undefined)
    @scala.inline
    def setAuthorization_signed_response_alg(value: String): Self = this.set("authorization_signed_response_alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorization_signed_response_alg: Self = this.set("authorization_signed_response_alg", js.undefined)
    @scala.inline
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_secret: Self = this.set("client_secret", js.undefined)
    @scala.inline
    def setDefault_max_age(value: Double): Self = this.set("default_max_age", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_max_age: Self = this.set("default_max_age", js.undefined)
    @scala.inline
    def setId_token_encrypted_response_alg(value: String): Self = this.set("id_token_encrypted_response_alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId_token_encrypted_response_alg: Self = this.set("id_token_encrypted_response_alg", js.undefined)
    @scala.inline
    def setId_token_encrypted_response_enc(value: String): Self = this.set("id_token_encrypted_response_enc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId_token_encrypted_response_enc: Self = this.set("id_token_encrypted_response_enc", js.undefined)
    @scala.inline
    def setId_token_signed_response_alg(value: String): Self = this.set("id_token_signed_response_alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId_token_signed_response_alg: Self = this.set("id_token_signed_response_alg", js.undefined)
    @scala.inline
    def setIntrospection_endpoint_auth_method(value: ClientAuthMethod): Self = this.set("introspection_endpoint_auth_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntrospection_endpoint_auth_method: Self = this.set("introspection_endpoint_auth_method", js.undefined)
    @scala.inline
    def setIntrospection_endpoint_auth_signing_alg(value: String): Self = this.set("introspection_endpoint_auth_signing_alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntrospection_endpoint_auth_signing_alg: Self = this.set("introspection_endpoint_auth_signing_alg", js.undefined)
    @scala.inline
    def setPost_logout_redirect_urisVarargs(value: String*): Self = this.set("post_logout_redirect_uris", js.Array(value :_*))
    @scala.inline
    def setPost_logout_redirect_uris(value: js.Array[String]): Self = this.set("post_logout_redirect_uris", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePost_logout_redirect_uris: Self = this.set("post_logout_redirect_uris", js.undefined)
    @scala.inline
    def setRedirect_urisVarargs(value: String*): Self = this.set("redirect_uris", js.Array(value :_*))
    @scala.inline
    def setRedirect_uris(value: js.Array[String]): Self = this.set("redirect_uris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect_uris: Self = this.set("redirect_uris", js.undefined)
    @scala.inline
    def setRequest_object_encryption_alg(value: String): Self = this.set("request_object_encryption_alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_object_encryption_alg: Self = this.set("request_object_encryption_alg", js.undefined)
    @scala.inline
    def setRequest_object_encryption_enc(value: String): Self = this.set("request_object_encryption_enc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_object_encryption_enc: Self = this.set("request_object_encryption_enc", js.undefined)
    @scala.inline
    def setRequest_object_signing_alg(value: String): Self = this.set("request_object_signing_alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest_object_signing_alg: Self = this.set("request_object_signing_alg", js.undefined)
    @scala.inline
    def setRequire_auth_time(value: Boolean): Self = this.set("require_auth_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire_auth_time: Self = this.set("require_auth_time", js.undefined)
    @scala.inline
    def setResponse_typesVarargs(value: ResponseType*): Self = this.set("response_types", js.Array(value :_*))
    @scala.inline
    def setResponse_types(value: js.Array[ResponseType]): Self = this.set("response_types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse_types: Self = this.set("response_types", js.undefined)
    @scala.inline
    def setRevocation_endpoint_auth_method(value: ClientAuthMethod): Self = this.set("revocation_endpoint_auth_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevocation_endpoint_auth_method: Self = this.set("revocation_endpoint_auth_method", js.undefined)
    @scala.inline
    def setRevocation_endpoint_auth_signing_alg(value: String): Self = this.set("revocation_endpoint_auth_signing_alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevocation_endpoint_auth_signing_alg: Self = this.set("revocation_endpoint_auth_signing_alg", js.undefined)
    @scala.inline
    def setTls_client_certificate_bound_access_tokens(value: Boolean): Self = this.set("tls_client_certificate_bound_access_tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTls_client_certificate_bound_access_tokens: Self = this.set("tls_client_certificate_bound_access_tokens", js.undefined)
    @scala.inline
    def setToken_endpoint_auth_method(value: ClientAuthMethod): Self = this.set("token_endpoint_auth_method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken_endpoint_auth_method: Self = this.set("token_endpoint_auth_method", js.undefined)
    @scala.inline
    def setToken_endpoint_auth_signing_alg(value: String): Self = this.set("token_endpoint_auth_signing_alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken_endpoint_auth_signing_alg: Self = this.set("token_endpoint_auth_signing_alg", js.undefined)
    @scala.inline
    def setUserinfo_encrypted_response_alg(value: String): Self = this.set("userinfo_encrypted_response_alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserinfo_encrypted_response_alg: Self = this.set("userinfo_encrypted_response_alg", js.undefined)
    @scala.inline
    def setUserinfo_encrypted_response_enc(value: String): Self = this.set("userinfo_encrypted_response_enc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserinfo_encrypted_response_enc: Self = this.set("userinfo_encrypted_response_enc", js.undefined)
    @scala.inline
    def setUserinfo_signed_response_alg(value: String): Self = this.set("userinfo_signed_response_alg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserinfo_signed_response_alg: Self = this.set("userinfo_signed_response_alg", js.undefined)
  }
  
}

