package typings
package popperDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Behavior extends js.Object {
  var behavior: js.UndefOr[
    popperDotJsLib.popperDotJsMod.PopperNs.Behavior | js.Array[popperDotJsLib.popperDotJsMod.PopperNs.Position]
  ] = js.undefined
  var boundariesElement: js.UndefOr[popperDotJsLib.popperDotJsMod.PopperNs.Boundary | stdLib.Element] = js.undefined
  var flipVariations: js.UndefOr[scala.Boolean] = js.undefined
  var flipVariationsByContent: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[scala.Double | popperDotJsLib.popperDotJsMod.PopperNs.Padding] = js.undefined
}

object Anon_Behavior {
  @scala.inline
  def apply(
    behavior: popperDotJsLib.popperDotJsMod.PopperNs.Behavior | js.Array[popperDotJsLib.popperDotJsMod.PopperNs.Position] = null,
    boundariesElement: popperDotJsLib.popperDotJsMod.PopperNs.Boundary | stdLib.Element = null,
    flipVariations: js.UndefOr[scala.Boolean] = js.undefined,
    flipVariationsByContent: js.UndefOr[scala.Boolean] = js.undefined,
    padding: scala.Double | popperDotJsLib.popperDotJsMod.PopperNs.Padding = null
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

