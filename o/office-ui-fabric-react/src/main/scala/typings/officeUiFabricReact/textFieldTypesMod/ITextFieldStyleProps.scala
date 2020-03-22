package typings.officeUiFabricReact.textFieldTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TextField/TextField.types.ITextFieldProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TextField/TextField.types.ITextFieldProps, 'className' | 'disabled' | 'inputClassName' | 'required' | 'multiline' | 'borderless' | 'resizable' | 'underlined' | 'autoAdjustHeight'> & {  hasErrorMessage ? :boolean,   hasIcon ? :boolean,   hasLabel ? :boolean,   focused ? :boolean} */
trait ITextFieldStyleProps extends js.Object {
  var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Element has focus. */
  var focused: js.UndefOr[Boolean] = js.undefined
  /** Element has an error message. */
  var hasErrorMessage: js.UndefOr[Boolean] = js.undefined
  /** Element has an icon. */
  var hasIcon: js.UndefOr[Boolean] = js.undefined
  /** Element has a label. */
  var hasLabel: js.UndefOr[Boolean] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  var multiline: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
  var underlined: js.UndefOr[Boolean] = js.undefined
}

object ITextFieldStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    autoAdjustHeight: js.UndefOr[Boolean] = js.undefined,
    borderless: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    hasErrorMessage: js.UndefOr[Boolean] = js.undefined,
    hasIcon: js.UndefOr[Boolean] = js.undefined,
    hasLabel: js.UndefOr[Boolean] = js.undefined,
    inputClassName: String = null,
    multiline: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    underlined: js.UndefOr[Boolean] = js.undefined
  ): ITextFieldStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjustHeight)) __obj.updateDynamic("autoAdjustHeight")(autoAdjustHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (!js.isUndefined(hasErrorMessage)) __obj.updateDynamic("hasErrorMessage")(hasErrorMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(hasIcon)) __obj.updateDynamic("hasIcon")(hasIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(hasLabel)) __obj.updateDynamic("hasLabel")(hasLabel.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(underlined)) __obj.updateDynamic("underlined")(underlined.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextFieldStyleProps]
  }
}

