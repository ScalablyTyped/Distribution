package typings
package muiDashDatatablesLib.muiDashDatatablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableSearch extends js.Object {
  var classes: js.UndefOr[js.Object] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
}

object MUIDataTableSearch {
  @scala.inline
  def apply(
    classes: js.Object = null,
    onHide: /* args */ js.Any => _ = null,
    onSearch: /* args */ js.Any => _ = null,
    options: js.Object = null
  ): MUIDataTableSearch = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[MUIDataTableSearch]
  }
}

