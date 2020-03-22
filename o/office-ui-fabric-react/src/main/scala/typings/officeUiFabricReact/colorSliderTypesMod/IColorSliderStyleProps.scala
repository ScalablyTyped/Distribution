package typings.officeUiFabricReact.colorSliderTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps, 'className' | 'isAlpha'> */
trait IColorSliderStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var isAlpha: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
}

object IColorSliderStyleProps {
  @scala.inline
  def apply(theme: ITheme, className: String = null, isAlpha: js.UndefOr[Boolean] = js.undefined): IColorSliderStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isAlpha)) __obj.updateDynamic("isAlpha")(isAlpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorSliderStyleProps]
  }
}

