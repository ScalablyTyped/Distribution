package typings.muiDashDatatables.muiDashDatatablesMod

import typings.muiDashDatatables.Anon_ColIndex
import typings.muiDashDatatables.Anon_Data
import typings.muiDashDatatables.Anon_DataDataIndex
import typings.muiDashDatatables.Anon_DataIndexRowIndex
import typings.muiDashDatatables.Anon_Filename
import typings.muiDashDatatables.muiDashDatatablesStrings.chip
import typings.muiDashDatatables.muiDashDatatablesStrings.reset
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import typings.std.BlobPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var customFilterDialogFooter: js.UndefOr[js.Function1[/* filterList */ js.Array[_], ReactNode]] = js.undefined
  var customFooter: js.UndefOr[
    js.Function5[
      /* rowCount */ Double, 
      /* page */ Double, 
      /* rowsPerPage */ Double, 
      /* changeRowsPerPage */ js.Function0[_], 
      /* changePage */ Double, 
      ReactNode
    ]
  ] = js.undefined
  var customRowRender: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* dataIndex */ Double, /* rowIndex */ Double, ReactNode]
  ] = js.undefined
  var customSearch: js.UndefOr[
    js.Function3[
      /* searchQuery */ String, 
      /* currentRow */ js.Array[_], 
      /* columns */ js.Array[_], 
      Boolean
    ]
  ] = js.undefined
  var customSearchRender: js.UndefOr[
    js.Function4[
      /* searchText */ String, 
      /* handleSearch */ js.Any, 
      /* hideSearch */ js.Any, 
      /* options */ js.Any, 
      (Component[js.Object, js.Object, _]) | Element
    ]
  ] = js.undefined
  var customSort: js.UndefOr[
    js.Function3[/* data */ js.Array[_], /* colIndex */ Double, /* order */ String, js.Array[_]]
  ] = js.undefined
  var customToolbar: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var customToolbarSelect: js.UndefOr[
    js.Function3[
      /* selectedRows */ Anon_Data, 
      /* displayData */ js.Array[Anon_DataDataIndex], 
      /* setSelectedRows */ js.Function1[/* rows */ js.Array[Double], Unit], 
      ReactNode
    ]
  ] = js.undefined
  var disableToolbarSelect: js.UndefOr[Boolean] = js.undefined
  var download: js.UndefOr[Boolean] = js.undefined
  var downloadOptions: js.UndefOr[Anon_Filename] = js.undefined
  var elevation: js.UndefOr[Double] = js.undefined
  var expandableRows: js.UndefOr[Boolean] = js.undefined
  var expandableRowsOnClick: js.UndefOr[Boolean] = js.undefined
  var filter: js.UndefOr[Boolean] = js.undefined
  var filterType: js.UndefOr[FilterType] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
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
  var onCellClick: js.UndefOr[js.Function2[/* colData */ js.Any, /* cellMeta */ Anon_ColIndex, Unit]] = js.undefined
  var onChangePage: js.UndefOr[js.Function1[/* currentPage */ Double, Unit]] = js.undefined
  var onChangeRowsPerPage: js.UndefOr[js.Function1[/* numberOfRows */ Double, Unit]] = js.undefined
  var onColumnSortChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* direction */ String, Unit]] = js.undefined
  var onColumnViewChange: js.UndefOr[js.Function2[/* changedColumn */ String, /* action */ String, Unit]] = js.undefined
  var onDownload: js.UndefOr[
    js.Function4[
      /* buildHead */ js.Function1[/* columns */ js.Any, String], 
      /* buildBody */ js.Function1[/* data */ js.Any, String], 
      /* columns */ js.Any, 
      /* data */ js.Any, 
      BlobPart
    ]
  ] = js.undefined
  var onFilterChange: js.UndefOr[
    js.Function3[
      /* changedColumn */ String, 
      /* filterList */ js.Array[_], 
      /* type */ FilterType | chip | reset, 
      Unit
    ]
  ] = js.undefined
  var onFilterDialogClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onFilterDialogOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onRowClick: js.UndefOr[
    js.Function2[/* rowData */ js.Array[String], /* rowMeta */ Anon_DataIndexRowIndex, Unit]
  ] = js.undefined
  var onRowsDelete: js.UndefOr[js.Function1[/* rowsDeleted */ js.Array[_], Unit]] = js.undefined
  var onRowsExpand: js.UndefOr[
    js.Function2[/* currentRowsExpanded */ js.Array[_], /* allRowsExpanded */ js.Array[_], Unit]
  ] = js.undefined
  var onRowsSelect: js.UndefOr[
    js.Function2[/* currentRowsSelected */ js.Array[_], /* rowsSelected */ js.Array[_], Unit]
  ] = js.undefined
  var onSearchChange: js.UndefOr[js.Function1[/* searchText */ String, Unit]] = js.undefined
  var onSearchClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSearchOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTableChange: js.UndefOr[js.Function2[/* action */ String, /* tableState */ MUIDataTableState, Unit]] = js.undefined
  var onTableInit: js.UndefOr[js.Function2[/* action */ String, /* tableState */ MUIDataTableState, Unit]] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var print: js.UndefOr[Boolean] = js.undefined
  var renderExpandableRow: js.UndefOr[
    js.Function2[/* rowData */ js.Array[String], /* rowMeta */ Anon_DataIndexRowIndex, ReactNode]
  ] = js.undefined
  var resizableColumns: js.UndefOr[Boolean] = js.undefined
  var responsive: js.UndefOr[Responsive] = js.undefined
  var rowHover: js.UndefOr[Boolean] = js.undefined
  var rowsExpanded: js.UndefOr[js.Array[_]] = js.undefined
  var rowsPerPage: js.UndefOr[Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[Double]] = js.undefined
  var rowsSelected: js.UndefOr[js.Array[_]] = js.undefined
  var search: js.UndefOr[Boolean] = js.undefined
  var searchOpen: js.UndefOr[Boolean] = js.undefined
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  var searchText: js.UndefOr[String] = js.undefined
  var selectableRows: js.UndefOr[SelectableRows] = js.undefined
  var selectableRowsHeader: js.UndefOr[Boolean] = js.undefined
  var selectableRowsOnClick: js.UndefOr[Boolean] = js.undefined
  var serverSide: js.UndefOr[Boolean] = js.undefined
  var serverSideFilterList: js.UndefOr[js.Array[_]] = js.undefined
  var setRowProps: js.UndefOr[js.Function2[/* row */ js.Array[_], /* rowIndex */ Double, js.Object]] = js.undefined
  var setTableProps: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var sort: js.UndefOr[Boolean] = js.undefined
  var sortFilterList: js.UndefOr[Boolean] = js.undefined
  var textLabels: js.UndefOr[MUIDataTableTextLabels] = js.undefined
  var viewColumns: js.UndefOr[Boolean] = js.undefined
}

object MUIDataTableOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    count: Int | Double = null,
    customFilterDialogFooter: /* filterList */ js.Array[_] => ReactNode = null,
    customFooter: (/* rowCount */ Double, /* page */ Double, /* rowsPerPage */ Double, /* changeRowsPerPage */ js.Function0[_], /* changePage */ Double) => ReactNode = null,
    customRowRender: (/* data */ js.Array[_], /* dataIndex */ Double, /* rowIndex */ Double) => ReactNode = null,
    customSearch: (/* searchQuery */ String, /* currentRow */ js.Array[_], /* columns */ js.Array[_]) => Boolean = null,
    customSearchRender: (/* searchText */ String, /* handleSearch */ js.Any, /* hideSearch */ js.Any, /* options */ js.Any) => (Component[js.Object, js.Object, _]) | Element = null,
    customSort: (/* data */ js.Array[_], /* colIndex */ Double, /* order */ String) => js.Array[_] = null,
    customToolbar: () => ReactNode = null,
    customToolbarSelect: (/* selectedRows */ Anon_Data, /* displayData */ js.Array[Anon_DataDataIndex], /* setSelectedRows */ js.Function1[/* rows */ js.Array[Double], Unit]) => ReactNode = null,
    disableToolbarSelect: js.UndefOr[Boolean] = js.undefined,
    download: js.UndefOr[Boolean] = js.undefined,
    downloadOptions: Anon_Filename = null,
    elevation: Int | Double = null,
    expandableRows: js.UndefOr[Boolean] = js.undefined,
    expandableRowsOnClick: js.UndefOr[Boolean] = js.undefined,
    filter: js.UndefOr[Boolean] = js.undefined,
    filterType: FilterType = null,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    isRowExpandable: (/* dataIndex */ Double, /* expandedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => Boolean = null,
    isRowSelectable: (/* dataIndex */ Double, /* selectedRows */ js.UndefOr[MUIDataTableIsRowCheck]) => Boolean = null,
    onCellClick: (/* colData */ js.Any, /* cellMeta */ Anon_ColIndex) => Unit = null,
    onChangePage: /* currentPage */ Double => Unit = null,
    onChangeRowsPerPage: /* numberOfRows */ Double => Unit = null,
    onColumnSortChange: (/* changedColumn */ String, /* direction */ String) => Unit = null,
    onColumnViewChange: (/* changedColumn */ String, /* action */ String) => Unit = null,
    onDownload: (/* buildHead */ js.Function1[/* columns */ js.Any, String], /* buildBody */ js.Function1[/* data */ js.Any, String], /* columns */ js.Any, /* data */ js.Any) => BlobPart = null,
    onFilterChange: (/* changedColumn */ String, /* filterList */ js.Array[_], /* type */ FilterType | chip | reset) => Unit = null,
    onFilterDialogClose: () => Unit = null,
    onFilterDialogOpen: () => Unit = null,
    onRowClick: (/* rowData */ js.Array[String], /* rowMeta */ Anon_DataIndexRowIndex) => Unit = null,
    onRowsDelete: /* rowsDeleted */ js.Array[_] => Unit = null,
    onRowsExpand: (/* currentRowsExpanded */ js.Array[_], /* allRowsExpanded */ js.Array[_]) => Unit = null,
    onRowsSelect: (/* currentRowsSelected */ js.Array[_], /* rowsSelected */ js.Array[_]) => Unit = null,
    onSearchChange: /* searchText */ String => Unit = null,
    onSearchClose: () => Unit = null,
    onSearchOpen: () => Unit = null,
    onTableChange: (/* action */ String, /* tableState */ MUIDataTableState) => Unit = null,
    onTableInit: (/* action */ String, /* tableState */ MUIDataTableState) => Unit = null,
    page: Int | Double = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    print: js.UndefOr[Boolean] = js.undefined,
    renderExpandableRow: (/* rowData */ js.Array[String], /* rowMeta */ Anon_DataIndexRowIndex) => ReactNode = null,
    resizableColumns: js.UndefOr[Boolean] = js.undefined,
    responsive: Responsive = null,
    rowHover: js.UndefOr[Boolean] = js.undefined,
    rowsExpanded: js.Array[_] = null,
    rowsPerPage: Int | Double = null,
    rowsPerPageOptions: js.Array[Double] = null,
    rowsSelected: js.Array[_] = null,
    search: js.UndefOr[Boolean] = js.undefined,
    searchOpen: js.UndefOr[Boolean] = js.undefined,
    searchPlaceholder: String = null,
    searchText: String = null,
    selectableRows: SelectableRows = null,
    selectableRowsHeader: js.UndefOr[Boolean] = js.undefined,
    selectableRowsOnClick: js.UndefOr[Boolean] = js.undefined,
    serverSide: js.UndefOr[Boolean] = js.undefined,
    serverSideFilterList: js.Array[_] = null,
    setRowProps: (/* row */ js.Array[_], /* rowIndex */ Double) => js.Object = null,
    setTableProps: () => js.Object = null,
    sort: js.UndefOr[Boolean] = js.undefined,
    sortFilterList: js.UndefOr[Boolean] = js.undefined,
    textLabels: MUIDataTableTextLabels = null,
    viewColumns: js.UndefOr[Boolean] = js.undefined
  ): MUIDataTableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (customFilterDialogFooter != null) __obj.updateDynamic("customFilterDialogFooter")(js.Any.fromFunction1(customFilterDialogFooter))
    if (customFooter != null) __obj.updateDynamic("customFooter")(js.Any.fromFunction5(customFooter))
    if (customRowRender != null) __obj.updateDynamic("customRowRender")(js.Any.fromFunction3(customRowRender))
    if (customSearch != null) __obj.updateDynamic("customSearch")(js.Any.fromFunction3(customSearch))
    if (customSearchRender != null) __obj.updateDynamic("customSearchRender")(js.Any.fromFunction4(customSearchRender))
    if (customSort != null) __obj.updateDynamic("customSort")(js.Any.fromFunction3(customSort))
    if (customToolbar != null) __obj.updateDynamic("customToolbar")(js.Any.fromFunction0(customToolbar))
    if (customToolbarSelect != null) __obj.updateDynamic("customToolbarSelect")(js.Any.fromFunction3(customToolbarSelect))
    if (!js.isUndefined(disableToolbarSelect)) __obj.updateDynamic("disableToolbarSelect")(disableToolbarSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (downloadOptions != null) __obj.updateDynamic("downloadOptions")(downloadOptions.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableRows)) __obj.updateDynamic("expandableRows")(expandableRows.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableRowsOnClick)) __obj.updateDynamic("expandableRowsOnClick")(expandableRowsOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (isRowExpandable != null) __obj.updateDynamic("isRowExpandable")(js.Any.fromFunction2(isRowExpandable))
    if (isRowSelectable != null) __obj.updateDynamic("isRowSelectable")(js.Any.fromFunction2(isRowSelectable))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (onChangePage != null) __obj.updateDynamic("onChangePage")(js.Any.fromFunction1(onChangePage))
    if (onChangeRowsPerPage != null) __obj.updateDynamic("onChangeRowsPerPage")(js.Any.fromFunction1(onChangeRowsPerPage))
    if (onColumnSortChange != null) __obj.updateDynamic("onColumnSortChange")(js.Any.fromFunction2(onColumnSortChange))
    if (onColumnViewChange != null) __obj.updateDynamic("onColumnViewChange")(js.Any.fromFunction2(onColumnViewChange))
    if (onDownload != null) __obj.updateDynamic("onDownload")(js.Any.fromFunction4(onDownload))
    if (onFilterChange != null) __obj.updateDynamic("onFilterChange")(js.Any.fromFunction3(onFilterChange))
    if (onFilterDialogClose != null) __obj.updateDynamic("onFilterDialogClose")(js.Any.fromFunction0(onFilterDialogClose))
    if (onFilterDialogOpen != null) __obj.updateDynamic("onFilterDialogOpen")(js.Any.fromFunction0(onFilterDialogOpen))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowsDelete != null) __obj.updateDynamic("onRowsDelete")(js.Any.fromFunction1(onRowsDelete))
    if (onRowsExpand != null) __obj.updateDynamic("onRowsExpand")(js.Any.fromFunction2(onRowsExpand))
    if (onRowsSelect != null) __obj.updateDynamic("onRowsSelect")(js.Any.fromFunction2(onRowsSelect))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction1(onSearchChange))
    if (onSearchClose != null) __obj.updateDynamic("onSearchClose")(js.Any.fromFunction0(onSearchClose))
    if (onSearchOpen != null) __obj.updateDynamic("onSearchOpen")(js.Any.fromFunction0(onSearchOpen))
    if (onTableChange != null) __obj.updateDynamic("onTableChange")(js.Any.fromFunction2(onTableChange))
    if (onTableInit != null) __obj.updateDynamic("onTableInit")(js.Any.fromFunction2(onTableInit))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    if (renderExpandableRow != null) __obj.updateDynamic("renderExpandableRow")(js.Any.fromFunction2(renderExpandableRow))
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHover)) __obj.updateDynamic("rowHover")(rowHover.asInstanceOf[js.Any])
    if (rowsExpanded != null) __obj.updateDynamic("rowsExpanded")(rowsExpanded.asInstanceOf[js.Any])
    if (rowsPerPage != null) __obj.updateDynamic("rowsPerPage")(rowsPerPage.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions.asInstanceOf[js.Any])
    if (rowsSelected != null) __obj.updateDynamic("rowsSelected")(rowsSelected.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(searchOpen)) __obj.updateDynamic("searchOpen")(searchOpen.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    if (selectableRows != null) __obj.updateDynamic("selectableRows")(selectableRows.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableRowsHeader)) __obj.updateDynamic("selectableRowsHeader")(selectableRowsHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableRowsOnClick)) __obj.updateDynamic("selectableRowsOnClick")(selectableRowsOnClick.asInstanceOf[js.Any])
    if (!js.isUndefined(serverSide)) __obj.updateDynamic("serverSide")(serverSide.asInstanceOf[js.Any])
    if (serverSideFilterList != null) __obj.updateDynamic("serverSideFilterList")(serverSideFilterList.asInstanceOf[js.Any])
    if (setRowProps != null) __obj.updateDynamic("setRowProps")(js.Any.fromFunction2(setRowProps))
    if (setTableProps != null) __obj.updateDynamic("setTableProps")(js.Any.fromFunction0(setTableProps))
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(sortFilterList)) __obj.updateDynamic("sortFilterList")(sortFilterList.asInstanceOf[js.Any])
    if (textLabels != null) __obj.updateDynamic("textLabels")(textLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(viewColumns)) __obj.updateDynamic("viewColumns")(viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableOptions]
  }
}

