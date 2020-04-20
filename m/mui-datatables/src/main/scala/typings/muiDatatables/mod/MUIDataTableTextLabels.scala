package typings.muiDatatables.mod

import typings.muiDatatables.PartialMUIDataTableTextLa
import typings.muiDatatables.PartialMUIDataTableTextLaAll
import typings.muiDatatables.PartialMUIDataTableTextLaDelete
import typings.muiDatatables.PartialMUIDataTableTextLaDisplayRows
import typings.muiDatatables.PartialMUIDataTableTextLaDownloadCsv
import typings.muiDatatables.PartialMUIDataTableTextLaTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableTextLabels extends js.Object {
  var body: PartialMUIDataTableTextLa
  var filter: PartialMUIDataTableTextLaAll
  var pagination: PartialMUIDataTableTextLaDisplayRows
  var selectedRows: PartialMUIDataTableTextLaDelete
  var toolbar: PartialMUIDataTableTextLaDownloadCsv
  var viewColumns: PartialMUIDataTableTextLaTitle
}

object MUIDataTableTextLabels {
  @scala.inline
  def apply(
    body: PartialMUIDataTableTextLa,
    filter: PartialMUIDataTableTextLaAll,
    pagination: PartialMUIDataTableTextLaDisplayRows,
    selectedRows: PartialMUIDataTableTextLaDelete,
    toolbar: PartialMUIDataTableTextLaDownloadCsv,
    viewColumns: PartialMUIDataTableTextLaTitle
  ): MUIDataTableTextLabels = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any], viewColumns = viewColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableTextLabels]
  }
}

