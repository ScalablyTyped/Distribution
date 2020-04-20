package typings.officeUiFabricReact.colorSliderTypesMod

import typings.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typings.officeUiFabricReact.officeUiFabricReactStrings.hue
import typings.officeUiFabricReact.officeUiFabricReactStrings.transparency
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorSliderProps extends js.Object {
  /**
    * Label of the ColorSlider for the benefit of screen reader users.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Additional CSS class(es) to apply to the ColorSlider.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IColorSlider]] = js.undefined
  /**
    * If true, the slider represents an alpha slider and will display a gray checkered pattern
    * in the background. Otherwise, the slider represents a hue slider.
    * @defaultvalue false
    * @deprecated Use `type`
    */
  var isAlpha: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum value of the slider.
    * @deprecated Will be 100 for alpha or transparency sliders, or 359 for hue sliders.
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /**
    * Minimum value of the slider.
    * @deprecated Will always be 0
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /**
    * Callback issued when the value changes.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * Hex color to use when rendering an alpha or transparency slider's overlay, *without* the `#`.
    */
  var overlayColor: js.UndefOr[String] = js.undefined
  /**
    * Custom style for the overlay element.
    * @deprecated Use `overlayColor` instead
    */
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
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
    * @deprecated Not used. Use `styles.sliderThumb` instead.
    */
  var thumbColor: js.UndefOr[String] = js.undefined
  /**
    * Type of slider to display.
    * @defaultvalue 'hue'
    */
  var `type`: js.UndefOr[hue | alpha | transparency] = js.undefined
  /**
    * Current value of the slider.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object IColorSliderProps {
  @scala.inline
  def apply(
    ariaLabel: String = null,
    className: String = null,
    componentRef: IRefObject[IColorSlider] = null,
    isAlpha: js.UndefOr[Boolean] = js.undefined,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    onChange: (/* event */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* newValue */ js.UndefOr[Double]) => Unit = null,
    overlayColor: String = null,
    overlayStyle: CSSProperties = null,
    styles: IStyleFunctionOrObject[IColorSliderStyleProps, IColorSliderStyles] = null,
    theme: ITheme = null,
    thumbColor: String = null,
    `type`: hue | alpha | transparency = null,
    value: Int | Double = null
  ): IColorSliderProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isAlpha)) __obj.updateDynamic("isAlpha")(isAlpha.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (thumbColor != null) __obj.updateDynamic("thumbColor")(thumbColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorSliderProps]
  }
}

