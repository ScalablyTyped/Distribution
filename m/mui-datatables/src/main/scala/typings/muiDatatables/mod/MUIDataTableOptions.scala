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

/* Inlined std.Partial<{  caseSensitive :boolean,   confirmFilters :boolean,   columnOrder :std.Array<number>,   count :number, customFilterDialogFooter (filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList'], applyNewFilters : (args : ...any): any | undefined): react.react.ReactNode, customFooter (rowCount : number, page : number, rowsPerPage : number, changeRowsPerPage : (page : string | number): void, changePage : (newPage : number): void, textLabels : std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabels>): react.react.ReactNode, customRowRender (data : std.Array<any>, dataIndex : number, rowIndex : number): react.react.ReactNode, customSearch (searchQuery : string, currentRow : std.Array<any>, columns : std.Array<any>): boolean, customSearchRender (searchText : string, handleSearch : (text : string): void, hideSearch : (): void, options : any): react.react.Component<{}, {}, any> | react.react.<global>.JSX.Element, customSort (data : std.Array<any>, colIndex : number, order : string): std.Array<any>, customTableBodyFooterRender (options : {  data :std.Array<any>,   selectableRows :mui-datatables.mui-datatables.SelectableRows,   columns :std.Array<any>}): any, customToolbar (data : {  displayData :mui-datatables.mui-datatables.DisplayData}): react.react.ReactNode, customToolbarSelect (selectedRows : {  data :std.Array<{  index :number,   dataIndex :number}>,   lookup :{[key: number] : boolean}}, displayData : mui-datatables.mui-datatables.DisplayData, setSelectedRows : (rows : std.Array<number>): void): react.react.ReactNode,   disableToolbarSelect :boolean,   download :mui-datatables.mui-datatables.ToolbarButton,   downloadOptions :std.Partial<{  filename :string,   separator :string,   filterOptions :std.Partial<{  useDisplayedColumnsOnly :boolean,   useDisplayedRowsOnly :boolean}>}>,   draggableColumns :mui-datatables.mui-datatables.MUIDataTableDraggableColumns,   elevation :number,   enableNestedDataAccess :string,   expandableRows :boolean,   expandableRowsHeader :boolean,   expandableRowsOnClick :boolean,   filter :mui-datatables.mui-datatables.ToolbarButton,   filterArrayFullMatch :boolean,   filterType :mui-datatables.mui-datatables.FilterType,   fixedHeader :boolean,   fixedHeaderOptions :{  xAxis :boolean,   yAxis :boolean},   fixedSelectColumn :boolean, isRowExpandable (dataIndex : number, expandedRows : mui-datatables.mui-datatables.MUIDataTableIsRowCheck | undefined): boolean, isRowSelectable (dataIndex : number, selectedRows : mui-datatables.mui-datatables.MUIDataTableIsRowCheck | undefined): boolean,   jumpToPage :boolean, onCellClick (colData : any, cellMeta : {  colIndex :number,   rowIndex :number,   dataIndex :number,   event :react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>}): void, onChangePage (currentPage : number): void, onChangeRowsPerPage (numberOfRows : number): void, onColumnOrderChange (newColumnOrder : std.Array<number>, columnIndex : number, newPosition : number): void, onColumnSortChange (changedColumn : string, direction : 'asc' | 'desc'): void,   onColumnViewChange :(changedColumn : string, action : string): void | undefined, onDownload (buildHead : (columns : any): string, buildBody : (data : any): string, columns : any, data : any): string | boolean, onFilterChange (changedColumn : string | mui-datatables.mui-datatables.MUIDataTableColumn | null, filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList'], type : mui-datatables.mui-datatables.FilterType | 'chip' | 'reset', changedColumnIndex : number, displayData : mui-datatables.mui-datatables.DisplayData): void, onFilterChipClose (index : number, removedFilter : string, filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList']): void, onFilterConfirm (filterList : mui-datatables.mui-datatables.MUIDataTableState['filterList']): void, onFilterDialogClose (): void, onFilterDialogOpen (): void, onRowClick (rowData : std.Array<string>, rowMeta : {  dataIndex :number,   rowIndex :number}): void, onRowExpansionChange (currentRowsExpanded : std.Array<any>, allRowsExpanded : std.Array<any>, rowsExpanded : std.Array<any> | undefined): void, onRowsDelete (rowsDeleted : {  lookup :{[dataIndex: number] : boolean},   data :std.Array<{  index :number,   dataIndex :number}>}, newTableData : std.Array<any>): void | false, onRowSelectionChange (currentRowsSelected : std.Array<any>, allRowsSelected : std.Array<any>, rowsSelected : std.Array<any> | undefined): void, onSearchChange (searchText : string | null): void, onSearchClose (): void, onSearchOpen (): void, onTableChange (action : string, tableState : mui-datatables.mui-datatables.MUIDataTableState): void, onTableInit (action : string, tableState : mui-datatables.mui-datatables.MUIDataTableState): void, onViewColumnsChange (changedColumn : string, action : string): void,   page :number,   pagination :boolean,   print :mui-datatables.mui-datatables.ToolbarButton, renderExpandableRow (rowData : std.Array<string>, rowMeta : {  dataIndex :number,   rowIndex :number}): react.react.ReactNode,   resizableColumns :boolean,   responsive :mui-datatables.mui-datatables.Responsive,   rowHover :boolean,   rowsExpanded :std.Array<any>,   rowsPerPage :number,   rowsPerPageOptions :std.Array<number>,   rowsSelected :std.Array<any>,   search :mui-datatables.mui-datatables.ToolbarButton,   searchOpen :boolean,   searchProps :react.react.HTMLAttributes<std.HTMLInputElement>,   searchPlaceholder :string,   searchText :string,   selectableRows :mui-datatables.mui-datatables.SelectableRows,   selectableRowsHeader :boolean,   selectableRowsHideCheckboxes :boolean,   selectableRowsOnClick :boolean,   selectToolbarPlacement :'replace' | 'above' | 'none',   serverSide :boolean, setFilterChipProps (colIndex : number, colName : string, data : std.ReadonlyArray<std.Array<any>>): mui-datatables.mui-datatables.MUIDataTableChip, setRowProps (row : std.Array<any>, dataIndex : number, rowIndex : number): object, setTableProps (): object,   sort :boolean,   sortFilterList :boolean,   sortOrder :mui-datatables.mui-datatables.MUISortOptions,   tableId :string,   tableBodyHeight :string,   tableBodyMaxHeight :string,   textLabels :std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabels>,   viewColumns :mui-datatables.mui-datatables.ToolbarButton}> */
trait MUIDataTableOptions extends StObject {
  
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var columnOrder: js.UndefOr[js.Array[Double]] = js.undefined
  
