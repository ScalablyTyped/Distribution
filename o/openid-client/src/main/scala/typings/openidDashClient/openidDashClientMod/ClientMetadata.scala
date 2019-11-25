package typings.openidDashClient.openidDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMetadata
  extends /* key */ StringDictionary[js.Any] {
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
  def apply(
    client_id: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    client_secret: String = null,
    default_max_age: Int | Double = null,
    id_token_encrypted_response_alg: String = null,
    id_token_encrypted_response_enc: String = null,
    id_token_signed_response_alg: String = null,
    introspection_endpoint_auth_method: ClientAuthMethod = null,
    introspection_endpoint_auth_signing_alg: String = null,
    post_logout_redirect_uris: js.Array[String] = null,
    redirect_uris: js.Array[String] = null,
    request_object_encryption_alg: String = null,
    request_object_encryption_enc: String = null,
    request_object_signing_alg: String = null,
    require_auth_time: js.UndefOr[Boolean] = js.undefined,
    response_types: js.Array[ResponseType] = null,
    revocation_endpoint_auth_method: ClientAuthMethod = null,
    revocation_endpoint_auth_signing_alg: String = null,
    tls_client_certificate_bound_access_tokens: js.UndefOr[Boolean] = js.undefined,
    token_endpoint_auth_method: ClientAuthMethod = null,
    token_endpoint_auth_signing_alg: String = null,
    userinfo_encrypted_response_alg: String = null,
    userinfo_encrypted_response_enc: String = null,
    userinfo_signed_response_alg: String = null
  ): ClientMetadata = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    if (default_max_age != null) __obj.updateDynamic("default_max_age")(default_max_age.asInstanceOf[js.Any])
    if (id_token_encrypted_response_alg != null) __obj.updateDynamic("id_token_encrypted_response_alg")(id_token_encrypted_response_alg.asInstanceOf[js.Any])
    if (id_token_encrypted_response_enc != null) __obj.updateDynamic("id_token_encrypted_response_enc")(id_token_encrypted_response_enc.asInstanceOf[js.Any])
    if (id_token_signed_response_alg != null) __obj.updateDynamic("id_token_signed_response_alg")(id_token_signed_response_alg.asInstanceOf[js.Any])
    if (introspection_endpoint_auth_method != null) __obj.updateDynamic("introspection_endpoint_auth_method")(introspection_endpoint_auth_method.asInstanceOf[js.Any])
    if (introspection_endpoint_auth_signing_alg != null) __obj.updateDynamic("introspection_endpoint_auth_signing_alg")(introspection_endpoint_auth_signing_alg.asInstanceOf[js.Any])
    if (post_logout_redirect_uris != null) __obj.updateDynamic("post_logout_redirect_uris")(post_logout_redirect_uris.asInstanceOf[js.Any])
    if (redirect_uris != null) __obj.updateDynamic("redirect_uris")(redirect_uris.asInstanceOf[js.Any])
    if (request_object_encryption_alg != null) __obj.updateDynamic("request_object_encryption_alg")(request_object_encryption_alg.asInstanceOf[js.Any])
    if (request_object_encryption_enc != null) __obj.updateDynamic("request_object_encryption_enc")(request_object_encryption_enc.asInstanceOf[js.Any])
    if (request_object_signing_alg != null) __obj.updateDynamic("request_object_signing_alg")(request_object_signing_alg.asInstanceOf[js.Any])
    if (!js.isUndefined(require_auth_time)) __obj.updateDynamic("require_auth_time")(require_auth_time.asInstanceOf[js.Any])
    if (response_types != null) __obj.updateDynamic("response_types")(response_types.asInstanceOf[js.Any])
    if (revocation_endpoint_auth_method != null) __obj.updateDynamic("revocation_endpoint_auth_method")(revocation_endpoint_auth_method.asInstanceOf[js.Any])
    if (revocation_endpoint_auth_signing_alg != null) __obj.updateDynamic("revocation_endpoint_auth_signing_alg")(revocation_endpoint_auth_signing_alg.asInstanceOf[js.Any])
    if (!js.isUndefined(tls_client_certificate_bound_access_tokens)) __obj.updateDynamic("tls_client_certificate_bound_access_tokens")(tls_client_certificate_bound_access_tokens.asInstanceOf[js.Any])
    if (token_endpoint_auth_method != null) __obj.updateDynamic("token_endpoint_auth_method")(token_endpoint_auth_method.asInstanceOf[js.Any])
    if (token_endpoint_auth_signing_alg != null) __obj.updateDynamic("token_endpoint_auth_signing_alg")(token_endpoint_auth_signing_alg.asInstanceOf[js.Any])
    if (userinfo_encrypted_response_alg != null) __obj.updateDynamic("userinfo_encrypted_response_alg")(userinfo_encrypted_response_alg.asInstanceOf[js.Any])
    if (userinfo_encrypted_response_enc != null) __obj.updateDynamic("userinfo_encrypted_response_enc")(userinfo_encrypted_response_enc.asInstanceOf[js.Any])
    if (userinfo_signed_response_alg != null) __obj.updateDynamic("userinfo_signed_response_alg")(userinfo_signed_response_alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientMetadata]
  }
}

