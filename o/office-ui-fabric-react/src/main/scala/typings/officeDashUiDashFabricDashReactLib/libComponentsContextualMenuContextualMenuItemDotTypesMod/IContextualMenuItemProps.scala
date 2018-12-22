package typings
package officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuItemDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IContextualMenuItemProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[IContextualMenuItemProps] {
  /**
       * Classnames for different aspects of a menu item
       */
  var classNames: officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotClassNamesMod.IMenuItemClassNames
  /**
       * Optional callback to access the IContextualMenuRenderItem interface. Use this instead of ref for accessing
       * the public methods and properties of the component.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IContextualMenuRenderItem]] = js.undefined
  /**
       * This prop will get set by ContextualMenu and can be called to close the menu this item belongs to.
       * If dismissAll is true, all menus will be closed.
       */
  var dismissMenu: js.UndefOr[
    js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
       * This prop will get set by ContextualMenu and can be called to close this item's subMenu, if present.
       */
  var dismissSubMenu: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * This prop will get set by the wrapping component and will return the element that wraps this ContextualMenuItem.
       * Used for openSubMenu.
       */
  var getSubmenuTarget: js.UndefOr[js.Function0[js.UndefOr[reactLib.HTMLElement]]] = js.undefined
  /**
       * If this item has icons
       */
  var hasIcons: js.UndefOr[scala.Boolean]
  /**
       * Index of the item
       */
  var index: scala.Double
  /**
       * The item to display
       */
  var item: officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
  /**
       * Click handler for the checkmark
       */
  var onCheckmarkClick: js.UndefOr[
    js.Function2[
      /* item */ officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem, 
      /* ev */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * This prop will get set by ContextualMenu and can be called to open this item's subMenu, if present.
       */
  var openSubMenu: js.UndefOr[js.Function2[/* item */ js.Any, /* target */ reactLib.HTMLElement, scala.Unit]] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IContextualMenuItemStyleProps, IContextualMenuItemStyles]
  ] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

