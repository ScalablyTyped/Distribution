package typings.muiDashDatatables.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableFilter extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var filterData: js.Array[_]
  var filterList: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  var onFilterRest: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var onFilterUpdate: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var options: js.Object
}

object MUIDataTableFilter {
  @scala.inline
  def apply(
    filterData: js.Array[_],
    options: js.Object,
    classes: js.Object = null,
    filterList: js.Array[js.Array[String]] = null,
    onFilterRest: /* args */ js.Any => _ = null,
    onFilterUpdate: /* args */ js.Any => _ = null
  ): MUIDataTableFilter = {
    val __obj = js.Dynamic.literal(filterData = filterData, options = options)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (filterList != null) __obj.updateDynamic("filterList")(filterList)
    if (onFilterRest != null) __obj.updateDynamic("onFilterRest")(js.Any.fromFunction1(onFilterRest))
    if (onFilterUpdate != null) __obj.updateDynamic("onFilterUpdate")(js.Any.fromFunction1(onFilterUpdate))
    __obj.asInstanceOf[MUIDataTableFilter]
  }
}

