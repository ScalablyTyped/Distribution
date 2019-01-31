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

