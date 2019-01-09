package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.base", "DetailsHeaderBase")
@js.native
class DetailsHeaderBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod.IDetailsHeaderBaseProps, 
      IDetailsHeaderState
    ]
     with IDetailsHeader {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod.IDetailsHeaderBaseProps) = this()
  var _classNames: js.Any = js.native
  /**
    * Based on the given cursor position, finds the nearest drop hint and updates the state to make it visible
    *
    */
  var _computeDropHintToBeShown: js.Any = js.native
  var _currentDropHintIndex: js.Any = js.native
  var _dragDropHelper: js.Any = js.native
  var _draggedColumnIndex: js.Any = js.native
  var _dropHintDetails: js.Any = js.native
  var _getDropHintPositions: js.Any = js.native
  var _id: js.Any = js.native
  var _onDropIndexInfo: js.Any = js.native
  var _onRenderColumnHeaderTooltip: js.Any = js.native
  var _onRootKeyDown: js.Any = js.native
  var _onRootMouseDown: js.Any = js.native
  var _onRootMouseMove: js.Any = js.native
  var _onRootRef: js.Any = js.native
  /**
    * Called when the select all toggle is clicked.
    */
  var _onSelectAllClicked: js.Any = js.native
  var _onSizerBlur: js.Any = js.native
  /**
    * mouse move event handler in the header
    * it will set isSizing state to true when user clicked on the sizer and move the mouse.
    *
    * @private
    * @param {React.MouseEvent} ev (mouse move event)
    */
  var _onSizerMouseMove: js.Any = js.native
  /**
    * mouse up event handler in the header
    * clear the resize related state.
    * This is to ensure we can catch double click event
    *
    * @private
    * @param {React.MouseEvent} ev (mouse up event)
    */
  var _onSizerMouseUp: js.Any = js.native
  var _renderColumnSizer: js.Any = js.native
  var _rootComponent: js.Any = js.native
  var _rootElement: js.Any = js.native
  var _subscriptionObject: js.Any = js.native
  /* private */ def _getHeaderDragDropOptions(): js.Any = js.native
  /* private */ def _isAfter(a: js.Any, b: js.Any): js.Any = js.native
  /* private */ def _isBefore(a: js.Any, b: js.Any): js.Any = js.native
  /**
    * @returns whether or not the "Select All" checkbox column is hidden.
    */
  /* private */ def _isCheckboxColumnHidden(): js.Any = js.native
  /* private */ def _isEventOnHeader(event: js.Any): js.Any = js.native
  /* private */ def _isValidCurrentDropHintIndex(): js.Any = js.native
  /* private */ def _liesBetween(target: js.Any, left: js.Any, right: js.Any): js.Any = js.native
  /* private */ def _onDragOver(item: js.Any, event: js.Any): js.Any = js.native
  /* private */ def _onDrop(): js.Any = js.native
  /* private */ def _onDrop(item: js.Any): js.Any = js.native
  /* private */ def _onDrop(item: js.Any, event: js.Any): js.Any = js.native
  /* private */ def _onSelectionChanged(): js.Any = js.native
  /**
    * double click on the column sizer will auto ajust column width
    * to fit the longest content among current rendered rows.
    *
    * @private
    * @param {number} columnIndex (index of the column user double clicked)
    * @param {React.MouseEvent} ev (mouse double click event)
    */
  /* private */ def _onSizerDoubleClick(columnIndex: js.Any, ev: js.Any): js.Any = js.native
  /* private */ def _onToggleCollapseAll(): js.Any = js.native
  /* private */ def _renderColumnDivider(columnIndex: js.Any): js.Any = js.native
  /* private */ def _renderDropHint(dropHintIndex: js.Any): js.Any = js.native
  /* private */ def _resetDropHints(): js.Any = js.native
  /* private */ def _updateDragInfo(props: js.Any): js.Any = js.native
  /* private */ def _updateDragInfo(props: js.Any, event: js.Any): js.Any = js.native
  /* private */ def _updateDropHintElement(element: js.Any, displayProperty: js.Any): js.Any = js.native
  /* private */ def _updateDroppingState(newValue: js.Any, event: js.Any): js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDetailsHeaderBase(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDetailsHeaderBase(
    prevProps: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod.IDetailsHeaderBaseProps
  ): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDetailsHeaderBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsHeaderDotTypesMod.IDetailsHeaderBaseProps
  ): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDetailsHeaderBase(): scala.Unit = js.native
  /* CompleteClass */
  override def focus(): scala.Boolean = js.native
}

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsHeader.base", "DetailsHeaderBase")
@js.native
object DetailsHeaderBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_CollapseAllVisibility = js.native
}

