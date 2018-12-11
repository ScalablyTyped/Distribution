package typings
package officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPivotProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[officeDashUiDashFabricDashReactLib.libComponentsPivotPivotDotBaseMod.PivotBase]
     with reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  /**
       * Optional callback to access the IPivot interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IPivot]] = js.undefined
  /**
       * Optional. Specify how IDs are generated for each tab header.
       * Useful if you're rendering content outside and need to connect aria-labelledby.
       */
  var getTabId: js.UndefOr[
    js.Function2[/* itemKey */ java.lang.String, /* index */ scala.Double, java.lang.String]
  ] = js.undefined
  /**
       * Specify whether to skip rendering the tabpanel with the content of the selected tab.
       * Use this prop if you plan to separately render the tab content
       * and don't want to leave an empty tabpanel in the page that may confuse Screen Readers.
       */
  var headersOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The index of the pivot item initially selected.
       *
       * It only works when initialSelectedKey is not defined. You must not use them together.
       */
  var initialSelectedIndex: js.UndefOr[scala.Double] = js.undefined
  /**
       * The key of the pivot item initially selected.
       *
       * It will make initialSelectedIndex not work. You must not use them together.
       */
  var initialSelectedKey: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Specify the PivotLinkFormat to use (links, tabs)
       */
  var linkFormat: js.UndefOr[PivotLinkFormat] = js.undefined
  /**
       * Specify the PivotLinkSize to use (normal, large)
       */
  var linkSize: js.UndefOr[PivotLinkSize] = js.undefined
  /**
       * Callback issued when the selected pivot item is changed
       */
  var onLinkClick: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[officeDashUiDashFabricDashReactLib.libComponentsPivotPivotItemMod.PivotItem], 
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * The key of the selected pivot item.
       *
       * If set, this will override the Pivot's selected item state.
       */
  var selectedKey: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IPivotStyleProps, IPivotStyles]
  ] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

