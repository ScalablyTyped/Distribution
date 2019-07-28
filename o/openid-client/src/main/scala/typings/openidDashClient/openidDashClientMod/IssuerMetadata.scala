package typings.openidDashClient.openidDashClientMod

import typings.openidDashClient.Anon_Introspectionendpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuerMetadata extends js.Object {
  val authorization_endpoint: js.UndefOr[String] = js.undefined
  val end_session_endpoint: js.UndefOr[String] = js.undefined
  val introspection_endpoint: js.UndefOr[String] = js.undefined
  val introspection_endpoint_auth_methods_supported: js.UndefOr[js.Array[String]] = js.undefined
  val introspection_endpoint_auth_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.undefined
  val issuer: js.UndefOr[String] = js.undefined
  val jwks_uri: js.UndefOr[String] = js.undefined
  val mtls_endpoint_aliases: js.UndefOr[Anon_Introspectionendpoint] = js.undefined
  val registration_endpoint: js.UndefOr[String] = js.undefined
  val revocation_endpoint: js.UndefOr[String] = js.undefined
  val revocation_endpoint_auth_methods_supported: js.UndefOr[js.Array[String]] = js.undefined
  val revocation_endpoint_auth_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.undefined
  val token_endpoint: js.UndefOr[String] = js.undefined
  val token_endpoint_auth_methods_supported: js.UndefOr[js.Array[String]] = js.undefined
  val token_endpoint_auth_signing_alg_values_supported: js.UndefOr[js.Array[String]] = js.undefined
  val userinfo_endpoint: js.UndefOr[String] = js.undefined
}

object IssuerMetadata {
  @scala.inline
  def apply(
    authorization_endpoint: String = null,
    end_session_endpoint: String = null,
    introspection_endpoint: String = null,
    introspection_endpoint_auth_methods_supported: js.Array[String] = null,
    introspection_endpoint_auth_signing_alg_values_supported: js.Array[String] = null,
    issuer: String = null,
    jwks_uri: String = null,
    mtls_endpoint_aliases: Anon_Introspectionendpoint = null,
    registration_endpoint: String = null,
    revocation_endpoint: String = null,
    revocation_endpoint_auth_methods_supported: js.Array[String] = null,
    revocation_endpoint_auth_signing_alg_values_supported: js.Array[String] = null,
    token_endpoint: String = null,
    token_endpoint_auth_methods_supported: js.Array[String] = null,
    token_endpoint_auth_signing_alg_values_supported: js.Array[String] = null,
    userinfo_endpoint: String = null
  ): IssuerMetadata = {
    val __obj = js.Dynamic.literal()
    if (authorization_endpoint != null) __obj.updateDynamic("authorization_endpoint")(authorization_endpoint)
    if (end_session_endpoint != null) __obj.updateDynamic("end_session_endpoint")(end_session_endpoint)
    if (introspection_endpoint != null) __obj.updateDynamic("introspection_endpoint")(introspection_endpoint)
    if (introspection_endpoint_auth_methods_supported != null) __obj.updateDynamic("introspection_endpoint_auth_methods_supported")(introspection_endpoint_auth_methods_supported)
    if (introspection_endpoint_auth_signing_alg_values_supported != null) __obj.updateDynamic("introspection_endpoint_auth_signing_alg_values_supported")(introspection_endpoint_auth_signing_alg_values_supported)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (jwks_uri != null) __obj.updateDynamic("jwks_uri")(jwks_uri)
    if (mtls_endpoint_aliases != null) __obj.updateDynamic("mtls_endpoint_aliases")(mtls_endpoint_aliases)
    if (registration_endpoint != null) __obj.updateDynamic("registration_endpoint")(registration_endpoint)
    if (revocation_endpoint != null) __obj.updateDynamic("revocation_endpoint")(revocation_endpoint)
    if (revocation_endpoint_auth_methods_supported != null) __obj.updateDynamic("revocation_endpoint_auth_methods_supported")(revocation_endpoint_auth_methods_supported)
    if (revocation_endpoint_auth_signing_alg_values_supported != null) __obj.updateDynamic("revocation_endpoint_auth_signing_alg_values_supported")(revocation_endpoint_auth_signing_alg_values_supported)
    if (token_endpoint != null) __obj.updateDynamic("token_endpoint")(token_endpoint)
    if (token_endpoint_auth_methods_supported != null) __obj.updateDynamic("token_endpoint_auth_methods_supported")(token_endpoint_auth_methods_supported)
    if (token_endpoint_auth_signing_alg_values_supported != null) __obj.updateDynamic("token_endpoint_auth_signing_alg_values_supported")(token_endpoint_auth_signing_alg_values_supported)
    if (userinfo_endpoint != null) __obj.updateDynamic("userinfo_endpoint")(userinfo_endpoint)
    __obj.asInstanceOf[IssuerMetadata]
  }
}

