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
    contentContainer: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    stickyAbove: js.UndefOr[Null | IStyle] = js.undefined,
    stickyBelow: js.UndefOr[Null | IStyle] = js.undefined,
    stickyBelowItems: js.UndefOr[Null | IStyle] = js.undefined
  ): IScrollablePaneStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentContainer)) __obj.updateDynamic("contentContainer")(contentContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyAbove)) __obj.updateDynamic("stickyAbove")(stickyAbove.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyBelow)) __obj.updateDynamic("stickyBelow")(stickyBelow.asInstanceOf[js.Any])
    if (!js.isUndefined(stickyBelowItems)) __obj.updateDynamic("stickyBelowItems")(stickyBelowItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollablePaneStyles]
  }
}

