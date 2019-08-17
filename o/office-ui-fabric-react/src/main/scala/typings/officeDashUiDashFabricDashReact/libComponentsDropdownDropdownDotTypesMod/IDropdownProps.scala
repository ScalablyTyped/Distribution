package typings.officeDashUiDashFabricDashReact.libComponentsDropdownDropdownDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesSelectableOptionSelectableDroppableTextDotTypesMod.ISelectableDroppableTextProps
import typings.react.reactMod.FormEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownProps extends ISelectableDroppableTextProps[IDropdown, HTMLDivElement] {
  /**
    * Keys that will be initially used to set selected items. This prop is used for `multiSelect`
    * scenarios. In other cases, `defaultSelectedKey` should be used.
    */
  var defaultSelectedKeys: js.UndefOr[js.Array[Double | String]] = js.undefined
  /**
    * Custom width for dropdown. If value is 0, width of the input field is used.
    * @defaultvalue 0
    */
  var dropdownWidth: js.UndefOr[Double] = js.undefined
  /**
    * Deprecated at v0.52.0, use `disabled` instead.
    * @deprecated Use `disabled` instead.
    */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional keytip for this dropdown
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
  /**
    * Optional mode indicates if multi-choice selections is allowed.  Default to false
    */
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * When multiple items are selected, this still will be used to separate values in
    * the dropdown title.
    *
    * @defaultvalue ", "
    */
  var multiSelectDelimiter: js.UndefOr[String] = js.undefined
  /**
    * Optional preference to have onChanged still be called when an already selected item is
    * clicked in single select mode.  Default to false
    */
  var notifyOnReselect: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback issued when the selected option changes.
    */
  @JSName("onChange")
  var onChange_IDropdownProps: js.UndefOr[
    js.Function3[
      /* event */ FormEvent[HTMLDivElement], 
      /* option */ js.UndefOr[IDropdownOption], 
      /* index */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /**
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function2[/* option */ IDropdownOption, /* index */ js.UndefOr[Double], Unit]] = js.undefined
  /**
    * Callback issues when the options callout is dismissed
    */
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional custom renderer for chevron icon
    */
  var onRenderCaretDown: js.UndefOr[IRenderFunction[IDropdownProps]] = js.undefined
  /**
    * Custom render function for the label.
    */
  var onRenderLabel: js.UndefOr[IRenderFunction[IDropdownProps]] = js.undefined
  /**
    * Optional custom renderer for placeholder text
    * @deprecated Use `onRenderPlaceholder`
    */
  var onRenderPlaceHolder: js.UndefOr[IRenderFunction[IDropdownProps]] = js.undefined
  /**
    * Optional custom renderer for placeholder text
    */
  var onRenderPlaceholder: js.UndefOr[IRenderFunction[IDropdownProps]] = js.undefined
  /**
    * Optional custom renderer for selected option displayed in input
    */
  var onRenderTitle: js.UndefOr[IRenderFunction[js.Array[IDropdownOption]]] = js.undefined
  /**
    * Options for the dropdown. If using `defaultSelectedKey` or `defaultSelectedKeys`, options must be
    * pure for correct behavior.
    */
  @JSName("options")
  var options_IDropdownProps: js.Array[IDropdownOption]
  /**
    * Input placeholder text. Displayed until option is selected.
    * @deprecated Use `placeholder`
    */
  var placeHolder: js.UndefOr[String] = js.undefined
  /**
    * Pass in ResponsiveMode to manually overwrite the way the Dropdown renders.
    * ResponsiveMode.Large would, for instance, disable the behavior where Dropdown options
    * get rendered into a Panel while ResponsiveMode.Small would result in the Dropdown
    * options always getting rendered in a Panel.
    */
  var responsiveMode: js.UndefOr[
    typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
  ] = js.undefined
  /**
    * Keys of the selected items. If you provide this, you must maintain selection
    * state by observing onChange events and passing a new value in when changed.
    * Passing null in will clear the selection.
    */
  var selectedKeys: js.UndefOr[(js.Array[Double | String]) | Null] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDropdownStyleProps, IDropdownStyles]] = js.undefined
  /**
    * Theme provided by higher order component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IDropdownProps {
  @scala.inline
  def apply(
    options: js.Array[IDropdownOption],
    ISelectableDroppableTextProps: ISelectableDroppableTextProps[IDropdown, HTMLDivElement] = null,
    defaultSelectedKeys: js.Array[Double | String] = null,
    dropdownWidth: Int | Double = null,
    isDisabled: js.UndefOr[Boolean] = js.undefined,
    keytipProps: IKeytipProps = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    multiSelectDelimiter: String = null,
    notifyOnReselect: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* event */ FormEvent[HTMLDivElement], /* option */ js.UndefOr[IDropdownOption], /* index */ js.UndefOr[Double]) => Unit = null,
    onChanged: (/* option */ IDropdownOption, /* index */ js.UndefOr[Double]) => Unit = null,
    onDismiss: () => Unit = null,
    onRenderCaretDown: IRenderFunction[IDropdownProps] = null,
    onRenderLabel: IRenderFunction[IDropdownProps] = null,
    onRenderPlaceHolder: IRenderFunction[IDropdownProps] = null,
    onRenderPlaceholder: IRenderFunction[IDropdownProps] = null,
    onRenderTitle: IRenderFunction[js.Array[IDropdownOption]] = null,
    placeHolder: String = null,
    responsiveMode: typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode = null,
    selectedKeys: js.Array[Double | String] = null,
    styles: IStyleFunctionOrObject[IDropdownStyleProps, IDropdownStyles] = null,
    theme: ITheme = null
  ): IDropdownProps = {
    val __obj = js.Dynamic.literal(options = options)
    js.Dynamic.global.Object.assign(__obj, ISelectableDroppableTextProps)
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys)
    if (dropdownWidth != null) __obj.updateDynamic("dropdownWidth")(dropdownWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled)
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps)
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (multiSelectDelimiter != null) __obj.updateDynamic("multiSelectDelimiter")(multiSelectDelimiter)
    if (!js.isUndefined(notifyOnReselect)) __obj.updateDynamic("notifyOnReselect")(notifyOnReselect)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction2(onChanged))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onRenderCaretDown != null) __obj.updateDynamic("onRenderCaretDown")(onRenderCaretDown)
    if (onRenderLabel != null) __obj.updateDynamic("onRenderLabel")(onRenderLabel)
    if (onRenderPlaceHolder != null) __obj.updateDynamic("onRenderPlaceHolder")(onRenderPlaceHolder)
    if (onRenderPlaceholder != null) __obj.updateDynamic("onRenderPlaceholder")(onRenderPlaceholder)
    if (onRenderTitle != null) __obj.updateDynamic("onRenderTitle")(onRenderTitle)
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode)
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IDropdownProps]
  }
}

