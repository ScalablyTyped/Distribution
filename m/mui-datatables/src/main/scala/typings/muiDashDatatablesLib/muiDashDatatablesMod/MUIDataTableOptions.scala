package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableOptions extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var customFooter: js.UndefOr[
    js.Function5[
      /* rowCount */ scala.Double, 
      /* page */ scala.Double, 
      /* rowsPerPage */ scala.Double, 
      /* changeRowsPerPage */ js.Function0[_], 
      /* changePage */ scala.Double, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var customSearch: js.UndefOr[
    js.Function3[
      /* searchQuery */ java.lang.String, 
      /* currentRow */ js.Array[_], 
      /* columns */ js.Array[_], 
      scala.Boolean
    ]
  ] = js.undefined
  var customSort: js.UndefOr[
    js.Function3[
      /* data */ js.Array[_], 
      /* colIndex */ scala.Double, 
      /* order */ java.lang.String, 
      js.Array[_]
    ]
  ] = js.undefined
  var customToolbar: js.UndefOr[js.Function0[reactLib.reactMod.ReactNode]] = js.undefined
  var customToolbarSelect: js.UndefOr[
    js.Function3[
      /* selectedRows */ muiDashDatatablesLib.Anon_Data, 
      /* displayData */ js.Array[muiDashDatatablesLib.Anon_DataDataIndex], 
      /* setSelectedRows */ js.Function1[/* rows */ js.Array[scala.Double], scala.Unit], 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var download: js.UndefOr[scala.Boolean] = js.undefined
  var downloadOptions: js.UndefOr[muiDashDatatablesLib.Anon_Filename] = js.undefined
  var elevation: js.UndefOr[scala.Double] = js.undefined
  var expandableRows: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var filterType: js.UndefOr[
    muiDashDatatablesLib.muiDashDatatablesLibStrings.dropdown | muiDashDatatablesLib.muiDashDatatablesLibStrings.checkbox | muiDashDatatablesLib.muiDashDatatablesLibStrings.multiselect | muiDashDatatablesLib.muiDashDatatablesLibStrings.textField
  ] = js.undefined
  var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
  var isRowSelectable: js.UndefOr[js.Function1[/* dataIndex */ scala.Double, scala.Boolean]] = js.undefined
  var onCellClick: js.UndefOr[
    js.Function2[/* colData */ js.Any, /* cellMeta */ muiDashDatatablesLib.Anon_ColIndex, scala.Unit]
  ] = js.undefined
  var onChangePage: js.UndefOr[js.Function1[/* currentPage */ scala.Double, scala.Unit]] = js.undefined
  var onChangeRowsPerPage: js.UndefOr[js.Function1[/* numberOfRows */ scala.Double, scala.Unit]] = js.undefined
  var onColumnSortChange: js.UndefOr[
    js.Function2[/* changedColumn */ java.lang.String, /* direction */ java.lang.String, scala.Unit]
  ] = js.undefined
  var onColumnViewChange: js.UndefOr[
    js.Function2[/* changedColumn */ java.lang.String, /* action */ java.lang.String, scala.Unit]
  ] = js.undefined
  var onFilterChange: js.UndefOr[
    js.Function2[/* changedColumn */ java.lang.String, /* filterList */ js.Array[_], scala.Unit]
  ] = js.undefined
  var onRowClick: js.UndefOr[
    js.Function2[
      /* rowData */ js.Array[java.lang.String], 
      /* rowMeta */ muiDashDatatablesLib.Anon_DataIndex, 
      scala.Unit
    ]
  ] = js.undefined
  var onRowsDelete: js.UndefOr[js.Function1[/* rowsDeleted */ js.Array[_], scala.Unit]] = js.undefined
  var onRowsSelect: js.UndefOr[
    js.Function2[/* currentRowsSelected */ js.Array[_], /* rowsSelected */ js.Array[_], scala.Unit]
  ] = js.undefined
  var onSearchChange: js.UndefOr[js.Function1[/* searchText */ java.lang.String, scala.Unit]] = js.undefined
  var onTableChange: js.UndefOr[
    js.Function2[/* action */ java.lang.String, /* tableState */ js.Object, scala.Unit]
  ] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var pagination: js.UndefOr[scala.Boolean] = js.undefined
  var print: js.UndefOr[scala.Boolean] = js.undefined
  var renderExpandableRow: js.UndefOr[
    js.Function2[
      /* rowData */ js.Array[java.lang.String], 
      /* rowMeta */ muiDashDatatablesLib.Anon_DataIndex, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.undefined
  var resizableColumns: js.UndefOr[scala.Boolean] = js.undefined
  var responsive: js.UndefOr[
    muiDashDatatablesLib.muiDashDatatablesLibStrings.stacked | muiDashDatatablesLib.muiDashDatatablesLibStrings.scroll
  ] = js.undefined
  var rowHover: js.UndefOr[scala.Boolean] = js.undefined
  var rowsPerPage: js.UndefOr[scala.Double] = js.undefined
  var rowsPerPageOptions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var rowsSelected: js.UndefOr[js.Array[_]] = js.undefined
  var search: js.UndefOr[scala.Boolean] = js.undefined
  var selectableRows: js.UndefOr[scala.Boolean] = js.undefined
  var serverSide: js.UndefOr[scala.Boolean] = js.undefined
  var setRowProps: js.UndefOr[js.Function2[/* row */ js.Array[_], /* rowIndex */ scala.Double, js.Object]] = js.undefined
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  var sortFilterList: js.UndefOr[scala.Boolean] = js.undefined
  var textLabels: js.UndefOr[MUIDataTableTextLabels] = js.undefined
  var viewColumns: js.UndefOr[scala.Boolean] = js.undefined
}

object MUIDataTableOptions {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    customFooter: (/* rowCount */ scala.Double, /* page */ scala.Double, /* rowsPerPage */ scala.Double, /* changeRowsPerPage */ js.Function0[_], /* changePage */ scala.Double) => reactLib.reactMod.ReactNode = null,
    customSearch: (/* searchQuery */ java.lang.String, /* currentRow */ js.Array[_], /* columns */ js.Array[_]) => scala.Boolean = null,
    customSort: (/* data */ js.Array[_], /* colIndex */ scala.Double, /* order */ java.lang.String) => js.Array[_] = null,
    customToolbar: () => reactLib.reactMod.ReactNode = null,
    customToolbarSelect: (/* selectedRows */ muiDashDatatablesLib.Anon_Data, /* displayData */ js.Array[muiDashDatatablesLib.Anon_DataDataIndex], /* setSelectedRows */ js.Function1[/* rows */ js.Array[scala.Double], scala.Unit]) => reactLib.reactMod.ReactNode = null,
    download: js.UndefOr[scala.Boolean] = js.undefined,
    downloadOptions: muiDashDatatablesLib.Anon_Filename = null,
    elevation: scala.Int | scala.Double = null,
    expandableRows: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    filterType: muiDashDatatablesLib.muiDashDatatablesLibStrings.dropdown | muiDashDatatablesLib.muiDashDatatablesLibStrings.checkbox | muiDashDatatablesLib.muiDashDatatablesLibStrings.multiselect | muiDashDatatablesLib.muiDashDatatablesLibStrings.textField = null,
    fixedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    isRowSelectable: /* dataIndex */ scala.Double => scala.Boolean = null,
    onCellClick: (/* colData */ js.Any, /* cellMeta */ muiDashDatatablesLib.Anon_ColIndex) => scala.Unit = null,
    onChangePage: /* currentPage */ scala.Double => scala.Unit = null,
    onChangeRowsPerPage: /* numberOfRows */ scala.Double => scala.Unit = null,
    onColumnSortChange: (/* changedColumn */ java.lang.String, /* direction */ java.lang.String) => scala.Unit = null,
    onColumnViewChange: (/* changedColumn */ java.lang.String, /* action */ java.lang.String) => scala.Unit = null,
    onFilterChange: (/* changedColumn */ java.lang.String, /* filterList */ js.Array[_]) => scala.Unit = null,
    onRowClick: (/* rowData */ js.Array[java.lang.String], /* rowMeta */ muiDashDatatablesLib.Anon_DataIndex) => scala.Unit = null,
    onRowsDelete: /* rowsDeleted */ js.Array[_] => scala.Unit = null,
    onRowsSelect: (/* currentRowsSelected */ js.Array[_], /* rowsSelected */ js.Array[_]) => scala.Unit = null,
    onSearchChange: /* searchText */ java.lang.String => scala.Unit = null,
    onTableChange: (/* action */ java.lang.String, /* tableState */ js.Object) => scala.Unit = null,
    page: scala.Int | scala.Double = null,
    pagination: js.UndefOr[scala.Boolean] = js.undefined,
    print: js.UndefOr[scala.Boolean] = js.undefined,
    renderExpandableRow: (/* rowData */ js.Array[java.lang.String], /* rowMeta */ muiDashDatatablesLib.Anon_DataIndex) => reactLib.reactMod.ReactNode = null,
    resizableColumns: js.UndefOr[scala.Boolean] = js.undefined,
    responsive: muiDashDatatablesLib.muiDashDatatablesLibStrings.stacked | muiDashDatatablesLib.muiDashDatatablesLibStrings.scroll = null,
    rowHover: js.UndefOr[scala.Boolean] = js.undefined,
    rowsPerPage: scala.Int | scala.Double = null,
    rowsPerPageOptions: js.Array[scala.Double] = null,
    rowsSelected: js.Array[_] = null,
    search: js.UndefOr[scala.Boolean] = js.undefined,
    selectableRows: js.UndefOr[scala.Boolean] = js.undefined,
    serverSide: js.UndefOr[scala.Boolean] = js.undefined,
    setRowProps: (/* row */ js.Array[_], /* rowIndex */ scala.Double) => js.Object = null,
    sort: js.UndefOr[scala.Boolean] = js.undefined,
    sortFilterList: js.UndefOr[scala.Boolean] = js.undefined,
    textLabels: MUIDataTableTextLabels = null,
    viewColumns: js.UndefOr[scala.Boolean] = js.undefined
  ): MUIDataTableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (customFooter != null) __obj.updateDynamic("customFooter")(js.Any.fromFunction5(customFooter))
    if (customSearch != null) __obj.updateDynamic("customSearch")(js.Any.fromFunction3(customSearch))
    if (customSort != null) __obj.updateDynamic("customSort")(js.Any.fromFunction3(customSort))
    if (customToolbar != null) __obj.updateDynamic("customToolbar")(js.Any.fromFunction0(customToolbar))
    if (customToolbarSelect != null) __obj.updateDynamic("customToolbarSelect")(js.Any.fromFunction3(customToolbarSelect))
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download)
    if (downloadOptions != null) __obj.updateDynamic("downloadOptions")(downloadOptions)
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableRows)) __obj.updateDynamic("expandableRows")(expandableRows)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (isRowSelectable != null) __obj.updateDynamic("isRowSelectable")(js.Any.fromFunction1(isRowSelectable))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2(onCellClick))
    if (onChangePage != null) __obj.updateDynamic("onChangePage")(js.Any.fromFunction1(onChangePage))
    if (onChangeRowsPerPage != null) __obj.updateDynamic("onChangeRowsPerPage")(js.Any.fromFunction1(onChangeRowsPerPage))
    if (onColumnSortChange != null) __obj.updateDynamic("onColumnSortChange")(js.Any.fromFunction2(onColumnSortChange))
    if (onColumnViewChange != null) __obj.updateDynamic("onColumnViewChange")(js.Any.fromFunction2(onColumnViewChange))
    if (onFilterChange != null) __obj.updateDynamic("onFilterChange")(js.Any.fromFunction2(onFilterChange))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2(onRowClick))
    if (onRowsDelete != null) __obj.updateDynamic("onRowsDelete")(js.Any.fromFunction1(onRowsDelete))
    if (onRowsSelect != null) __obj.updateDynamic("onRowsSelect")(js.Any.fromFunction2(onRowsSelect))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction1(onSearchChange))
    if (onTableChange != null) __obj.updateDynamic("onTableChange")(js.Any.fromFunction2(onTableChange))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination)
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print)
    if (renderExpandableRow != null) __obj.updateDynamic("renderExpandableRow")(js.Any.fromFunction2(renderExpandableRow))
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHover)) __obj.updateDynamic("rowHover")(rowHover)
    if (rowsPerPage != null) __obj.updateDynamic("rowsPerPage")(rowsPerPage.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions)
    if (rowsSelected != null) __obj.updateDynamic("rowsSelected")(rowsSelected)
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (!js.isUndefined(selectableRows)) __obj.updateDynamic("selectableRows")(selectableRows)
    if (!js.isUndefined(serverSide)) __obj.updateDynamic("serverSide")(serverSide)
    if (setRowProps != null) __obj.updateDynamic("setRowProps")(js.Any.fromFunction2(setRowProps))
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(sortFilterList)) __obj.updateDynamic("sortFilterList")(sortFilterList)
    if (textLabels != null) __obj.updateDynamic("textLabels")(textLabels)
    if (!js.isUndefined(viewColumns)) __obj.updateDynamic("viewColumns")(viewColumns)
    __obj.asInstanceOf[MUIDataTableOptions]
  }
}

