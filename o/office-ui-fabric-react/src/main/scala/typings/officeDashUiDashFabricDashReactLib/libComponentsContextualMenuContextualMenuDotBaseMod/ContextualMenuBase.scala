package typings
package officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.base", "ContextualMenuBase")
@js.native
class ContextualMenuBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps, 
      IContextualMenuState
    ] {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps) = this()
  var _adjustedFocusZoneProps: js.Any = js.native
  var _cancelSubMenuTimer: js.Any = js.native
  var _classNames: js.Any = js.native
  var _enterTimerId: js.Any = js.native
  var _executeItemClick: js.Any = js.native
  var _getSubMenuId: js.Any = js.native
  var _gotMouseMove: js.Any = js.native
  var _host: js.Any = js.native
  var _isFocusingPreviousElement: js.Any = js.native
  var _isScrollIdle: js.Any = js.native
  /**
       * Calls `shouldHandleKey` to determine whether the keyboard event should be handled;
       * if so, stops event propagation and dismisses menu(s).
       * @param ev The keyboard event.
       * @param shouldHandleKey Returns whether we should handle this keyboard event.
       * @param dismissAllMenus If true, dismiss all menus. Otherwise, dismiss only the current menu.
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
  var _onMenuFocusCapture: js.Any = js.native
  var _onMenuKeyDown: js.Any = js.native
  var _onMouseItemLeave: js.Any = js.native
  var _onPointerAndTouchEvent: js.Any = js.native
  var _onRenderMenuList: js.Any = js.native
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
  var _scrollIdleTimeoutId: js.Any = js.native
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
  var _shouldUpdateFocusOnMouseEvent: js.Any = js.native
  var _target: js.Any = js.native
  var _targetWindow: js.Any = js.native
  /* private */ def _findItemByKey(key: js.Any): js.Any = js.native
  /**
       * Returns the item that mathes a given key if any.
       * @param key The key of the item to match
       * @param items The items to look for the key
       */
  /* private */ def _findItemByKeyFromItems(key: js.Any, items: js.Any): js.Any = js.native
  /**
       * Gets the focusZoneDirection by using the arrowDirection if specified,
       * the direction specificed in the focusZoneProps, or defaults to FocusZoneDirection.vertical
       */
  /* private */ def _getFocusZoneDirection(): js.Any = js.native
  /* private */ def _getSubmenuProps(): js.Any = js.native
  /**
       * Returns true if the key for the event is alt (Mac option) or meta (Mac command).
       */
  /* private */ def _isAltOrMeta(ev: js.Any): js.Any = js.native
  /* private */ def _onMenuClosed(): js.Any = js.native
  /* private */ def _onMenuOpened(): js.Any = js.native
  /* private */ def _onRenderSubMenu(subMenuProps: js.Any): js.Any = js.native
  /* private */ def _renderAnchorMenuItem(
    item: js.Any,
    classNames: js.Any,
    index: js.Any,
    focusableElementIndex: js.Any,
    totalItemCount: js.Any,
    hasCheckmarks: js.Any,
    hasIcons: js.Any
  ): js.Any = js.native
  /* private */ def _renderButtonItem(
    item: js.Any,
    classNames: js.Any,
    index: js.Any,
    focusableElementIndex: js.Any,
    totalItemCount: js.Any
  ): js.Any = js.native
  /* private */ def _renderButtonItem(
    item: js.Any,
    classNames: js.Any,
    index: js.Any,
    focusableElementIndex: js.Any,
    totalItemCount: js.Any,
    hasCheckmarks: js.Any
  ): js.Any = js.native
  /* private */ def _renderButtonItem(
    item: js.Any,
    classNames: js.Any,
    index: js.Any,
    focusableElementIndex: js.Any,
    totalItemCount: js.Any,
    hasCheckmarks: js.Any,
    hasIcons: js.Any
  ): js.Any = js.native
  /* private */ def _renderHeaderMenuItem(item: js.Any, classNames: js.Any, index: js.Any, hasCheckmarks: js.Any, hasIcons: js.Any): js.Any = js.native
  /* private */ def _renderListItem(content: js.Any, key: js.Any, classNames: js.Any): js.Any = js.native
  /* private */ def _renderListItem(content: js.Any, key: js.Any, classNames: js.Any, title: js.Any): js.Any = js.native
  /* private */ def _renderMenuItem(
    item: js.Any,
    index: js.Any,
    focusableElementIndex: js.Any,
    totalItemCount: js.Any,
    hasCheckmarks: js.Any,
    hasIcons: js.Any
  ): js.Any = js.native
  /* private */ def _renderNormalItem(
    item: js.Any,
    classNames: js.Any,
    index: js.Any,
    focusableElementIndex: js.Any,
    totalItemCount: js.Any,
    hasCheckmarks: js.Any,
    hasIcons: js.Any
  ): js.Any = js.native
  /* private */ def _renderSectionItem(item: js.Any, menuClassNames: js.Any, index: js.Any, hasCheckmarks: js.Any, hasIcons: js.Any): js.Any = js.native
  /* private */ def _renderSeparator(index: js.Any, classNames: js.Any): js.Any = js.native
  /* private */ def _renderSeparator(index: js.Any, classNames: js.Any, top: js.Any): js.Any = js.native
  /* private */ def _renderSeparator(index: js.Any, classNames: js.Any, top: js.Any, fromSection: js.Any): js.Any = js.native
  /* private */ def _renderSplitButton(
    item: js.Any,
    classNames: js.Any,
    index: js.Any,
    focusableElementIndex: js.Any,
    totalItemCount: js.Any
  ): js.Any = js.native
  /* private */ def _renderSplitButton(
    item: js.Any,
    classNames: js.Any,
    index: js.Any,
    focusableElementIndex: js.Any,
    totalItemCount: js.Any,
    hasCheckmarks: js.Any
  ): js.Any = js.native
  /* private */ def _renderSplitButton(
    item: js.Any,
    classNames: js.Any,
    index: js.Any,
    focusableElementIndex: js.Any,
    totalItemCount: js.Any,
    hasCheckmarks: js.Any,
    hasIcons: js.Any
  ): js.Any = js.native
  /* private */ def _setTargetWindowAndElement(target: js.Any): js.Any = js.native
  /* private */ def _shouldIgnoreMouseEvent(): js.Any = js.native
  /**
       * Handles updating focus when mouseEnter or mouseMove fire.
       * As part of updating focus, This function will also update
       * the expand/collapse state accordingly.
       */
  /* private */ def _updateFocusOnMouseEvent(item: js.Any, ev: js.Any): js.Any = js.native
  /**
       * Handles updating focus when mouseEnter or mouseMove fire.
       * As part of updating focus, This function will also update
       * the expand/collapse state accordingly.
       */
  /* private */ def _updateFocusOnMouseEvent(item: js.Any, ev: js.Any, target: js.Any): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MContextualMenuBase(): scala.Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MContextualMenuBase(): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MContextualMenuBase(): scala.Unit = js.native
  @JSName("componentWillUpdate")
  def componentWillUpdate_MContextualMenuBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps
  ): scala.Unit = js.native
  def dismiss(): scala.Unit = js.native
  def dismiss(ev: js.Any): scala.Unit = js.native
  def dismiss(ev: js.Any, dismissAll: scala.Boolean): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenu.base", "ContextualMenuBase")
@js.native
object ContextualMenuBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps = js.native
}

