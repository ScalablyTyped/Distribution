package typings.popperJs.anon

import typings.popperJs.mod.Popper.Behavior
import typings.popperJs.mod.Popper.Boundary
import typings.popperJs.mod.Popper.Data
import typings.popperJs.mod.Popper.ModifierFn
import typings.popperJs.mod.Popper.Padding
import typings.popperJs.mod.Popper.Position
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  behavior ? :popper.js.popper.js.Popper.Behavior | std.Array<popper.js.popper.js.Popper.Position>,   padding ? :number | popper.js.popper.js.Popper.Padding,   boundariesElement ? :popper.js.popper.js.Popper.Boundary | std.Element,   flipVariations ? :boolean,   flipVariationsByContent ? :boolean} */
trait BaseModifierbehaviorBehav extends js.Object {
  var behavior: js.UndefOr[Behavior | js.Array[Position]] = js.undefined
  var boundariesElement: js.UndefOr[Boundary | Element] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var flipVariations: js.UndefOr[Boolean] = js.undefined
  var flipVariationsByContent: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double | Padding] = js.undefined
}

object BaseModifierbehaviorBehav {
  @scala.inline
  def apply(
    behavior: Behavior | js.Array[Position] = null,
    boundariesElement: Boundary | Element = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    flipVariations: js.UndefOr[Boolean] = js.undefined,
    flipVariationsByContent: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ Data, /* options */ js.Object) => Data = null,
    order: js.UndefOr[Double] = js.undefined,
    padding: Double | Padding = null
  ): BaseModifierbehaviorBehav = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipVariations)) __obj.updateDynamic("flipVariations")(flipVariations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipVariationsByContent)) __obj.updateDynamic("flipVariationsByContent")(flipVariationsByContent.get.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2(fn))
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifierbehaviorBehav]
  }
}

