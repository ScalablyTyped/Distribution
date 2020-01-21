package typings.officeUiFabricReact.stackHorizontalWrapAdvancedExampleMod

import typings.officeUiFabricReact.stackTypesMod.Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExampleOptions extends js.Object {
  var containerHeight: Double
  var horizontalAlignment: js.UndefOr[Alignment] = js.undefined
  var overflow: Overflow
  var stackWidth: Double
  var verticalAlignment: js.UndefOr[Alignment] = js.undefined
}

object IExampleOptions {
  @scala.inline
  def apply(
    containerHeight: Double,
    overflow: Overflow,
    stackWidth: Double,
    horizontalAlignment: Alignment = null,
    verticalAlignment: Alignment = null
  ): IExampleOptions = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], stackWidth = stackWidth.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExampleOptions]
  }
}

