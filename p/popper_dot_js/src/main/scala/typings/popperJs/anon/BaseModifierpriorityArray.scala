package typings.popperJs.anon

import typings.popperJs.mod.Popper.Boundary
import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import typings.popperJs.mod.Popper.Padding
import typings.popperJs.mod.Popper.Position
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  priority ? :std.Array<popper.js.popper.js.Popper.Position>,   padding ? :number | popper.js.popper.js.Popper.Padding,   boundariesElement ? :popper.js.popper.js.Popper.Boundary | std.Element,   escapeWithReference ? :boolean} */
trait BaseModifierpriorityArray extends js.Object {
  var boundariesElement: js.UndefOr[Boundary | Element] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var escapeWithReference: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double | Padding] = js.undefined
  var priority: js.UndefOr[js.Array[Position]] = js.undefined
}

object BaseModifierpriorityArray {
  @scala.inline
  def apply(
    boundariesElement: Boundary | Element = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    escapeWithReference: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ Data, /* options */ js.Object) => Data = null,
    order: js.UndefOr[Double] = js.undefined,
    padding: Double | Padding = null,
    priority: js.Array[Position] = null
  ): BaseModifierpriorityArray = {
    val __obj = js.Dynamic.literal()
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeWithReference)) __obj.updateDynamic("escapeWithReference")(escapeWithReference.get.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2(fn))
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifierpriorityArray]
  }
}

