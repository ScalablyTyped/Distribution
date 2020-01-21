package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableFilterList extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var filterList: js.Array[js.Array[String]]
  var onFilterUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
}

object MUIDataTableFilterList {
  @scala.inline
  def apply(
    filterList: js.Array[js.Array[String]],
    classes: js.Object = null,
    onFilterUpdate: /* args */ js.Any => _ = null
  ): MUIDataTableFilterList = {
    val __obj = js.Dynamic.literal(filterList = filterList.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (onFilterUpdate != null) __obj.updateDynamic("onFilterUpdate")(js.Any.fromFunction1(onFilterUpdate))
    __obj.asInstanceOf[MUIDataTableFilterList]
  }
}

