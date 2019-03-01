package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableData extends js.Object {
  var data: js.Array[_]
  var index: scala.Double
}

object MUIDataTableData {
  @scala.inline
  def apply(data: js.Array[_], index: scala.Double): MUIDataTableData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("index")(index)
    __obj.asInstanceOf[MUIDataTableData]
  }
}

