package typings
package officeDashUiDashFabricDashReactLib.libComponentsSpinnerSpinnerDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISpinnerProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] {
  /**
       * Alternative status label for screen reader
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Politeness setting for label update announcement.
       * @default polite
       */
  var ariaLive: js.UndefOr[
    officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.assertive | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.polite | officeDashUiDashFabricDashReactLib.officeDashUiDashFabricDashReactLibStrings.off
  ] = js.undefined
  /**
       * Optional callback to access the ISpinner interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[ISpinner]] = js.undefined
  /**
       * The label to show next to the Spinner. Label updates will be announced to the screen readers.
       * Use ariaLive to control politeness level.
       */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The size of Spinner to render. { extraSmall, small, medium, large }
       * @default SpinnerType.medium
       */
  var size: js.UndefOr[SpinnerSize] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[ISpinnerStyleProps, ISpinnerStyles]
  ] = js.undefined
  /**
       * Theme (provided through customization.)
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Deprecated and will be removed at >= 2.0.0. Use SpinnerSize instead.
       * @deprecated
       */
  var `type`: js.UndefOr[SpinnerType] = js.undefined
}