  var confirmFilters: js.UndefOr[Boolean] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
  
  var customFilterDialogFooter: js.UndefOr[
    js.Function2[
      /* filterList */ js.Array[js.Array[String]], 
      /* applyNewFilters */ js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]], 
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
    js.Function3[/* data */ js.Array[js.Any], /* dataIndex */ Double, /* rowIndex */ Double, ReactNode]
  ] = js.undefined
  
  var customSearch: js.UndefOr[
    js.Function3[
      /* searchQuery */ String, 
      /* currentRow */ js.Array[js.Any], 
      /* columns */ js.Array[js.Any], 
      Boolean
    ]
  ] = js.undefined
  
  var customSearchRender: js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Function1[/* text */ String, Unit], 
      /* hideSearch */ js.Function0[Unit], 
      /* options */ js.Any, 
      (Component[js.Object, js.Object, js.Any]) | Element
    ]
  ] = js.undefined
  
  var customSort: js.UndefOr[
    js.Function3[
      /* data */ js.Array[js.Any], 
      /* colIndex */ Double, 
      /* order */ String, 
      js.Array[js.Any]
    ]
  ] = js.undefined
  
  var customTableBodyFooterRender: js.UndefOr[js.Function1[/* options */ Columns, js.Any]] = js.undefined
  
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
  
  var onCellClick: js.UndefOr[js.Function2[/* colData */ js.Any, /* cellMeta */ ColIndex, Unit]] = js.undefined
  
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
      /* buildHead */ js.Function1[/* columns */ js.Any, String], 
      /* buildBody */ js.Function1[/* data */ js.Any, String], 
      /* columns */ js.Any, 
      /* data */ js.Any, 
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
      /* currentRowsExpanded */ js.Array[js.Any], 
      /* allRowsExpanded */ js.Array[js.Any], 
      /* rowsExpanded */ js.UndefOr[js.Array[js.Any]], 
      Unit
    ]
  ] = js.undefined
  
  var onRowSelectionChange: js.UndefOr[
    js.Function3[
      /* currentRowsSelected */ js.Array[js.Any], 
      /* allRowsSelected */ js.Array[js.Any], 
      /* rowsSelected */ js.UndefOr[js.Array[js.Any]], 
      Unit
    ]
  ] = js.undefined
  
  var onRowsDelete: js.UndefOr[
    js.Function2[/* rowsDeleted */ Lookup, /* newTableData */ js.Array[js.Any], Unit | `false`]
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
  
  var rowsExpanded: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var rowsPerPage: js.UndefOr[Double] = js.undefined
  
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.undefined
  
  var rowsSelected: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var search: js.UndefOr[ToolbarButton] = js.undefined
  
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
      /* data */ js.Array[js.Array[js.Any]], 
      MUIDataTableChip
    ]
  ] = js.undefined
  
  var setRowProps: js.UndefOr[
    js.Function3[/* row */ js.Array[js.Any], /* dataIndex */ Double, /* rowIndex */ Double, js.Object]
  ] = js.undefined
  
  var setTableProps: js.UndefOr[js.Function0[js.Object]] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
  
  var sortFilterList: js.UndefOr[Boolean] = js.undefined
  
  var sortOrder: js.UndefOr[MUISortOptions] = js.undefined
  
  var tableBodyHeight: js.UndefOr[String] = js.undefined
  
  var tableBodyMaxHeight: js.UndefOr[String] = js.undefined
  
  var tableId: js.UndefOr[String] = js.undefined
  
  var textLabels: js.UndefOr[PartialMUIDataTableTextLaBody] = js.undefined
  
  var viewColumns: js.UndefOr[ToolbarButton] = js.undefined
}
object MUIDataTableOptions {
  
