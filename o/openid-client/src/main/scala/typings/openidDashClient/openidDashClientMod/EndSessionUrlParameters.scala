package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndSessionUrlParameters extends js.Object {
  val id_token_hint: js.UndefOr[String | TokenSet] = js.undefined
  val post_logout_redirect_uri: js.UndefOr[String] = js.undefined
  val state: js.UndefOr[String] = js.undefined
}

object EndSessionUrlParameters {
  @scala.inline
  def apply(
    id_token_hint: String | TokenSet = null,
    post_logout_redirect_uri: String = null,
    state: String = null
  ): EndSessionUrlParameters = {
    val __obj = js.Dynamic.literal()
    if (id_token_hint != null) __obj.updateDynamic("id_token_hint")(id_token_hint.asInstanceOf[js.Any])
    if (post_logout_redirect_uri != null) __obj.updateDynamic("post_logout_redirect_uri")(post_logout_redirect_uri)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[EndSessionUrlParameters]
  }
}

