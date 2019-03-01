package typings
package popperDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoundariesElement extends js.Object {
  var boundariesElement: js.UndefOr[popperDotJsLib.popperDotJsMod.PopperNs.Boundary | stdLib.Element] = js.undefined
  var escapeWithReference: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[scala.Double | popperDotJsLib.popperDotJsMod.PopperNs.Padding] = js.undefined
  var priority: js.UndefOr[js.Array[popperDotJsLib.popperDotJsMod.PopperNs.Position]] = js.undefined
}

object Anon_BoundariesElement {
  @scala.inline
  def apply(
    boundariesElement: popperDotJsLib.popperDotJsMod.PopperNs.Boundary | stdLib.Element = null,
    escapeWithReference: js.UndefOr[scala.Boolean] = js.undefined,
    padding: scala.Double | popperDotJsLib.popperDotJsMod.PopperNs.Padding = null,
    priority: js.Array[popperDotJsLib.popperDotJsMod.PopperNs.Position] = null
  ): Anon_BoundariesElement = {
    val __obj = js.Dynamic.literal()
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeWithReference)) __obj.updateDynamic("escapeWithReference")(escapeWithReference)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority)
    __obj.asInstanceOf[Anon_BoundariesElement]
  }
}

