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
  def apply(
    content: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    subText: js.UndefOr[Null | IStyle] = js.undefined
  ): ITooltipStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(subText)) __obj.updateDynamic("subText")(subText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITooltipStyles]
  }
}

