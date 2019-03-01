package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableTextLabelsPagination extends js.Object {
  var displayRows: java.lang.String
  var next: java.lang.String
  var previous: java.lang.String
  var rowsPerPage: java.lang.String
}

object MUIDataTableTextLabelsPagination {
  @scala.inline
  def apply(
    displayRows: java.lang.String,
    next: java.lang.String,
    previous: java.lang.String,
    rowsPerPage: java.lang.String
  ): MUIDataTableTextLabelsPagination = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayRows")(displayRows)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("previous")(previous)
    __obj.updateDynamic("rowsPerPage")(rowsPerPage)
    __obj.asInstanceOf[MUIDataTableTextLabelsPagination]
  }
}

