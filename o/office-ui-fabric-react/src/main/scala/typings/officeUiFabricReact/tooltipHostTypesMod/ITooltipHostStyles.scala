package typings.officeUiFabricReact.tooltipHostTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipHostStyles extends js.Object {
  /**
    * Style for the host wrapper element.
    */
  var root: IStyle
}

object ITooltipHostStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): ITooltipHostStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipHostStyles]
  }
}

