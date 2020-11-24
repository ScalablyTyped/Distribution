package typings.officeUiFabricReact.contextualMenuTypesMod

import typings.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.anon.ContainsFocus
import typings.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typings.officeUiFabricReact.contextualMenuClassNamesMod.IContextualMenuClassNames
import typings.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typings.officeUiFabricReact.withResponsiveModeMod.IWithResponsiveModeState
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Window
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricReactHooks.useTargetMod.Target
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextualMenuProps
  extends IBaseProps[IContextualMenu]
     with IWithResponsiveModeState {
  
  /**
    * If true the positioning logic will prefer to flip edges rather than to nudge the rectangle to fit within bounds,
    * thus making sure the element aligns perfectly with target's alignment edge
    */
  var alignTargetEdge: js.UndefOr[Boolean] = js.native
  
  /**
    * Accessible label for the ContextualMenu's root element (inside the callout).
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * The width of the beak.
    * @defaultvalue 16
    */
  var beakWidth: js.UndefOr[Double] = js.native
  
  /**
    * The bounding rectangle (or callback that returns a rectangle) which the contextual menu can appear in.
    */
  var bounds: js.UndefOr[
    IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window], 
      js.UndefOr[IRectangle]
    ])
  ] = js.native
  
  /**
    * Additional custom props for the Callout.
    */
  var calloutProps: js.UndefOr[ICalloutProps] = js.native
  
  /**
    * Additional CSS class to apply to the ContextualMenu.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Custom component to use for rendering individual menu items.
    * @defaultvalue ContextualMenuItem
    */
  var contextualMenuItemAs: js.UndefOr[
    (ComponentClass[IContextualMenuItemProps, ComponentState]) | FunctionComponent[IContextualMenuItemProps]
  ] = js.native
  
  /**
    * If true, the menu will be positioned to cover the target.
    * If false, it will be positioned next to the target.
    * @defaultvalue false
    */
  var coverTarget: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the contextual menu will not be updated until focus enters the menu via other means.
    * This will only result in different behavior when `shouldFocusOnMount = false`.
    */
  var delayUpdateFocusOnHover: js.UndefOr[Boolean] = js.native
  
  /**
    * How the menu should be positioned
    * @defaultvalue DirectionalHint.bottomAutoEdge
    */
  var directionalHint: js.UndefOr[typings.officeUiFabricReact.directionalHintMod.DirectionalHint] = js.native
  
  /**
    * If true the position will not change sides in an attempt to fit the ContextualMenu within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.native
  
  /**
    * How the menu should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used.
    */
  var directionalHintForRTL: js.UndefOr[typings.officeUiFabricReact.directionalHintMod.DirectionalHint] = js.native
  
  /**
    * If true do not render on a new layer. If false render on a new layer.
    * @defaultvalue false
    */
  var doNotLayer: js.UndefOr[Boolean] = js.native
  
  /**
    * Props to pass down to the FocusZone.
    * NOTE: the default FocusZoneDirection will be used unless a direction
    * is specified in the focusZoneProps (even if other focusZoneProps are defined)
    * @defaultvalue \{ direction: FocusZoneDirection.vertical \}
    */
  var focusZoneProps: js.UndefOr[IFocusZoneProps] = js.native
  
  /**
    * The gap between the ContextualMenu and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.native
  
  /**
    * Method to provide the classnames to style the contextual menu.
    * @deprecated Use `styles` instead to leverage mergeStyles API.
    */
  var getMenuClassNames: js.UndefOr[
    js.Function2[/* theme */ ITheme, /* className */ js.UndefOr[String], IContextualMenuClassNames]
  ] = js.native
  
  /**
    * If true, renders the ContextualMenu in a hidden state.
    * Use this flag, rather than rendering a ContextualMenu conditionally based on visibility,
    * to improve rendering performance when it becomes visible.
    * Note: When ContextualMenu is hidden its content will not be rendered. It will only render
    * once the ContextualMenu is visible.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /**
    * ID for the ContextualMenu's root element (inside the callout).
    * Should be used for `aria-owns` and other such uses, rather than direct reference for programmatic purposes.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * If true then the beak is visible. If false it will not be shown.
    */
  var isBeakVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this menu is a submenu of another menu.
    */
  var isSubMenu: js.UndefOr[Boolean] = js.native
  
  /**
    * Menu items to display.
    */
  var items: js.Array[IContextualMenuItem] = js.native
  
  /**
    * Used as `aria-labelledby` for the menu element inside the callout.
    */
  var labelElementId: js.UndefOr[String] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /**
    * Callback for when the menu is being closed (removing from the DOM).
    */
  var onMenuDismissed: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[this.type], Unit]] = js.native
  
  /**
    * Callback for when the menu has been opened.
    */
  var onMenuOpened: js.UndefOr[js.Function1[/* contextualMenu */ js.UndefOr[this.type], Unit]] = js.native
  
  /**
    * Method to override the render of the list of menu items.
    */
  var onRenderMenuList: js.UndefOr[IRenderFunction[IContextualMenuListProps]] = js.native
  
  /** Custom render function for a submenu. */
  var onRenderSubMenu: js.UndefOr[IRenderFunction[IContextualMenuProps]] = js.native
  
  /**
    * Called when the component is unmounting, and focus needs to be restored.
    * Argument passed down contains two variables, the element that the underlying
    * popup believes focus should go to and whether or not the popup currently
    * contains focus. If this prop is provided, focus will not be restored automatically,
    * you'll need to call originalElement.focus()
    */
  var onRestoreFocus: js.UndefOr[js.Function1[/* options */ ContainsFocus, Unit]] = js.native
  
  /**
    * Whether to focus on the contextual menu container (as opposed to the first menu item).
    */
  var shouldFocusOnContainer: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to focus on the menu when mounted.
    * @defaultvalue true
    */
  var shouldFocusOnMount: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the menu will be updated even when `hidden=true`. Note that this will consume
    * resources to update even when nothing is being shown to the user. This might be helpful if
    * your updates are small and you want the menu to display quickly when `hidden` is set to false.
    */
  var shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles]] = js.native
  
  /**
    * Delay (in milliseconds) to wait before expanding / dismissing a submenu on mouseEnter or mouseLeave
    */
  var subMenuHoverDelay: js.UndefOr[Double] = js.native
  
  /**
    * The target that the ContextualMenu should try to position itself based on.
    * It can be either an element, a query selector string resolving to a valid element,
    * or a MouseEvent. If a MouseEvent is given, the origin point of the event will be used.
    */
  var target: js.UndefOr[Target] = js.native
  
  /**
    * Theme provided by higher-order component.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * Title to be displayed at the top of the menu, above the items.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * If true the context menu will have a minimum width equal to the width of the target element
    * @defaultvalue false
    */
  var useTargetAsMinWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * If true the context menu will render as the same width as the target element
    * @defaultvalue false
    */
  var useTargetWidth: js.UndefOr[Boolean] = js.native
}
object IContextualMenuProps {
  
