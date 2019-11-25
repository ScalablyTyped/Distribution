package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorPickerDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorPickerStyleProps extends js.Object {
  /**
    * Additional CSS class(es) to apply to the ColorPicker.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: ITheme
}

object IColorPickerStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): IColorPickerStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerStyleProps]
  }
}

