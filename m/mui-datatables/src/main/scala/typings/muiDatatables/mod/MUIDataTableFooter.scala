package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MUIDataTableFooter extends js.Object {
  var changePage: js.UndefOr[js.Any] = js.undefined
  var changeRowsPerPage: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var rowCount: js.UndefOr[Double] = js.undefined
  var rowsPerPage: js.UndefOr[Double] = js.undefined
}

object MUIDataTableFooter {
  @scala.inline
  def apply(
    changePage: js.Any = null,
    changeRowsPerPage: /* args */ js.Any => _ = null,
    options: js.Object = null,
    page: js.UndefOr[Double] = js.undefined,
    rowCount: js.UndefOr[Double] = js.undefined,
    rowsPerPage: js.UndefOr[Double] = js.undefined
  ): MUIDataTableFooter = {
    val __obj = js.Dynamic.literal()
    if (changePage != null) __obj.updateDynamic("changePage")(changePage.asInstanceOf[js.Any])
    if (changeRowsPerPage != null) __obj.updateDynamic("changeRowsPerPage")(js.Any.fromFunction1(changeRowsPerPage))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCount)) __obj.updateDynamic("rowCount")(rowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowsPerPage)) __obj.updateDynamic("rowsPerPage")(rowsPerPage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUIDataTableFooter]
  }
}

