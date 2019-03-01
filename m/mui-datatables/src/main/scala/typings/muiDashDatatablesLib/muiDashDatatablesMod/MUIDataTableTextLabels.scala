package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableTextLabels extends js.Object {
  var body: MUIDataTableTextLabelsBody
  var filter: MUIDataTableTextLabelsFilter
  var pagination: MUIDataTableTextLabelsPagination
  var selectedRows: MUIDataTableTextLabelsSelectedRows
  var toolbar: MUIDataTableTextLabelsToolbar
  var viewColumns: MUIDataTableTextLabelsViewColumns
}

object MUIDataTableTextLabels {
  @scala.inline
  def apply(
    body: MUIDataTableTextLabelsBody,
    filter: MUIDataTableTextLabelsFilter,
    pagination: MUIDataTableTextLabelsPagination,
    selectedRows: MUIDataTableTextLabelsSelectedRows,
    toolbar: MUIDataTableTextLabelsToolbar,
    viewColumns: MUIDataTableTextLabelsViewColumns
  ): MUIDataTableTextLabels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("pagination")(pagination)
    __obj.updateDynamic("selectedRows")(selectedRows)
    __obj.updateDynamic("toolbar")(toolbar)
    __obj.updateDynamic("viewColumns")(viewColumns)
    __obj.asInstanceOf[MUIDataTableTextLabels]
  }
}

