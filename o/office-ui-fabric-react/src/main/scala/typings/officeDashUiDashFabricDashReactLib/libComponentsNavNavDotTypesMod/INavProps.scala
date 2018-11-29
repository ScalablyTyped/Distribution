package typings
package officeDashUiDashFabricDashReactLib.libComponentsNavNavDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait INavProps extends js.Object {
  /**
       * (Optional) The nav container aria label.
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Additional css class to apply to the Nav
       * @defaultvalue undefined
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Deprecated at v0.68.1 and will be removed at \>= v1.0.0.
       * @deprecated Removed at v1.0.0.
       **/
  var collapsedStateText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Optional callback to access the INav interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[INav]] = js.undefined
  /**
       * (Optional) The nav container aria label.
       */
  var expandButtonAriaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Deprecated at v0.68.1 and will be removed at \>= v1.0.0.
       * @deprecated Removed at v1.0.0.
       **/
  var expandedStateText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A collection of link groups to display in the navigation bar
       */
  var groups: js.Array[INavLinkGroup] | scala.Null
  /**
       * (Optional) The key of the nav item initially selected.
       */
  var initialSelectedKey: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Indicates whether the navigation component renders on top of other content in the UI
       */
  var isOnTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Render a custom link in place of the normal one.
       * This replaces the entire button rather than simply button content
       */
  var linkAs: js.UndefOr[
    atUifabricUtilitiesLib.libIComponentAsMod.IComponentAs[
      officeDashUiDashFabricDashReactLib.libComponentsButtonButtonDotTypesMod.IButtonProps
    ]
  ] = js.undefined
  /**
       * Function callback invoked when a link in the navigation is clicked
       */
  var onLinkClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]], 
      /* item */ js.UndefOr[INavLink], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Function callback invoked when the chevron on a link is clicked
       */
  var onLinkExpandClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]], 
      /* item */ js.UndefOr[INavLink], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Used to customize how content inside the group header is rendered
       * @defaultvalue Default group header rendering
       */
  var onRenderGroupHeader: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[INavLinkGroup]] = js.undefined
  /**
       * Used to customize how content inside the link tag is rendered
       * @defaultvalue Default link rendering
       */
  var onRenderLink: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[INavLink]] = js.undefined
  /**
       * (Optional) The key of the nav item selected by caller.
       */
  var selectedKey: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[INavStyleProps, INavStyles]
  ] = js.undefined
  /**
       * Theme provided by HOC.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

