package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSessionRequestOptions extends js.Object {
  var endStream: js.UndefOr[scala.Boolean] = js.undefined
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var parent: js.UndefOr[scala.Double] = js.undefined
  var waitForTrailers: js.UndefOr[scala.Boolean] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object ClientSessionRequestOptions {
  @scala.inline
  def apply(
    endStream: js.UndefOr[scala.Boolean] = js.undefined,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    parent: scala.Int | scala.Double = null,
    waitForTrailers: js.UndefOr[scala.Boolean] = js.undefined,
    weight: scala.Int | scala.Double = null
  ): ClientSessionRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endStream)) __obj.updateDynamic("endStream")(endStream)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForTrailers)) __obj.updateDynamic("waitForTrailers")(waitForTrailers)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSessionRequestOptions]
  }
}

