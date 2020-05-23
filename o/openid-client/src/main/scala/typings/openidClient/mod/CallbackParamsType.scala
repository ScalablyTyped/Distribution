package typings.openidClient.mod

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
  var response: js.UndefOr[String] = js.undefined
  var session_state: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var token_type: js.UndefOr[String] = js.undefined
}

object CallbackParamsType {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    access_token: String = null,
    code: String = null,
    error: String = null,
    error_description: String = null,
    error_uri: String = null,
    expires_in: String = null,
    id_token: String = null,
    response: String = null,
    session_state: String = null,
    state: String = null,
    token_type: String = null
  ): CallbackParamsType = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (error_description != null) __obj.updateDynamic("error_description")(error_description.asInstanceOf[js.Any])
    if (error_uri != null) __obj.updateDynamic("error_uri")(error_uri.asInstanceOf[js.Any])
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in.asInstanceOf[js.Any])
    if (id_token != null) __obj.updateDynamic("id_token")(id_token.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (session_state != null) __obj.updateDynamic("session_state")(session_state.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (token_type != null) __obj.updateDynamic("token_type")(token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackParamsType]
  }
}

