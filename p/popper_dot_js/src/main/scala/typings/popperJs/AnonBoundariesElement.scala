package typings.popperJs

import typings.popperJs.mod.Popper.Boundary
import typings.popperJs.mod.Popper.Padding
import typings.popperJs.mod.Popper.Position
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoundariesElement extends js.Object {
  var boundariesElement: js.UndefOr[Boundary | Element] = js.undefined
  var escapeWithReference: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[Double | Padding] = js.undefined
  var priority: js.UndefOr[js.Array[Position]] = js.undefined
}

object AnonBoundariesElement {
  @scala.inline
  def apply(
    boundariesElement: Boundary | Element = null,
    escapeWithReference: js.UndefOr[Boolean] = js.undefined,
    padding: Double | Padding = null,
    priority: js.Array[Position] = null
  ): AnonBoundariesElement = {
    val __obj = js.Dynamic.literal()
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeWithReference)) __obj.updateDynamic("escapeWithReference")(escapeWithReference.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoundariesElement]
  }
}

