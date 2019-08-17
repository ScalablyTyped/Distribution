package typings.officeDashUiDashFabricDashReact.libComponentsScrollablePaneScrollablePaneDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollablePaneStyles extends js.Object {
  /**
    * Style set for the contentContainer element.
    */
  var contentContainer: IStyle
  /**
    * Style set for the root element.
    */
  var root: IStyle
  /**
    * Style set for the stickyAbove element.
    */
  var stickyAbove: IStyle
  /**
    * Style set for the stickyBelow element.
    */
  var stickyBelow: IStyle
  /**
    * Style set for the stickyBelowItems element.
    */
  var stickyBelowItems: IStyle
}

object IScrollablePaneStyles {
  @scala.inline
  def apply(
    contentContainer: IStyle,
    root: IStyle,
    stickyAbove: IStyle,
    stickyBelow: IStyle,
    stickyBelowItems: IStyle
  ): IScrollablePaneStyles = {
    val __obj = js.Dynamic.literal(contentContainer = contentContainer.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], stickyAbove = stickyAbove.asInstanceOf[js.Any], stickyBelow = stickyBelow.asInstanceOf[js.Any], stickyBelowItems = stickyBelowItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IScrollablePaneStyles]
  }
}

