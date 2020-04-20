package typings.officeUiFabricReact.colorPickerTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typings.officeUiFabricReact.officeUiFabricReactStrings.none
import typings.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.types.IColorPickerProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.types.IColorPickerProps, 'className' | 'alphaType'> */
trait IColorPickerStyleProps extends js.Object {
  var alphaType: js.UndefOr[alpha | transparency | none] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var theme: ITheme
}

object IColorPickerStyleProps {
  @scala.inline
  def apply(theme: ITheme, alphaType: alpha | transparency | none = null, className: String = null): IColorPickerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (alphaType != null) __obj.updateDynamic("alphaType")(alphaType.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerStyleProps]
  }
}

