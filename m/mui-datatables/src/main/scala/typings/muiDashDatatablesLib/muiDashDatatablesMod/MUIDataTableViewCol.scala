package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableViewCol extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var columns: js.Array[_]
  var `object`: js.Object
  def onColumnUpdate(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any
}

object MUIDataTableViewCol {
  @scala.inline
  def apply(
    columns: js.Array[_],
    `object`: js.Object,
    onColumnUpdate: js.Any => js.Any,
    classes: js.Object = null
  ): MUIDataTableViewCol = {
    val __obj = js.Dynamic.literal(columns = columns, onColumnUpdate = js.Any.fromFunction1(onColumnUpdate))
    __obj.updateDynamic("object")(`object`)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    __obj.asInstanceOf[MUIDataTableViewCol]
  }
}

