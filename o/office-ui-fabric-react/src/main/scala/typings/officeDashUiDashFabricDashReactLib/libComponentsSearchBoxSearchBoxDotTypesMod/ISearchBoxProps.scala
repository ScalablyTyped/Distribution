package typings
package officeDashUiDashFabricDashReactLib.libComponentsSearchBoxSearchBoxDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchBoxProps
  extends reactLib.reactMod.ReactNs.InputHTMLAttributes[reactLib.HTMLInputElement] {
  /**
    * The aria label of the SearchBox for the benefit of screen readers.
    * @defaultvalue placeholder
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The props for the clear button.
    */
  var clearButtonProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
  ] = js.undefined
  /**
    * Optional callback to access the ISearchBox interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ISearchBox]] = js.undefined
  /**
    * The default value of the text in the SearchBox, in the case of an uncontrolled component.
    * Up till now, this has not been implemented, deprecating. Will re-implement if uncontrolled
    * component behavior is implemented.
    * @deprecated Not implmented.
    */
  @JSName("defaultValue")
  var defaultValue_ISearchBoxProps: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether or not to animate the SearchBox icon on focus.
    * @defaultvalue false
    */
  var disableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The props for the icon.
    */
  var iconProps: js.UndefOr[
    stdLib.Pick[
      officeDashUiDashFabricDashReactLib.libComponentsIconIconDotTypesMod.IIconProps, 
      stdLib.Exclude[
        java.lang.String, 
        officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.className
      ]
    ]
  ] = js.undefined
  /**
    * Deprecated. Use `placeholder` instead.
    * @deprecated Use `placeholder` instead.
    */
  var labelText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback function for when the typed input for the SearchBox has changed.
    */
  @JSName("onChange")
  var onChange_ISearchBoxProps: js.UndefOr[js.Function1[/* newValue */ js.Any, scala.Unit]] = js.undefined
  /**
    * Deprecated at v0.52.2, use `onChange` instead.
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function1[/* newValue */ js.Any, scala.Unit]] = js.undefined
  /**
    * Callback executed when the user clears the search box by either clicking 'X' or hitting escape.
    */
  var onClear: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /**
    * Callback executed when the user presses escape in the search box.
    */
  var onEscape: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /**
    * Callback executed when the user presses enter in the search box.
    */
  var onSearch: js.UndefOr[js.Function1[/* newValue */ js.Any, scala.Unit]] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ISearchBoxStyleProps, ISearchBoxStyles]
  ] = js.undefined
  /**
    * Theme (provided through customization.)
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
    * Whether or not the SearchBox is underlined.
    * @defaultvalue false
    */
  var underlined: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The value of the text in the SearchBox.
    */
  @JSName("value")
  var value_ISearchBoxProps: js.UndefOr[java.lang.String] = js.undefined
}

