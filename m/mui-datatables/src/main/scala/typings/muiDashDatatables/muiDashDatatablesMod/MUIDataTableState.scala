package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableState extends js.Object {
  var activeColumn: String | Null
  var announceText: String | Null
  var expandedRows: MUIDataTableStateRows
  var filterList: js.Array[js.Array[String]]
  var page: Double
  var rowsPerPage: Double
  var rowsPerPageOptions: js.Array[Double]
  var searchText: String | Null
  var selectedRows: MUIDataTableStateRows
  var showResponsive: Boolean
}

object MUIDataTableState {
  @scala.inline
  def apply(
    expandedRows: MUIDataTableStateRows,
    filterList: js.Array[js.Array[String]],
    page: Double,
    rowsPerPage: Double,
    rowsPerPageOptions: js.Array[Double],
    selectedRows: MUIDataTableStateRows,
    showResponsive: Boolean,
    activeColumn: String = null,
    announceText: String = null,
    searchText: String = null
  ): MUIDataTableState = {
    val __obj = js.Dynamic.literal(expandedRows = expandedRows, filterList = filterList, page = page, rowsPerPage = rowsPerPage, rowsPerPageOptions = rowsPerPageOptions, selectedRows = selectedRows, showResponsive = showResponsive)
    if (activeColumn != null) __obj.updateDynamic("activeColumn")(activeColumn)
    if (announceText != null) __obj.updateDynamic("announceText")(announceText)
    if (searchText != null) __obj.updateDynamic("searchText")(searchText)
    __obj.asInstanceOf[MUIDataTableState]
  }
}

