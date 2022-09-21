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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object detailsListBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/DetailsList.base", "DetailsListBase")
  @js.native
  open class DetailsListBase protected ()
    extends Component[IDetailsListProps, IDetailsListState, Any]
       with IDetailsList {
    def this(props: IDetailsListProps) = this()
    
    /* private */ var _activeRows: Any = js.native
    
    /* private */ var _adjustColumns: Any = js.native
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _columnOverrides: Any = js.native
    
    /* private */ var _dragDropHelper: Any = js.native
    
    /* private */ var _focusZone: Any = js.native
    
    /* private */ var _forceListUpdates: Any = js.native
    
    /** Returns adjusted columns, given the viewport size and layout mode. */
    /* private */ var _getAdjustedColumns: Any = js.native
    
    /* private */ var _getColumnOverride: Any = js.native
    
    /* private */ var _getDerivedStateFromProps: Any = js.native
    
    /** Builds a set of columns based on the given columns mixed with the current overrides. */
    /* private */ var _getFixedColumns: Any = js.native
    
    /* private */ var _getGroupNestingDepth: Any = js.native
    
    /* private */ var _getItemKey: Any = js.native
    
    /** Builds a set of columns to fix within the viewport width. */
    /* private */ var _getJustifiedColumns: Any = js.native
    
    /* private */ var _groupedList: Any = js.native
    
    /* private */ var _header: Any = js.native
    
    /* private */ var _initialFocusedIndex: Any = js.native
    
    /* private */ var _list: Any = js.native
    
    /* private */ var _notifyColumnsResized: Any = js.native
    
    /**
      * Call back function when an element in FocusZone becomes active. It will translate it into item
      * and call onActiveItemChanged callback if specified.
      *
      * @param row - element that became active in Focus Zone
      * @param focus - event from Focus Zone
      */
    /* private */ var _onActiveRowChanged: Any = js.native
    
    /* private */ var _onBlur: Any = js.native
    
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
    /* private */ var _onColumnAutoResized: Any = js.native
    
    /* private */ var _onColumnIsSizingChanged: Any = js.native
    
    /* private */ var _onColumnResized: Any = js.native
    
    /* private */ var _onGroupExpandStateChanged: Any = js.native
    
    /* protected */ def _onRenderRow(props: IDetailsRowProps): Element = js.native
    /* protected */ def _onRenderRow(props: IDetailsRowProps, defaultRender: IRenderFunction[IDetailsRowProps]): Element = js.native
    
    /* private */ var _onRowDidMount: Any = js.native
    
    /* private */ var _onRowWillUnmount: Any = js.native
    
    /* private */ var _onToggleCollapse: Any = js.native
    
    /* private */ var _rememberCalculatedWidth: Any = js.native
    
    /* private */ var _root: Any = js.native
    
    /* private */ var _selection: Any = js.native
    
    /* private */ var _selectionZone: Any = js.native
    
    /* private */ var _setFocusToRow: Any = js.native
    
    /* private */ var _setFocusToRowIfPending: Any = js.native
    
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
    inline def defaultProps_=(x: CheckboxVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(nextProps: IDetailsListProps, previousState: IDetailsListState): IDetailsListState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], previousState.asInstanceOf[js.Any])).asInstanceOf[IDetailsListState]
  }
  
  inline def buildColumns(
    items: js.Array[Any],
    canResizeColumns: js.UndefOr[Boolean],
    onColumnClick: js.UndefOr[
      js.Function2[/* ev */ MouseEvent[HTMLElement, NativeMouseEvent], /* column */ IColumn, Unit]
    ],
    sortedColumnKey: js.UndefOr[String],
    isSortedDescending: js.UndefOr[Boolean],
    groupedColumnKey: js.UndefOr[String],
    isMultiline: js.UndefOr[Boolean]
  ): js.Array[IColumn] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildColumns")(items.asInstanceOf[js.Any], canResizeColumns.asInstanceOf[js.Any], onColumnClick.asInstanceOf[js.Any], sortedColumnKey.asInstanceOf[js.Any], isSortedDescending.asInstanceOf[js.Any], groupedColumnKey.asInstanceOf[js.Any], isMultiline.asInstanceOf[js.Any])).asInstanceOf[js.Array[IColumn]]
  
  trait IDetailsListState extends StObject {
    
    var adjustedColumns: js.Array[IColumn]
    
    var focusedItemIndex: Double
    
    def getDerivedStateFromProps(nextProps: IDetailsListProps, previousState: IDetailsListState): IDetailsListState
    
    var isCollapsed: js.UndefOr[Boolean] = js.undefined
    
    var isSizing: js.UndefOr[Boolean] = js.undefined
    
    var isSomeGroupExpanded: js.UndefOr[Boolean] = js.undefined
    
    var lastSelectionMode: js.UndefOr[SelectionMode] = js.undefined
    
    var lastWidth: js.UndefOr[Double] = js.undefined
  }
  object IDetailsListState {
    
    inline def apply(
      adjustedColumns: js.Array[IColumn],
      focusedItemIndex: Double,
      getDerivedStateFromProps: (IDetailsListProps, IDetailsListState) => IDetailsListState
    ): IDetailsListState = {
      val __obj = js.Dynamic.literal(adjustedColumns = adjustedColumns.asInstanceOf[js.Any], focusedItemIndex = focusedItemIndex.asInstanceOf[js.Any], getDerivedStateFromProps = js.Any.fromFunction2(getDerivedStateFromProps))
      __obj.asInstanceOf[IDetailsListState]
    }
    
    extension [Self <: IDetailsListState](x: Self) {
      
      inline def setAdjustedColumns(value: js.Array[IColumn]): Self = StObject.set(x, "adjustedColumns", value.asInstanceOf[js.Any])
      
      inline def setAdjustedColumnsVarargs(value: IColumn*): Self = StObject.set(x, "adjustedColumns", js.Array(value*))
      
      inline def setFocusedItemIndex(value: Double): Self = StObject.set(x, "focusedItemIndex", value.asInstanceOf[js.Any])
      
      inline def setGetDerivedStateFromProps(value: (IDetailsListProps, IDetailsListState) => IDetailsListState): Self = StObject.set(x, "getDerivedStateFromProps", js.Any.fromFunction2(value))
      
      inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
      
      inline def setIsCollapsedUndefined: Self = StObject.set(x, "isCollapsed", js.undefined)
      
      inline def setIsSizing(value: Boolean): Self = StObject.set(x, "isSizing", value.asInstanceOf[js.Any])
      
      inline def setIsSizingUndefined: Self = StObject.set(x, "isSizing", js.undefined)
      
      inline def setIsSomeGroupExpanded(value: Boolean): Self = StObject.set(x, "isSomeGroupExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsSomeGroupExpandedUndefined: Self = StObject.set(x, "isSomeGroupExpanded", js.undefined)
      
      inline def setLastSelectionMode(value: SelectionMode): Self = StObject.set(x, "lastSelectionMode", value.asInstanceOf[js.Any])
      
      inline def setLastSelectionModeUndefined: Self = StObject.set(x, "lastSelectionMode", js.undefined)
      
      inline def setLastWidth(value: Double): Self = StObject.set(x, "lastWidth", value.asInstanceOf[js.Any])
      
      inline def setLastWidthUndefined: Self = StObject.set(x, "lastWidth", js.undefined)
    }
  }
}
