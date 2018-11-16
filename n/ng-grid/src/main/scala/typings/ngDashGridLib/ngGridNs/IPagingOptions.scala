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

