package typings.popperJs.anon

import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  onLoad ? :std.Function,   gpuAcceleration ? :boolean} */
trait BaseModifieronLoadFunctio extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var gpuAcceleration: js.UndefOr[Boolean] = js.undefined
  var onLoad: js.UndefOr[js.Function] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
}

object BaseModifieronLoadFunctio {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ Data, /* options */ js.Object) => Data = null,
    gpuAcceleration: js.UndefOr[Boolean] = js.undefined,
    onLoad: js.Function = null,
    order: js.UndefOr[Double] = js.undefined
  ): BaseModifieronLoadFunctio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2(fn))
    if (!js.isUndefined(gpuAcceleration)) __obj.updateDynamic("gpuAcceleration")(gpuAcceleration.get.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifieronLoadFunctio]
  }
}

