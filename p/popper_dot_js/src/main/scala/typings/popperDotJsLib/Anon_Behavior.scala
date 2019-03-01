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
  var padding: js.UndefOr[scala.Double | popperDotJsLib.popperDotJsMod.PopperNs.Padding] = js.undefined
}

object Anon_Behavior {
  @scala.inline
  def apply(
    behavior: popperDotJsLib.popperDotJsMod.PopperNs.Behavior | js.Array[popperDotJsLib.popperDotJsMod.PopperNs.Position] = null,
    boundariesElement: popperDotJsLib.popperDotJsMod.PopperNs.Boundary | stdLib.Element = null,
    padding: scala.Double | popperDotJsLib.popperDotJsMod.PopperNs.Padding = null
  ): Anon_Behavior = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Behavior]
  }
}

