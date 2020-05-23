package typings.popperJs.anon

import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  element ? :string | std.Element} */
trait BaseModifierelementstring extends js.Object {
  var element: js.UndefOr[String | Element] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
}

object BaseModifierelementstring {
  @scala.inline
  def apply(
    element: String | Element = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ Data, /* options */ js.Object) => Data = null,
    order: js.UndefOr[Double] = js.undefined
  ): BaseModifierelementstring = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2(fn))
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifierelementstring]
  }
}

