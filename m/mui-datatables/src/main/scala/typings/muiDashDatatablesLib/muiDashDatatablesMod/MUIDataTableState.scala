package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableState extends js.Object {
  var activeColumn: java.lang.String | scala.Null
  var announceText: java.lang.String | scala.Null
  var expandedRows: MUIDataTableStateRows
  var filterList: js.Array[js.Array[java.lang.String]]
  var page: scala.Double
  var rowsPerPage: scala.Double
  var rowsPerPageOptions: js.Array[scala.Double]
  var searchText: java.lang.String | scala.Null
  var selectedRows: MUIDataTableStateRows
  var showResponsive: scala.Boolean
}

object MUIDataTableState {
  @scala.inline
  def apply(
    expandedRows: MUIDataTableStateRows,
    filterList: js.Array[js.Array[java.lang.String]],
    page: scala.Double,
    rowsPerPage: scala.Double,
    rowsPerPageOptions: js.Array[scala.Double],
    selectedRows: MUIDataTableStateRows,
    showResponsive: scala.Boolean,
    activeColumn: java.lang.String = null,
    announceText: java.lang.String = null,
    searchText: java.lang.String = null
  ): MUIDataTableState = {
    val __obj = js.Dynamic.literal(expandedRows = expandedRows, filterList = filterList, page = page, rowsPerPage = rowsPerPage, rowsPerPageOptions = rowsPerPageOptions, selectedRows = selectedRows, showResponsive = showResponsive)
    if (activeColumn != null) __obj.updateDynamic("activeColumn")(activeColumn)
    if (announceText != null) __obj.updateDynamic("announceText")(announceText)
    if (searchText != null) __obj.updateDynamic("searchText")(searchText)
    __obj.asInstanceOf[MUIDataTableState]
  }
}

