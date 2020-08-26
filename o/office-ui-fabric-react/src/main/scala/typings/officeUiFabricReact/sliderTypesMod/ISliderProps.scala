package typings.officeUiFabricReact.sliderTypesMod

import typings.officeUiFabricReact.sliderBaseMod.SliderBase
import typings.react.mod.ClassAttributes
import typings.react.mod.HTMLAttributes
import typings.std.HTMLButtonElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISliderProps extends ClassAttributes[SliderBase] {
  /**
    * A description of the Slider for the benefit of screen readers.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * A text description of the Slider number value for the benefit of screen readers.
    * This should be used when the Slider number value is not accurately represented by a number.
    */
  var ariaValueText: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
  /**
    * Optional mixin for additional props on the thumb button within the slider.
    */
  var buttonProps: js.UndefOr[HTMLAttributes[HTMLButtonElement]] = js.native
  /**
    * Optional className to attach to the slider root element.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Optional callback to access the ISlider interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ISlider]] = js.native
  /**
    * The initial value of the Slider. Use this if you intend for the Slider to be an uncontrolled component.
    * This value is mutually exclusive to value. Use one or the other.
    */
  var defaultValue: js.UndefOr[Double] = js.native
  /**
    * Optional flag to render the Slider as disabled.
    * @defaultvalue false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Description label of the Slider
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The max value of the Slider
    * @defaultvalue 10
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The min value of the Slider
    * @defaultvalue 0
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Callback when the value has been changed
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Callback on mouse up or touch end
    */
  var onChanged: js.UndefOr[
    js.Function2[/* event */ MouseEvent | TouchEvent | KeyboardEvent, /* value */ Double, Unit]
  ] = js.native
  /**
    * Optional flag to attach the origin of slider to zero. Helpful when the range include negatives.
    * @defaultvalue false
    */
  var originFromZero: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show the value on the right of the Slider.
    * @defaultvalue true
    */
  var showValue: js.UndefOr[Boolean] = js.native
  /**
    * Optional flag to decide that thumb will snap to closest value while moving the slider
    * @defaultvalue false
    */
  var snapToStep: js.UndefOr[Boolean] = js.native
  /**
    * The difference between the two adjacent values of the Slider
    * @defaultvalue 1
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISliderStyleProps, ISliderStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  /**
    * The initial value of the Slider. Use this if you intend to pass in a new value as a result of onChange events.
    * This value is mutually exclusive to defaultValue. Use one or the other.
    */
  var value: js.UndefOr[Double] = js.native
  /**
    * Optional function to format the slider value.
    */
  var valueFormat: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
  /**
    * Optional flag to render the slider vertically. Defaults to rendering horizontal.
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object ISliderProps {
  @scala.inline
  def apply(): ISliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISliderProps]
  }
  @scala.inline
  implicit class ISliderPropsOps[Self <: ISliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setAriaValueText(value: /* value */ Double => String): Self = this.set("ariaValueText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAriaValueText: Self = this.set("ariaValueText", js.undefined)
    @scala.inline
    def setButtonProps(value: HTMLAttributes[HTMLButtonElement]): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ISlider | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[ISlider]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnChanged(value: (/* event */ MouseEvent | TouchEvent | KeyboardEvent, /* value */ Double) => Unit): Self = this.set("onChanged", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChanged: Self = this.set("onChanged", js.undefined)
    @scala.inline
    def setOriginFromZero(value: Boolean): Self = this.set("originFromZero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginFromZero: Self = this.set("originFromZero", js.undefined)
    @scala.inline
    def setShowValue(value: Boolean): Self = this.set("showValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowValue: Self = this.set("showValue", js.undefined)
    @scala.inline
    def setSnapToStep(value: Boolean): Self = this.set("snapToStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapToStep: Self = this.set("snapToStep", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStylesFunction1(value: ISliderStyleProps => DeepPartial[ISliderStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ISliderStyleProps, ISliderStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueFormat(value: /* value */ Double => String): Self = this.set("valueFormat", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValueFormat: Self = this.set("valueFormat", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

