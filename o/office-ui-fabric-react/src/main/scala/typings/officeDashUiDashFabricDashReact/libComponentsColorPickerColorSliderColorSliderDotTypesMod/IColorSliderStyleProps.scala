package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorSliderColorSliderDotTypesMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorSliderStyleProps extends js.Object {
  /**
    * Additional CSS class(es) to apply to the ColorSlider.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: ITheme
}

object IColorSliderStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null): IColorSliderStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[IColorSliderStyleProps]
  }
}

