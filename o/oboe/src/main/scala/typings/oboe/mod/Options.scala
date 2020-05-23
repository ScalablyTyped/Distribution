package typings.oboe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var cached: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var url: String
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    url: String,
    body: js.Any = null,
    cached: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    method: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(cached)) __obj.updateDynamic("cached")(cached.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

