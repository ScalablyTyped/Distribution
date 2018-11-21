package typings
package officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IContextualMenuProps
  extends atUifabricUtilitiesLib.libBaseComponentMod.IBaseProps[IContextualMenu]
     with officeDashUiDashFabricDashReactLib.libUtilitiesDecoratorsWithResponsiveModeMod.IWithResponsiveModeState {
  /**
       * Aria label for accessibility for the ContextualMenu.
       * If none specified no aria label will be applied to the ContextualMenu.
       */
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The width of the beak.
       * @default 16
       */
  var beakWidth: js.UndefOr[scala.Double] = js.undefined
  /**
       * The bounding rectangle for which the contextual menu can appear in.
       */
  var bounds: js.UndefOr[atUifabricUtilitiesLib.libIRectangleMod.IRectangle] = js.undefined
  /**
       * Pass in custom callout props
       */
  var calloutProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
  ] = js.undefined
  /**
       * Additional css class to apply to the ContextualMenu
       * @defaultvalue undefined
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Method to override the render of the individual menu items
       * @default ContextualMenuItem
       */
  var contextualMenuItemAs: js.UndefOr[
    (reactLib.reactMod.ReactNs.ComponentClass[
      officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ]) | (reactLib.reactMod.ReactNs.StatelessComponent[
      officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemProps
    ])
  ] = js.undefined
  /**
       * If true the position returned will have the menu element cover the target.
       * If false then it will position next to the target;
       * @default false
       */
  var coverTarget: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, the contextual menu will not be updated until
       * focus enters the menu via other means. This will only result
       * in different behavior when shouldFocusOnMount = false
       * @default null
       */
  var delayUpdateFocusOnHover: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * How the element should be positioned
       * @default DirectionalHint.bottomAutoEdge
       */
  var directionalHint: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
       * If true the position will not change sides in an attempt to fit the ContextualMenu within bounds.
       * It will still attempt to align it to whatever bounds are given.
       * @default false
       */
  var directionalHintFixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * How the element should be positioned in RTL layouts.
       * If not specified, a mirror of `directionalHint` will be used instead
       */
  var directionalHintForRTL: js.UndefOr[officeDashUiDashFabricDashReactLib.libCommonDirectionalHintMod.DirectionalHint] = js.undefined
  /**
       * If true do not render on a new layer. If false render on a new layer.
       * @default false
       */
  var doNotLayer: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Props to pass down to the FocusZone.
       * NOTE: the default FocusZoneDirection will be used unless a direction
       * is specified in the focusZoneProps (even if other focusZoneProps are defined)
       * @default {direction: FocusZoneDirection.vertical}
       */
  var focusZoneProps: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps
  ] = js.undefined
  /**
       * The gap between the ContextualMenu and the target
       * @default 0
       */
  var gapSpace: js.UndefOr[scala.Double] = js.undefined
  /**
       * Method to provide the classnames to style the contextual menu. Default value is the getMenuClassnames func
       * defined in ContextualMenu.classnames.
       * @deprecated Use `styles` prop of `IContextualMenuProps` to leverage mergeStyle API.
       */
  var getMenuClassNames: js.UndefOr[
    js.Function2[
      /* theme */ atUifabricStylingLib.libInterfacesIThemeMod.ITheme, 
      /* className */ js.UndefOr[java.lang.String], 
      officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotClassNamesMod.IContextualMenuClassNames
    ]
  ] = js.undefined
  /**
       * If specified, renders the ContextualMenu in a hidden state.
       * Use this flag, rather than rendering a ContextualMenu conditionally based on visibility,
       * to improve rendering performance when it becomes visible.
       * Note: When ContextualMenu is hidden its content will not be rendered. It will only render
       * once the ContextualMenu is visible.
       */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * DOM id to tag the ContextualMenu with, for reference.
       * Should be used for 'aria-owns' and other such uses, rather than direct reference for programmatic purposes.
       */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If true then the beak is visible. If false it will not be shown.
       */
  var isBeakVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether this menu is a submenu of another menu or not.
       */
  var isSubMenu: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Collection of menu items.
       * @default []
       */
  var items: js.Array[IContextualMenuItem]
  /**
       * Aria Labelled by labelElementId
       * @default null
       */
  var labelElementId: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Callback when the ContextualMenu tries to close. If dismissAll is true then all
       * submenus will be dismissed.
       */
  var onDismiss: js.UndefOr[
    js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
       * Click handler which is invoked if onClick is not passed for individual contextual
       * menu item.
       * Returning true will dismiss the menu even if ev.preventDefault() was called.
       */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[
        reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement] | reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]
      ], 
      /* item */ js.UndefOr[IContextualMenuItem], 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  /**
       * Callback for when the contextualmenu is being closed (removing from the DOM)
       */
  var onMenuDismissed: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[IContextualMenuProps], scala.Unit]] = js.undefined
  /**
       * Callback for when the contextualmenu has been opened.
       */
  var onMenuOpened: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[IContextualMenuProps], scala.Unit]] = js.undefined
  /**
       * Method to override the render of the list of menu items.
       */
  var onRenderMenuList: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IContextualMenuListProps]
  ] = js.undefined
  /** Method to call when trying to render a submenu. */
  var onRenderSubMenu: js.UndefOr[
    atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IContextualMenuProps]
  ] = js.undefined
  /**
       * Whether to focus on the contextual menu container (as opposed to the first menu item).
       * @default null
       */
  var shouldFocusOnContainer: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether to focus on the menu when mounted.
       * @default true
       */
  var shouldFocusOnMount: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Call to provide customized styling that will layer on top of the variant rules.
       */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles]
  ] = js.undefined
  /**
       * Delay (in milliseconds) to wait before expanding / dismissing a submenu on mouseEnter or mouseLeave
       */
  var subMenuHoverDelay: js.UndefOr[scala.Double] = js.undefined
  /**
       * The target that the ContextualMenu should try to position itself based on.
       * It can be either an Element a querySelector string of a valid Element
       * or a MouseEvent. If MouseEvent is given then the origin point of the event will be used.
       */
  var target: js.UndefOr[
    reactLib.Element | java.lang.String | reactLib.MouseEvent | atUifabricUtilitiesLib.libIPointMod.IPoint | scala.Null
  ] = js.undefined
  /**
       * Theme provided by High-Order Component.
       */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
  /**
       * Optional title to be displayed on top of the menu.
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If true the context menu will have a minimum width equal to the width of the target element
       * @default false
       */
  var useTargetAsMinWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true the context menu will render as the same width as the target element
       * @default false
       */
  var useTargetWidth: js.UndefOr[scala.Boolean] = js.undefined
}

