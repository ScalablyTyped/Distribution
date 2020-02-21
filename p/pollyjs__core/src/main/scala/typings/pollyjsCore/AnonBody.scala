package typings.pollyjsCore

import typings.pollyjsCore.mod.Headers
import typings.pollyjsCore.mod.MatchBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: js.UndefOr[Boolean | (MatchBy[_, _])] = js.undefined
  var headers: js.UndefOr[Boolean | AnonExclude | (MatchBy[Headers, Headers])] = js.undefined
  var method: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
  var order: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[Boolean | (MatchBy[String, String]) | AnonHash] = js.undefined
}

object AnonBody {
  @scala.inline
  def apply(
    body: Boolean | (MatchBy[_, _]) = null,
    headers: Boolean | AnonExclude | (MatchBy[Headers, Headers]) = null,
    method: Boolean | (MatchBy[String, String]) = null,
    order: js.UndefOr[Boolean] = js.undefined,
    url: Boolean | (MatchBy[String, String]) | AnonHash = null
  ): AnonBody = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

