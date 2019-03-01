package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableStateRows extends js.Object {
  var data: js.Array[java.lang.String]
  var lookup: js.Any
}

object MUIDataTableStateRows {
  @scala.inline
  def apply(data: js.Array[java.lang.String], lookup: js.Any): MUIDataTableStateRows = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("lookup")(lookup)
    __obj.asInstanceOf[MUIDataTableStateRows]
  }
}

