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
import typings.react.NativeMouseEvent
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.StatelessComponent
import typings.std.HTMLElement
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
    * Aria label for accessibility for the ContextualMenu.
    * If none specified no aria label will be applied to the ContextualMenu.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * The width of the beak.
    * @defaultvalue 16
    */
  var beakWidth: js.UndefOr[Double] = js.undefined
  /**
    * The bounding rectangle for which the contextual menu can appear in.
    */
  var bounds: js.UndefOr[IRectangle] = js.undefined
  /**
    * Pass in custom callout props
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.undefined
  /**
    * Additional css class to apply to the ContextualMenu
    * @defaultvalue undefined
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
    * If true the position returned will have the menu element cover the target.
    * If false then it will position next to the target;
    * @defaultvalue false
    */
  var coverTarget: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the contextual menu will not be updated until
    * focus enters the menu via other means. This will only result
    * in different behavior when shouldFocusOnMount = false
    * @defaultvalue null
    */
  var delayUpdateFocusOnHover: js.UndefOr[Boolean] = js.undefined
  /**
    * How the element should be positioned
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
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used instead
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
    * @defaultvalue \{direction: FocusZoneDirection.vertical\}
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.undefined
  /**
    * The gap between the ContextualMenu and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.undefined
  /**
    * Method to provide the classnames to style the contextual menu. Default value is the getMenuClassnames func
    * defined in ContextualMenu.classnames.
    * Deprecated, use `styles` prop of `IContextualMenuProps` to leverage mergeStyles API.
    * @deprecated Use `styles` prop of `IContextualMenuProps` to leverage mergeStyles API.
    */
  var getMenuClassNames: js.UndefOr[
    js.Function2[/* theme */ ITheme, /* className */ js.UndefOr[String], IContextualMenuClassNames]
  ] = js.undefined
  /**
    * If specified, renders the ContextualMenu in a hidden state.
    * Use this flag, rather than rendering a ContextualMenu conditionally based on visibility,
    * to improve rendering performance when it becomes visible.
    * Note: When ContextualMenu is hidden its content will not be rendered. It will only render
    * once the ContextualMenu is visible.
    * @defaultValue undefined
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**
    * DOM id to tag the ContextualMenu with, for reference.
    * Should be used for 'aria-owns' and other such uses, rather than direct reference for programmatic purposes.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * If true then the beak is visible. If false it will not be shown.
    */
  var isBeakVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether this menu is a submenu of another menu or not.
    */
  var isSubMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * Collection of menu items.
    * @defaultvalue []
    */
  var items: js.Array[IContextualMenuItem]
  /**
    * Aria Labelled by labelElementId
    * @defaultvalue null
    */
  var labelElementId: js.UndefOr[String] = js.undefined
  /**
    * Callback when the ContextualMenu tries to close. If dismissAll is true then all
    * submenus will be dismissed.
    */
  var onDismiss: js.UndefOr[
    js.Function2[/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /**
    * Click handler which is invoked if onClick is not passed for individual contextual
    * menu item.
    * Returning true will dismiss the menu even if ev.preventDefault() was called.
    */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], 
      /* item */ js.UndefOr[IContextualMenuItem], 
      Boolean | Unit
    ]
  ] = js.undefined
  /**
    * Callback for when the contextualmenu is being closed (removing from the DOM)
    */
  var onMenuDismissed: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[IContextualMenuProps], Unit]] = js.undefined
  /**
    * Callback for when the contextualmenu has been opened.
    */
  var onMenuOpened: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[IContextualMenuProps], Unit]] = js.undefined
  /**
    * Method to override the render of the list of menu items.
    */
  var onRenderMenuList: js.UndefOr[IRenderFunction[IContextualMenuListProps]] = js.undefined
  /** Method to call when trying to render a submenu. */
  var onRenderSubMenu: js.UndefOr[IRenderFunction[IContextualMenuProps]] = js.undefined
  /**
    * Whether to focus on the contextual menu container (as opposed to the first menu item).
    * @defaultvalue null
    */
  var shouldFocusOnContainer: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to focus on the menu when mounted.
    * @defaultvalue true
    */
  var shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined
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
    * It can be either an Element a querySelector string of a valid Element
    * or a MouseEvent. If MouseEvent is given then the origin point of the event will be used.
    */
  var target: js.UndefOr[Target] = js.undefined
  /**
    * Theme provided by High-Order Component.
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
    bounds: IRectangle = null,
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
    onDismiss: (/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean]) => Unit = null,
    onItemClick: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit = null,
    onMenuDismissed: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit = null,
    onMenuOpened: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit = null,
    onRenderMenuList: IRenderFunction[IContextualMenuListProps] = null,
    onRenderSubMenu: IRenderFunction[IContextualMenuProps] = null,
    responsiveMode: ResponsiveMode = null,
    shouldFocusOnContainer: js.UndefOr[Boolean] = js.undefined,
    shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles] = null,
    subMenuHoverDelay: Int | Double = null,
    target: Target = null,
    theme: ITheme = null,
    title: String = null,
    useTargetAsMinWidth: js.UndefOr[Boolean] = js.undefined,
    useTargetWidth: js.UndefOr[Boolean] = js.undefined
  ): IContextualMenuProps = {
    val __obj = js.Dynamic.literal(items = items)
    if (!js.isUndefined(alignTargetEdge)) __obj.updateDynamic("alignTargetEdge")(alignTargetEdge)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextualMenuItemAs != null) __obj.updateDynamic("contextualMenuItemAs")(contextualMenuItemAs.asInstanceOf[js.Any])
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget)
    if (!js.isUndefined(delayUpdateFocusOnHover)) __obj.updateDynamic("delayUpdateFocusOnHover")(delayUpdateFocusOnHover)
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint)
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed)
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL)
    if (!js.isUndefined(doNotLayer)) __obj.updateDynamic("doNotLayer")(doNotLayer)
    if (focusZoneProps != null) __obj.updateDynamic("focusZoneProps")(focusZoneProps)
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (getMenuClassNames != null) __obj.updateDynamic("getMenuClassNames")(js.Any.fromFunction2(getMenuClassNames))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isBeakVisible)) __obj.updateDynamic("isBeakVisible")(isBeakVisible)
    if (!js.isUndefined(isSubMenu)) __obj.updateDynamic("isSubMenu")(isSubMenu)
    if (labelElementId != null) __obj.updateDynamic("labelElementId")(labelElementId)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction2(onDismiss))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onMenuDismissed != null) __obj.updateDynamic("onMenuDismissed")(js.Any.fromFunction1(onMenuDismissed))
    if (onMenuOpened != null) __obj.updateDynamic("onMenuOpened")(js.Any.fromFunction1(onMenuOpened))
    if (onRenderMenuList != null) __obj.updateDynamic("onRenderMenuList")(onRenderMenuList)
    if (onRenderSubMenu != null) __obj.updateDynamic("onRenderSubMenu")(onRenderSubMenu)
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode)
    if (!js.isUndefined(shouldFocusOnContainer)) __obj.updateDynamic("shouldFocusOnContainer")(shouldFocusOnContainer)
    if (!js.isUndefined(shouldFocusOnMount)) __obj.updateDynamic("shouldFocusOnMount")(shouldFocusOnMount)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subMenuHoverDelay != null) __obj.updateDynamic("subMenuHoverDelay")(subMenuHoverDelay.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(useTargetAsMinWidth)) __obj.updateDynamic("useTargetAsMinWidth")(useTargetAsMinWidth)
    if (!js.isUndefined(useTargetWidth)) __obj.updateDynamic("useTargetWidth")(useTargetWidth)
    __obj.asInstanceOf[IContextualMenuProps]
  }
}

