package typings.muiDatatables.mod

import typings.muiDatatables.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableState extends js.Object {
  var activeColumn: String | Null
  var announceText: String | Null
  var columns: js.Array[MUIDataTableColumnState]
  var count: Double
  var data: js.Array[_]
  var displayData: js.Array[AnonData]
  var expandedRows: MUIDataTableStateRows
  var filterData: js.Array[_]
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
    columns: js.Array[MUIDataTableColumnState],
    count: Double,
    data: js.Array[_],
    displayData: js.Array[AnonData],
    expandedRows: MUIDataTableStateRows,
    filterData: js.Array[_],
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
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], displayData = displayData.asInstanceOf[js.Any], expandedRows = expandedRows.asInstanceOf[js.Any], filterData = filterData.asInstanceOf[js.Any], filterList = filterList.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any], rowsPerPageOptions = rowsPerPageOptions.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any], showResponsive = showResponsive.asInstanceOf[js.Any])
    if (activeColumn != null) __obj.updateDynamic("activeColumn")(activeColumn.asInstanceOf[js.Any])
    if (announceText != null) __obj.updateDynamic("announceText")(announceText.asInstanceOf[js.Any])
    if (searchText != null) __obj.updateDynamic("searchText")(searchText.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableState]
  }
}

