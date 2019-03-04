package typings
package oboeLib.oboeMod.oboeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var cached: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    url: java.lang.String,
    body: js.Any = null,
    cached: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Object = null,
    method: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(url = url)
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(cached)) __obj.updateDynamic("cached")(cached)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[Options]
  }
}

