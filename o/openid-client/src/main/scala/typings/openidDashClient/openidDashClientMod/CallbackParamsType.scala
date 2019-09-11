package typings.openidDashClient.openidDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackParamsType
  extends /* key */ StringDictionary[js.Any] {
  var access_token: js.UndefOr[String] = js.undefined
  var code: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var error_description: js.UndefOr[String] = js.undefined
  var error_uri: js.UndefOr[String] = js.undefined
  var expires_in: js.UndefOr[String] = js.undefined
  var id_token: js.UndefOr[String] = js.undefined
  var session_state: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var token_type: js.UndefOr[String] = js.undefined
}

object CallbackParamsType {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    access_token: String = null,
    code: String = null,
    error: String = null,
    error_description: String = null,
    error_uri: String = null,
    expires_in: String = null,
    id_token: String = null,
    session_state: String = null,
    state: String = null,
    token_type: String = null
  ): CallbackParamsType = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (code != null) __obj.updateDynamic("code")(code)
    if (error != null) __obj.updateDynamic("error")(error)
    if (error_description != null) __obj.updateDynamic("error_description")(error_description)
    if (error_uri != null) __obj.updateDynamic("error_uri")(error_uri)
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in)
    if (id_token != null) __obj.updateDynamic("id_token")(id_token)
    if (session_state != null) __obj.updateDynamic("session_state")(session_state)
    if (state != null) __obj.updateDynamic("state")(state)
    if (token_type != null) __obj.updateDynamic("token_type")(token_type)
    __obj.asInstanceOf[CallbackParamsType]
  }
}

