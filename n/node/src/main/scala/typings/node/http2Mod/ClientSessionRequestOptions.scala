package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSessionRequestOptions extends js.Object {
  var endStream: js.UndefOr[Boolean] = js.undefined
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var parent: js.UndefOr[Double] = js.undefined
  var waitForTrailers: js.UndefOr[Boolean] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object ClientSessionRequestOptions {
  @scala.inline
  def apply(
    endStream: js.UndefOr[Boolean] = js.undefined,
    exclusive: js.UndefOr[Boolean] = js.undefined,
    parent: Int | Double = null,
    waitForTrailers: js.UndefOr[Boolean] = js.undefined,
    weight: Int | Double = null
  ): ClientSessionRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endStream)) __obj.updateDynamic("endStream")(endStream.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForTrailers)) __obj.updateDynamic("waitForTrailers")(waitForTrailers.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSessionRequestOptions]
  }
}

