package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndSessionParameters
  extends /* key */ StringDictionary[js.Any] {
  var id_token_hint: js.UndefOr[TokenSet | String] = js.undefined
  var post_logout_redirect_uri: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object EndSessionParameters {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    id_token_hint: TokenSet | String = null,
    post_logout_redirect_uri: String = null,
    state: String = null
  ): EndSessionParameters = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (id_token_hint != null) __obj.updateDynamic("id_token_hint")(id_token_hint.asInstanceOf[js.Any])
    if (post_logout_redirect_uri != null) __obj.updateDynamic("post_logout_redirect_uri")(post_logout_redirect_uri.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndSessionParameters]
  }
}

