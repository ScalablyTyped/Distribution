package typings.popperDotJs

import typings.popperDotJs.popperDotJsMod.PopperNs.Behavior
import typings.popperDotJs.popperDotJsMod.PopperNs.Boundary
import typings.popperDotJs.popperDotJsMod.PopperNs.Padding
import typings.popperDotJs.popperDotJsMod.PopperNs.Position
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Behavior extends js.Object {
  var behavior: js.UndefOr[Behavior | js.Array[Position]] = js.undefined
  var boundariesElement: js.UndefOr[Boundary | Element] = js.undefined
  var flipVariations: js.UndefOr[Boolean] = js.undefined
  var flipVariationsByContent: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Double | Padding] = js.undefined
}

object Anon_Behavior {
  @scala.inline
  def apply(
    behavior: Behavior | js.Array[Position] = null,
    boundariesElement: Boundary | Element = null,
    flipVariations: js.UndefOr[Boolean] = js.undefined,
    flipVariationsByContent: js.UndefOr[Boolean] = js.undefined,
    padding: Double | Padding = null
  ): Anon_Behavior = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (!js.isUndefined(flipVariations)) __obj.updateDynamic("flipVariations")(flipVariations)
    if (!js.isUndefined(flipVariationsByContent)) __obj.updateDynamic("flipVariationsByContent")(flipVariationsByContent)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Behavior]
  }
}

