package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableTextLabelsSelectedRows extends js.Object {
  var delete: java.lang.String
  var deleteAria: java.lang.String
  var text: java.lang.String
}

object MUIDataTableTextLabelsSelectedRows {
  @scala.inline
  def apply(delete: java.lang.String, deleteAria: java.lang.String, text: java.lang.String): MUIDataTableTextLabelsSelectedRows = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("deleteAria")(deleteAria)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MUIDataTableTextLabelsSelectedRows]
  }
}

