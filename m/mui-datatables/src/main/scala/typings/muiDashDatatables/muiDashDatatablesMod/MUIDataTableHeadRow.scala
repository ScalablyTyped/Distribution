package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableHeadRow extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
}

object MUIDataTableHeadRow {
  @scala.inline
  def apply(classes: js.Object = null): MUIDataTableHeadRow = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableHeadRow]
  }
}

