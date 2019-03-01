package typings
package oidcDashTokenDashManagerLib.OidcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OidcTokenManagerSettings extends js.Object {
  var authority: js.UndefOr[java.lang.String] = js.undefined
  var authorization_endpoint: js.UndefOr[java.lang.String] = js.undefined
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var end_session_endpoint: js.UndefOr[java.lang.String] = js.undefined
  var jwks: js.UndefOr[js.Any] = js.undefined
  var jwks_uri: js.UndefOr[java.lang.String] = js.undefined
  var load_user_profile: js.UndefOr[scala.Boolean] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var persist: js.UndefOr[scala.Boolean] = js.undefined
  var persistKey: js.UndefOr[java.lang.String] = js.undefined
  var popup_redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  var post_logout_redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  var request_state_key: js.UndefOr[java.lang.String] = js.undefined
  var request_state_store: js.UndefOr[stdLib.Storage] = js.undefined
  var response_type: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var silent_redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  var silent_renew: js.UndefOr[scala.Boolean] = js.undefined
  var store: js.UndefOr[stdLib.Storage] = js.undefined
  var userinfo_endpoint: js.UndefOr[java.lang.String] = js.undefined
}

object OidcTokenManagerSettings {
  @scala.inline
  def apply(
    authority: java.lang.String = null,
    authorization_endpoint: java.lang.String = null,
    client_id: java.lang.String = null,
    end_session_endpoint: java.lang.String = null,
    jwks: js.Any = null,
    jwks_uri: java.lang.String = null,
    load_user_profile: js.UndefOr[scala.Boolean] = js.undefined,
    metadata: js.Any = null,
    persist: js.UndefOr[scala.Boolean] = js.undefined,
    persistKey: java.lang.String = null,
    popup_redirect_uri: java.lang.String = null,
    post_logout_redirect_uri: java.lang.String = null,
    redirect_uri: java.lang.String = null,
    request_state_key: java.lang.String = null,
    request_state_store: stdLib.Storage = null,
    response_type: java.lang.String = null,
    scope: java.lang.String = null,
    silent_redirect_uri: java.lang.String = null,
    silent_renew: js.UndefOr[scala.Boolean] = js.undefined,
    store: stdLib.Storage = null,
    userinfo_endpoint: java.lang.String = null
  ): OidcTokenManagerSettings = {
    val __obj = js.Dynamic.literal()
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (authorization_endpoint != null) __obj.updateDynamic("authorization_endpoint")(authorization_endpoint)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (end_session_endpoint != null) __obj.updateDynamic("end_session_endpoint")(end_session_endpoint)
    if (jwks != null) __obj.updateDynamic("jwks")(jwks)
    if (jwks_uri != null) __obj.updateDynamic("jwks_uri")(jwks_uri)
    if (!js.isUndefined(load_user_profile)) __obj.updateDynamic("load_user_profile")(load_user_profile)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    if (persistKey != null) __obj.updateDynamic("persistKey")(persistKey)
    if (popup_redirect_uri != null) __obj.updateDynamic("popup_redirect_uri")(popup_redirect_uri)
    if (post_logout_redirect_uri != null) __obj.updateDynamic("post_logout_redirect_uri")(post_logout_redirect_uri)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (request_state_key != null) __obj.updateDynamic("request_state_key")(request_state_key)
    if (request_state_store != null) __obj.updateDynamic("request_state_store")(request_state_store)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (silent_redirect_uri != null) __obj.updateDynamic("silent_redirect_uri")(silent_redirect_uri)
    if (!js.isUndefined(silent_renew)) __obj.updateDynamic("silent_renew")(silent_renew)
    if (store != null) __obj.updateDynamic("store")(store)
    if (userinfo_endpoint != null) __obj.updateDynamic("userinfo_endpoint")(userinfo_endpoint)
    __obj.asInstanceOf[OidcTokenManagerSettings]
  }
}

