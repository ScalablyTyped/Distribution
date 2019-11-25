package typings.muiDashDatatables.muiDashDatatablesMod

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
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], viewColumns = viewColumns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MUIDataTableTextLabels]
  }
}

