package typings.officeUiFabricReact.tooltipTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
  def apply(content: IStyle = null, root: IStyle = null, subText: IStyle = null): ITooltipStyles = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (subText != null) __obj.updateDynamic("subText")(subText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipStyles]
  }
}

