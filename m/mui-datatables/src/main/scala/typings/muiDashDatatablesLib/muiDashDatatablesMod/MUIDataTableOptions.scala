package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableOptions extends js.Object {
  var IsRowSelectable: js.UndefOr[js.Function1[/* dataIndex */ scala.Double, scala.Boolean]] = js.undefined
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var customFooter: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var customSort: js.UndefOr[
    js.Function3[
      /* data */ js.Array[_], 
      /* colIndex */ scala.Double, 
      /* order */ java.lang.String, 
      js.Array[_]
    ]
  ] = js.undefined
  var customToolbar: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var customToolbarSelect: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var download: js.UndefOr[scala.Boolean] = js.undefined
  var downloadOptions: js.UndefOr[muiDashDatatablesLib.Anon_Filename] = js.undefined
  var elevation: js.UndefOr[scala.Double] = js.undefined
  var expandableRows: js.UndefOr[scala.Boolean] = js.undefined
  var filter: js.UndefOr[scala.Boolean] = js.undefined
  var filterType: js.UndefOr[
    muiDashDatatablesLib.muiDashDatatablesLibStrings.dropdown | muiDashDatatablesLib.muiDashDatatablesLibStrings.checkbox | muiDashDatatablesLib.muiDashDatatablesLibStrings.multiselect | muiDashDatatablesLib.muiDashDatatablesLibStrings.textField
  ] = js.undefined
  var fixedHeader: js.UndefOr[scala.Boolean] = js.undefined
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
      reactLib.reactMod.ReactNs.ReactNode
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
    IsRowSelectable: js.Function1[/* dataIndex */ scala.Double, scala.Boolean] = null,
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    count: scala.Int | scala.Double = null,
    customFooter: js.Function0[reactLib.reactMod.ReactNs.ReactNode] = null,
    customSort: js.Function3[
      /* data */ js.Array[_], 
      /* colIndex */ scala.Double, 
      /* order */ java.lang.String, 
      js.Array[_]
    ] = null,
    customToolbar: js.Function0[reactLib.reactMod.ReactNs.ReactNode] = null,
    customToolbarSelect: js.Function0[reactLib.reactMod.ReactNs.ReactNode] = null,
    download: js.UndefOr[scala.Boolean] = js.undefined,
    downloadOptions: muiDashDatatablesLib.Anon_Filename = null,
    elevation: scala.Int | scala.Double = null,
    expandableRows: js.UndefOr[scala.Boolean] = js.undefined,
    filter: js.UndefOr[scala.Boolean] = js.undefined,
    filterType: muiDashDatatablesLib.muiDashDatatablesLibStrings.dropdown | muiDashDatatablesLib.muiDashDatatablesLibStrings.checkbox | muiDashDatatablesLib.muiDashDatatablesLibStrings.multiselect | muiDashDatatablesLib.muiDashDatatablesLibStrings.textField = null,
    fixedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    onCellClick: js.Function2[/* colData */ js.Any, /* cellMeta */ muiDashDatatablesLib.Anon_ColIndex, scala.Unit] = null,
    onChangePage: js.Function1[/* currentPage */ scala.Double, scala.Unit] = null,
    onChangeRowsPerPage: js.Function1[/* numberOfRows */ scala.Double, scala.Unit] = null,
    onColumnSortChange: js.Function2[/* changedColumn */ java.lang.String, /* direction */ java.lang.String, scala.Unit] = null,
    onColumnViewChange: js.Function2[/* changedColumn */ java.lang.String, /* action */ java.lang.String, scala.Unit] = null,
    onFilterChange: js.Function2[/* changedColumn */ java.lang.String, /* filterList */ js.Array[_], scala.Unit] = null,
    onRowClick: js.Function2[
      /* rowData */ js.Array[java.lang.String], 
      /* rowMeta */ muiDashDatatablesLib.Anon_DataIndex, 
      scala.Unit
    ] = null,
    onRowsDelete: js.Function1[/* rowsDeleted */ js.Array[_], scala.Unit] = null,
    onRowsSelect: js.Function2[/* currentRowsSelected */ js.Array[_], /* rowsSelected */ js.Array[_], scala.Unit] = null,
    onSearchChange: js.Function1[/* searchText */ java.lang.String, scala.Unit] = null,
    onTableChange: js.Function2[/* action */ java.lang.String, /* tableState */ js.Object, scala.Unit] = null,
    page: scala.Int | scala.Double = null,
    pagination: js.UndefOr[scala.Boolean] = js.undefined,
    print: js.UndefOr[scala.Boolean] = js.undefined,
    renderExpandableRow: js.Function2[
      /* rowData */ js.Array[java.lang.String], 
      /* rowMeta */ muiDashDatatablesLib.Anon_DataIndex, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    resizableColumns: js.UndefOr[scala.Boolean] = js.undefined,
    responsive: muiDashDatatablesLib.muiDashDatatablesLibStrings.stacked | muiDashDatatablesLib.muiDashDatatablesLibStrings.scroll = null,
    rowHover: js.UndefOr[scala.Boolean] = js.undefined,
    rowsPerPage: scala.Int | scala.Double = null,
    rowsPerPageOptions: js.Array[scala.Double] = null,
    rowsSelected: js.Array[_] = null,
    search: js.UndefOr[scala.Boolean] = js.undefined,
    selectableRows: js.UndefOr[scala.Boolean] = js.undefined,
    serverSide: js.UndefOr[scala.Boolean] = js.undefined,
    setRowProps: js.Function2[/* row */ js.Array[_], /* rowIndex */ scala.Double, js.Object] = null,
    sort: js.UndefOr[scala.Boolean] = js.undefined,
    sortFilterList: js.UndefOr[scala.Boolean] = js.undefined,
    textLabels: MUIDataTableTextLabels = null,
    viewColumns: js.UndefOr[scala.Boolean] = js.undefined
  ): MUIDataTableOptions = {
    val __obj = js.Dynamic.literal()
    if (IsRowSelectable != null) __obj.updateDynamic("IsRowSelectable")(IsRowSelectable)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (customFooter != null) __obj.updateDynamic("customFooter")(customFooter)
    if (customSort != null) __obj.updateDynamic("customSort")(customSort)
    if (customToolbar != null) __obj.updateDynamic("customToolbar")(customToolbar)
    if (customToolbarSelect != null) __obj.updateDynamic("customToolbarSelect")(customToolbarSelect)
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download)
    if (downloadOptions != null) __obj.updateDynamic("downloadOptions")(downloadOptions)
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (!js.isUndefined(expandableRows)) __obj.updateDynamic("expandableRows")(expandableRows)
    if (!js.isUndefined(filter)) __obj.updateDynamic("filter")(filter)
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader)
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(onCellClick)
    if (onChangePage != null) __obj.updateDynamic("onChangePage")(onChangePage)
    if (onChangeRowsPerPage != null) __obj.updateDynamic("onChangeRowsPerPage")(onChangeRowsPerPage)
    if (onColumnSortChange != null) __obj.updateDynamic("onColumnSortChange")(onColumnSortChange)
    if (onColumnViewChange != null) __obj.updateDynamic("onColumnViewChange")(onColumnViewChange)
    if (onFilterChange != null) __obj.updateDynamic("onFilterChange")(onFilterChange)
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(onRowClick)
    if (onRowsDelete != null) __obj.updateDynamic("onRowsDelete")(onRowsDelete)
    if (onRowsSelect != null) __obj.updateDynamic("onRowsSelect")(onRowsSelect)
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(onSearchChange)
    if (onTableChange != null) __obj.updateDynamic("onTableChange")(onTableChange)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination)
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print)
    if (renderExpandableRow != null) __obj.updateDynamic("renderExpandableRow")(renderExpandableRow)
    if (!js.isUndefined(resizableColumns)) __obj.updateDynamic("resizableColumns")(resizableColumns)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHover)) __obj.updateDynamic("rowHover")(rowHover)
    if (rowsPerPage != null) __obj.updateDynamic("rowsPerPage")(rowsPerPage.asInstanceOf[js.Any])
    if (rowsPerPageOptions != null) __obj.updateDynamic("rowsPerPageOptions")(rowsPerPageOptions)
    if (rowsSelected != null) __obj.updateDynamic("rowsSelected")(rowsSelected)
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search)
    if (!js.isUndefined(selectableRows)) __obj.updateDynamic("selectableRows")(selectableRows)
    if (!js.isUndefined(serverSide)) __obj.updateDynamic("serverSide")(serverSide)
    if (setRowProps != null) __obj.updateDynamic("setRowProps")(setRowProps)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(sortFilterList)) __obj.updateDynamic("sortFilterList")(sortFilterList)
    if (textLabels != null) __obj.updateDynamic("textLabels")(textLabels)
    if (!js.isUndefined(viewColumns)) __obj.updateDynamic("viewColumns")(viewColumns)
    __obj.asInstanceOf[MUIDataTableOptions]
  }
}