  @scala.inline
  def apply(items: js.Array[IContextualMenuItem]): IContextualMenuProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuProps]
  }
  
  @scala.inline
  implicit class IContextualMenuPropsOps[Self <: IContextualMenuProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemsVarargs(value: IContextualMenuItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[IContextualMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignTargetEdge(value: Boolean): Self = this.set("alignTargetEdge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignTargetEdge: Self = this.set("alignTargetEdge", js.undefined)
    
    @scala.inline
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    
    @scala.inline
    def setBeakWidth(value: Double): Self = this.set("beakWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeakWidth: Self = this.set("beakWidth", js.undefined)
    
    @scala.inline
    def setBoundsFunction2(
      value: (/* target */ js.UndefOr[Target], /* targetWindow */ js.UndefOr[Window]) => js.UndefOr[IRectangle]
    ): Self = this.set("bounds", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBounds(
      value: IRectangle | (js.Function2[
          /* target */ js.UndefOr[Target], 
          /* targetWindow */ js.UndefOr[Window], 
          js.UndefOr[IRectangle]
        ])
    ): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setCalloutProps(value: ICalloutProps): Self = this.set("calloutProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutProps: Self = this.set("calloutProps", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContextualMenuItemAs(
      value: (ComponentClass[IContextualMenuItemProps, ComponentState]) | FunctionComponent[IContextualMenuItemProps]
    ): Self = this.set("contextualMenuItemAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextualMenuItemAs: Self = this.set("contextualMenuItemAs", js.undefined)
    
    @scala.inline
    def setCoverTarget(value: Boolean): Self = this.set("coverTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverTarget: Self = this.set("coverTarget", js.undefined)
    
    @scala.inline
    def setDelayUpdateFocusOnHover(value: Boolean): Self = this.set("delayUpdateFocusOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayUpdateFocusOnHover: Self = this.set("delayUpdateFocusOnHover", js.undefined)
    
    @scala.inline
    def setDirectionalHint(value: typings.officeUiFabricReact.directionalHintMod.DirectionalHint): Self = this.set("directionalHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHint: Self = this.set("directionalHint", js.undefined)
    
    @scala.inline
    def setDirectionalHintFixed(value: Boolean): Self = this.set("directionalHintFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHintFixed: Self = this.set("directionalHintFixed", js.undefined)
    
    @scala.inline
    def setDirectionalHintForRTL(value: typings.officeUiFabricReact.directionalHintMod.DirectionalHint): Self = this.set("directionalHintForRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectionalHintForRTL: Self = this.set("directionalHintForRTL", js.undefined)
    
    @scala.inline
    def setDoNotLayer(value: Boolean): Self = this.set("doNotLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoNotLayer: Self = this.set("doNotLayer", js.undefined)
    
    @scala.inline
    def setFocusZoneProps(value: IFocusZoneProps): Self = this.set("focusZoneProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusZoneProps: Self = this.set("focusZoneProps", js.undefined)
    
    @scala.inline
    def setGapSpace(value: Double): Self = this.set("gapSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGapSpace: Self = this.set("gapSpace", js.undefined)
    
    @scala.inline
    def setGetMenuClassNames(value: (/* theme */ ITheme, /* className */ js.UndefOr[String]) => IContextualMenuClassNames): Self = this.set("getMenuClassNames", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetMenuClassNames: Self = this.set("getMenuClassNames", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsBeakVisible(value: Boolean): Self = this.set("isBeakVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBeakVisible: Self = this.set("isBeakVisible", js.undefined)
    
    @scala.inline
    def setIsSubMenu(value: Boolean): Self = this.set("isSubMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSubMenu: Self = this.set("isSubMenu", js.undefined)
    
    @scala.inline
    def setLabelElementId(value: String): Self = this.set("labelElementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelElementId: Self = this.set("labelElementId", js.undefined)
    
    @scala.inline
    def setOnDismiss(
      value: (/* ev */ js.UndefOr[(MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element]], /* dismissAll */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("onDismiss", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setOnItemClick(
      value: (/* ev */ js.UndefOr[(MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit
    ): Self = this.set("onItemClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnItemClick: Self = this.set("onItemClick", js.undefined)
    
    @scala.inline
    def setOnMenuDismissed(value: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit): Self = this.set("onMenuDismissed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMenuDismissed: Self = this.set("onMenuDismissed", js.undefined)
    
    @scala.inline
    def setOnMenuOpened(value: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit): Self = this.set("onMenuOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMenuOpened: Self = this.set("onMenuOpened", js.undefined)
    
    @scala.inline
    def setOnRenderMenuList(
      value: (/* props */ js.UndefOr[IContextualMenuListProps], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[IContextualMenuListProps], 
            typings.react.mod.global.JSX.Element | Null
          ]
        ]) => typings.react.mod.global.JSX.Element | Null
    ): Self = this.set("onRenderMenuList", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderMenuList: Self = this.set("onRenderMenuList", js.undefined)
    
    @scala.inline
    def setOnRenderSubMenu(
      value: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[IContextualMenuProps], 
            typings.react.mod.global.JSX.Element | Null
          ]
        ]) => typings.react.mod.global.JSX.Element | Null
    ): Self = this.set("onRenderSubMenu", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderSubMenu: Self = this.set("onRenderSubMenu", js.undefined)
    
    @scala.inline
    def setOnRestoreFocus(value: /* options */ ContainsFocus => Unit): Self = this.set("onRestoreFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRestoreFocus: Self = this.set("onRestoreFocus", js.undefined)
    
    @scala.inline
    def setShouldFocusOnContainer(value: Boolean): Self = this.set("shouldFocusOnContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldFocusOnContainer: Self = this.set("shouldFocusOnContainer", js.undefined)
    
    @scala.inline
    def setShouldFocusOnMount(value: Boolean): Self = this.set("shouldFocusOnMount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldFocusOnMount: Self = this.set("shouldFocusOnMount", js.undefined)
    
    @scala.inline
    def setShouldUpdateWhenHidden(value: Boolean): Self = this.set("shouldUpdateWhenHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldUpdateWhenHidden: Self = this.set("shouldUpdateWhenHidden", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IContextualMenuStyleProps => DeepPartial[IContextualMenuStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSubMenuHoverDelay(value: Double): Self = this.set("subMenuHoverDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubMenuHoverDelay: Self = this.set("subMenuHoverDelay", js.undefined)
    
    @scala.inline
    def setTarget(value: Target): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUseTargetAsMinWidth(value: Boolean): Self = this.set("useTargetAsMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTargetAsMinWidth: Self = this.set("useTargetAsMinWidth", js.undefined)
    
    @scala.inline
    def setUseTargetWidth(value: Boolean): Self = this.set("useTargetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTargetWidth: Self = this.set("useTargetWidth", js.undefined)
  }
}
