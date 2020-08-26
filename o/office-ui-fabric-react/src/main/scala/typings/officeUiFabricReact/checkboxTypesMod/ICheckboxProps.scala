package typings.officeUiFabricReact.checkboxTypesMod

import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.officeUiFabricReactStrings.end
import typings.officeUiFabricReact.officeUiFabricReactStrings.start
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.FormEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICheckboxProps extends ButtonHTMLAttributes[HTMLElement | HTMLInputElement] {
  /**
    * ID for element that provides extended information for the checkbox.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.native
  /**
    * Accessible label for the checkbox.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * ID for element that contains label information for the checkbox.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.native
  /**
    * The position in the parent set (if in a set) for aria-posinset.
    */
  var ariaPositionInSet: js.UndefOr[Double] = js.native
  /**
    * The total size of the parent set (if in a set) for aria-setsize.
    */
  var ariaSetSize: js.UndefOr[Double] = js.native
  /**
    * Allows you to set the checkbox to be at the before (start) or after (end) the label.
    * @defaultvalue 'start'
    */
  var boxSide: js.UndefOr[start | end] = js.native
  /**
    * Checked state. Mutually exclusive to "defaultChecked". Use this if you control the checked state at a higher
    * level and plan to pass in the correct value based on handling onChange events and re-rendering.
    */
  var checked: js.UndefOr[Boolean] = js.native
  /**
    * Custom icon props for the check mark rendered by the checkbox
    */
  var checkmarkIconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Optional callback to access the ICheckbox interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ICheckbox]] = js.native
  /**
    * Optional uncontrolled indeterminate visual state for checkbox. Setting indeterminate state takes visual precedence
    * over checked or defaultChecked props given but does not affect checked state.
    * This is not a toggleable state. On load the checkbox will receive indeterminate visual state
    * and after the user's first click it will be removed exposing the true state of the checkbox.
    */
  var defaultIndeterminate: js.UndefOr[Boolean] = js.native
  /**
    * Optional controlled indeterminate visual state for checkbox. Setting indeterminate state takes visual precedence
    * over checked or defaultChecked props given but does not affect checked state.
    * This should not be a toggleable state. On load the checkbox will receive indeterminate visual state
    * and after the first user click it should be removed by your supplied onChange callback
    * function exposing the true state of the checkbox.
    */
  var indeterminate: js.UndefOr[Boolean] = js.native
  /**
    * Optional input props that will be mixed into the input element, *before* other props are applied. This allows
    * you to extend the input element with additional attributes, such as data-automation-id needed for automation.
    * Note that if you provide, for example, "disabled" as well as "inputProps.disabled", the former will take
    * precedence over the later.
    */
  var inputProps: js.UndefOr[ButtonHTMLAttributes[HTMLElement | HTMLButtonElement]] = js.native
  /**
    * Optional keytip for this checkbox
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * Label to display next to the checkbox.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Callback that is called when the checked value has changed.
    */
  @JSName("onChange")
  var onChange_ICheckboxProps: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], 
      /* checked */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  /**
    * Custom render function for the label.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[ICheckboxProps]] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]] = js.native
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object ICheckboxProps {
  @scala.inline
  def apply(): ICheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICheckboxProps]
  }
  @scala.inline
  implicit class ICheckboxPropsOps[Self <: ICheckboxProps] (val x: Self) extends AnyVal {
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
    def setAriaDescribedBy(value: String): Self = this.set("ariaDescribedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaDescribedBy: Self = this.set("ariaDescribedBy", js.undefined)
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setAriaLabelledBy(value: String): Self = this.set("ariaLabelledBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabelledBy: Self = this.set("ariaLabelledBy", js.undefined)
    @scala.inline
    def setAriaPositionInSet(value: Double): Self = this.set("ariaPositionInSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaPositionInSet: Self = this.set("ariaPositionInSet", js.undefined)
    @scala.inline
    def setAriaSetSize(value: Double): Self = this.set("ariaSetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaSetSize: Self = this.set("ariaSetSize", js.undefined)
    @scala.inline
    def setBoxSide(value: start | end): Self = this.set("boxSide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxSide: Self = this.set("boxSide", js.undefined)
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setCheckmarkIconProps(value: IIconProps): Self = this.set("checkmarkIconProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckmarkIconProps: Self = this.set("checkmarkIconProps", js.undefined)
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ ICheckbox | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def setComponentRef(value: IRefObject[ICheckbox]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    @scala.inline
    def setDefaultIndeterminate(value: Boolean): Self = this.set("defaultIndeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultIndeterminate: Self = this.set("defaultIndeterminate", js.undefined)
    @scala.inline
    def setIndeterminate(value: Boolean): Self = this.set("indeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndeterminate: Self = this.set("indeterminate", js.undefined)
    @scala.inline
    def setInputProps(value: ButtonHTMLAttributes[HTMLElement | HTMLButtonElement]): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    @scala.inline
    def setKeytipProps(value: IKeytipProps): Self = this.set("keytipProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeytipProps: Self = this.set("keytipProps", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* ev */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], /* checked */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnRenderLabel(
      value: (/* props */ js.UndefOr[ICheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ICheckboxProps], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderLabel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnRenderLabel: Self = this.set("onRenderLabel", js.undefined)
    @scala.inline
    def setStylesFunction1(value: ICheckboxStyleProps => DeepPartial[ICheckboxStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

