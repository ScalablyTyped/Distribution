package typings
package officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.base", "DetailsListBase")
@js.native
class DetailsListBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListProps, 
      IDetailsListState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IDetailsList {
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListProps) = this()
  var _activeRows: js.Any = js.native
  var _columnOverrides: js.Any = js.native
  var _dragDropHelper: js.Any = js.native
  var _focusZone: js.Any = js.native
  var _groupedList: js.Any = js.native
  var _header: js.Any = js.native
  var _initialFocusedIndex: js.Any = js.native
  var _list: js.Any = js.native
  var _onRenderDetailsFooter: js.Any = js.native
  var _onRenderDetailsHeader: js.Any = js.native
  var _onRenderListCell: js.Any = js.native
  var _pendingForceUpdate: js.Any = js.native
  var _root: js.Any = js.native
  var _selection: js.Any = js.native
  var _selectionZone: js.Any = js.native
  /* private */ def _adjustColumns(newProps: js.Any): js.Any = js.native
  /* private */ def _adjustColumns(newProps: js.Any, forceUpdate: js.Any): js.Any = js.native
  /* private */ def _adjustColumns(newProps: js.Any, forceUpdate: js.Any, resizingColumnIndex: js.Any): js.Any = js.native
  /* private */ def _forceListUpdates(): js.Any = js.native
  /** Returns adjusted columns, given the viewport size and layout mode. */
  /* private */ def _getAdjustedColumns(newProps: js.Any): js.Any = js.native
  /* private */ def _getAdjustedColumns(newProps: js.Any, forceUpdate: js.Any): js.Any = js.native
  /* private */ def _getAdjustedColumns(newProps: js.Any, forceUpdate: js.Any, resizingColumnIndex: js.Any): js.Any = js.native
  /* private */ def _getColumnOverride(key: js.Any): js.Any = js.native
  /* private */ def _getColumnReorderProps(): js.Any = js.native
  /* private */ def _getDetailsFooterProps(): js.Any = js.native
  /** Builds a set of columns based on the given columns mixed with the current overrides. */
  /* private */ def _getFixedColumns(newColumns: js.Any): js.Any = js.native
  /* private */ def _getGroupNestingDepth(): js.Any = js.native
  /* private */ def _getGroupProps(detailsGroupProps: js.Any): js.Any = js.native
  /* private */ def _getItemKey(item: js.Any, itemIndex: js.Any): js.Any = js.native
  /** Builds a set of columns to fix within the viewport width. */
  /* private */ def _getJustifiedColumns(newColumns: js.Any, viewportWidth: js.Any, props: js.Any, firstIndex: js.Any): js.Any = js.native
  /* private */ def _getJustifiedColumnsAfterResize(newColumns: js.Any, viewportWidth: js.Any, props: js.Any, resizingColumnIndex: js.Any): js.Any = js.native
  /* private */ def _notifyColumnsResized(): js.Any = js.native
  /**
    * Call back function when an element in FocusZone becomes active. It will translate it into item
    * and call onActiveItemChanged callback if specified.
    *
    * @private
    * @param {el} row element that became active in Focus Zone
    * @param {ev} focus event from Focus Zone
    */
  /* private */ def _onActiveRowChanged(): js.Any = js.native
  /* private */ def _onActiveRowChanged(el: js.Any): js.Any = js.native
  /* private */ def _onActiveRowChanged(el: js.Any, ev: js.Any): js.Any = js.native
  /* private */ def _onBlur(event: js.Any): js.Any = js.native
  /**
    * Callback function when double clicked on the details header column resizer
    * which will measure the column cells of all the active rows and resize the
    * column to the max cell width.
    *
    * @private
    * @param {IColumn} column (double clicked column definition)
    * @param {number} columnIndex (double clicked column index)
    * @todo min width 100 should be changed to const value and should be consistent with the
    * value used on _onSizerMove method in DetailsHeader
    */
  /* private */ def _onColumnAutoResized(column: js.Any, columnIndex: js.Any): js.Any = js.native
  /* private */ def _onColumnDragEnd(props: js.Any, event: js.Any): js.Any = js.native
  /* private */ def _onColumnIsSizingChanged(column: js.Any, isSizing: js.Any): js.Any = js.native
  /* private */ def _onColumnResized(resizingColumn: js.Any, newWidth: js.Any, resizingColumnIndex: js.Any): js.Any = js.native
  /* private */ def _onContentKeyDown(ev: js.Any): js.Any = js.native
  /* private */ def _onGroupExpandStateChanged(isSomeGroupExpanded: js.Any): js.Any = js.native
  /* private */ def _onHeaderKeyDown(ev: js.Any): js.Any = js.native
  /* private */ def _onRenderCell(nestingDepth: js.Any, item: js.Any, index: js.Any): js.Any = js.native
  /* protected */ def _onRenderRow(
    props: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowProps
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  /* protected */ def _onRenderRow(
    props: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowProps,
    defaultRender: js.Any
  ): reactLib.reactMod.Global.JSXNs.Element = js.native
  /* private */ def _onRowDidMount(row: js.Any): js.Any = js.native
  /* private */ def _onRowWillUnmount(row: js.Any): js.Any = js.native
  /* private */ def _onToggleCollapse(collapsed: js.Any): js.Any = js.native
  /* private */ def _rememberCalculatedWidth(column: js.Any, newCalculatedWidth: js.Any): js.Any = js.native
  /* private */ def _setFocusToRow(row: js.Any): js.Any = js.native
  /* private */ def _setFocusToRow(row: js.Any, forceIntoFirstElement: js.Any): js.Any = js.native
  /* private */ def _setFocusToRowIfPending(row: js.Any): js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDetailsListBase(prevProps: js.Any, prevState: js.Any): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MDetailsListBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListProps
  ): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDetailsListBase(): scala.Unit = js.native
  @JSName("componentWillUpdate")
  def componentWillUpdate_MDetailsListBase(): scala.Unit = js.native
  /**
    * Force the component to update.
    */
  /* InferMemberOverrides */
  override def forceUpdate(): scala.Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.base", "DetailsListBase")
@js.native
object DetailsListBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.Anon_CheckboxVisibility = js.native
}

