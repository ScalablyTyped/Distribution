package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamPriorityOptions extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var parent: js.UndefOr[Double] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object StreamPriorityOptions {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[Boolean] = js.undefined,
    parent: js.UndefOr[Double] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    weight: js.UndefOr[Double] = js.undefined
  ): StreamPriorityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parent)) __obj.updateDynamic("parent")(parent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamPriorityOptions]
  }
}

