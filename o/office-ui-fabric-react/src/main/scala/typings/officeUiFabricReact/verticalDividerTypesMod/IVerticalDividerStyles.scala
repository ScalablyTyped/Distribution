package typings.officeUiFabricReact.verticalDividerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
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
  def apply(
    divider: js.UndefOr[Null | IStyle] = js.undefined,
    wrapper: js.UndefOr[Null | IStyle] = js.undefined
  ): IVerticalDividerStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapper)) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVerticalDividerStyles]
  }
}

