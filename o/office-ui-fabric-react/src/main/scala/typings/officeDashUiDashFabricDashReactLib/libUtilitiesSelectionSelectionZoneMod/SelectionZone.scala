package typings
package officeDashUiDashFabricDashReactLib.libUtilitiesSelectionSelectionZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/selection/SelectionZone", "SelectionZone")
@js.native
class SelectionZone ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[ISelectionZoneProps, js.Object] {
  var _isCtrlPressed: js.Any = js.native
  var _isMetaPressed: js.Any = js.native
  var _isShiftPressed: js.Any = js.native
  var _isTabPressed: js.Any = js.native
  var _isTouch: js.Any = js.native
  var _isTouchTimeoutId: js.Any = js.native
  var _onClick: js.Any = js.native
  var _onContextMenu: js.Any = js.native
  /**
       * In multi selection, if you double click within an item's root (but not within the invoke element or input elements),
       * we should execute the invoke handler.
       */
  var _onDoubleClick: js.Any = js.native
  /**
       * When we focus an item, for single/multi select scenarios, we should try to select it immediately
       * as long as the focus did not originate from a mouse down/touch event. For those cases, we handle them
       * specially.
       */
  var _onFocus: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onKeyDownCapture: js.Any = js.native
  var _onMouseDown: js.Any = js.native
  var _onMouseDownCapture: js.Any = js.native
  var _onTouchStartCapture: js.Any = js.native
  var _root: js.Any = js.native
  var _shouldHandleFocus: js.Any = js.native
  var _shouldHandleFocusTimeoutId: js.Any = js.native
  /* private */ def _clearAndSelectIndex(index: js.Any): js.Any = js.native
  /* private */ def _findItemRoot(target: js.Any): js.Any = js.native
  /* private */ def _getItemIndex(itemRoot: js.Any): js.Any = js.native
  /* private */ def _getSelectionMode(): js.Any = js.native
  /* private */ def _handleNextFocus(handleFocus: js.Any): js.Any = js.native
  /* private */ def _hasAttribute(element: js.Any, attributeName: js.Any): js.Any = js.native
  /* private */ def _isInputElement(element: js.Any): js.Any = js.native
  /* private */ def _isNonHandledClick(element: js.Any): js.Any = js.native
  /* private */ def _isSelectionDisabled(target: js.Any): js.Any = js.native
  /* private */ def _onInvokeClick(ev: js.Any, index: js.Any): js.Any = js.native
  /* private */ def _onInvokeMouseDown(ev: js.Any, index: js.Any): js.Any = js.native
  /* private */ def _onItemSurfaceClick(ev: js.Any, index: js.Any): js.Any = js.native
  /* private */ def _onToggleAllClick(ev: js.Any): js.Any = js.native
  /* private */ def _onToggleClick(ev: js.Any, index: js.Any): js.Any = js.native
  /* private */ def _setIsTouch(isTouch: js.Any): js.Any = js.native
  /* private */ def _shouldAutoSelect(element: js.Any): js.Any = js.native
  /* private */ def _tryClearOnEmptyClick(ev: js.Any): js.Any = js.native
  /**
       * We need to track the modifier key states so that when focus events occur, which do not contain
       * modifier states in the Event object, we know how to behave.
       */
  /* private */ def _updateModifiers(ev: js.Any): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSelectionZone(): scala.Unit = js.native
  /**
       * In some cases, the consuming scenario requires to set focus on a row without having SelectionZone
       * react to the event. Note that focus events in IE <= 11 will occur asynchronously after .focus() has
       * been called on an element, so we need a flag to store the idea that we will bypass the "next"
       * focus event that occurs. This method does that.
       */
  def ignoreNextFocus(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/utilities/selection/SelectionZone", "SelectionZone")
@js.native
object SelectionZone extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_IsMultiSelectEnabled = js.native
}

