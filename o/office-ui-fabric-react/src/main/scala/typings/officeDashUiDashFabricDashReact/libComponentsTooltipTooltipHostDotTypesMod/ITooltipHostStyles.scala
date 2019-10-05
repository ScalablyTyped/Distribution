package typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipHostDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  def apply(root: IStyle = null): ITooltipHostStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipHostStyles]
  }
}

