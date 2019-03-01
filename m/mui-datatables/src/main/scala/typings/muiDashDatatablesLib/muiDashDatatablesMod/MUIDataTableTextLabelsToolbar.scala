package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableTextLabelsToolbar extends js.Object {
  var downloadCsv: java.lang.String
  var filterTable: java.lang.String
  var print: java.lang.String
  var search: java.lang.String
  var viewColumns: java.lang.String
}

object MUIDataTableTextLabelsToolbar {
  @scala.inline
  def apply(
    downloadCsv: java.lang.String,
    filterTable: java.lang.String,
    print: java.lang.String,
    search: java.lang.String,
    viewColumns: java.lang.String
  ): MUIDataTableTextLabelsToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("downloadCsv")(downloadCsv)
    __obj.updateDynamic("filterTable")(filterTable)
    __obj.updateDynamic("print")(print)
    __obj.updateDynamic("search")(search)
    __obj.updateDynamic("viewColumns")(viewColumns)
    __obj.asInstanceOf[MUIDataTableTextLabelsToolbar]
  }
}

