package typings.officeUiFabricReact.scrollablePaneTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
    contentContainer: IStyle = null,
    root: IStyle = null,
    stickyAbove: IStyle = null,
    stickyBelow: IStyle = null,
    stickyBelowItems: IStyle = null
  ): IScrollablePaneStyles = {
    val __obj = js.Dynamic.literal()
    if (contentContainer != null) __obj.updateDynamic("contentContainer")(contentContainer.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (stickyAbove != null) __obj.updateDynamic("stickyAbove")(stickyAbove.asInstanceOf[js.Any])
    if (stickyBelow != null) __obj.updateDynamic("stickyBelow")(stickyBelow.asInstanceOf[js.Any])
    if (stickyBelowItems != null) __obj.updateDynamic("stickyBelowItems")(stickyBelowItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneStyles]
  }
}

