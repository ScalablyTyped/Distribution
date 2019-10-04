package typings.atPollyjsCore

import typings.atPollyjsCore.atPollyjsCoreMod.Headers
import typings.atPollyjsCore.atPollyjsCoreMod.MatchBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[Boolean | (MatchBy[_, _])] = js.undefined
  var headers: js.UndefOr[Boolean | Anon_Exclude | (MatchBy[Headers, Headers])] = js.undefined
  var method: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
  var order: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[Anon_Hash] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: Boolean | (MatchBy[_, _]) = null,
    headers: Boolean | Anon_Exclude | (MatchBy[Headers, Headers]) = null,
    method: Boolean | (MatchBy[String, String]) = null,
    order: js.UndefOr[Boolean] = js.undefined,
    url: Anon_Hash = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Body]
  }
}

