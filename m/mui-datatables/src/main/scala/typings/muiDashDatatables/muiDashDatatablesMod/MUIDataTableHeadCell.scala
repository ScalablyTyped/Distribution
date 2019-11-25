package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableHeadCell extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var classes: js.UndefOr[js.Object] = js.undefined
  var hint: String
  var options: js.Object
  var sort: Boolean
  var sortDirection: js.UndefOr[SortDirection] = js.undefined
  def toggleSort(
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): js.Any
}

object MUIDataTableHeadCell {
  @scala.inline
  def apply(
    hint: String,
    options: js.Object,
    sort: Boolean,
    toggleSort: js.Any => js.Any,
    children: js.Any = null,
    classes: js.Object = null,
    sortDirection: SortDirection = null
  ): MUIDataTableHeadCell = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], toggleSort = js.Any.fromFunction1(toggleSort))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableHeadCell]
  }
}

