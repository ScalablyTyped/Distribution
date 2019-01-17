package typings
package officeDashUiDashFabricDashReactLib.libComponentsToggleToggleDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToggleProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] {
  /**
    * Text for screen-reader to announce as the name of the toggle.
    */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Render the root element as another type.
    */
  var as: js.UndefOr[
    atUifabricUtilitiesLib.libIComponentAsMod.IComponentAs[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]]
  ] = js.undefined
  /**
    * Checked state of the toggle. If you are maintaining state yourself, use this property. Otherwise refer to `defaultChecked`.
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional callback to access the IToggle interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IToggle]] = js.undefined
  /**
    * Optional disabled flag.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the label (not the onText/offText) should be positioned inline with the toggle control.
    * Left (right in RTL) side when on/off text provided VS right (left in RTL) side when no on/off text.
    * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
    */
  var inlineLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional keytip for this toggle
    */
  var keytipProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsKeytipKeytipDotTypesMod.IKeytipProps
  ] = js.undefined
  /**
    * A label for the toggle.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated Use `ariaLabel` for name, and let the metadata convey state
    */
  var offAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text to display when toggle is OFF.
    * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
    */
  var offText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @deprecated Use `ariaLabel` for name, and let the metadata convey state
    */
  var onAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback issued when the value changes.
    */
  @JSName("onChange")
  var onChange_IToggleProps: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* checked */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * @deprecated Use `onChange` instead.
    */
  var onChanged: js.UndefOr[js.Function1[/* checked */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Text to display when toggle is ON.
    * Caution: when not providing on/off text user may get confused in differentiating the on/off states of the toggle.
    */
  var onText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IToggleStyleProps, IToggleStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

