package typings.mongoosePaginateV2.mod.mongooseAugmentingMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginateResult[T]
  extends /* customLabel */ StringDictionary[js.UndefOr[js.Array[T] | Double | Boolean | Null]] {
  var docs: js.Array[T] = js.native
  var hasNextPage: Boolean = js.native
  var hasPrevPage: Boolean = js.native
  var limit: Double = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var nextPage: js.UndefOr[Double | Null] = js.native
  var page: js.UndefOr[Double] = js.native
  var pagingCounter: Double = js.native
  var prevPage: js.UndefOr[Double | Null] = js.native
  var totalDocs: Double = js.native
  var totalPages: Double = js.native
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
    totalPages: Double
  ): PaginateResult[T] = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPrevPage = hasPrevPage.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], pagingCounter = pagingCounter.asInstanceOf[js.Any], totalDocs = totalDocs.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginateResult[T]]
  }
  @scala.inline
  implicit class PaginateResultOps[Self <: PaginateResult[_], T] (val x: Self with PaginateResult[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocsVarargs(value: T*): Self = this.set("docs", js.Array(value :_*))
    @scala.inline
    def setDocs(value: js.Array[T]): Self = this.set("docs", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasNextPage(value: Boolean): Self = this.set("hasNextPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasPrevPage(value: Boolean): Self = this.set("hasPrevPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPagingCounter(value: Double): Self = this.set("pagingCounter", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalDocs(value: Double): Self = this.set("totalDocs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setNextPage(value: Double): Self = this.set("nextPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPage: Self = this.set("nextPage", js.undefined)
    @scala.inline
    def setNextPageNull: Self = this.set("nextPage", null)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPrevPage(value: Double): Self = this.set("prevPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevPage: Self = this.set("prevPage", js.undefined)
    @scala.inline
    def setPrevPageNull: Self = this.set("prevPage", null)
  }
  
}

