package typings.openidDashClient.openidDashClientMod

import typings.openidDashClient.Anon_Idtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestObjectPayload extends AuthorizationParameters {
  var aud: js.UndefOr[String] = js.undefined
  var exp: js.UndefOr[Double] = js.undefined
  var iat: js.UndefOr[Double] = js.undefined
  var iss: js.UndefOr[String] = js.undefined
  var jti: js.UndefOr[String] = js.undefined
}

object RequestObjectPayload {
  @scala.inline
  def apply(
    acr_values: String = null,
    aud: String = null,
    audience: String = null,
    claims: String | Anon_Idtoken = null,
    claims_locales: String = null,
    client_id: String = null,
    code_challenge: String = null,
    code_challenge_method: String = null,
    display: String = null,
    exp: Int | Double = null,
    iat: Int | Double = null,
    id_token_hint: String = null,
    iss: String = null,
    jti: String = null,
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
  ): RequestObjectPayload = {
    val __obj = js.Dynamic.literal()
    if (acr_values != null) __obj.updateDynamic("acr_values")(acr_values)
    if (aud != null) __obj.updateDynamic("aud")(aud)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (claims != null) __obj.updateDynamic("claims")(claims.asInstanceOf[js.Any])
    if (claims_locales != null) __obj.updateDynamic("claims_locales")(claims_locales)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (code_challenge != null) __obj.updateDynamic("code_challenge")(code_challenge)
    if (code_challenge_method != null) __obj.updateDynamic("code_challenge_method")(code_challenge_method)
    if (display != null) __obj.updateDynamic("display")(display)
    if (exp != null) __obj.updateDynamic("exp")(exp.asInstanceOf[js.Any])
    if (iat != null) __obj.updateDynamic("iat")(iat.asInstanceOf[js.Any])
    if (id_token_hint != null) __obj.updateDynamic("id_token_hint")(id_token_hint)
    if (iss != null) __obj.updateDynamic("iss")(iss)
    if (jti != null) __obj.updateDynamic("jti")(jti)
    if (login_hint != null) __obj.updateDynamic("login_hint")(login_hint)
    if (max_age != null) __obj.updateDynamic("max_age")(max_age)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (registration != null) __obj.updateDynamic("registration")(registration)
    if (request != null) __obj.updateDynamic("request")(request)
    if (request_uri != null) __obj.updateDynamic("request_uri")(request_uri)
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (response_mode != null) __obj.updateDynamic("response_mode")(response_mode)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (ui_locales != null) __obj.updateDynamic("ui_locales")(ui_locales)
    __obj.asInstanceOf[RequestObjectPayload]
  }
}

