package typings
package officeDashUiDashFabricDashReactLib.libComponentsDropdownDropdownDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDropdownProps
  extends officeDashUiDashFabricDashReactLib.libUtilitiesSelectableOptionSelectableDroppableTextDotTypesMod.ISelectableDroppableTextProps[IDropdown, reactLib.HTMLDivElement] {
  /**
       * Keys that will be initially used to set selected items.
       */
  var defaultSelectedKeys: js.UndefOr[js.Array[java.lang.String] | js.Array[scala.Double]] = js.undefined
  /**
       * Custom width for dropdown. If value is 0, width of the input field is used.
       * @defaultvalue 0
       */
  var dropdownWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * Deprecated at v0.52.0, use `disabled` instead.
       * @deprecated Use `disabled` instead.
       */
  var isDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Optional keytip for this dropdown
       */
  var keytipProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
  ] = js.undefined
  /**
       * Optional mode indicates if multi-choice selections is allowed.  Default to false
       */
  var multiSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * When multiple items are selected, this still will be used to separate values in
       * the dropdown title.
       *
       * @defaultvalue ", "
       */
  var multiSelectDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional preference to have onChanged still be called when an already selected item is
       * clicked in single select mode.  Default to false
       */
  var notifyOnReselect: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Callback issued when the selected option changes.
       */
  @JSName("onChange")
  var onChange_IDropdownProps: js.UndefOr[
    js.Function3[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLDivElement], 
      /* option */ js.UndefOr[IDropdownOption], 
      /* index */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * @deprecated Use `onChange` instead.
       */
  var onChanged: js.UndefOr[
    js.Function2[/* option */ IDropdownOption, /* index */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /**
       * Callback issues when the options callout is dismissed
       */
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Optional custom renderer for chevron icon
       */
  var onRenderCaretDown: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IDropdownProps]] = js.undefined
  /**
       * Optional custom renderer for placeholder text
       */
  var onRenderPlaceHolder: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IDropdownProps]] = js.undefined
  /**
       * Optional custom renderer for selected option displayed in input
       */
  var onRenderTitle: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IDropdownOption | js.Array[IDropdownOption]]
  ] = js.undefined
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
  var placeHolder: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Pass in ResponsiveMode to manually overwrite the way the Dropdown renders.
       * ResponsiveMode.Large would, for instance, disable the behavior where Dropdown options
       * get rendered into a Panel while ResponsiveMode.Small would result in the Dropdown
       * options always getting rendered in a Panel.
       */
  var responsiveMode: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
  ] = js.undefined
  /**
       * Keys of the selected items. If you provide this, you must maintain selection
       * state by observing onChange events and passing a new value in when changed.
       */
  var selectedKeys: js.UndefOr[js.Array[java.lang.String] | js.Array[scala.Double]] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDropdownStyleProps, IDropdownStyles]
  ] = js.undefined
  /**
       * Theme provided by higher order component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

