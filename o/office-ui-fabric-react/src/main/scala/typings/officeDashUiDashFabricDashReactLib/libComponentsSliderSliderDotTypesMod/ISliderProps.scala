package typings
package officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsSliderSliderDotBaseMod.SliderBase
    ] {
  /**
    * A description of the Slider for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A text description of the Slider number value for the benefit of screen readers.
    * This should be used when the Slider number value is not accurately represented by a number.
    */
  var ariaValueText: js.UndefOr[js.Function1[/* value */ scala.Double, java.lang.String]] = js.undefined
  /**
    * Optional mixin for additional props on the thumb button within the slider.
    */
  var buttonProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLButtonElement]] = js.undefined
  /**
    * Optional className to attach to the slider root element.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional callback to access the ISlider interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ISlider]] = js.undefined
  /**
    * The initial value of the Slider. Use this if you intend for the Slider to be an uncontrolled component.
    * This value is mutually exclusive to value. Use one or the other.
    */
  var defaultValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional flag to render the Slider as disabled.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Description label of the Slider
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The max value of the Slider
    * @defaultvalue 10
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * The min value of the Slider
    * @defaultvalue 0
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback when the value has been changed
    */
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Callback on mouse up or touch end
    */
  var onChanged: js.UndefOr[
    js.Function2[
      /* event */ reactLib.MouseEvent | reactLib.TouchEvent, 
      /* value */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Whether to show the value on the right of the Slider.
    * @defaultvalue true
    */
  var showValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The difference between the two adjacent values of the Slider
    * @defaultvalue 1
    */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ISliderStyleProps, ISliderStyles]
  ] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
    * The initial value of the Slider. Use this if you intend to pass in a new value as a result of onChange events.
    * This value is mutually exclusive to defaultValue. Use one or the other.
    */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional flag to render the slider vertically. Defaults to rendering horizontal.
    */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

