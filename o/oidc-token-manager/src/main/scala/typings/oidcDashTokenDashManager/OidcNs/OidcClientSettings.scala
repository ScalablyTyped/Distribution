package typings.oidcDashTokenDashManager.OidcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OidcClientSettings extends js.Object {
  var authority: js.UndefOr[String] = js.undefined
  var filter_protocol_claims: js.UndefOr[Boolean] = js.undefined
  var load_user_profile: js.UndefOr[Boolean] = js.undefined
  var request_state_key: js.UndefOr[String] = js.undefined
  var request_state_store: js.UndefOr[js.Any] = js.undefined
  var response_type: js.UndefOr[String] = js.undefined
}

object OidcClientSettings {
  @scala.inline
  def apply(
    authority: String = null,
    filter_protocol_claims: js.UndefOr[Boolean] = js.undefined,
    load_user_profile: js.UndefOr[Boolean] = js.undefined,
    request_state_key: String = null,
    request_state_store: js.Any = null,
    response_type: String = null
  ): OidcClientSettings = {
    val __obj = js.Dynamic.literal()
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (!js.isUndefined(filter_protocol_claims)) __obj.updateDynamic("filter_protocol_claims")(filter_protocol_claims)
    if (!js.isUndefined(load_user_profile)) __obj.updateDynamic("load_user_profile")(load_user_profile)
    if (request_state_key != null) __obj.updateDynamic("request_state_key")(request_state_key)
    if (request_state_store != null) __obj.updateDynamic("request_state_store")(request_state_store)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    __obj.asInstanceOf[OidcClientSettings]
  }
}

