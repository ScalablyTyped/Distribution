package typings.officeDashUiDashFabricDashReact.libComponentsCheckboxCheckboxDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.end
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.start
import typings.react.reactMod.ButtonHTMLAttributes
import typings.react.reactMod.FormEvent
import typings.react.reactMod.Global.JSX.Element
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxProps extends ButtonHTMLAttributes[HTMLElement | HTMLInputElement] {
  /**
    * ID for element that provides extended information for the checkbox.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * Accessible label for the checkbox.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * ID for element that contains label information for the checkbox.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  /**
    * The position in the parent set (if in a set) for aria-posinset.
    */
  var ariaPositionInSet: js.UndefOr[Double] = js.undefined
  /**
    * The total size of the parent set (if in a set) for aria-setsize.
    */
  var ariaSetSize: js.UndefOr[Double] = js.undefined
  /**
    * Allows you to set the checkbox to be at the before (start) or after (end) the label.
    * @defaultvalue 'start'
    */
  var boxSide: js.UndefOr[start | end] = js.undefined
  /**
    * Checked state. Mutually exclusive to "defaultChecked". Use this if you control the checked state at a higher
    * level and plan to pass in the correct value based on handling onChange events and re-rendering.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * Custom icon props for the check mark rendered by the checkbox
    */
  var checkmarkIconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * Optional callback to access the ICheckbox interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ICheckbox]] = js.undefined
  /**
    * Optional uncontrolled indeterminate visual state for checkbox. Setting indeterminate state takes visual precedence
    * over checked or defaultChecked props given but does not affect checked state.
    * This is not a toggleable state. On load the checkbox will receive indeterminate visual state
    * and after the user's first click it will be removed exposing the true state of the checkbox.
    */
  var defaultIndeterminate: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional controlled indeterminate visual state for checkbox. Setting indeterminate state takes visual precedence
    * over checked or defaultChecked props given but does not affect checked state.
    * This should not be a toggleable state. On load the checkbox will receive indeterminate visual state
    * and after the first user click it should be removed by your supplied onChange callback
    * function exposing the true state of the checkbox.
    */
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional input props that will be mixed into the input element, *before* other props are applied. This allows
    * you to extend the input element with additional attributes, such as data-automation-id needed for automation.
    * Note that if you provide, for example, "disabled" as well as "inputProps.disabled", the former will take
    * precedence over the later.
    */
  var inputProps: js.UndefOr[ButtonHTMLAttributes[HTMLElement | HTMLButtonElement]] = js.undefined
  /**
    * Optional keytip for this checkbox
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * Label to display next to the checkbox.
    */
  var label: js.UndefOr[String] = js.undefined
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
  ] = js.undefined
  /**
    * Custom render function for the label.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[ICheckboxProps]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object ICheckboxProps {
  @scala.inline
  def apply(
    ButtonHTMLAttributes: ButtonHTMLAttributes[HTMLElement | HTMLInputElement] = null,
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    ariaLabelledBy: String = null,
    ariaPositionInSet: Int | Double = null,
    ariaSetSize: Int | Double = null,
    boxSide: start | end = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    checkmarkIconProps: IIconProps = null,
    className: String = null,
    componentRef: IRefObject[ICheckbox] = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultIndeterminate: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    inputProps: ButtonHTMLAttributes[HTMLElement | HTMLButtonElement] = null,
    keytipProps: IKeytipProps = null,
    label: String = null,
    onChange: (/* ev */ js.UndefOr[FormEvent[HTMLElement | HTMLInputElement]], /* checked */ js.UndefOr[Boolean]) => Unit = null,
    onRenderLabel: (/* props */ js.UndefOr[ICheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[ICheckboxProps], Element | Null]]) => Element | Null = null,
    styles: IStyleFunctionOrObject[ICheckboxStyleProps, ICheckboxStyles] = null,
    theme: ITheme = null
  ): ICheckboxProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy)
    if (ariaPositionInSet != null) __obj.updateDynamic("ariaPositionInSet")(ariaPositionInSet.asInstanceOf[js.Any])
    if (ariaSetSize != null) __obj.updateDynamic("ariaSetSize")(ariaSetSize.asInstanceOf[js.Any])
    if (boxSide != null) __obj.updateDynamic("boxSide")(boxSide.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkmarkIconProps != null) __obj.updateDynamic("checkmarkIconProps")(checkmarkIconProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(defaultIndeterminate)) __obj.updateDynamic("defaultIndeterminate")(defaultIndeterminate)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onRenderLabel != null) __obj.updateDynamic("onRenderLabel")(js.Any.fromFunction2(onRenderLabel))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ICheckboxProps]
  }
}

