package typings.officeUiFabricReact.sliderTypesMod

import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Slider/Slider.types.ISliderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Slider/Slider.types.ISliderProps, 'className' | 'disabled' | 'vertical'> & {  showTransitions ? :boolean,   showValue ? :boolean,   titleLabelClassName ? :string} */
trait ISliderStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var showTransitions: js.UndefOr[Boolean] = js.undefined
  var showValue: js.UndefOr[Boolean] = js.undefined
  var theme: ITheme
  var titleLabelClassName: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ISliderStyleProps {
  @scala.inline
  def apply(
    theme: ITheme,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    showTransitions: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined,
    titleLabelClassName: String = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ISliderStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showTransitions)) __obj.updateDynamic("showTransitions")(showTransitions.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.asInstanceOf[js.Any])
    if (titleLabelClassName != null) __obj.updateDynamic("titleLabelClassName")(titleLabelClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderStyleProps]
  }
}

