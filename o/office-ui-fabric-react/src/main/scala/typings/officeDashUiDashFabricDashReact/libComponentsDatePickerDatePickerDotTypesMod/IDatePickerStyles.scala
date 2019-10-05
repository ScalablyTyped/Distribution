package typings.officeDashUiDashFabricDashReact.libComponentsDatePickerDatePickerDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
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
  def apply(callout: IStyle = null, icon: IStyle = null, root: IStyle = null, textField: IStyle = null): IDatePickerStyles = {
    val __obj = js.Dynamic.literal()
    if (callout != null) __obj.updateDynamic("callout")(callout.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (textField != null) __obj.updateDynamic("textField")(textField.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerStyles]
  }
}

