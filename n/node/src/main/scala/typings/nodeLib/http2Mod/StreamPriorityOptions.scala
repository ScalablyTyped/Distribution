package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamPriorityOptions extends js.Object {
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var parent: js.UndefOr[scala.Double] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object StreamPriorityOptions {
  @scala.inline
  def apply(
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    parent: scala.Int | scala.Double = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    weight: scala.Int | scala.Double = null
  ): StreamPriorityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamPriorityOptions]
  }
}

