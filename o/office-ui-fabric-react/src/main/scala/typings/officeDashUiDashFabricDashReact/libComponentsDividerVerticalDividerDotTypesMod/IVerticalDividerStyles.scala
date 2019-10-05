package typings.officeDashUiDashFabricDashReact.libComponentsDividerVerticalDividerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVerticalDividerStyles extends js.Object {
  /**
    * Styling for the divider.
    */
  var divider: IStyle
  /**
    * Styling for the div that wraps the actual divider
    */
  var wrapper: IStyle
}

object IVerticalDividerStyles {
  @scala.inline
  def apply(divider: IStyle = null, wrapper: IStyle = null): IVerticalDividerStyles = {
    val __obj = js.Dynamic.literal()
    if (divider != null) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerticalDividerStyles]
  }
}

