package typings.officeUiFabricReact.basePickerTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/BasePicker.types.IBasePickerProps<any>, 'theme' | 'className' | 'disabled'> & {  isFocused :boolean | undefined,   inputClassName :string | undefined} */
@js.native
trait IBasePickerStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  /** Optional pickerInput className */
  var inputClassName: js.UndefOr[String] = js.native
  /** Whether text style area is focused */
  var isFocused: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[ITheme] = js.native
}

object IBasePickerStyleProps {
  @scala.inline
  def apply(): IBasePickerStyleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBasePickerStyleProps]
  }
  @scala.inline
  implicit class IBasePickerStylePropsOps[Self <: IBasePickerStyleProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

