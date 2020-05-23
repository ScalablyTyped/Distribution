package typings.officeUiFabricReact.datePickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerStyles extends js.Object {
  var callout: IStyle
  var icon: IStyle
  /**
    * Style for the root element.
    */
  var root: IStyle
  var textField: IStyle
}

object IDatePickerStyles {
  @scala.inline
  def apply(
    callout: js.UndefOr[Null | IStyle] = js.undefined,
    icon: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    textField: js.UndefOr[Null | IStyle] = js.undefined
  ): IDatePickerStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(callout)) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(textField)) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerStyles]
  }
}

