package typings.officeUiFabricReact.sliderTypesMod

import typings.officeUiFabricReact.sliderBaseMod.SliderBase
import typings.react.mod.ClassAttributes
import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.std.HTMLButtonElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISliderProps extends ClassAttributes[SliderBase] {
  /**
    * A description of the Slider for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * A text description of the Slider number value for the benefit of screen readers.
    * This should be used when the Slider number value is not accurately represented by a number.
    */
  var ariaValueText: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
  /**
    * Optional mixin for additional props on the thumb button within the slider.
    */
  var buttonProps: js.UndefOr[HTMLAttributes[HTMLButtonElement]] = js.undefined
  /**
    * Optional className to attach to the slider root element.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the ISlider interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ISlider]] = js.undefined
  /**
    * The initial value of the Slider. Use this if you intend for the Slider to be an uncontrolled component.
    * This value is mutually exclusive to value. Use one or the other.
    */
  var defaultValue: js.UndefOr[Double] = js.undefined
  /**
    * Optional flag to render the Slider as disabled.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Description label of the Slider
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * The max value of the Slider
    * @defaultvalue 10
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The min value of the Slider
    * @defaultvalue 0
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Callback when the value has been changed
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Callback on mouse up or touch end
    */
  var onChanged: js.UndefOr[
    js.Function2[/* event */ MouseEvent | TouchEvent | KeyboardEvent, /* value */ Double, Unit]
  ] = js.undefined
  /**
    * Optional flag to attach the origin of slider to zero. Helpful when the range include negatives.
    * @defaultvalue false
    */
  var originFromZero: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to show the value on the right of the Slider.
    * @defaultvalue true
    */
  var showValue: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional flag to decide that thumb will snap to closest value while moving the slider
    * @defaultvalue false
    */
  var snapToStep: js.UndefOr[Boolean] = js.undefined
  /**
    * The difference between the two adjacent values of the Slider
    * @defaultvalue 1
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISliderStyleProps, ISliderStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * The initial value of the Slider. Use this if you intend to pass in a new value as a result of onChange events.
    * This value is mutually exclusive to defaultValue. Use one or the other.
    */
  var value: js.UndefOr[Double] = js.undefined
  /**
    * Optional function to format the slider value.
    */
  var valueFormat: js.UndefOr[js.Function1[/* value */ Double, String]] = js.undefined
  /**
    * Optional flag to render the slider vertically. Defaults to rendering horizontal.
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ISliderProps {
  @scala.inline
  def apply(
    ariaLabel: String = null,
    ariaValueText: /* value */ Double => String = null,
    buttonProps: HTMLAttributes[HTMLButtonElement] = null,
    className: String = null,
    componentRef: IRefObject[ISlider] = null,
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    label: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* value */ Double => Unit = null,
    onChanged: (/* event */ MouseEvent | TouchEvent | KeyboardEvent, /* value */ Double) => Unit = null,
    originFromZero: js.UndefOr[Boolean] = js.undefined,
    ref: LegacyRef[SliderBase] = null,
    showValue: js.UndefOr[Boolean] = js.undefined,
    snapToStep: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    styles: IStyleFunctionOrObject[ISliderStyleProps, ISliderStyles] = null,
    theme: ITheme = null,
    value: Int | Double = null,
    valueFormat: /* value */ Double => String = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ISliderProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaValueText != null) __obj.updateDynamic("ariaValueText")(js.Any.fromFunction1(ariaValueText))
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction2(onChanged))
    if (!js.isUndefined(originFromZero)) __obj.updateDynamic("originFromZero")(originFromZero.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.asInstanceOf[js.Any])
    if (!js.isUndefined(snapToStep)) __obj.updateDynamic("snapToStep")(snapToStep.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueFormat != null) __obj.updateDynamic("valueFormat")(js.Any.fromFunction1(valueFormat))
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISliderProps]
  }
}

