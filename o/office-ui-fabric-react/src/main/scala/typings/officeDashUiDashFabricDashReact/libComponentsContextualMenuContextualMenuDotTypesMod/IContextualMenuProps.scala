package typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRectangleMod.IRectangle
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
import typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.Target
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotClassNamesMod.IContextualMenuClassNames
import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemProps
import typings.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.IWithResponsiveModeState
import typings.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.StatelessComponent
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualMenuProps
  extends IBaseProps[IContextualMenu]
     with IWithResponsiveModeState {
  /**
    * If true the positioning logic will prefer to flip edges rather than to nudge the rectangle to fit within bounds,
    * thus making sure the element aligns perfectly with target's alignment edge
    */
  var alignTargetEdge: js.UndefOr[Boolean] = js.undefined
  /**
    * Accessible label for the ContextualMenu's root element (inside the callout).
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * The width of the beak.
    * @defaultvalue 16
    */
  var beakWidth: js.UndefOr[Double] = js.undefined
  /**
    * The bounding rectangle (or callback that returns a rectangle) which the contextual menu can appear in.
    */
  var bounds: js.UndefOr[
    IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window], 
      js.UndefOr[IRectangle]
    ])
  ] = js.undefined
  /**
    * Additional custom props for the Callout.
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
  /**
    * Additional CSS class to apply to the ContextualMenu.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Method to override the render of the individual menu items
    * @defaultvalue ContextualMenuItem
    */
  var contextualMenuItemAs: js.UndefOr[
    (ComponentClass[IContextualMenuItemProps, ComponentState]) | StatelessComponent[IContextualMenuItemProps]
  ] = js.undefined
  /**
    * If true, the menu will be positioned to cover the target.
    * If false, it will be positioned next to the target.
    * @defaultvalue false
    */
  var coverTarget: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the contextual menu will not be updated until focus enters the menu via other means.
    * This will only result in different behavior when `shouldFocusOnMount = false`.
    * @defaultvalue null
    */
  var delayUpdateFocusOnHover: js.UndefOr[Boolean] = js.undefined
  /**
    * How the menu should be positioned
    * @defaultvalue DirectionalHint.bottomAutoEdge
    */
  var directionalHint: js.UndefOr[
    typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
  ] = js.undefined
  /**
    * If true the position will not change sides in an attempt to fit the ContextualMenu within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.undefined
  /**
    * How the menu should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used.
    */
  var directionalHintForRTL: js.UndefOr[
    typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
  ] = js.undefined
  /**
    * If true do not render on a new layer. If false render on a new layer.
    * @defaultvalue false
    */
  var doNotLayer: js.UndefOr[Boolean] = js.undefined
  /**
    * Props to pass down to the FocusZone.
    * NOTE: the default FocusZoneDirection will be used unless a direction
    * is specified in the focusZoneProps (even if other focusZoneProps are defined)
    * @defaultvalue \{ direction: FocusZoneDirection.vertical \}
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.undefined
  /**
    * The gap between the ContextualMenu and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.undefined
  /**
    * Method to provide the classnames to style the contextual menu.
    * @deprecated Use `styles` instead to leverage mergeStyles API.
    */
  var getMenuClassNames: js.UndefOr[
    js.Function2[/* theme */ ITheme, /* className */ js.UndefOr[String], IContextualMenuClassNames]
  ] = js.undefined
  /**
    * If true, renders the ContextualMenu in a hidden state.
    * Use this flag, rather than rendering a ContextualMenu conditionally based on visibility,
    * to improve rendering performance when it becomes visible.
    * Note: When ContextualMenu is hidden its content will not be rendered. It will only render
    * once the ContextualMenu is visible.
    * @defaultValue undefined
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * ID for the ContextualMenu's root element (inside the callout).
    * Should be used for `aria-owns` and other such uses, rather than direct reference for programmatic purposes.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * If true then the beak is visible. If false it will not be shown.
    */
  var isBeakVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this menu is a submenu of another menu.
    */
  var isSubMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * Menu items to display.
    * @defaultvalue []
    */
  var items: js.Array[IContextualMenuItem]
  /**
    * Used as `aria-labelledby` for the menu element inside the callout.
    */
  var labelElementId: js.UndefOr[String] = js.undefined
  /**
    * Callback when the ContextualMenu tries to close. If `dismissAll` is true then all
    * submenus will be dismissed.
    */
  var onDismiss: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[(MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element]], 
      /* dismissAll */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /**
    * Click handler which is invoked if `onClick` is not passed for individual contextual
    * menu item.
    * Returning true will dismiss the menu even if `ev.preventDefault()` was called.
    */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
      /* item */ js.UndefOr[IContextualMenuItem], 
      Boolean | Unit
    ]
  ] = js.undefined
  /**
    * Callback for when the menu is being closed (removing from the DOM).
    */
  var onMenuDismissed: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[IContextualMenuProps], Unit]] = js.undefined
  /**
    * Callback for when the menu has been opened.
    */
  var onMenuOpened: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[IContextualMenuProps], Unit]] = js.undefined
  /**
    * Method to override the render of the list of menu items.
    */
  var onRenderMenuList: js.UndefOr[IRenderFunction[IContextualMenuListProps]] = js.undefined
  /** Custom render function for a submenu. */
  var onRenderSubMenu: js.UndefOr[IRenderFunction[IContextualMenuProps]] = js.undefined
  /**
    * Whether to focus on the contextual menu container (as opposed to the first menu item).
    */
  var shouldFocusOnContainer: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to focus on the menu when mounted.
    * @defaultvalue true
    */
  var shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the component will be updated even when `hidden=true`.
    * Note that this would consume resources to update even though
    * nothing is being shown to the user.
    * This might be helpful though if your updates are small and you want the
    * contextual menu to be revealed fast to the user when `hidden` is set to false.
    */
  var shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles]] = js.undefined
  /**
    * Delay (in milliseconds) to wait before expanding / dismissing a submenu on mouseEnter or mouseLeave
    */
  var subMenuHoverDelay: js.UndefOr[Double] = js.undefined
  /**
    * The target that the ContextualMenu should try to position itself based on.
    * It can be either an element, a query selector string resolving to a valid element,
    * or a MouseEvent. If a MouseEvent is given, the origin point of the event will be used.
    */
  var target: js.UndefOr[Target] = js.undefined
  /**
    * Theme provided by higher-order component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Optional title to be displayed on top of the menu.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * If true the context menu will have a minimum width equal to the width of the target element
    * @defaultvalue false
    */
  var useTargetAsMinWidth: js.UndefOr[Boolean] = js.undefined
  /**
    * If true the context menu will render as the same width as the target element
    * @defaultvalue false
    */
  var useTargetWidth: js.UndefOr[Boolean] = js.undefined
}

