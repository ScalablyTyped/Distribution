package typings.officeUiFabricReact.basePickerTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/BasePicker.types.IBasePickerProps<any>, 'theme' | 'className' | 'disabled'> & {  isFocused ? :boolean,   inputClassName ? :string} */
trait IBasePickerStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Optional pickerInput className */
  var inputClassName: js.UndefOr[String] = js.undefined
  /** Whether text style area is focused */
  var isFocused: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IBasePickerStyleProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputClassName: String = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    theme: ITheme = null
  ): IBasePickerStyleProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasePickerStyleProps]
  }
}

