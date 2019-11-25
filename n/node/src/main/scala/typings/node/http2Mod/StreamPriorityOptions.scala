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
    parent: Int | Double = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    weight: Int | Double = null
  ): StreamPriorityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamPriorityOptions]
  }
}

