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
    parent: js.UndefOr[Double] = js.undefined,
    waitForTrailers: js.UndefOr[Boolean] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined
  ): ClientSessionRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endStream)) __obj.updateDynamic("endStream")(endStream.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForTrailers)) __obj.updateDynamic("waitForTrailers")(waitForTrailers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSessionRequestOptions]
  }
}

