package typings.officeDashUiDashFabricDashReact.libComponentsColorPickerColorSliderColorSliderDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorSliderProps extends js.Object {
  /**
    * Additional CSS class(es) to apply to the ColorSlider.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IColorSlider]] = js.undefined
  /**
    * If true, the slider represents an alpha slider.
    * Otherwise, the slider represents a hue slider.
    */
  var isAlpha: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum value of the slider.
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * Minimum value of the slider.
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /**
    * Callback issued when the value changes.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * Custom style for the overlay element.
    */
  var overlayStyle: js.UndefOr[js.Any] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles]] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * CSS-compatible string for the color of the thumb element.
    */
  var thumbColor: js.UndefOr[String] = js.undefined
  /**
    * Current value of the slider.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object IColorSliderProps {
  @scala.inline
  def apply(
    className: String = null,
    componentRef: IRefObject[IColorSlider] = null,
    isAlpha: js.UndefOr[Boolean] = js.undefined,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    onChange: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* newValue */ js.UndefOr[Double]) => Unit = null,
    overlayStyle: js.Any = null,
    styles: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles] = null,
    theme: ITheme = null,
    thumbColor: String = null,
    value: Int | Double = null
  ): IColorSliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isAlpha)) __obj.updateDynamic("isAlpha")(isAlpha)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (thumbColor != null) __obj.updateDynamic("thumbColor")(thumbColor)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorSliderProps]
  }
}

