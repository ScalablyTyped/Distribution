package typings
package officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IScrollablePaneProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[
      reactLib.HTMLElement | officeDashUiDashFabricDashReactLib.libComponentsScrollablePaneScrollablePaneDotBaseMod.ScrollablePaneBase
    ] {
  /**
       * Optional callback to access the IScrollablePane interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IScrollablePane]] = js.undefined
  /**
       * Sets the initial scroll position of the ScrollablePane
       */
  var initialScrollPosition: js.UndefOr[scala.Double] = js.undefined
  var scrollbarVisibility: js.UndefOr[ScrollbarVisibility] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IScrollablePaneStyleProps, IScrollablePaneStyles]
  ] = js.undefined
  /**
       * Theme provided by HOC.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

