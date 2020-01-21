package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuerMetadata
  extends /* key */ StringDictionary[js.Any] {
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
  @scala.inline
  def apply(
    issuer: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    authorization_endpoint: String = null,
    end_session_endpoint: String = null,
    introspection_endpoint_auth_methods_supported: js.Array[String] = null,
    introspection_endpoint_auth_signing_alg_values_supported: js.Array[String] = null,
    jwks_uri: String = null,
    mtls_endpoint_aliases: MtlsEndpointAliases = null,
    registration_endpoint: String = null,
    request_object_signing_alg_values_supported: js.Array[String] = null,
    revocation_endpoint: String = null,
    revocation_endpoint_auth_methods_supported: js.Array[String] = null,
    revocation_endpoint_auth_signing_alg_values_supported: js.Array[String] = null,
    token_endpoint: String = null,
    token_endpoint_auth_methods_supported: js.Array[String] = null,
    token_endpoint_auth_signing_alg_values_supported: js.Array[String] = null,
    userinfo_endpoint: String = null
  ): IssuerMetadata = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (authorization_endpoint != null) __obj.updateDynamic("authorization_endpoint")(authorization_endpoint.asInstanceOf[js.Any])
    if (end_session_endpoint != null) __obj.updateDynamic("end_session_endpoint")(end_session_endpoint.asInstanceOf[js.Any])
    if (introspection_endpoint_auth_methods_supported != null) __obj.updateDynamic("introspection_endpoint_auth_methods_supported")(introspection_endpoint_auth_methods_supported.asInstanceOf[js.Any])
    if (introspection_endpoint_auth_signing_alg_values_supported != null) __obj.updateDynamic("introspection_endpoint_auth_signing_alg_values_supported")(introspection_endpoint_auth_signing_alg_values_supported.asInstanceOf[js.Any])
    if (jwks_uri != null) __obj.updateDynamic("jwks_uri")(jwks_uri.asInstanceOf[js.Any])
    if (mtls_endpoint_aliases != null) __obj.updateDynamic("mtls_endpoint_aliases")(mtls_endpoint_aliases.asInstanceOf[js.Any])
    if (registration_endpoint != null) __obj.updateDynamic("registration_endpoint")(registration_endpoint.asInstanceOf[js.Any])
    if (request_object_signing_alg_values_supported != null) __obj.updateDynamic("request_object_signing_alg_values_supported")(request_object_signing_alg_values_supported.asInstanceOf[js.Any])
    if (revocation_endpoint != null) __obj.updateDynamic("revocation_endpoint")(revocation_endpoint.asInstanceOf[js.Any])
    if (revocation_endpoint_auth_methods_supported != null) __obj.updateDynamic("revocation_endpoint_auth_methods_supported")(revocation_endpoint_auth_methods_supported.asInstanceOf[js.Any])
    if (revocation_endpoint_auth_signing_alg_values_supported != null) __obj.updateDynamic("revocation_endpoint_auth_signing_alg_values_supported")(revocation_endpoint_auth_signing_alg_values_supported.asInstanceOf[js.Any])
    if (token_endpoint != null) __obj.updateDynamic("token_endpoint")(token_endpoint.asInstanceOf[js.Any])
    if (token_endpoint_auth_methods_supported != null) __obj.updateDynamic("token_endpoint_auth_methods_supported")(token_endpoint_auth_methods_supported.asInstanceOf[js.Any])
    if (token_endpoint_auth_signing_alg_values_supported != null) __obj.updateDynamic("token_endpoint_auth_signing_alg_values_supported")(token_endpoint_auth_signing_alg_values_supported.asInstanceOf[js.Any])
    if (userinfo_endpoint != null) __obj.updateDynamic("userinfo_endpoint")(userinfo_endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuerMetadata]
  }
}

