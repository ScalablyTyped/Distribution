package typings.mongoosePaginate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateResult[T] extends js.Object {
  var docs: js.Array[T]
  var limit: Double
  var offset: js.UndefOr[Double] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var pages: js.UndefOr[Double] = js.undefined
  var total: Double
}

object PaginateResult {
  @scala.inline
  def apply[T](
    docs: js.Array[T],
    limit: Double,
    total: Double,
    offset: js.UndefOr[Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    pages: js.UndefOr[Double] = js.undefined
  ): PaginateResult[T] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pages)) __obj.updateDynamic("pages")(pages.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateResult[T]]
  }
}

