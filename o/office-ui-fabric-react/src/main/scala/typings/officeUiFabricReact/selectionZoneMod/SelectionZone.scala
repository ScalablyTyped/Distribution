package typings.officeUiFabricReact.selectionZoneMod

import typings.officeUiFabricReact.anon.IsSelectedOnFocus
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/selection/SelectionZone", "SelectionZone")
@js.native
class SelectionZone protected ()
  extends Component[ISelectionZoneProps, ISelectionZoneState, js.Any] {
  def this(props: ISelectionZoneProps) = this()
  var _async: js.Any = js.native
  var _clearAndSelectIndex: js.Any = js.native
  var _events: js.Any = js.native
  var _findItemRoot: js.Any = js.native
  /**
    * To avoid high startup cost of traversing the DOM on component mount,
    * defer finding the scrollable parent until a click interaction.
    *
    * The styles will probably already calculated since we're running in a click handler,
    * so this is less likely to cause layout thrashing then doing it in mount.
    */
  var _findScrollParentAndTryClearOnEmptyClick: js.Any = js.native
  var _getItemIndex: js.Any = js.native
  var _getSelectionMode: js.Any = js.native
  var _handleNextFocus: js.Any = js.native
  var _hasAttribute: js.Any = js.native
  var _isCtrlPressed: js.Any = js.native
  var _isInputElement: js.Any = js.native
  var _isMetaPressed: js.Any = js.native
  var _isNonHandledClick: js.Any = js.native
  var _isSelectionDisabled: js.Any = js.native
  var _isShiftPressed: js.Any = js.native
  var _isTabPressed: js.Any = js.native
  var _isTouch: js.Any = js.native
  var _isTouchTimeoutId: js.Any = js.native
  var _onClick: js.Any = js.native
  var _onContextMenu: js.Any = js.native
  /**
    * In multi selection, if you double click within an item's root (but not within the invoke element or
    * input elements), we should execute the invoke handler.
    */
  var _onDoubleClick: js.Any = js.native
  /**
    * When we focus an item, for single/multi select scenarios, we should try to select it immediately
    * as long as the focus did not originate from a mouse down/touch event. For those cases, we handle them
    * specially.
    */
  var _onFocus: js.Any = js.native
  var _onInvokeClick: js.Any = js.native
  var _onInvokeMouseDown: js.Any = js.native
  var _onItemSurfaceClick: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onKeyDownCapture: js.Any = js.native
  var _onMouseDown: js.Any = js.native
  var _onMouseDownCapture: js.Any = js.native
  var _onSelectionChange: js.Any = js.native
  var _onToggleAllClick: js.Any = js.native
  var _onToggleClick: js.Any = js.native
  var _onTouchStartCapture: js.Any = js.native
  var _root: js.Any = js.native
  var _setIsTouch: js.Any = js.native
  var _shouldAutoSelect: js.Any = js.native
  var _shouldHandleFocus: js.Any = js.native
  var _shouldHandleFocusTimeoutId: js.Any = js.native
  var _tryClearOnEmptyClick: js.Any = js.native
  /**
    * We need to track the modifier key states so that when focus events occur, which do not contain
    * modifier states in the Event object, we know how to behave.
    */
  var _updateModifiers: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSelectionZone(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSelectionZone(previousProps: ISelectionZoneProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSelectionZone(): Unit = js.native
  /**
    * In some cases, the consuming scenario requires to set focus on a row without having SelectionZone
    * react to the event. Note that focus events in IE \<= 11 will occur asynchronously after .focus() has
    * been called on an element, so we need a flag to store the idea that we will bypass the "next"
    * focus event that occurs. This method does that.
    */
  def ignoreNextFocus(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/utilities/selection/SelectionZone", "SelectionZone")
@js.native
object SelectionZone extends js.Object {
  var defaultProps: IsSelectedOnFocus = js.native
  def getDerivedStateFromProps(nextProps: ISelectionZoneProps, prevState: ISelectionZoneState): ISelectionZoneState = js.native
}

