package typings.muiDatatables.mod

import typings.muiDatatables.anon.ColIndex
import typings.muiDatatables.anon.Columns
import typings.muiDatatables.anon.DataLookup
import typings.muiDatatables.anon.Lookup
import typings.muiDatatables.anon.PartialMUIDataTableTextLaBody
import typings.muiDatatables.anon.Partialfilenamestringsepa
import typings.muiDatatables.anon.RowIndex
import typings.muiDatatables.anon.XAxis
import typings.muiDatatables.muiDatatablesBooleans.`false`
import typings.muiDatatables.muiDatatablesStrings.above
import typings.muiDatatables.muiDatatablesStrings.asc
import typings.muiDatatables.muiDatatablesStrings.chip
import typings.muiDatatables.muiDatatablesStrings.desc
import typings.muiDatatables.muiDatatablesStrings.none
import typings.muiDatatables.muiDatatablesStrings.replace
import typings.muiDatatables.muiDatatablesStrings.reset
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  caseSensitive :boolean,   confirmFilters :boolean,   columnOrder :std.Array<number>,   count :number, customFilterDialogFooter (filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList'], applyNewFilters : (args : ...any): any | undefined): react.react.ReactNode, customFooter (rowCount : number, page : number, rowsPerPage : number, changeRowsPerPage : (page : string | number): void, changePage : (newPage : number): void, textLabels : std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabels>): react.react.ReactNode, customRowRender (data : std.Array<any>, dataIndex : number, rowIndex : number): react.react.ReactNode, customSearch (searchQuery : string, currentRow : std.Array<any>, columns : std.Array<any>): boolean, customSearchRender (searchText : string, handleSearch : (text : string): void, hideSearch : (): void, options : any): react.react.Component<{}, {}, any> | react.react.<global>.JSX.Element, customSort (data : std.Array<any>, colIndex : number, order : string): std.Array<any>, customTableBodyFooterRender (options : {  data :std.Array<any>,   selectableRows :mui-datatables.mui-datatables.SelectableRows,   columns :std.Array<any>}): any, customToolbar (data : {  displayData :mui-datatables.mui-datatables.DisplayData}): react.react.ReactNode, customToolbarSelect (selectedRows : {  data :std.Array<{  index :number,   dataIndex :number}>,   lookup :{[key: number] : boolean}}, displayData : mui-datatables.mui-datatables.DisplayData, setSelectedRows : (rows : std.Array<number>): void): react.react.ReactNode,   disableToolbarSelect :boolean,   download :mui-datatables.mui-datatables.ToolbarButton,   downloadOptions :std.Partial<{  filename :string,   separator :string,   filterOptions :std.Partial<{  useDisplayedColumnsOnly :boolean,   useDisplayedRowsOnly :boolean}>}>,   draggableColumns :mui-datatables.mui-datatables.MUIDataTableDraggableColumns,   elevation :number,   enableNestedDataAccess :string,   expandableRows :boolean,   expandableRowsHeader :boolean,   expandableRowsOnClick :boolean,   filter :mui-datatables.mui-datatables.ToolbarButton,   filterArrayFullMatch :boolean,   filterType :mui-datatables.mui-datatables.FilterType,   fixedHeader :boolean,   fixedHeaderOptions :{  xAxis :boolean,   yAxis :boolean},   fixedSelectColumn :boolean, isRowExpandable (dataIndex : number, expandedRows : mui-datatables.mui-datatables.MUIDataTableIsRowCheck | undefined): boolean, isRowSelectable (dataIndex : number, selectedRows : mui-datatables.mui-datatables.MUIDataTableIsRowCheck | undefined): boolean,   jumpToPage :boolean, onCellClick (colData : any, cellMeta : {  colIndex :number,   rowIndex :number,   dataIndex :number,   event :react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>}): void, onChangePage (currentPage : number): void, onChangeRowsPerPage (numberOfRows : number): void, onColumnOrderChange (newColumnOrder : std.Array<number>, columnIndex : number, newPosition : number): void, onColumnSortChange (changedColumn : string, direction : 'asc' | 'desc'): void,   onColumnViewChange :(changedColumn : string, action : string): void | undefined, onDownload (buildHead : (columns : any): string, buildBody : (data : any): string, columns : any, data : any): string | boolean, onFilterChange (changedColumn : string | mui-datatables.mui-datatables.MUIDataTableColumn | null, filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList'], type : mui-datatables.mui-datatables.FilterType | 'chip' | 'reset', changedColumnIndex : number, displayData : mui-datatables.mui-datatables.DisplayData): void, onFilterChipClose (index : number, removedFilter : string, filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList']): void, onFilterConfirm (filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList']): void, onFilterDialogClose (): void, onFilterDialogOpen (): void, onRowClick (rowData : std.Array<string>, rowMeta : {  dataIndex :number,   rowIndex :number}): void, onRowExpansionChange (currentRowsExpanded : std.Array<any>, allRowsExpanded : std.Array<any>, rowsExpanded : std.Array<any> | undefined): void, onRowsDelete (rowsDeleted : {  lookup :{[dataIndex: number] : boolean},   data :std.Array<{  index :number,   dataIndex :number}>}, newTableData : std.Array<any>): void | false, onRowSelectionChange (currentRowsSelected : std.Array<any>, allRowsSelected : std.Array<any>, rowsSelected : std.Array<any> | undefined): void, onSearchChange (searchText : string | null): void, onSearchClose (): void, onSearchOpen (): void, onTableChange (action : string, tableState : mui-datatables.mui-datatables.MUIDataTableState): void, onTableInit (action : string, tableState : mui-datatables.mui-datatables.MUIDataTableState): void, onViewColumnsChange (changedColumn : string, action : string): void,   page :number,   pagination :boolean,   print :mui-datatables.mui-datatables.ToolbarButton, renderExpandableRow (rowData : std.Array<string>, rowMeta : {  dataIndex :number,   rowIndex :number}): react.react.ReactNode,   resizableColumns :boolean,   responsive :mui-datatables.mui-datatables.Responsive,   rowHover :boolean,   rowsExpanded :std.Array<any>,   rowsPerPage :number,   rowsPerPageOptions :std.Array<number>,   rowsSelected :std.Array<any>,   search :mui-datatables.mui-datatables.ToolbarButton,   searchOpen :boolean,   searchAlwaysOpen :boolean,   searchProps :react.react.HTMLAttributes<std.HTMLInputElement>,   searchPlaceholder :string,   searchText :string,   selectableRows :mui-datatables.mui-datatables.SelectableRows,   selectableRowsHeader :boolean,   selectableRowsHideCheckboxes :boolean,   selectableRowsOnClick :boolean,   selectToolbarPlacement :'replace' | 'above' | 'none',   serverSide :boolean, setFilterChipProps (colIndex : number, colName : string, data : std.ReadonlyArray<std.Array<any>>): mui-datatables.mui-datatables.MUIDataTableChip, setRowProps (row : std.Array<any>, dataIndex : number, rowIndex : number): object, setTableProps (): object,   sort :boolean,   sortFilterList :boolean,   sortOrder :mui-datatables.mui-datatables.MUISortOptions,   tableId :string,   tableBodyHeight :string,   tableBodyMaxHeight :string,   textLabels :std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabels>,   viewColumns :mui-datatables.mui-datatables.ToolbarButton,   storageKey :string}> */
trait MUIDataTableOptions extends StObject {
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var columnOrder: js.UndefOr[js.Array[Double]] = js.undefined
  
