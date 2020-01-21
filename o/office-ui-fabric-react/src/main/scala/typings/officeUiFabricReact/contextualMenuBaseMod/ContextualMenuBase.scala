package typings.officeUiFabricReact.contextualMenuBaseMod

import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.base", "ContextualMenuBase")
@js.native
class ContextualMenuBase protected () extends BaseComponent[IContextualMenuProps, IContextualMenuState] {
  def this(props: IContextualMenuProps) = this()
  var _adjustedFocusZoneProps: js.Any = js.native
  var _cancelSubMenuTimer: js.Any = js.native
  var _classNames: js.Any = js.native
  var _enterTimerId: js.Any = js.native
  var _executeItemClick: js.Any = js.native
  var _findItemByKey: js.Any = js.native
  /**
    * Returns the item that mathes a given key if any.
    * @param key - The key of the item to match
    * @param items - The items to look for the key
    */
  var _findItemByKeyFromItems: js.Any = js.native
  /**
    * Gets the focusZoneDirection by using the arrowDirection if specified,
    * the direction specificed in the focusZoneProps, or defaults to FocusZoneDirection.vertical
    */
  var _getFocusZoneDirection: js.Any = js.native
  var _getSubMenuId: js.Any = js.native
  var _getSubmenuProps: js.Any = js.native
  var _gotMouseMove: js.Any = js.native
  var _host: js.Any = js.native
  var _id: js.Any = js.native
  /**
    * Returns true if the key for the event is alt (Mac option) or meta (Mac command).
    */
  var _isAltOrMeta: js.Any = js.native
  var _isFocusingPreviousElement: js.Any = js.native
  /**
    * Return whether the contextual menu is hidden.
    * Undefined value for hidden is equivalent to hidden being false.
    * @param props - Props for the component
    */
  var _isHidden: js.Any = js.native
  var _isScrollIdle: js.Any = js.native
  /**
    * Calls `shouldHandleKey` to determine whether the keyboard event should be handled;
    * if so, stops event propagation and dismisses menu(s).
    * @param ev - The keyboard event.
    * @param shouldHandleKey - Returns whether we should handle this keyboard event.
    * @param dismissAllMenus - If true, dismiss all menus. Otherwise, dismiss only the current menu.
    * Only does anything if `shouldHandleKey` returns true.
    * @returns Whether the event was handled.
    */
  var _keyHandler: js.Any = js.native
  /** True if the most recent keydown event was for alt (option) or meta (command). */
  var _lastKeyDownWasAltOrMeta: js.Any = js.native
  var _mounted: js.Any = js.native
  var _onAnchorClick: js.Any = js.native
  var _onItemClick: js.Any = js.native
  var _onItemClickBase: js.Any = js.native
  var _onItemKeyDown: js.Any = js.native
  var _onItemMouseDown: js.Any = js.native
  var _onItemMouseEnterBase: js.Any = js.native
  var _onItemMouseMoveBase: js.Any = js.native
  var _onItemSubMenuExpand: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onKeyUp: js.Any = js.native
  var _onMenuClosed: js.Any = js.native
  var _onMenuFocusCapture: js.Any = js.native
  var _onMenuKeyDown: js.Any = js.native
  var _onMenuOpened: js.Any = js.native
  var _onMouseItemLeave: js.Any = js.native
  var _onPointerAndTouchEvent: js.Any = js.native
  var _onRenderMenuList: js.Any = js.native
  var _onRenderSubMenu: js.Any = js.native
  /**
    * Scroll handler for the callout to make sure the mouse events
    * for updating focus are not interacting during scroll
    */
  var _onScroll: js.Any = js.native
  /**
    * This function is called ASYNCHRONOUSLY, and so there is a chance it is called
    * after the component is unmounted. The _mounted property is added to prevent
    * from calling setState() after unmount. Do NOT copy this pattern in synchronous
    * code.
    */
  var _onSubMenuDismiss: js.Any = js.native
  var _previousActiveElement: js.Any = js.native
  var _renderAnchorMenuItem: js.Any = js.native
  var _renderButtonItem: js.Any = js.native
  var _renderHeaderMenuItem: js.Any = js.native
  var _renderListItem: js.Any = js.native
  var _renderMenuItem: js.Any = js.native
  var _renderNormalItem: js.Any = js.native
  var _renderSectionItem: js.Any = js.native
  var _renderSeparator: js.Any = js.native
  var _renderSplitButton: js.Any = js.native
  var _scrollIdleTimeoutId: js.Any = js.native
  var _setTargetWindowAndElement: js.Any = js.native
  /**
    * Checks if the submenu should be closed
    */
  var _shouldCloseSubMenu: js.Any = js.native
  var _shouldHandleKeyDown: js.Any = js.native
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
  var _shouldHandleKeyUp: js.Any = js.native
  var _shouldIgnoreMouseEvent: js.Any = js.native
  var _shouldUpdateFocusOnMouseEvent: js.Any = js.native
  var _target: js.Any = js.native
  var _targetWindow: js.Any = js.native
  var _tryFocusPreviousActiveElement: js.Any = js.native
  /**
    * Handles updating focus when mouseEnter or mouseMove fire.
    * As part of updating focus, This function will also update
    * the expand/collapse state accordingly.
    */
  var _updateFocusOnMouseEvent: js.Any = js.native
  @JSName("UNSAFE_componentWillMount")
  def UNSAFE_componentWillMount_MContextualMenuBase(): Unit = js.native
  @JSName("UNSAFE_componentWillUpdate")
  def UNSAFE_componentWillUpdate_MContextualMenuBase(newProps: IContextualMenuProps): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MContextualMenuBase(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MContextualMenuBase(): Unit = js.native
  def dismiss(): Unit = js.native
  def dismiss(ev: js.Any): Unit = js.native
  def dismiss(ev: js.Any, dismissAll: Boolean): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MContextualMenuBase(newProps: IContextualMenuProps, newState: IContextualMenuState): Boolean = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.base", "ContextualMenuBase")
@js.native
object ContextualMenuBase extends js.Object {
  var defaultProps: IContextualMenuProps = js.native
}

