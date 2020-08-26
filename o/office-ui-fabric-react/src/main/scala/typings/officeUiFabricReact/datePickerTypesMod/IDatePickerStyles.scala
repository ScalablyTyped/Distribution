package typings.officeUiFabricReact.datePickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatePickerStyles extends js.Object {
  var callout: IStyle = js.native
  var icon: IStyle = js.native
  /**
    * Style for the root element.
    */
  var root: IStyle = js.native
  var textField: IStyle = js.native
}

object IDatePickerStyles {
  @scala.inline
  def apply(): IDatePickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePickerStyles]
  }
  @scala.inline
  implicit class IDatePickerStylesOps[Self <: IDatePickerStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallout(value: IStyle): Self = this.set("callout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallout: Self = this.set("callout", js.undefined)
    @scala.inline
    def setCalloutNull: Self = this.set("callout", null)
    @scala.inline
    def setIcon(value: IStyle): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setTextField(value: IStyle): Self = this.set("textField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextField: Self = this.set("textField", js.undefined)
    @scala.inline
    def setTextFieldNull: Self = this.set("textField", null)
  }
  
}

