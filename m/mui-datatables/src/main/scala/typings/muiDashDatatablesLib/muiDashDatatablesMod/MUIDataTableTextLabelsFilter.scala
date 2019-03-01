package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableTextLabelsFilter extends js.Object {
  var all: java.lang.String
  var reset: java.lang.String
  var title: java.lang.String
}

object MUIDataTableTextLabelsFilter {
  @scala.inline
  def apply(all: java.lang.String, reset: java.lang.String, title: java.lang.String): MUIDataTableTextLabelsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MUIDataTableTextLabelsFilter]
  }
}

