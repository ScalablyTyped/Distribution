package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPagingOptions extends js.Object {
  /** currentPage: the uhm... current page. */
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  /** pageSize: currently selected page size.  */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**  pageSizes: list of available page sizes.  */
  var pageSizes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** totalServerItems: Total items are on the server.  */
  var totalServerItems: js.UndefOr[scala.Double] = js.undefined
}

object IPagingOptions {
  @scala.inline
  def apply(
    currentPage: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    pageSizes: js.Array[scala.Double] = null,
    totalServerItems: scala.Int | scala.Double = null
  ): IPagingOptions = {
    val __obj = js.Dynamic.literal()
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizes != null) __obj.updateDynamic("pageSizes")(pageSizes)
    if (totalServerItems != null) __obj.updateDynamic("totalServerItems")(totalServerItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPagingOptions]
  }
}

