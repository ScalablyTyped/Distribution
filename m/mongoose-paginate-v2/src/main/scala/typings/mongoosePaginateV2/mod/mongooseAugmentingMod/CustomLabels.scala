package typings.mongoosePaginateV2.mod.mongooseAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLabels extends js.Object {
  var docs: js.UndefOr[String] = js.native
  var limit: js.UndefOr[String] = js.native
  var nextPage: js.UndefOr[String] = js.native
  var page: js.UndefOr[String] = js.native
  var prevPage: js.UndefOr[String] = js.native
  var totalDocs: js.UndefOr[String] = js.native
  var totalPages: js.UndefOr[String] = js.native
}

object CustomLabels {
  @scala.inline
  def apply(): CustomLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLabels]
  }
  @scala.inline
  implicit class CustomLabelsOps[Self <: CustomLabels] (val x: Self) extends AnyVal {
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
    def setDocs(value: String): Self = this.set("docs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocs: Self = this.set("docs", js.undefined)
    @scala.inline
    def setLimit(value: String): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setNextPage(value: String): Self = this.set("nextPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPage: Self = this.set("nextPage", js.undefined)
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPrevPage(value: String): Self = this.set("prevPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevPage: Self = this.set("prevPage", js.undefined)
    @scala.inline
    def setTotalDocs(value: String): Self = this.set("totalDocs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalDocs: Self = this.set("totalDocs", js.undefined)
    @scala.inline
    def setTotalPages(value: String): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalPages: Self = this.set("totalPages", js.undefined)
  }
  
}

