package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableHeadCell extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var classes: js.UndefOr[js.Object] = js.undefined
  var hint: java.lang.String
  var options: js.Object
  var sort: scala.Boolean
  var sortDirection: js.UndefOr[SortDirection] = js.undefined
  def toggleSort(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any
}

object MUIDataTableHeadCell {
  @scala.inline
  def apply(
    hint: java.lang.String,
    options: js.Object,
    sort: scala.Boolean,
    toggleSort: js.Any => js.Any,
    children: js.Any = null,
    classes: js.Object = null,
    sortDirection: SortDirection = null
  ): MUIDataTableHeadCell = {
    val __obj = js.Dynamic.literal(hint = hint, options = options, sort = sort, toggleSort = js.Any.fromFunction1(toggleSort))
    if (children != null) __obj.updateDynamic("children")(children)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection)
    __obj.asInstanceOf[MUIDataTableHeadCell]
  }
}

