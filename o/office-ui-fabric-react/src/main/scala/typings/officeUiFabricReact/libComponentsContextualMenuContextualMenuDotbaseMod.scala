package typings.officeUiFabricReact

import typings.officeUiFabricReact.libCommonDirectionalHintMod.DirectionalHint
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuItem
import typings.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.MouseEvent
import typings.uifabricUtilities.libPointMod.Point
import typings.uifabricUtilities.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsContextualMenuContextualMenuDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.base", "ContextualMenuBase")
  @js.native
  open class ContextualMenuBase protected () extends Component[IContextualMenuProps, IContextualMenuState, Any] {
    def this(props: IContextualMenuProps) = this()
    
    @JSName("UNSAFE_componentWillMount")
    def UNSAFE_componentWillMount_MContextualMenuBase(): Unit = js.native
    
    @JSName("UNSAFE_componentWillUpdate")
    def UNSAFE_componentWillUpdate_MContextualMenuBase(newProps: IContextualMenuProps): Unit = js.native
    
    /* private */ var _adjustedFocusZoneProps: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _cancelSubMenuTimer: Any = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _defaultMenuItemRenderer: Any = js.native
    
    /* private */ var _enterTimerId: Any = js.native
    
    /* private */ var _events: Any = js.native
    
    /* private */ var _executeItemClick: Any = js.native
    
    /* private */ var _findItemByKey: Any = js.native
    
    /**
      * Returns the item that mathes a given key if any.
      * @param key - The key of the item to match
      * @param items - The items to look for the key
      */
    /* private */ var _findItemByKeyFromItems: Any = js.native
    
    /* private */ var _focusingPreviousElement: Any = js.native
    
    /**
      * Gets the focusZoneDirection by using the arrowDirection if specified,
      * the direction specificed in the focusZoneProps, or defaults to FocusZoneDirection.vertical
      */
    /* private */ var _getFocusZoneDirection: Any = js.native
    
    /* private */ var _getSubmenuProps: Any = js.native
    
    /* private */ var _gotMouseMove: Any = js.native
    
    /* private */ var _host: Any = js.native
    
    /* private */ var _id: Any = js.native
    
    /**
      * Returns true if the key for the event is alt (Mac option) or meta (Mac command).
      */
    /* private */ var _isAltOrMeta: Any = js.native
    
    /**
      * Return whether the contextual menu is hidden.
      * Undefined value for hidden is equivalent to hidden being false.
      * @param props - Props for the component
      */
    /* private */ var _isHidden: Any = js.native
    
    /* private */ var _isScrollIdle: Any = js.native
    
    /**
      * Calls `shouldHandleKey` to determine whether the keyboard event should be handled;
      * if so, stops event propagation and dismisses menu(s).
      * @param ev - The keyboard event.
      * @param shouldHandleKey - Returns whether we should handle this keyboard event.
      * @param dismissAllMenus - If true, dismiss all menus. Otherwise, dismiss only the current menu.
      * Only does anything if `shouldHandleKey` returns true.
      * @returns Whether the event was handled.
      */
    /* private */ var _keyHandler: Any = js.native
    
    /** True if the most recent keydown event was for alt (option) or meta (command). */
    /* private */ var _lastKeyDownWasAltOrMeta: Any = js.native
    
    /* private */ var _mounted: Any = js.native
    
    /* private */ var _onAnchorClick: Any = js.native
    
    /* private */ var _onItemClick: Any = js.native
    
    /* private */ var _onItemClickBase: Any = js.native
    
    /* private */ var _onItemKeyDown: Any = js.native
    
    /* private */ var _onItemMouseDown: Any = js.native
    
    /* private */ var _onItemMouseEnterBase: Any = js.native
    
    /* private */ var _onItemMouseMoveBase: Any = js.native
    
    /* private */ var _onItemSubMenuExpand: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onKeyUp: Any = js.native
    
    /* private */ var _onMenuClosed: Any = js.native
    
    /* private */ var _onMenuFocusCapture: Any = js.native
    
    /* private */ var _onMenuKeyDown: Any = js.native
    
    /* private */ var _onMenuOpened: Any = js.native
    
    /* private */ var _onMouseItemLeave: Any = js.native
    
    /* private */ var _onPointerAndTouchEvent: Any = js.native
    
    /* private */ var _onRenderMenuList: Any = js.native
    
    /* private */ var _onRenderSubMenu: Any = js.native
    
    /**
      * Scroll handler for the callout to make sure the mouse events
      * for updating focus are not interacting during scroll
      */
    /* private */ var _onScroll: Any = js.native
    
    /**
      * This function is called ASYNCHRONOUSLY, and so there is a chance it is called
      * after the component is unmounted. The _mounted property is added to prevent
      * from calling setState() after unmount. Do NOT copy this pattern in synchronous
      * code.
      */
    /* private */ var _onSubMenuDismiss: Any = js.native
    
    /* private */ var _previousActiveElement: Any = js.native
    
    /* private */ var _renderAnchorMenuItem: Any = js.native
    
    /* private */ var _renderButtonItem: Any = js.native
    
    /* private */ var _renderHeaderMenuItem: Any = js.native
    
    /* private */ var _renderListItem: Any = js.native
    
    /**
      * !!!IMPORTANT!!! Avoid mutating `item: IContextualMenuItem` argument. It will
      * cause the menu items to always re-render because the component update is based on shallow comparison.
      */
    /* private */ var _renderMenuItem: Any = js.native
    
    /* private */ var _renderNormalItem: Any = js.native
    
    /* private */ var _renderSectionItem: Any = js.native
    
    /* private */ var _renderSeparator: Any = js.native
    
    /* private */ var _renderSplitButton: Any = js.native
    
    /* private */ var _scrollIdleTimeoutId: Any = js.native
    
    /* private */ var _setTargetWindowAndElement: Any = js.native
    
    /**
      * Checks if the submenu should be closed
      */
    /* private */ var _shouldCloseSubMenu: Any = js.native
    
    /* private */ var _shouldHandleKeyDown: Any = js.native
    
    /**
      * We close the menu on key up only if ALL of the following are true:
      * - Most recent key down was alt or meta (command)
      * - The alt/meta key down was NOT followed by some other key (such as down/up arrow to
      *   expand/collapse the menu)
      * - We're not on a Mac (or iOS)
      *
      * This is because on Windows, pressing alt moves focus to the application menu bar or similar,
      * closing any open context menus. There is not a similar behavior on Macs.
      */
    /* private */ var _shouldHandleKeyUp: Any = js.native
    
    /* private */ var _shouldIgnoreMouseEvent: Any = js.native
    
    /* private */ var _shouldUpdateFocusOnMouseEvent: Any = js.native
    
    /* private */ var _target: Any = js.native
    
    /* private */ var _targetWindow: Any = js.native
    
    /* private */ var _tryFocusPreviousActiveElement: Any = js.native
    
    /**
      * Handles updating focus when mouseEnter or mouseMove fire.
      * As part of updating focus, This function will also update
      * the expand/collapse state accordingly.
      */
    /* private */ var _updateFocusOnMouseEvent: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MContextualMenuBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MContextualMenuBase(): Unit = js.native
    
    def dismiss(): Unit = js.native
    def dismiss(ev: Any): Unit = js.native
    def dismiss(ev: Any, dismissAll: Boolean): Unit = js.native
    def dismiss(ev: Unit, dismissAll: Boolean): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MContextualMenuBase(newProps: IContextualMenuProps, newState: IContextualMenuState): Boolean = js.native
  }
  /* static members */
  object ContextualMenuBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.base", "ContextualMenuBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.base", "ContextualMenuBase.defaultProps")
    @js.native
    def defaultProps: IContextualMenuProps = js.native
    inline def defaultProps_=(x: IContextualMenuProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def canAnyMenuItemsCheck(items: js.Array[IContextualMenuItem]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canAnyMenuItemsCheck")(items.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getSubmenuItems(item: IContextualMenuItem): js.UndefOr[js.Array[IContextualMenuItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSubmenuItems")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[IContextualMenuItem]]]
  inline def getSubmenuItems(item: IContextualMenuItem, options: typings.officeUiFabricReact.anon.Target): js.UndefOr[js.Array[IContextualMenuItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSubmenuItems")(item.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[IContextualMenuItem]]]
  
  trait IContextualMenuState extends StObject {
    
    var contextualMenuItems: js.UndefOr[js.Array[IContextualMenuItem]] = js.undefined
    
    var contextualMenuTarget: js.UndefOr[Element] = js.undefined
    
    var dismissedMenuItemKey: js.UndefOr[String] = js.undefined
    
    /** True if the menu was expanded by mouse click OR hover (as opposed to by keyboard) */
    var expandedByMouseClick: js.UndefOr[Boolean] = js.undefined
    
    var expandedMenuItemKey: js.UndefOr[String] = js.undefined
    
    var positions: js.UndefOr[Any] = js.undefined
    
    var slideDirectionalClassName: js.UndefOr[String] = js.undefined
    
    var subMenuId: js.UndefOr[String] = js.undefined
    
    var submenuDirection: js.UndefOr[DirectionalHint] = js.undefined
    
    var submenuTarget: js.UndefOr[Element] = js.undefined
  }
  object IContextualMenuState {
    
    inline def apply(): IContextualMenuState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IContextualMenuState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IContextualMenuState] (val x: Self) extends AnyVal {
      
      inline def setContextualMenuItems(value: js.Array[IContextualMenuItem]): Self = StObject.set(x, "contextualMenuItems", value.asInstanceOf[js.Any])
      
      inline def setContextualMenuItemsUndefined: Self = StObject.set(x, "contextualMenuItems", js.undefined)
      
      inline def setContextualMenuItemsVarargs(value: IContextualMenuItem*): Self = StObject.set(x, "contextualMenuItems", js.Array(value*))
      
      inline def setContextualMenuTarget(value: Element): Self = StObject.set(x, "contextualMenuTarget", value.asInstanceOf[js.Any])
      
      inline def setContextualMenuTargetUndefined: Self = StObject.set(x, "contextualMenuTarget", js.undefined)
      
      inline def setDismissedMenuItemKey(value: String): Self = StObject.set(x, "dismissedMenuItemKey", value.asInstanceOf[js.Any])
      
      inline def setDismissedMenuItemKeyUndefined: Self = StObject.set(x, "dismissedMenuItemKey", js.undefined)
      
      inline def setExpandedByMouseClick(value: Boolean): Self = StObject.set(x, "expandedByMouseClick", value.asInstanceOf[js.Any])
      
      inline def setExpandedByMouseClickUndefined: Self = StObject.set(x, "expandedByMouseClick", js.undefined)
      
      inline def setExpandedMenuItemKey(value: String): Self = StObject.set(x, "expandedMenuItemKey", value.asInstanceOf[js.Any])
      
      inline def setExpandedMenuItemKeyUndefined: Self = StObject.set(x, "expandedMenuItemKey", js.undefined)
      
      inline def setPositions(value: Any): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
      
      inline def setSlideDirectionalClassName(value: String): Self = StObject.set(x, "slideDirectionalClassName", value.asInstanceOf[js.Any])
      
      inline def setSlideDirectionalClassNameUndefined: Self = StObject.set(x, "slideDirectionalClassName", js.undefined)
      
      inline def setSubMenuId(value: String): Self = StObject.set(x, "subMenuId", value.asInstanceOf[js.Any])
      
      inline def setSubMenuIdUndefined: Self = StObject.set(x, "subMenuId", js.undefined)
      
      inline def setSubmenuDirection(value: DirectionalHint): Self = StObject.set(x, "submenuDirection", value.asInstanceOf[js.Any])
      
      inline def setSubmenuDirectionUndefined: Self = StObject.set(x, "submenuDirection", js.undefined)
      
      inline def setSubmenuTarget(value: Element): Self = StObject.set(x, "submenuTarget", value.asInstanceOf[js.Any])
      
      inline def setSubmenuTargetUndefined: Self = StObject.set(x, "submenuTarget", js.undefined)
    }
  }
  
  type Target = Element | String | MouseEvent | Point | Rectangle | Null | RefObject[Element]
}
