package typings.mongoosePaginateV2.mod.mongooseAugmentingMod

import typings.mongoose.mod.CollationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginateOptions extends js.Object {
  var collation: js.UndefOr[CollationOptions] = js.native
  var customLabels: js.UndefOr[CustomLabels] = js.native
  var lean: js.UndefOr[Boolean] = js.native
  var leanWithId: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var page: js.UndefOr[Double] = js.native
  /* If pagination is set to `false`, it will return all docs without adding limit condition. (Default: `true`) */
  var pagination: js.UndefOr[Boolean] = js.native
  /* tslint:disable-next-line: ban-types */
  var populate: js.UndefOr[(js.Array[js.Object | String]) | js.Object | String | QueryPopulateOptions] = js.native
  var read: js.UndefOr[ReadOptions] = js.native
  /* tslint:disable-next-line: ban-types */
  var select: js.UndefOr[js.Object | String] = js.native
  /* tslint:disable-next-line: ban-types */
  var sort: js.UndefOr[js.Object | String] = js.native
}

object PaginateOptions {
  @scala.inline
  def apply(): PaginateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginateOptions]
  }
  @scala.inline
  implicit class PaginateOptionsOps[Self <: PaginateOptions] (val x: Self) extends AnyVal {
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
    def setCollation(value: CollationOptions): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    @scala.inline
    def setCustomLabels(value: CustomLabels): Self = this.set("customLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomLabels: Self = this.set("customLabels", js.undefined)
    @scala.inline
    def setLean(value: Boolean): Self = this.set("lean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLean: Self = this.set("lean", js.undefined)
    @scala.inline
    def setLeanWithId(value: Boolean): Self = this.set("leanWithId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeanWithId: Self = this.set("leanWithId", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPagination(value: Boolean): Self = this.set("pagination", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setPopulateVarargs(value: (js.Object | String)*): Self = this.set("populate", js.Array(value :_*))
    @scala.inline
    def setPopulate(value: (js.Array[js.Object | String]) | js.Object | String | QueryPopulateOptions): Self = this.set("populate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulate: Self = this.set("populate", js.undefined)
    @scala.inline
    def setRead(value: ReadOptions): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setSelect(value: js.Object | String): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setSort(value: js.Object | String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