  var confirmFilters: js.UndefOr[Boolean] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var customFilterDialogFooter: js.UndefOr[
    js.Function2[
      /* filterList */ js.Array[js.Array[String]], 
      /* applyNewFilters */ js.UndefOr[js.Function1[/* repeated */ Any, Any]], 
      ReactNode
    ]
  ] = js.undefined
  
  var customFooter: js.UndefOr[
    js.Function6[
      /* rowCount */ Double, 
      /* page */ Double, 
      /* rowsPerPage */ Double, 
      /* changeRowsPerPage */ js.Function1[/* page */ String | Double, Unit], 
      /* changePage */ js.Function1[/* newPage */ Double, Unit], 
      /* textLabels */ PartialMUIDataTableTextLaBody, 
      ReactNode
    ]
  ] = js.undefined
  
  var customRowRender: js.UndefOr[
    js.Function3[/* data */ js.Array[Any], /* dataIndex */ Double, /* rowIndex */ Double, ReactNode]
  ] = js.undefined
  
  var customSearch: js.UndefOr[
    js.Function3[
      /* searchQuery */ String, 
      /* currentRow */ js.Array[Any], 
      /* columns */ js.Array[Any], 
      Boolean
    ]
  ] = js.undefined
  
  var customSearchRender: js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Function1[/* text */ String, Unit], 
      /* hideSearch */ js.Function0[Unit], 
      /* options */ Any, 
      (Component[js.Object, js.Object, Any]) | Element
    ]
  ] = js.undefined
  
  var customSort: js.UndefOr[
    js.Function3[/* data */ js.Array[Any], /* colIndex */ Double, /* order */ String, js.Array[Any]]
  ] = js.undefined
  
  var customTableBodyFooterRender: js.UndefOr[js.Function1[/* options */ Columns, Any]] = js.undefined
  
  var customToolbar: js.UndefOr[js.Function1[/* data */ typings.muiDatatables.anon.DisplayData, ReactNode]] = js.undefined
  
  var customToolbarSelect: js.UndefOr[
    js.Function3[
      /* selectedRows */ DataLookup, 
      /* displayData */ DisplayData, 
      /* setSelectedRows */ js.Function1[/* rows */ js.Array[Double], Unit], 
      ReactNode
    ]
  ] = js.undefined
  
  var disableToolbarSelect: js.UndefOr[Boolean] = js.undefined
  
  var download: js.UndefOr[ToolbarButton] = js.undefined
  
  var downloadOptions: js.UndefOr[Partialfilenamestringsepa] = js.undefined
  
  var draggableColumns: js.UndefOr[MUIDataTableDraggableColumns] = js.undefined
  
  var elevation: js.UndefOr[Double] = js.undefined
  
  var enableNestedDataAccess: js.UndefOr[String] = js.undefined
  
  var expandableRows: js.UndefOr[Boolean] = js.undefined
  
  var expandableRowsHeader: js.UndefOr[Boolean] = js.undefined
  
  var expandableRowsOnClick: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[ToolbarButton] = js.undefined
  
  var filterArrayFullMatch: js.UndefOr[Boolean] = js.undefined
  
  var filterType: js.UndefOr[FilterType] = js.undefined
  
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  
  var fixedHeaderOptions: js.UndefOr[XAxis] = js.undefined
  
  var fixedSelectColumn: js.UndefOr[Boolean] = js.undefined
  
  var isRowExpandable: js.UndefOr[
    js.Function2[
      /* dataIndex */ Double, 
      /* expandedRows */ js.UndefOr[MUIDataTableIsRowCheck], 
      Boolean
    ]
  ] = js.undefined
  
  var isRowSelectable: js.UndefOr[
    js.Function2[
      /* dataIndex */ Double, 
      /* selectedRows */ js.UndefOr[MUIDataTableIsRowCheck], 
      Boolean
    ]
  ] = js.undefined
  
  var jumpToPage: js.UndefOr[Boolean] = js.undefined
  
  var onCellClick: js.UndefOr[js.Function2[/* colData */ Any, /* cellMeta */ ColIndex, Unit]] = js.undefined
  
  var onChangePage: js.UndefOr[js.Function1[/* currentPage */ Double, Unit]] = js.undefined
  
  var onChangeRowsPerPage: js.UndefOr[js.Function1[/* numberOfRows */ Double, Unit]] = js.undefined
  
  var onColumnOrderChange: js.UndefOr[
    js.Function3[
      /* newColumnOrder */ js.Array[Double], 
      /* columnIndex */ Double, 
      /* newPosition */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var onColumnSortChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* direction */ asc | desc, Unit]] = js.undefined
  
  var onColumnViewChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* action */ String, Unit]] = js.undefined
  
  var onDownload: js.UndefOr[
    js.Function4[
      /* buildHead */ js.Function1[/* columns */ Any, String], 
      /* buildBody */ js.Function1[/* data */ Any, String], 
      /* columns */ Any, 
      /* data */ Any, 
      String | Boolean
    ]
  ] = js.undefined
  
  var onFilterChange: js.UndefOr[
    js.Function5[
      /* changedColumn */ String | MUIDataTableColumn | Null, 
      /* filterList */ js.Array[js.Array[String]], 
      /* type */ FilterType | chip | reset, 
      /* changedColumnIndex */ Double, 
      /* displayData */ DisplayData, 
      Unit
    ]
  ] = js.undefined
  
  var onFilterChipClose: js.UndefOr[
    js.Function3[
      /* index */ Double, 
      /* removedFilter */ String, 
      /* filterList */ js.Array[js.Array[String]], 
      Unit
    ]
  ] = js.undefined
  
  var onFilterConfirm: js.UndefOr[js.Function1[/* filterList */ js.Array[js.Array[String]], Unit]] = js.undefined
  
  var onFilterDialogClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onFilterDialogOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onRowClick: js.UndefOr[js.Function2[/* rowData */ js.Array[String], /* rowMeta */ RowIndex, Unit]] = js.undefined
  
  var onRowExpansionChange: js.UndefOr[
    js.Function3[
      /* currentRowsExpanded */ js.Array[Any], 
      /* allRowsExpanded */ js.Array[Any], 
      /* rowsExpanded */ js.UndefOr[js.Array[Any]], 
      Unit
    ]
  ] = js.undefined
  
  var onRowSelectionChange: js.UndefOr[
    js.Function3[
      /* currentRowsSelected */ js.Array[Any], 
      /* allRowsSelected */ js.Array[Any], 
      /* rowsSelected */ js.UndefOr[js.Array[Any]], 
      Unit
    ]
  ] = js.undefined
  
  var onRowsDelete: js.UndefOr[
    js.Function2[/* rowsDeleted */ Lookup, /* newTableData */ js.Array[Any], Unit | `false`]
  ] = js.undefined
  
  var onSearchChange: js.UndefOr[js.Function1[/* searchText */ String | Null, Unit]] = js.undefined
  
  var onSearchClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onSearchOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onTableChange: js.UndefOr[js.Function2[/* action */ String, /* tableState */ MUIDataTableState, Unit]] = js.undefined
  
  var onTableInit: js.UndefOr[js.Function2[/* action */ String, /* tableState */ MUIDataTableState, Unit]] = js.undefined
  
  var onViewColumnsChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* action */ String, Unit]] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var pagination: js.UndefOr[Boolean] = js.undefined
  
  var print: js.UndefOr[ToolbarButton] = js.undefined
  
  var renderExpandableRow: js.UndefOr[js.Function2[/* rowData */ js.Array[String], /* rowMeta */ RowIndex, ReactNode]] = js.undefined
  
  var resizableColumns: js.UndefOr[Boolean] = js.undefined
  
  var responsive: js.UndefOr[Responsive] = js.undefined
  
  var rowHover: js.UndefOr[Boolean] = js.undefined
  
  var rowsExpanded: js.UndefOr[js.Array[Any]] = js.undefined
  
  var rowsPerPage: js.UndefOr[Double] = js.undefined
  
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.undefined
  
  var rowsSelected: js.UndefOr[js.Array[Any]] = js.undefined
  
  var search: js.UndefOr[ToolbarButton] = js.undefined
  
  var searchAlwaysOpen: js.UndefOr[Boolean] = js.undefined
  
  var searchOpen: js.UndefOr[Boolean] = js.undefined
  
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  
  var searchProps: js.UndefOr[HTMLAttributes[HTMLInputElement]] = js.undefined
  
  var searchText: js.UndefOr[String] = js.undefined
  
  var selectToolbarPlacement: js.UndefOr[replace | above | none] = js.undefined
  
  var selectableRows: js.UndefOr[SelectableRows] = js.undefined
  
  var selectableRowsHeader: js.UndefOr[Boolean] = js.undefined
  
  var selectableRowsHideCheckboxes: js.UndefOr[Boolean] = js.undefined
  
  var selectableRowsOnClick: js.UndefOr[Boolean] = js.undefined
  
  var serverSide: js.UndefOr[Boolean] = js.undefined
  
  var setFilterChipProps: js.UndefOr[
    js.Function3[
      /* colIndex */ Double, 
      /* colName */ String, 
      /* data */ js.Array[js.Array[Any]], 
      MUIDataTableChip
    ]
  ] = js.undefined
  
  var setRowProps: js.UndefOr[
    js.Function3[/* row */ js.Array[Any], /* dataIndex */ Double, /* rowIndex */ Double, js.Object]
  ] = js.undefined
  
  var setTableProps: js.UndefOr[js.Function0[js.Object]] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
  
  var sortFilterList: js.UndefOr[Boolean] = js.undefined
  
  var sortOrder: js.UndefOr[MUISortOptions] = js.undefined
  
  var storageKey: js.UndefOr[String] = js.undefined
  
  var tableBodyHeight: js.UndefOr[String] = js.undefined
  
  var tableBodyMaxHeight: js.UndefOr[String] = js.undefined
  
  var tableId: js.UndefOr[String] = js.undefined
  
  var textLabels: js.UndefOr[PartialMUIDataTableTextLaBody] = js.undefined
  
  var viewColumns: js.UndefOr[ToolbarButton] = js.undefined
}
object MUIDataTableOptions {
  
