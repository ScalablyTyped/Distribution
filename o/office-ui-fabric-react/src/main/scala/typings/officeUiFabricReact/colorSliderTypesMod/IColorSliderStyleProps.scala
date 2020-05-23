package typings.officeUiFabricReact.colorSliderTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typings.officeUiFabricReact.officeUiFabricReactStrings.hue
import typings.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps, 'className' | 'type'> & {  isAlpha ? :boolean} */
trait IColorSliderStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /**
    * @deprecated Use `type`
    */
  var isAlpha: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
  var `type`: js.UndefOr[hue | alpha | transparency] = js.undefined
}

object IColorSliderStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    isAlpha: js.UndefOr[Boolean] = js.undefined,
    `type`: hue | alpha | transparency = null
  ): IColorSliderStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isAlpha)) __obj.updateDynamic("isAlpha")(isAlpha.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorSliderStyleProps]
  }
}

