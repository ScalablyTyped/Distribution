package typings.officeDashUiDashFabricDashReact.libComponentsSearchBoxSearchBoxDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.className
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.InputHTMLAttributes
import typings.std.Exclude
import typings.std.HTMLInputElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchBoxProps extends InputHTMLAttributes[HTMLInputElement] {
  /**
    * The aria label of the SearchBox for the benefit of screen readers.
    * @defaultvalue placeholder
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * The props for the clear button.
    */
  var clearButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * Optional callback to access the ISearchBox interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[ISearchBox]] = js.undefined
  /**
    * The default value of the text in the SearchBox, in the case of an uncontrolled component.
    * This prop is being deprecated since so far, uncontrolled behavior has not been implemented.
    * @deprecated Not implemented.
    */
  @JSName("defaultValue")
  var defaultValue_ISearchBoxProps: js.UndefOr[String] = js.undefined
  /**
    * Whether or not to animate the SearchBox icon on focus.
    * @defaultvalue false
    */
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * The props for the icon.
    */
  var iconProps: js.UndefOr[Pick[IIconProps, Exclude[String, className]]] = js.undefined
  /**
    * Deprecated. Use `placeholder` instead.
    * @deprecated Use `placeholder` instead.
    */
  var labelText: js.UndefOr[String] = js.undefined
  /**
    * Callback function for when the typed input for the SearchBox has changed.
    */
  @JSName("onChange")
  var onChange_ISearchBoxProps: js.UndefOr[
    js.Function2[
      /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /**
    * Deprecated at v0.52.2, use `onChange` instead.
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function1[/* newValue */ js.Any, Unit]] = js.undefined
  /**
    * Callback executed when the user clears the search box by either clicking 'X' or hitting escape.
    */
  var onClear: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    * Callback executed when the user presses escape in the search box.
    */
  var onEscape: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    * Callback executed when the user presses enter in the search box.
    */
  var onSearch: js.UndefOr[js.Function1[/* newValue */ js.Any, Unit]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ISearchBoxStyleProps, ISearchBoxStyles]] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Whether or not the SearchBox is underlined.
    * @defaultvalue false
    */
  var underlined: js.UndefOr[Boolean] = js.undefined
  /**
    * The value of the text in the SearchBox.
    */
  @JSName("value")
  var value_ISearchBoxProps: js.UndefOr[String] = js.undefined
}

object ISearchBoxProps {
  @scala.inline
  def apply(
    InputHTMLAttributes: InputHTMLAttributes[HTMLInputElement] = null,
    ariaLabel: String = null,
    className: String = null,
    clearButtonProps: IButtonProps = null,
    componentRef: IRefObject[ISearchBox] = null,
    defaultValue: String = null,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    iconProps: Pick[IIconProps, Exclude[String, className]] = null,
    labelText: String = null,
    onChange: (/* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], /* newValue */ js.UndefOr[String]) => Unit = null,
    onChanged: /* newValue */ js.Any => Unit = null,
    onClear: /* ev */ js.UndefOr[js.Any] => Unit = null,
    onEscape: /* ev */ js.UndefOr[js.Any] => Unit = null,
    onSearch: /* newValue */ js.Any => Unit = null,
    placeholder: String = null,
    styles: IStyleFunctionOrObject[ISearchBoxStyleProps, ISearchBoxStyles] = null,
    theme: ITheme = null,
    underlined: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): ISearchBoxProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, InputHTMLAttributes)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (className != null) __obj.updateDynamic("className")(className)
    if (clearButtonProps != null) __obj.updateDynamic("clearButtonProps")(clearButtonProps)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation)
    if (iconProps != null) __obj.updateDynamic("iconProps")(iconProps)
    if (labelText != null) __obj.updateDynamic("labelText")(labelText)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction1(onChanged))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1(onClear))
    if (onEscape != null) __obj.updateDynamic("onEscape")(js.Any.fromFunction1(onEscape))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (!js.isUndefined(underlined)) __obj.updateDynamic("underlined")(underlined)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ISearchBoxProps]
  }
}