object IContextualMenuProps {
  @scala.inline
  def apply(
    items: js.Array[IContextualMenuItem],
    alignTargetEdge: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    beakWidth: Int | Double = null,
    bounds: IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window], 
      js.UndefOr[IRectangle]
    ]) = null,
    calloutProps: ICalloutProps = null,
    className: String = null,
    componentRef: IRefObject[IContextualMenu] = null,
    contextualMenuItemAs: (ComponentClass[IContextualMenuItemProps, ComponentState]) | StatelessComponent[IContextualMenuItemProps] = null,
    coverTarget: js.UndefOr[Boolean] = js.undefined,
    delayUpdateFocusOnHover: js.UndefOr[Boolean] = js.undefined,
    directionalHint: typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    directionalHintForRTL: typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint = null,
    doNotLayer: js.UndefOr[Boolean] = js.undefined,
    focusZoneProps: IFocusZoneProps = null,
    gapSpace: Int | Double = null,
    getMenuClassNames: (/* theme */ ITheme, /* className */ js.UndefOr[String]) => IContextualMenuClassNames = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    isBeakVisible: js.UndefOr[Boolean] = js.undefined,
    isSubMenu: js.UndefOr[Boolean] = js.undefined,
    labelElementId: String = null,
    onDismiss: (/* ev */ js.UndefOr[(MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element]], /* dismissAll */ js.UndefOr[Boolean]) => Unit = null,
    onItemClick: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit = null,
    onMenuDismissed: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit = null,
    onMenuOpened: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit = null,
    onRenderMenuList: (/* props */ js.UndefOr[IContextualMenuListProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IContextualMenuListProps], 
        typings.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typings.react.reactMod._Global_.JSX.Element | Null = null,
    onRenderSubMenu: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IContextualMenuProps], 
        typings.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typings.react.reactMod._Global_.JSX.Element | Null = null,
    responsiveMode: ResponsiveMode = null,
    shouldFocusOnContainer: js.UndefOr[Boolean] = js.undefined,
    shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined,
    shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles] = null,
    subMenuHoverDelay: Int | Double = null,
    target: Target = null,
    theme: ITheme = null,
    title: String = null,
    useTargetAsMinWidth: js.UndefOr[Boolean] = js.undefined,
    useTargetWidth: js.UndefOr[Boolean] = js.undefined
  ): IContextualMenuProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(alignTargetEdge)) __obj.updateDynamic("alignTargetEdge")(alignTargetEdge.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextualMenuItemAs != null) __obj.updateDynamic("contextualMenuItemAs")(contextualMenuItemAs.asInstanceOf[js.Any])
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(delayUpdateFocusOnHover)) __obj.updateDynamic("delayUpdateFocusOnHover")(delayUpdateFocusOnHover.asInstanceOf[js.Any])
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed.asInstanceOf[js.Any])
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotLayer)) __obj.updateDynamic("doNotLayer")(doNotLayer.asInstanceOf[js.Any])
    if (focusZoneProps != null) __obj.updateDynamic("focusZoneProps")(focusZoneProps.asInstanceOf[js.Any])
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (getMenuClassNames != null) __obj.updateDynamic("getMenuClassNames")(js.Any.fromFunction2(getMenuClassNames))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isBeakVisible)) __obj.updateDynamic("isBeakVisible")(isBeakVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isSubMenu)) __obj.updateDynamic("isSubMenu")(isSubMenu.asInstanceOf[js.Any])
    if (labelElementId != null) __obj.updateDynamic("labelElementId")(labelElementId.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction2(onDismiss))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onMenuDismissed != null) __obj.updateDynamic("onMenuDismissed")(js.Any.fromFunction1(onMenuDismissed))
    if (onMenuOpened != null) __obj.updateDynamic("onMenuOpened")(js.Any.fromFunction1(onMenuOpened))
    if (onRenderMenuList != null) __obj.updateDynamic("onRenderMenuList")(js.Any.fromFunction2(onRenderMenuList))
    if (onRenderSubMenu != null) __obj.updateDynamic("onRenderSubMenu")(js.Any.fromFunction2(onRenderSubMenu))
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusOnContainer)) __obj.updateDynamic("shouldFocusOnContainer")(shouldFocusOnContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusOnMount)) __obj.updateDynamic("shouldFocusOnMount")(shouldFocusOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldUpdateWhenHidden)) __obj.updateDynamic("shouldUpdateWhenHidden")(shouldUpdateWhenHidden.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subMenuHoverDelay != null) __obj.updateDynamic("subMenuHoverDelay")(subMenuHoverDelay.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(useTargetAsMinWidth)) __obj.updateDynamic("useTargetAsMinWidth")(useTargetAsMinWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(useTargetWidth)) __obj.updateDynamic("useTargetWidth")(useTargetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuProps]
  }
}