  @scala.inline
  def apply(): MUIDataTableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableOptions]
  }
  
  @scala.inline
  implicit class MUIDataTableOptionsMutableBuilder[Self <: MUIDataTableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setColumnOrder(value: js.Array[Double]): Self = StObject.set(x, "columnOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnOrderUndefined: Self = StObject.set(x, "columnOrder", js.undefined)
    
    @scala.inline
    def setColumnOrderVarargs(value: Double*): Self = StObject.set(x, "columnOrder", js.Array(value :_*))
    
    @scala.inline
    def setConfirmFilters(value: Boolean): Self = StObject.set(x, "confirmFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmFiltersUndefined: Self = StObject.set(x, "confirmFilters", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setCustomFilterDialogFooter(
      value: (/* filterList */ js.Array[js.Array[String]], /* applyNewFilters */ js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]]) => ReactNode
    ): Self = StObject.set(x, "customFilterDialogFooter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCustomFilterDialogFooterUndefined: Self = StObject.set(x, "customFilterDialogFooter", js.undefined)
    
    @scala.inline
    def setCustomFooter(
      value: (/* rowCount */ Double, /* page */ Double, /* rowsPerPage */ Double, /* changeRowsPerPage */ js.Function1[/* page */ String | Double, Unit], /* changePage */ js.Function1[/* newPage */ Double, Unit], /* textLabels */ PartialMUIDataTableTextLaBody) => ReactNode
    ): Self = StObject.set(x, "customFooter", js.Any.fromFunction6(value))
    
    @scala.inline
    def setCustomFooterUndefined: Self = StObject.set(x, "customFooter", js.undefined)
    
    @scala.inline
    def setCustomRowRender(value: (/* data */ js.Array[js.Any], /* dataIndex */ Double, /* rowIndex */ Double) => ReactNode): Self = StObject.set(x, "customRowRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCustomRowRenderUndefined: Self = StObject.set(x, "customRowRender", js.undefined)
    
    @scala.inline
    def setCustomSearch(
      value: (/* searchQuery */ String, /* currentRow */ js.Array[js.Any], /* columns */ js.Array[js.Any]) => Boolean
    ): Self = StObject.set(x, "customSearch", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCustomSearchRender(
      value: (/* searchText */ String, /* handleSearch */ js.Function1[/* text */ String, Unit], /* hideSearch */ js.Function0[Unit], /* options */ js.Any) => (Component[js.Object, js.Object, js.Any]) | Element
    ): Self = StObject.set(x, "customSearchRender", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCustomSearchRenderUndefined: Self = StObject.set(x, "customSearchRender", js.undefined)
    
    @scala.inline
    def setCustomSearchUndefined: Self = StObject.set(x, "customSearch", js.undefined)
    
    @scala.inline
    def setCustomSort(
      value: (/* data */ js.Array[js.Any], /* colIndex */ Double, /* order */ String) => js.Array[js.Any]
    ): Self = StObject.set(x, "customSort", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCustomSortUndefined: Self = StObject.set(x, "customSort", js.undefined)
    
    @scala.inline
    def setCustomTableBodyFooterRender(value: /* options */ Columns => js.Any): Self = StObject.set(x, "customTableBodyFooterRender", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomTableBodyFooterRenderUndefined: Self = StObject.set(x, "customTableBodyFooterRender", js.undefined)
    
    @scala.inline
    def setCustomToolbar(value: /* data */ typings.muiDatatables.anon.DisplayData => ReactNode): Self = StObject.set(x, "customToolbar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomToolbarSelect(
      value: (/* selectedRows */ DataLookup, /* displayData */ DisplayData, /* setSelectedRows */ js.Function1[/* rows */ js.Array[Double], Unit]) => ReactNode
    ): Self = StObject.set(x, "customToolbarSelect", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCustomToolbarSelectUndefined: Self = StObject.set(x, "customToolbarSelect", js.undefined)
    
    @scala.inline
    def setCustomToolbarUndefined: Self = StObject.set(x, "customToolbar", js.undefined)
    
    @scala.inline
    def setDisableToolbarSelect(value: Boolean): Self = StObject.set(x, "disableToolbarSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableToolbarSelectUndefined: Self = StObject.set(x, "disableToolbarSelect", js.undefined)
    
    @scala.inline
    def setDownload(value: ToolbarButton): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadOptions(value: Partialfilenamestringsepa): Self = StObject.set(x, "downloadOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadOptionsUndefined: Self = StObject.set(x, "downloadOptions", js.undefined)
    
    @scala.inline
    def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    @scala.inline
    def setDraggableColumns(value: MUIDataTableDraggableColumns): Self = StObject.set(x, "draggableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableColumnsUndefined: Self = StObject.set(x, "draggableColumns", js.undefined)
    
    @scala.inline
    def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    @scala.inline
    def setEnableNestedDataAccess(value: String): Self = StObject.set(x, "enableNestedDataAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableNestedDataAccessUndefined: Self = StObject.set(x, "enableNestedDataAccess", js.undefined)
    
    @scala.inline
    def setExpandableRows(value: Boolean): Self = StObject.set(x, "expandableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableRowsHeader(value: Boolean): Self = StObject.set(x, "expandableRowsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableRowsHeaderUndefined: Self = StObject.set(x, "expandableRowsHeader", js.undefined)
    
    @scala.inline
    def setExpandableRowsOnClick(value: Boolean): Self = StObject.set(x, "expandableRowsOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableRowsOnClickUndefined: Self = StObject.set(x, "expandableRowsOnClick", js.undefined)
    
    @scala.inline
    def setExpandableRowsUndefined: Self = StObject.set(x, "expandableRows", js.undefined)
    
    @scala.inline
    def setFilter(value: ToolbarButton): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterArrayFullMatch(value: Boolean): Self = StObject.set(x, "filterArrayFullMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterArrayFullMatchUndefined: Self = StObject.set(x, "filterArrayFullMatch", js.undefined)
    
    @scala.inline
    def setFilterType(value: FilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFixedHeader(value: Boolean): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedHeaderOptions(value: XAxis): Self = StObject.set(x, "fixedHeaderOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedHeaderOptionsUndefined: Self = StObject.set(x, "fixedHeaderOptions", js.undefined)
    
    @scala.inline
    def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
    
    @scala.inline
    def setFixedSelectColumn(value: Boolean): Self = StObject.set(x, "fixedSelectColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedSelectColumnUndefined: Self = StObject.set(x, "fixedSelectColumn", js.undefined)
    
    @scala.inline
    def setIsRowExpandable(value: (/* dataIndex */ Double, /* expandedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => Boolean): Self = StObject.set(x, "isRowExpandable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsRowExpandableUndefined: Self = StObject.set(x, "isRowExpandable", js.undefined)
    
    @scala.inline
    def setIsRowSelectable(value: (/* dataIndex */ Double, /* selectedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => Boolean): Self = StObject.set(x, "isRowSelectable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsRowSelectableUndefined: Self = StObject.set(x, "isRowSelectable", js.undefined)
    
    @scala.inline
    def setJumpToPage(value: Boolean): Self = StObject.set(x, "jumpToPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJumpToPageUndefined: Self = StObject.set(x, "jumpToPage", js.undefined)
    
    @scala.inline
    def setOnCellClick(value: (/* colData */ js.Any, /* cellMeta */ ColIndex) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
    
    @scala.inline
    def setOnChangePage(value: /* currentPage */ Double => Unit): Self = StObject.set(x, "onChangePage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangePageUndefined: Self = StObject.set(x, "onChangePage", js.undefined)
    
    @scala.inline
    def setOnChangeRowsPerPage(value: /* numberOfRows */ Double => Unit): Self = StObject.set(x, "onChangeRowsPerPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeRowsPerPageUndefined: Self = StObject.set(x, "onChangeRowsPerPage", js.undefined)
    
    @scala.inline
    def setOnColumnOrderChange(
      value: (/* newColumnOrder */ js.Array[Double], /* columnIndex */ Double, /* newPosition */ Double) => Unit
    ): Self = StObject.set(x, "onColumnOrderChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnColumnOrderChangeUndefined: Self = StObject.set(x, "onColumnOrderChange", js.undefined)
    
    @scala.inline
    def setOnColumnSortChange(value: (/* changedColumn */ String, /* direction */ asc | desc) => Unit): Self = StObject.set(x, "onColumnSortChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnColumnSortChangeUndefined: Self = StObject.set(x, "onColumnSortChange", js.undefined)
    
    @scala.inline
    def setOnColumnViewChange(value: (/* changedColumn */ String, /* action */ String) => Unit): Self = StObject.set(x, "onColumnViewChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnColumnViewChangeUndefined: Self = StObject.set(x, "onColumnViewChange", js.undefined)
    
    @scala.inline
    def setOnDownload(
      value: (/* buildHead */ js.Function1[/* columns */ js.Any, String], /* buildBody */ js.Function1[/* data */ js.Any, String], /* columns */ js.Any, /* data */ js.Any) => String | Boolean
    ): Self = StObject.set(x, "onDownload", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnDownloadUndefined: Self = StObject.set(x, "onDownload", js.undefined)
    
    @scala.inline
    def setOnFilterChange(
      value: (/* changedColumn */ String | MUIDataTableColumn | Null, /* filterList */ js.Array[js.Array[String]], /* type */ FilterType | chip | reset, /* changedColumnIndex */ Double, /* displayData */ DisplayData) => Unit
    ): Self = StObject.set(x, "onFilterChange", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOnFilterChangeUndefined: Self = StObject.set(x, "onFilterChange", js.undefined)
    
    @scala.inline
    def setOnFilterChipClose(
      value: (/* index */ Double, /* removedFilter */ String, /* filterList */ js.Array[js.Array[String]]) => Unit
    ): Self = StObject.set(x, "onFilterChipClose", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnFilterChipCloseUndefined: Self = StObject.set(x, "onFilterChipClose", js.undefined)
    
    @scala.inline
    def setOnFilterConfirm(value: /* filterList */ js.Array[js.Array[String]] => Unit): Self = StObject.set(x, "onFilterConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFilterConfirmUndefined: Self = StObject.set(x, "onFilterConfirm", js.undefined)
    
    @scala.inline
    def setOnFilterDialogClose(value: () => Unit): Self = StObject.set(x, "onFilterDialogClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFilterDialogCloseUndefined: Self = StObject.set(x, "onFilterDialogClose", js.undefined)
    
    @scala.inline
    def setOnFilterDialogOpen(value: () => Unit): Self = StObject.set(x, "onFilterDialogOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFilterDialogOpenUndefined: Self = StObject.set(x, "onFilterDialogOpen", js.undefined)
    
    @scala.inline
    def setOnRowClick(value: (/* rowData */ js.Array[String], /* rowMeta */ RowIndex) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    @scala.inline
    def setOnRowExpansionChange(
      value: (/* currentRowsExpanded */ js.Array[js.Any], /* allRowsExpanded */ js.Array[js.Any], /* rowsExpanded */ js.UndefOr[js.Array[js.Any]]) => Unit
    ): Self = StObject.set(x, "onRowExpansionChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnRowExpansionChangeUndefined: Self = StObject.set(x, "onRowExpansionChange", js.undefined)
    
    @scala.inline
    def setOnRowSelectionChange(
      value: (/* currentRowsSelected */ js.Array[js.Any], /* allRowsSelected */ js.Array[js.Any], /* rowsSelected */ js.UndefOr[js.Array[js.Any]]) => Unit
    ): Self = StObject.set(x, "onRowSelectionChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnRowSelectionChangeUndefined: Self = StObject.set(x, "onRowSelectionChange", js.undefined)
    
    @scala.inline
    def setOnRowsDelete(value: (/* rowsDeleted */ Lookup, /* newTableData */ js.Array[js.Any]) => Unit | `false`): Self = StObject.set(x, "onRowsDelete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRowsDeleteUndefined: Self = StObject.set(x, "onRowsDelete", js.undefined)
    
    @scala.inline
    def setOnSearchChange(value: /* searchText */ String | Null => Unit): Self = StObject.set(x, "onSearchChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSearchChangeUndefined: Self = StObject.set(x, "onSearchChange", js.undefined)
    
    @scala.inline
    def setOnSearchClose(value: () => Unit): Self = StObject.set(x, "onSearchClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSearchCloseUndefined: Self = StObject.set(x, "onSearchClose", js.undefined)
    
    @scala.inline
    def setOnSearchOpen(value: () => Unit): Self = StObject.set(x, "onSearchOpen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSearchOpenUndefined: Self = StObject.set(x, "onSearchOpen", js.undefined)
    
    @scala.inline
    def setOnTableChange(value: (/* action */ String, /* tableState */ MUIDataTableState) => Unit): Self = StObject.set(x, "onTableChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnTableChangeUndefined: Self = StObject.set(x, "onTableChange", js.undefined)
    
    @scala.inline
    def setOnTableInit(value: (/* action */ String, /* tableState */ MUIDataTableState) => Unit): Self = StObject.set(x, "onTableInit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnTableInitUndefined: Self = StObject.set(x, "onTableInit", js.undefined)
    
    @scala.inline
    def setOnViewColumnsChange(value: (/* changedColumn */ String, /* action */ String) => Unit): Self = StObject.set(x, "onViewColumnsChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnViewColumnsChangeUndefined: Self = StObject.set(x, "onViewColumnsChange", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    @scala.inline
    def setPrint(value: ToolbarButton): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    
    @scala.inline
    def setRenderExpandableRow(value: (/* rowData */ js.Array[String], /* rowMeta */ RowIndex) => ReactNode): Self = StObject.set(x, "renderExpandableRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderExpandableRowUndefined: Self = StObject.set(x, "renderExpandableRow", js.undefined)
    
    @scala.inline
    def setResizableColumns(value: Boolean): Self = StObject.set(x, "resizableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizableColumnsUndefined: Self = StObject.set(x, "resizableColumns", js.undefined)
    
    @scala.inline
    def setResponsive(value: Responsive): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
    
    @scala.inline
    def setRowHover(value: Boolean): Self = StObject.set(x, "rowHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHoverUndefined: Self = StObject.set(x, "rowHover", js.undefined)
    
    @scala.inline
    def setRowsExpanded(value: js.Array[js.Any]): Self = StObject.set(x, "rowsExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsExpandedUndefined: Self = StObject.set(x, "rowsExpanded", js.undefined)
    
    @scala.inline
    def setRowsExpandedVarargs(value: js.Any*): Self = StObject.set(x, "rowsExpanded", js.Array(value :_*))
    
    @scala.inline
    def setRowsPerPage(value: Double): Self = StObject.set(x, "rowsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPageOptions(value: js.Array[Double]): Self = StObject.set(x, "rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsPerPageOptionsUndefined: Self = StObject.set(x, "rowsPerPageOptions", js.undefined)
    
    @scala.inline
    def setRowsPerPageOptionsVarargs(value: Double*): Self = StObject.set(x, "rowsPerPageOptions", js.Array(value :_*))
    
    @scala.inline
    def setRowsPerPageUndefined: Self = StObject.set(x, "rowsPerPage", js.undefined)
    
    @scala.inline
    def setRowsSelected(value: js.Array[js.Any]): Self = StObject.set(x, "rowsSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsSelectedUndefined: Self = StObject.set(x, "rowsSelected", js.undefined)
    
    @scala.inline
    def setRowsSelectedVarargs(value: js.Any*): Self = StObject.set(x, "rowsSelected", js.Array(value :_*))
    
    @scala.inline
    def setSearch(value: ToolbarButton): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchOpen(value: Boolean): Self = StObject.set(x, "searchOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchOpenUndefined: Self = StObject.set(x, "searchOpen", js.undefined)
    
    @scala.inline
    def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    @scala.inline
    def setSearchProps(value: HTMLAttributes[HTMLInputElement]): Self = StObject.set(x, "searchProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPropsUndefined: Self = StObject.set(x, "searchProps", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    @scala.inline
    def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    @scala.inline
    def setSelectToolbarPlacement(value: replace | above | none): Self = StObject.set(x, "selectToolbarPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectToolbarPlacementUndefined: Self = StObject.set(x, "selectToolbarPlacement", js.undefined)
    
    @scala.inline
    def setSelectableRows(value: SelectableRows): Self = StObject.set(x, "selectableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableRowsHeader(value: Boolean): Self = StObject.set(x, "selectableRowsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableRowsHeaderUndefined: Self = StObject.set(x, "selectableRowsHeader", js.undefined)
    
    @scala.inline
    def setSelectableRowsHideCheckboxes(value: Boolean): Self = StObject.set(x, "selectableRowsHideCheckboxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableRowsHideCheckboxesUndefined: Self = StObject.set(x, "selectableRowsHideCheckboxes", js.undefined)
    
    @scala.inline
    def setSelectableRowsOnClick(value: Boolean): Self = StObject.set(x, "selectableRowsOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableRowsOnClickUndefined: Self = StObject.set(x, "selectableRowsOnClick", js.undefined)
    
    @scala.inline
    def setSelectableRowsUndefined: Self = StObject.set(x, "selectableRows", js.undefined)
    
    @scala.inline
    def setServerSide(value: Boolean): Self = StObject.set(x, "serverSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideUndefined: Self = StObject.set(x, "serverSide", js.undefined)
    
    @scala.inline
    def setSetFilterChipProps(
      value: (/* colIndex */ Double, /* colName */ String, /* data */ js.Array[js.Array[js.Any]]) => MUIDataTableChip
    ): Self = StObject.set(x, "setFilterChipProps", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetFilterChipPropsUndefined: Self = StObject.set(x, "setFilterChipProps", js.undefined)
    
    @scala.inline
    def setSetRowProps(value: (/* row */ js.Array[js.Any], /* dataIndex */ Double, /* rowIndex */ Double) => js.Object): Self = StObject.set(x, "setRowProps", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetRowPropsUndefined: Self = StObject.set(x, "setRowProps", js.undefined)
    
    @scala.inline
    def setSetTableProps(value: () => js.Object): Self = StObject.set(x, "setTableProps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTablePropsUndefined: Self = StObject.set(x, "setTableProps", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFilterList(value: Boolean): Self = StObject.set(x, "sortFilterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFilterListUndefined: Self = StObject.set(x, "sortFilterList", js.undefined)
    
    @scala.inline
    def setSortOrder(value: MUISortOptions): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setTableBodyHeight(value: String): Self = StObject.set(x, "tableBodyHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBodyHeightUndefined: Self = StObject.set(x, "tableBodyHeight", js.undefined)
    
    @scala.inline
    def setTableBodyMaxHeight(value: String): Self = StObject.set(x, "tableBodyMaxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBodyMaxHeightUndefined: Self = StObject.set(x, "tableBodyMaxHeight", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    @scala.inline
    def setTextLabels(value: PartialMUIDataTableTextLaBody): Self = StObject.set(x, "textLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLabelsUndefined: Self = StObject.set(x, "textLabels", js.undefined)
    
    @scala.inline
    def setViewColumns(value: ToolbarButton): Self = StObject.set(x, "viewColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewColumnsUndefined: Self = StObject.set(x, "viewColumns", js.undefined)
  }
}
