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
    currentPage: Int | Double = null,
    pageSize: Int | Double = null,
    pageSizes: js.Array[Double] = null,
    totalServerItems: Int | Double = null
  ): IPagingOptions = {
    val __obj = js.Dynamic.literal()
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizes != null) __obj.updateDynamic("pageSizes")(pageSizes.asInstanceOf[js.Any])
    if (totalServerItems != null) __obj.updateDynamic("totalServerItems")(totalServerItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPagingOptions]
  }
}

