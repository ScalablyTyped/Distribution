package typings
package mongooseDashPaginateLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateResult[T] extends js.Object {
  var docs: js.Array[T]
  var limit: scala.Double
  var offset: js.UndefOr[scala.Double] = js.undefined
  var page: js.UndefOr[scala.Double] = js.undefined
  var pages: js.UndefOr[scala.Double] = js.undefined
  var total: scala.Double
}

object PaginateResult {
  @scala.inline
  def apply[T](
    docs: js.Array[T],
    limit: scala.Double,
    total: scala.Double,
    offset: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    pages: scala.Int | scala.Double = null
  ): PaginateResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("docs")(docs)
    __obj.updateDynamic("limit")(limit)
    __obj.updateDynamic("total")(total)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateResult[T]]
  }
}

