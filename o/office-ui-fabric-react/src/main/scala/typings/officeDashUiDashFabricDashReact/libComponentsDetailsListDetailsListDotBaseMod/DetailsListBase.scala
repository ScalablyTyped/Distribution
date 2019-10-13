package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotBaseMod

import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.Anon_CheckboxVisibility
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IDetailsList
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsListDotTypesMod.IDetailsListProps
import typings.officeDashUiDashFabricDashReact.libComponentsDetailsListDetailsRowDotTypesMod.IDetailsRowProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.base", "DetailsListBase")
@js.native
class DetailsListBase protected ()
  extends Component[IDetailsListProps, IDetailsListState, js.Any]
     with IDetailsList {
  def this(props: IDetailsListProps) = this()
  var _activeRows: js.Any = js.native
  var _adjustColumns: js.Any = js.native
  var _async: js.Any = js.native
  var _columnOverrides: js.Any = js.native
  var _dragDropHelper: js.Any = js.native
  var _focusZone: js.Any = js.native
  var _forceListUpdates: js.Any = js.native
  /** Returns adjusted columns, given the viewport size and layout mode. */
  var _getAdjustedColumns: js.Any = js.native
  var _getColumnOverride: js.Any = js.native
  var _getColumnReorderProps: js.Any = js.native
  var _getDetailsFooterProps: js.Any = js.native
  /** Builds a set of columns based on the given columns mixed with the current overrides. */
  var _getFixedColumns: js.Any = js.native
  var _getGroupNestingDepth: js.Any = js.native
  var _getGroupProps: js.Any = js.native
  var _getItemKey: js.Any = js.native
  /** Builds a set of columns to fix within the viewport width. */
  var _getJustifiedColumns: js.Any = js.native
  var _getJustifiedColumnsAfterResize: js.Any = js.native
  var _groupedList: js.Any = js.native
  var _header: js.Any = js.native
  var _initialFocusedIndex: js.Any = js.native
  var _list: js.Any = js.native
  var _notifyColumnsResized: js.Any = js.native
  /**
    * Call back function when an element in FocusZone becomes active. It will translate it into item
    * and call onActiveItemChanged callback if specified.
    *
    * @param row - element that became active in Focus Zone
    * @param focus - event from Focus Zone
    */
  var _onActiveRowChanged: js.Any = js.native
  var _onBlur: js.Any = js.native
  /**
    * Callback function when double clicked on the details header column resizer
    * which will measure the column cells of all the active rows and resize the
    * column to the max cell width.
    *
    * @param column - double clicked column definition
    * @param columnIndex - double clicked column index
    * TODO: min width 100 should be changed to const value and should be consistent with the
    * value used on _onSizerMove method in DetailsHeader
    */
  var _onColumnAutoResized: js.Any = js.native
  var _onColumnDragEnd: js.Any = js.native
  var _onColumnIsSizingChanged: js.Any = js.native
  var _onColumnResized: js.Any = js.native
  var _onContentKeyDown: js.Any = js.native
  var _onGroupExpandStateChanged: js.Any = js.native
  var _onHeaderKeyDown: js.Any = js.native
  var _onRenderCell: js.Any = js.native
  var _onRenderDetailsFooter: js.Any = js.native
  var _onRenderDetailsHeader: js.Any = js.native
  var _onRenderListCell: js.Any = js.native
  var _onRowDidMount: js.Any = js.native
  var _onRowWillUnmount: js.Any = js.native
  var _onToggleCollapse: js.Any = js.native
  var _pendingForceUpdate: js.Any = js.native
  var _rememberCalculatedWidth: js.Any = js.native
  var _root: js.Any = js.native
  var _selection: js.Any = js.native
  var _selectionZone: js.Any = js.native
  var _setFocusToRow: js.Any = js.native
  var _setFocusToRowIfPending: js.Any = js.native
  var _sumColumnWidths: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MDetailsListBase(newProps: IDetailsListProps): Unit = js.native
  @JSName("UNSAFE_componentWillUpdate")
  def UNSAFE_componentWillUpdate_MDetailsListBase(): Unit = js.native
  /* protected */ def _onRenderRow(props: IDetailsRowProps): Element = js.native
  /* protected */ def _onRenderRow(props: IDetailsRowProps, defaultRender: IRenderFunction[IDetailsRowProps]): Element = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDetailsListBase(prevProps: IDetailsListProps, prevState: IDetailsListState): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MDetailsListBase(): Unit = js.native
  /* InferMemberOverrides */
  override def forceUpdate(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.base", "DetailsListBase")
@js.native
object DetailsListBase extends js.Object {
  var defaultProps: Anon_CheckboxVisibility = js.native
}

