package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableOptions extends js.Object {
  var IsRowSelectable: js.UndefOr[js.Function1[/* dataIndex */ js.Any, scala.Boolean]] = js.undefined
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
    js.Function2[/* colIndex */ scala.Double, /* rowIndex */ scala.Double, scala.Unit]
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
  var setRowProps: js.UndefOr[js.Function2[/* row */ js.Array[_], /* rowIndex */ scala.Double, _]] = js.undefined
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  var sortFilterList: js.UndefOr[scala.Boolean] = js.undefined
  var textLabels: js.UndefOr[MUIDataTableTextLabels] = js.undefined
  var viewColumns: js.UndefOr[scala.Boolean] = js.undefined
}

