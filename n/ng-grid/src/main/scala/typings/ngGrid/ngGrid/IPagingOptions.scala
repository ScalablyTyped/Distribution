package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPagingOptions extends js.Object {
  /** currentPage: the uhm... current page. */
  var currentPage: js.UndefOr[Double] = js.undefined
  /** pageSize: currently selected page size.  */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**  pageSizes: list of available page sizes.  */
  var pageSizes: js.UndefOr[js.Array[Double]] = js.undefined
  /** totalServerItems: Total items are on the server.  */
  var totalServerItems: js.UndefOr[Double] = js.undefined
}

object IPagingOptions {
  @scala.inline
  def apply(
    currentPage: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageSizes: js.Array[Double] = null,
    totalServerItems: js.UndefOr[Double] = js.undefined
  ): IPagingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentPage)) __obj.updateDynamic("currentPage")(currentPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageSizes != null) __obj.updateDynamic("pageSizes")(pageSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(totalServerItems)) __obj.updateDynamic("totalServerItems")(totalServerItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPagingOptions]
  }
}

