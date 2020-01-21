package typings.mongoosePaginateV2.mod.mongooseAugmentingMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginateResult[T]
  extends /* customLabel */ StringDictionary[js.UndefOr[js.Array[T] | Double]] {
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
    StringDictionary: /* customLabel */ StringDictionary[js.UndefOr[js.Array[T] | Double]] = null,
    offset: Int | Double = null,
    page: Int | Double = null,
    pages: Int | Double = null
  ): PaginateResult[T] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateResult[T]]
  }
}

