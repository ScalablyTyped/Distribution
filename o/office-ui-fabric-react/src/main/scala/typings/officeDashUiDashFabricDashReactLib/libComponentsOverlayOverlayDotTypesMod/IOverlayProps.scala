package typings
package officeDashUiDashFabricDashReactLib.libComponentsOverlayOverlayDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOverlayProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] {
  /**
       * Gets the component ref.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IOverlay]] = js.undefined
  /**
       * Whether to use the dark-themed overlay.
       * @defaultvalue false
       */
  var isDarkThemed: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("onClick")
  var onClick_IOverlayProps: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IOverlayStyleProps, IOverlayStyles]
  ] = js.undefined
  /**
       * Theme provided by HOC.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