  inline def apply(): MUIDataTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableOptions]
  }
  
  extension [Self <: MUIDataTableOptions](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setColumnOrder(value: js.Array[Double]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    inline def setColumnOrderUndefined: Self = StObject.set(x, "columnOrder", js.undefined)
    
    inline def setColumnOrderVarargs(value: Double*): Self = StObject.set(x, "columnOrder", js.Array(value*))
    
    inline def setConfirmFilters(value: Boolean): Self = StObject.set(x, "confirmFilters", value.asInstanceOf[js.Any])
    
    inline def setConfirmFiltersUndefined: Self = StObject.set(x, "confirmFilters", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCustomFilterDialogFooter(
      value: (/* filterList */ js.Array[js.Array[String]], /* applyNewFilters */ js.UndefOr[js.Function1[/* repeated */ Any, Any]]) => ReactNode
    ): Self = StObject.set(x, "customFilterDialogFooter", js.Any.fromFunction2(value))
    
    inline def setCustomFilterDialogFooterUndefined: Self = StObject.set(x, "customFilterDialogFooter", js.undefined)
    
    inline def setCustomFooter(
      value: (/* rowCount */ Double, /* page */ Double, /* rowsPerPage */ Double, /* changeRowsPerPage */ js.Function1[/* page */ String | Double, Unit], /* changePage */ js.Function1[/* newPage */ Double, Unit], /* textLabels */ PartialMUIDataTableTextLaBody) => ReactNode
    ): Self = StObject.set(x, "customFooter", js.Any.fromFunction6(value))
    
    inline def setCustomFooterUndefined: Self = StObject.set(x, "customFooter", js.undefined)
    
    inline def setCustomRowRender(value: (/* data */ js.Array[Any], /* dataIndex */ Double, /* rowIndex */ Double) => ReactNode): Self = StObject.set(x, "customRowRender", js.Any.fromFunction3(value))
    
    inline def setCustomRowRenderUndefined: Self = StObject.set(x, "customRowRender", js.undefined)
    
    inline def setCustomSearch(
      value: (/* searchQuery */ String, /* currentRow */ js.Array[Any], /* columns */ js.Array[Any]) => Boolean
    ): Self = StObject.set(x, "customSearch", js.Any.fromFunction3(value))
    
    inline def setCustomSearchRender(
      value: (/* searchText */ String, /* handleSearch */ js.Function1[/* text */ String, Unit], /* hideSearch */ js.Function0[Unit], /* options */ Any) => (Component[js.Object, js.Object, Any]) | Element
    ): Self = StObject.set(x, "customSearchRender", js.Any.fromFunction4(value))
    
    inline def setCustomSearchRenderUndefined: Self = StObject.set(x, "customSearchRender", js.undefined)
    
    inline def setCustomSearchUndefined: Self = StObject.set(x, "customSearch", js.undefined)
    
    inline def setCustomSort(value: (/* data */ js.Array[Any], /* colIndex */ Double, /* order */ String) => js.Array[Any]): Self = StObject.set(x, "customSort", js.Any.fromFunction3(value))
    
    inline def setCustomSortUndefined: Self = StObject.set(x, "customSort", js.undefined)
    
    inline def setCustomTableBodyFooterRender(value: /* options */ Columns => Any): Self = StObject.set(x, "customTableBodyFooterRender", js.Any.fromFunction1(value))
    
    inline def setCustomTableBodyFooterRenderUndefined: Self = StObject.set(x, "customTableBodyFooterRender", js.undefined)
    
    inline def setCustomToolbar(value: /* data */ typings.muiDatatables.anon.DisplayData => ReactNode): Self = StObject.set(x, "customToolbar", js.Any.fromFunction1(value))
    
    inline def setCustomToolbarSelect(
      value: (/* selectedRows */ DataLookup, /* displayData */ DisplayData, /* setSelectedRows */ js.Function1[/* rows */ js.Array[Double], Unit]) => ReactNode
    ): Self = StObject.set(x, "customToolbarSelect", js.Any.fromFunction3(value))
    
    inline def setCustomToolbarSelectUndefined: Self = StObject.set(x, "customToolbarSelect", js.undefined)
    
    inline def setCustomToolbarUndefined: Self = StObject.set(x, "customToolbar", js.undefined)
    
    inline def setDisableToolbarSelect(value: Boolean): Self = StObject.set(x, "disableToolbarSelect", value.asInstanceOf[js.Any])
    
    inline def setDisableToolbarSelectUndefined: Self = StObject.set(x, "disableToolbarSelect", js.undefined)
    
    inline def setDownload(value: ToolbarButton): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadOptions(value: Partialfilenamestringsepa): Self = StObject.set(x, "downloadOptions", value.asInstanceOf[js.Any])
    
    inline def setDownloadOptionsUndefined: Self = StObject.set(x, "downloadOptions", js.undefined)
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setDraggableColumns(value: MUIDataTableDraggableColumns): Self = StObject.set(x, "draggableColumns", value.asInstanceOf[js.Any])
    
    inline def setDraggableColumnsUndefined: Self = StObject.set(x, "draggableColumns", js.undefined)
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    inline def setEnableNestedDataAccess(value: String): Self = StObject.set(x, "enableNestedDataAccess", value.asInstanceOf[js.Any])
    
    inline def setEnableNestedDataAccessUndefined: Self = StObject.set(x, "enableNestedDataAccess", js.undefined)
    
    inline def setExpandableRows(value: Boolean): Self = StObject.set(x, "expandableRows", value.asInstanceOf[js.Any])
    
    inline def setExpandableRowsHeader(value: Boolean): Self = StObject.set(x, "expandableRowsHeader", value.asInstanceOf[js.Any])
    
    inline def setExpandableRowsHeaderUndefined: Self = StObject.set(x, "expandableRowsHeader", js.undefined)
    
    inline def setExpandableRowsOnClick(value: Boolean): Self = StObject.set(x, "expandableRowsOnClick", value.asInstanceOf[js.Any])
    
    inline def setExpandableRowsOnClickUndefined: Self = StObject.set(x, "expandableRowsOnClick", js.undefined)
    
    inline def setExpandableRowsUndefined: Self = StObject.set(x, "expandableRows", js.undefined)
    
    inline def setFilter(value: ToolbarButton): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterArrayFullMatch(value: Boolean): Self = StObject.set(x, "filterArrayFullMatch", value.asInstanceOf[js.Any])
    
    inline def setFilterArrayFullMatchUndefined: Self = StObject.set(x, "filterArrayFullMatch", js.undefined)
    
    inline def setFilterType(value: FilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    inline def setFixedHeaderOptions(value: XAxis): Self = StObject.set(x, "fixedHeaderOptions", value.asInstanceOf[js.Any])
    
    inline def setFixedHeaderOptionsUndefined: Self = StObject.set(x, "fixedHeaderOptions", js.undefined)
    
    inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    inline def setFixedSelectColumn(value: Boolean): Self = StObject.set(x, "fixedSelectColumn", value.asInstanceOf[js.Any])
    
    inline def setFixedSelectColumnUndefined: Self = StObject.set(x, "fixedSelectColumn", js.undefined)
    
    inline def setIsRowExpandable(value: (/* dataIndex */ Double, /* expandedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => Boolean): Self = StObject.set(x, "isRowExpandable", js.Any.fromFunction2(value))
    
    inline def setIsRowExpandableUndefined: Self = StObject.set(x, "isRowExpandable", js.undefined)
    
    inline def setIsRowSelectable(value: (/* dataIndex */ Double, /* selectedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => Boolean): Self = StObject.set(x, "isRowSelectable", js.Any.fromFunction2(value))
    
    inline def setIsRowSelectableUndefined: Self = StObject.set(x, "isRowSelectable", js.undefined)
    
    inline def setJumpToPage(value: Boolean): Self = StObject.set(x, "jumpToPage", value.asInstanceOf[js.Any])
    
    inline def setJumpToPageUndefined: Self = StObject.set(x, "jumpToPage", js.undefined)
    
    inline def setOnCellClick(value: (/* colData */ Any, /* cellMeta */ ColIndex) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2(value))
    
    inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
    
    inline def setOnChangePage(value: /* currentPage */ Double => Unit): Self = StObject.set(x, "onChangePage", js.Any.fromFunction1(value))
    
    inline def setOnChangePageUndefined: Self = StObject.set(x, "onChangePage", js.undefined)
    
    inline def setOnChangeRowsPerPage(value: /* numberOfRows */ Double => Unit): Self = StObject.set(x, "onChangeRowsPerPage", js.Any.fromFunction1(value))
    
    inline def setOnChangeRowsPerPageUndefined: Self = StObject.set(x, "onChangeRowsPerPage", js.undefined)
    
    inline def setOnColumnOrderChange(
      value: (/* newColumnOrder */ js.Array[Double], /* columnIndex */ Double, /* newPosition */ Double) => Unit
    ): Self = StObject.set(x, "onColumnOrderChange", js.Any.fromFunction3(value))
    
    inline def setOnColumnOrderChangeUndefined: Self = StObject.set(x, "onColumnOrderChange", js.undefined)
    
    inline def setOnColumnSortChange(value: (/* changedColumn */ String, /* direction */ asc | desc) => Unit): Self = StObject.set(x, "onColumnSortChange", js.Any.fromFunction2(value))
    
    inline def setOnColumnSortChangeUndefined: Self = StObject.set(x, "onColumnSortChange", js.undefined)
    
    inline def setOnColumnViewChange(value: (/* changedColumn */ String, /* action */ String) => Unit): Self = StObject.set(x, "onColumnViewChange", js.Any.fromFunction2(value))
    
    inline def setOnColumnViewChangeUndefined: Self = StObject.set(x, "onColumnViewChange", js.undefined)
    
    inline def setOnDownload(
      value: (/* buildHead */ js.Function1[/* columns */ Any, String], /* buildBody */ js.Function1[/* data */ Any, String], /* columns */ Any, /* data */ Any) => String | Boolean
    ): Self = StObject.set(x, "onDownload", js.Any.fromFunction4(value))
    
    inline def setOnDownloadUndefined: Self = StObject.set(x, "onDownload", js.undefined)
    
    inline def setOnFilterChange(
      value: (/* changedColumn */ String | MUIDataTableColumn | Null, /* filterList */ js.Array[js.Array[String]], /* type */ FilterType | chip | reset, /* changedColumnIndex */ Double, /* displayData */ DisplayData) => Unit
    ): Self = StObject.set(x, "onFilterChange", js.Any.fromFunction5(value))
    
    inline def setOnFilterChangeUndefined: Self = StObject.set(x, "onFilterChange", js.undefined)
    
    inline def setOnFilterChipClose(
      value: (/* index */ Double, /* removedFilter */ String, /* filterList */ js.Array[js.Array[String]]) => Unit
    ): Self = StObject.set(x, "onFilterChipClose", js.Any.fromFunction3(value))
    
    inline def setOnFilterChipCloseUndefined: Self = StObject.set(x, "onFilterChipClose", js.undefined)
    
    inline def setOnFilterConfirm(value: /* filterList */ js.Array[js.Array[String]] => Unit): Self = StObject.set(x, "onFilterConfirm", js.Any.fromFunction1(value))
    
    inline def setOnFilterConfirmUndefined: Self = StObject.set(x, "onFilterConfirm", js.undefined)
    
    inline def setOnFilterDialogClose(value: () => Unit): Self = StObject.set(x, "onFilterDialogClose", js.Any.fromFunction0(value))
    
    inline def setOnFilterDialogCloseUndefined: Self = StObject.set(x, "onFilterDialogClose", js.undefined)
    
    inline def setOnFilterDialogOpen(value: () => Unit): Self = StObject.set(x, "onFilterDialogOpen", js.Any.fromFunction0(value))
    
    inline def setOnFilterDialogOpenUndefined: Self = StObject.set(x, "onFilterDialogOpen", js.undefined)
    
    inline def setOnRowClick(value: (/* rowData */ js.Array[String], /* rowMeta */ RowIndex) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2(value))
    
    inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    inline def setOnRowExpansionChange(
      value: (/* currentRowsExpanded */ js.Array[Any], /* allRowsExpanded */ js.Array[Any], /* rowsExpanded */ js.UndefOr[js.Array[Any]]) => Unit
    ): Self = StObject.set(x, "onRowExpansionChange", js.Any.fromFunction3(value))
    
    inline def setOnRowExpansionChangeUndefined: Self = StObject.set(x, "onRowExpansionChange", js.undefined)
    
    inline def setOnRowSelectionChange(
      value: (/* currentRowsSelected */ js.Array[Any], /* allRowsSelected */ js.Array[Any], /* rowsSelected */ js.UndefOr[js.Array[Any]]) => Unit
    ): Self = StObject.set(x, "onRowSelectionChange", js.Any.fromFunction3(value))
    
    inline def setOnRowSelectionChangeUndefined: Self = StObject.set(x, "onRowSelectionChange", js.undefined)
    
    inline def setOnRowsDelete(value: (/* rowsDeleted */ Lookup, /* newTableData */ js.Array[Any]) => Unit | `false`): Self = StObject.set(x, "onRowsDelete", js.Any.fromFunction2(value))
    
    inline def setOnRowsDeleteUndefined: Self = StObject.set(x, "onRowsDelete", js.undefined)
    
    inline def setOnSearchChange(value: /* searchText */ String | Null => Unit): Self = StObject.set(x, "onSearchChange", js.Any.fromFunction1(value))
    
    inline def setOnSearchChangeUndefined: Self = StObject.set(x, "onSearchChange", js.undefined)
    
    inline def setOnSearchClose(value: () => Unit): Self = StObject.set(x, "onSearchClose", js.Any.fromFunction0(value))
    
    inline def setOnSearchCloseUndefined: Self = StObject.set(x, "onSearchClose", js.undefined)
    
    inline def setOnSearchOpen(value: () => Unit): Self = StObject.set(x, "onSearchOpen", js.Any.fromFunction0(value))
    
    inline def setOnSearchOpenUndefined: Self = StObject.set(x, "onSearchOpen", js.undefined)
    
    inline def setOnTableChange(value: (/* action */ String, /* tableState */ MUIDataTableState) => Unit): Self = StObject.set(x, "onTableChange", js.Any.fromFunction2(value))
    
    inline def setOnTableChangeUndefined: Self = StObject.set(x, "onTableChange", js.undefined)
    
    inline def setOnTableInit(value: (/* action */ String, /* tableState */ MUIDataTableState) => Unit): Self = StObject.set(x, "onTableInit", js.Any.fromFunction2(value))
    
    inline def setOnTableInitUndefined: Self = StObject.set(x, "onTableInit", js.undefined)
    
    inline def setOnViewColumnsChange(value: (/* changedColumn */ String, /* action */ String) => Unit): Self = StObject.set(x, "onViewColumnsChange", js.Any.fromFunction2(value))
    
    inline def setOnViewColumnsChangeUndefined: Self = StObject.set(x, "onViewColumnsChange", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setPrint(value: ToolbarButton): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
    
    inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    
    inline def setRenderExpandableRow(value: (/* rowData */ js.Array[String], /* rowMeta */ RowIndex) => ReactNode): Self = StObject.set(x, "renderExpandableRow", js.Any.fromFunction2(value))
    
    inline def setRenderExpandableRowUndefined: Self = StObject.set(x, "renderExpandableRow", js.undefined)
    
    inline def setResizableColumns(value: Boolean): Self = StObject.set(x, "resizableColumns", value.asInstanceOf[js.Any])
    
    inline def setResizableColumnsUndefined: Self = StObject.set(x, "resizableColumns", js.undefined)
    
    inline def setResponsive(value: Responsive): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    inline def setRowHover(value: Boolean): Self = StObject.set(x, "rowHover", value.asInstanceOf[js.Any])
    
    inline def setRowHoverUndefined: Self = StObject.set(x, "rowHover", js.undefined)
    
    inline def setRowsExpanded(value: js.Array[Any]): Self = StObject.set(x, "rowsExpanded", value.asInstanceOf[js.Any])
    
    inline def setRowsExpandedUndefined: Self = StObject.set(x, "rowsExpanded", js.undefined)
    
    inline def setRowsExpandedVarargs(value: Any*): Self = StObject.set(x, "rowsExpanded", js.Array(value*))
    
    inline def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPageOptions(value: js.Array[Double]): Self = StObject.set(x, "rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    inline def setRowsPerPageOptionsUndefined: Self = StObject.set(x, "rowsPerPageOptions", js.undefined)
    
    inline def setRowsPerPageOptionsVarargs(value: Double*): Self = StObject.set(x, "rowsPerPageOptions", js.Array(value*))
    
    inline def setRowsPerPageUndefined: Self = StObject.set(x, "rowsPerPage", js.undefined)
    
    inline def setRowsSelected(value: js.Array[Any]): Self = StObject.set(x, "rowsSelected", value.asInstanceOf[js.Any])
    
    inline def setRowsSelectedUndefined: Self = StObject.set(x, "rowsSelected", js.undefined)
    
    inline def setRowsSelectedVarargs(value: Any*): Self = StObject.set(x, "rowsSelected", js.Array(value*))
    
    inline def setSearch(value: ToolbarButton): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchAlwaysOpen(value: Boolean): Self = StObject.set(x, "searchAlwaysOpen", value.asInstanceOf[js.Any])
    
    inline def setSearchAlwaysOpenUndefined: Self = StObject.set(x, "searchAlwaysOpen", js.undefined)
    
    inline def setSearchOpen(value: Boolean): Self = StObject.set(x, "searchOpen", value.asInstanceOf[js.Any])
    
    inline def setSearchOpenUndefined: Self = StObject.set(x, "searchOpen", js.undefined)
    
    inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    inline def setSearchProps(value: HTMLAttributes[HTMLInputElement]): Self = StObject.set(x, "searchProps", value.asInstanceOf[js.Any])
    
    inline def setSearchPropsUndefined: Self = StObject.set(x, "searchProps", js.undefined)
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSelectToolbarPlacement(value: replace | above | none): Self = StObject.set(x, "selectToolbarPlacement", value.asInstanceOf[js.Any])
    
    inline def setSelectToolbarPlacementUndefined: Self = StObject.set(x, "selectToolbarPlacement", js.undefined)
    
    inline def setSelectableRows(value: SelectableRows): Self = StObject.set(x, "selectableRows", value.asInstanceOf[js.Any])
    
    inline def setSelectableRowsHeader(value: Boolean): Self = StObject.set(x, "selectableRowsHeader", value.asInstanceOf[js.Any])
    
    inline def setSelectableRowsHeaderUndefined: Self = StObject.set(x, "selectableRowsHeader", js.undefined)
    
    inline def setSelectableRowsHideCheckboxes(value: Boolean): Self = StObject.set(x, "selectableRowsHideCheckboxes", value.asInstanceOf[js.Any])
    
    inline def setSelectableRowsHideCheckboxesUndefined: Self = StObject.set(x, "selectableRowsHideCheckboxes", js.undefined)
    
    inline def setSelectableRowsOnClick(value: Boolean): Self = StObject.set(x, "selectableRowsOnClick", value.asInstanceOf[js.Any])
    
    inline def setSelectableRowsOnClickUndefined: Self = StObject.set(x, "selectableRowsOnClick", js.undefined)
    
    inline def setSelectableRowsUndefined: Self = StObject.set(x, "selectableRows", js.undefined)
    
    inline def setServerSide(value: Boolean): Self = StObject.set(x, "serverSide", value.asInstanceOf[js.Any])
    
    inline def setServerSideUndefined: Self = StObject.set(x, "serverSide", js.undefined)
    
    inline def setSetFilterChipProps(
      value: (/* colIndex */ Double, /* colName */ String, /* data */ js.Array[js.Array[Any]]) => MUIDataTableChip
    ): Self = StObject.set(x, "setFilterChipProps", js.Any.fromFunction3(value))
    
    inline def setSetFilterChipPropsUndefined: Self = StObject.set(x, "setFilterChipProps", js.undefined)
    
    inline def setSetRowProps(value: (/* row */ js.Array[Any], /* dataIndex */ Double, /* rowIndex */ Double) => js.Object): Self = StObject.set(x, "setRowProps", js.Any.fromFunction3(value))
    
    inline def setSetRowPropsUndefined: Self = StObject.set(x, "setRowProps", js.undefined)
    
    inline def setSetTableProps(value: () => js.Object): Self = StObject.set(x, "setTableProps", js.Any.fromFunction0(value))
    
    inline def setSetTablePropsUndefined: Self = StObject.set(x, "setTableProps", js.undefined)
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortFilterList(value: Boolean): Self = StObject.set(x, "sortFilterList", value.asInstanceOf[js.Any])
    
    inline def setSortFilterListUndefined: Self = StObject.set(x, "sortFilterList", js.undefined)
    
    inline def setSortOrder(value: MUISortOptions): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    
    inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
    
    inline def setTableBodyHeight(value: String): Self = StObject.set(x, "tableBodyHeight", value.asInstanceOf[js.Any])
    
    inline def setTableBodyHeightUndefined: Self = StObject.set(x, "tableBodyHeight", js.undefined)
    
    inline def setTableBodyMaxHeight(value: String): Self = StObject.set(x, "tableBodyMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setTableBodyMaxHeightUndefined: Self = StObject.set(x, "tableBodyMaxHeight", js.undefined)
    
    inline def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    inline def setTextLabels(value: PartialMUIDataTableTextLaBody): Self = StObject.set(x, "textLabels", value.asInstanceOf[js.Any])
    
    inline def setTextLabelsUndefined: Self = StObject.set(x, "textLabels", js.undefined)
    
    inline def setViewColumns(value: ToolbarButton): Self = StObject.set(x, "viewColumns", value.asInstanceOf[js.Any])
    
    inline def setViewColumnsUndefined: Self = StObject.set(x, "viewColumns", js.undefined)
  }
}
