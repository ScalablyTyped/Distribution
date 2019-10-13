package typings.officeDashUiDashFabricDashReact.libComponentsToggleToggleDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIComponentAsMod.IComponentAs
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggleProps extends HTMLAttributes[HTMLElement] {
  /**
    * Text for screen-reader to announce as the name of the toggle.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Render the root element as another type.
    */
  var as: js.UndefOr[IComponentAs[HTMLAttributes[HTMLElement]]] = js.undefined
  /**
    * Checked state of the toggle. If you are maintaining state yourself, use this property. Otherwise refer to `defaultChecked`.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional callback to access the IToggle interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IToggle]] = js.undefined
  /**
    * Optional disabled flag.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the label (not the onText/offText) should be positioned inline with the toggle control.
    * Left (right in RTL) side when on/off text provided VS right (left in RTL) side when no on/off text.
    * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
    */
  var inlineLabel: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional keytip for this toggle
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * A label for the toggle.
    */
  var label: js.UndefOr[String | Element] = js.undefined
  /**
    * @deprecated Use `ariaLabel` for name, and let the metadata convey state
    */
  var offAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Text to display when toggle is OFF.
    * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
    */
  var offText: js.UndefOr[String] = js.undefined
  /**
    * @deprecated Use `ariaLabel` for name, and let the metadata convey state
    */
  var onAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Callback issued when the value changes.
    */
  @JSName("onChange")
  var onChange_IToggleProps: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      /* checked */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /**
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  /**
    * Text to display when toggle is ON.
    * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
    */
  var onText: js.UndefOr[String] = js.undefined
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IToggleStyleProps, IToggleStyles]] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IToggleProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    ariaLabel: String = null,
    as: IComponentAs[HTMLAttributes[HTMLElement]] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[IToggle] = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inlineLabel: js.UndefOr[Boolean] = js.undefined,
    keytipProps: IKeytipProps = null,
    label: String | Element = null,
    offAriaLabel: String = null,
    offText: String = null,
    onAriaLabel: String = null,
    onChange: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* checked */ js.UndefOr[Boolean]) => Unit = null,
    onChanged: /* checked */ Boolean => Unit = null,
    onText: String = null,
    styles: IStyleFunctionOrObject[IToggleStyleProps, IToggleStyles] = null,
    theme: ITheme = null
  ): IToggleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(inlineLabel)) __obj.updateDynamic("inlineLabel")(inlineLabel)
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (offAriaLabel != null) __obj.updateDynamic("offAriaLabel")(offAriaLabel)
    if (offText != null) __obj.updateDynamic("offText")(offText)
    if (onAriaLabel != null) __obj.updateDynamic("onAriaLabel")(onAriaLabel)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction1(onChanged))
    if (onText != null) __obj.updateDynamic("onText")(onText)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IToggleProps]
  }
}

