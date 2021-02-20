package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CheckboxVisibility
import typings.officeUiFabricReact.detailsListTypesMod.IColumn
import typings.officeUiFabricReact.detailsListTypesMod.IDetailsList
import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListProps
import typings.officeUiFabricReact.detailsRowTypesMod.IDetailsRowProps
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsListBaseMod {
  
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
    
    var _getDerivedStateFromProps: js.Any = js.native
    
    /** Builds a set of columns based on the given columns mixed with the current overrides. */
    var _getFixedColumns: js.Any = js.native
    
    var _getGroupNestingDepth: js.Any = js.native
    
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
    
    var _onColumnIsSizingChanged: js.Any = js.native
    
    var _onColumnResized: js.Any = js.native
    
    var _onGroupExpandStateChanged: js.Any = js.native
    
    /* protected */ def _onRenderRow(props: IDetailsRowProps): Element = js.native
    /* protected */ def _onRenderRow(props: IDetailsRowProps, defaultRender: IRenderFunction[IDetailsRowProps]): Element = js.native
    
    var _onRowDidMount: js.Any = js.native
    
    var _onRowWillUnmount: js.Any = js.native
    
    var _onToggleCollapse: js.Any = js.native
    
    var _rememberCalculatedWidth: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var _selection: js.Any = js.native
    
    var _selectionZone: js.Any = js.native
    
    var _setFocusToRow: js.Any = js.native
    
    var _setFocusToRowIfPending: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDetailsListBase(prevProps: IDetailsListProps, prevState: IDetailsListState): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDetailsListBase(): Unit = js.native
    
    /**
      * Force the component to update.
      */
    /* InferMemberOverrides */
    override def forceUpdate(): Unit = js.native
  }
  /* static members */
  object DetailsListBase {
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.base", "DetailsListBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.base", "DetailsListBase.defaultProps")
    @js.native
    def defaultProps: CheckboxVisibility = js.native
    @scala.inline
    def defaultProps_=(x: CheckboxVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.base", "DetailsListBase.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IDetailsListProps, previousState: IDetailsListState): IDetailsListState = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.base", "buildColumns")
  @js.native
  def buildColumns(
    items: js.Array[_],
    canResizeColumns: js.UndefOr[Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
    ],
    sortedColumnKey: js.UndefOr[String],
    isSortedDescending: js.UndefOr[Boolean],
    groupedColumnKey: js.UndefOr[String],
    isMultiline: js.UndefOr[Boolean]
  ): js.Array[IColumn] = js.native
  
  @js.native
  trait IDetailsListState extends StObject {
    
    var adjustedColumns: js.Array[IColumn] = js.native
    
    var focusedItemIndex: Double = js.native
    
    def getDerivedStateFromProps(nextProps: IDetailsListProps, previousState: IDetailsListState): IDetailsListState = js.native
    
    var isCollapsed: js.UndefOr[Boolean] = js.native
    
    var isSizing: js.UndefOr[Boolean] = js.native
    
    var isSomeGroupExpanded: js.UndefOr[Boolean] = js.native
    
    var lastSelectionMode: js.UndefOr[SelectionMode] = js.native
    
    var lastWidth: js.UndefOr[Double] = js.native
  }
  object IDetailsListState {
    
    @scala.inline
    def apply(
      adjustedColumns: js.Array[IColumn],
      focusedItemIndex: Double,
      getDerivedStateFromProps: (IDetailsListProps, IDetailsListState) => IDetailsListState
    ): IDetailsListState = {
      val __obj = js.Dynamic.literal(adjustedColumns = adjustedColumns.asInstanceOf[js.Any], focusedItemIndex = focusedItemIndex.asInstanceOf[js.Any], getDerivedStateFromProps = js.Any.fromFunction2(getDerivedStateFromProps))
      __obj.asInstanceOf[IDetailsListState]
    }
    
    @scala.inline
    implicit class IDetailsListStateMutableBuilder[Self <: IDetailsListState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustedColumns(value: js.Array[IColumn]): Self = StObject.set(x, "adjustedColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustedColumnsVarargs(value: IColumn*): Self = StObject.set(x, "adjustedColumns", js.Array(value :_*))
      
      @scala.inline
      def setFocusedItemIndex(value: Double): Self = StObject.set(x, "focusedItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDerivedStateFromProps(value: (IDetailsListProps, IDetailsListState) => IDetailsListState): Self = StObject.set(x, "getDerivedStateFromProps", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
      
      @scala.inline
      def setIsSizing(value: Boolean): Self = StObject.set(x, "isSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSizingUndefined: Self = StObject.set(x, "isSizing", js.undefined)
      
      @scala.inline
      def setIsSomeGroupExpanded(value: Boolean): Self = StObject.set(x, "isSomeGroupExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSomeGroupExpandedUndefined: Self = StObject.set(x, "isSomeGroupExpanded", js.undefined)
      
      @scala.inline
      def setLastSelectionMode(value: SelectionMode): Self = StObject.set(x, "lastSelectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastSelectionModeUndefined: Self = StObject.set(x, "lastSelectionMode", js.undefined)
      
      @scala.inline
      def setLastWidth(value: Double): Self = StObject.set(x, "lastWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastWidthUndefined: Self = StObject.set(x, "lastWidth", js.undefined)
    }
  }
}
