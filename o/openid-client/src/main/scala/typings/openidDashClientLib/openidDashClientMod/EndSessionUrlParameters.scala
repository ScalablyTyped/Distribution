package typings
package openidDashClientLib.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndSessionUrlParameters extends js.Object {
  val id_token_hint: js.UndefOr[java.lang.String | TokenSet] = js.undefined
  val post_logout_redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  val state: js.UndefOr[java.lang.String] = js.undefined
}

object EndSessionUrlParameters {
  @scala.inline
  def apply(
    id_token_hint: java.lang.String | TokenSet = null,
    post_logout_redirect_uri: java.lang.String = null,
    state: java.lang.String = null
  ): EndSessionUrlParameters = {
    val __obj = js.Dynamic.literal()
    if (id_token_hint != null) __obj.updateDynamic("id_token_hint")(id_token_hint.asInstanceOf[js.Any])
    if (post_logout_redirect_uri != null) __obj.updateDynamic("post_logout_redirect_uri")(post_logout_redirect_uri)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[EndSessionUrlParameters]
  }
}

