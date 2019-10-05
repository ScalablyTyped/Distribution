package typings.popperDotJs.popperDotJsMod.Popper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseModifier extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[typings.popperDotJs.popperDotJsMod.Popper.ModifierFn] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
}

object BaseModifier {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ typings.popperDotJs.popperDotJsMod.Popper.Data, /* options */ js.Object) => typings.popperDotJs.popperDotJsMod.Popper.Data = null,
    order: Int | Double = null
  ): BaseModifier = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2(fn))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifier]
  }
}

