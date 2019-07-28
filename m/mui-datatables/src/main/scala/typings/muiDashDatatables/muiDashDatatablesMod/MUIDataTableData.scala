package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableData extends js.Object {
  var data: js.Array[js.Object | (js.Array[Double | String])]
  var index: Double
}

object MUIDataTableData {
  @scala.inline
  def apply(data: js.Array[js.Object | (js.Array[Double | String])], index: Double): MUIDataTableData = {
    val __obj = js.Dynamic.literal(data = data, index = index)
  
    __obj.asInstanceOf[MUIDataTableData]
  }
}

