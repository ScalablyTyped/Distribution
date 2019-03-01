package typings
package popperDotJsLib.popperDotJsMod.PopperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseModifier extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var order: js.UndefOr[scala.Double] = js.undefined
}

object BaseModifier {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    fn: ModifierFn = null,
    order: scala.Int | scala.Double = null
  ): BaseModifier = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fn != null) __obj.updateDynamic("fn")(fn)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifier]
  }
}

