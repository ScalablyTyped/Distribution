package typings.officeDashUiDashFabricDashReact.libComponentsTooltipTooltipDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipStyles extends js.Object {
  /**
    * Style for the content element.
    */
  var content: IStyle
  /**
    * Style for the root element.
    */
  var root: IStyle
  /**
    * Style for the subtext element.
    */
  var subText: IStyle
}

object ITooltipStyles {
  @scala.inline
  def apply(content: IStyle, root: IStyle, subText: IStyle): ITooltipStyles = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], subText = subText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITooltipStyles]
  }
}

