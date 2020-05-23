package typings.popperJs.anon

import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import typings.popperJs.popperJsStrings.bottom
import typings.popperJs.popperJsStrings.left
import typings.popperJs.popperJsStrings.right
import typings.popperJs.popperJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  gpuAcceleration ? :boolean,   x ? :'bottom' | 'top',   y ? :'left' | 'right'} */
trait BaseModifiergpuAccelerati extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var gpuAcceleration: js.UndefOr[Boolean] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[bottom | top] = js.undefined
  var y: js.UndefOr[left | right] = js.undefined
}

object BaseModifiergpuAccelerati {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ Data, /* options */ js.Object) => Data = null,
    gpuAcceleration: js.UndefOr[Boolean] = js.undefined,
    order: js.UndefOr[Double] = js.undefined,
    x: bottom | top = null,
    y: left | right = null
  ): BaseModifiergpuAccelerati = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2(fn))
    if (!js.isUndefined(gpuAcceleration)) __obj.updateDynamic("gpuAcceleration")(gpuAcceleration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifiergpuAccelerati]
  }
}

