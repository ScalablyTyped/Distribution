package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openidClient.anon.Idtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationParameters
  extends /* key */ StringDictionary[js.Any] {
  var acr_values: js.UndefOr[String] = js.undefined
  var audience: js.UndefOr[String] = js.undefined
  var claims: js.UndefOr[String | Idtoken] = js.undefined
  var claims_locales: js.UndefOr[String] = js.undefined
  var client_id: js.UndefOr[String] = js.undefined
  var code_challenge: js.UndefOr[String] = js.undefined
  var code_challenge_method: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[String] = js.undefined
  var id_token_hint: js.UndefOr[String] = js.undefined
  var login_hint: js.UndefOr[String] = js.undefined
  var max_age: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var redirect_uri: js.UndefOr[String] = js.undefined
  var registration: js.UndefOr[String] = js.undefined
  var request: js.UndefOr[String] = js.undefined
  var request_uri: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String | js.Array[String]] = js.undefined
  var response_mode: js.UndefOr[String] = js.undefined
  var response_type: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var ui_locales: js.UndefOr[String] = js.undefined
}

object AuthorizationParameters {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    acr_values: String = null,
    audience: String = null,
    claims: String | Idtoken = null,
    claims_locales: String = null,
    client_id: String = null,
    code_challenge: String = null,
    code_challenge_method: String = null,
    display: String = null,
    id_token_hint: String = null,
    login_hint: String = null,
    max_age: String = null,
    nonce: String = null,
    prompt: String = null,
    redirect_uri: String = null,
    registration: String = null,
    request: String = null,
    request_uri: String = null,
    resource: String | js.Array[String] = null,
    response_mode: String = null,
    response_type: String = null,
    scope: String = null,
    ui_locales: String = null
  ): AuthorizationParameters = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (acr_values != null) __obj.updateDynamic("acr_values")(acr_values.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (claims != null) __obj.updateDynamic("claims")(claims.asInstanceOf[js.Any])
    if (claims_locales != null) __obj.updateDynamic("claims_locales")(claims_locales.asInstanceOf[js.Any])
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (code_challenge != null) __obj.updateDynamic("code_challenge")(code_challenge.asInstanceOf[js.Any])
    if (code_challenge_method != null) __obj.updateDynamic("code_challenge_method")(code_challenge_method.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (id_token_hint != null) __obj.updateDynamic("id_token_hint")(id_token_hint.asInstanceOf[js.Any])
    if (login_hint != null) __obj.updateDynamic("login_hint")(login_hint.asInstanceOf[js.Any])
    if (max_age != null) __obj.updateDynamic("max_age")(max_age.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    if (registration != null) __obj.updateDynamic("registration")(registration.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (request_uri != null) __obj.updateDynamic("request_uri")(request_uri.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (response_mode != null) __obj.updateDynamic("response_mode")(response_mode.asInstanceOf[js.Any])
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (ui_locales != null) __obj.updateDynamic("ui_locales")(ui_locales.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationParameters]
  }
}

