package typings.mongoosePaginateV2.mod.mongooseAugmentingMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateResult[T]
  extends /* customLabel */ StringDictionary[js.UndefOr[js.Array[T] | Double | Boolean]] {
  var docs: js.Array[T]
  var hasNextPage: Boolean
  var hasPrevPage: Boolean
  var limit: Double
  var meta: js.UndefOr[js.Any] = js.undefined
  var nextPage: js.UndefOr[Double | Null] = js.undefined
  var page: js.UndefOr[Double] = js.undefined
  var pagingCounter: Double
  var prevPage: js.UndefOr[Double | Null] = js.undefined
  var totalDocs: Double
  var totalPages: Double
}

object PaginateResult {
  @scala.inline
  def apply[T](
    docs: js.Array[T],
    hasNextPage: Boolean,
    hasPrevPage: Boolean,
    limit: Double,
    pagingCounter: Double,
    totalDocs: Double,
    totalPages: Double,
    StringDictionary: /* customLabel */ StringDictionary[js.UndefOr[js.Array[T] | Double | Boolean]] = null,
    meta: js.Any = null,
    nextPage: js.UndefOr[Null | Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    prevPage: js.UndefOr[Null | Double] = js.undefined
  ): PaginateResult[T] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPrevPage = hasPrevPage.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], pagingCounter = pagingCounter.asInstanceOf[js.Any], totalDocs = totalDocs.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (!js.isUndefined(nextPage)) __obj.updateDynamic("nextPage")(nextPage.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(prevPage)) __obj.updateDynamic("prevPage")(prevPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateResult[T]]
  }
}

