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
  def apply(divider: IStyle, wrapper: IStyle): IVerticalDividerStyles = {
    val __obj = js.Dynamic.literal(divider = divider.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IVerticalDividerStyles]
  }
}

