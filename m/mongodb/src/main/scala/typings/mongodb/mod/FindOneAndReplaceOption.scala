package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindOneAndReplaceOption extends CommonOptions {
  var collation: js.UndefOr[CollationDocument] = js.native
  var maxTimeMS: js.UndefOr[scala.Double] = js.native
  var projection: js.UndefOr[js.Object] = js.native
  var returnOriginal: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[js.Object] = js.native
  var upsert: js.UndefOr[Boolean] = js.native
}

object FindOneAndReplaceOption {
  @scala.inline
  def apply(): FindOneAndReplaceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOneAndReplaceOption]
  }
  @scala.inline
  implicit class FindOneAndReplaceOptionOps[Self <: FindOneAndReplaceOption] (val x: Self) extends AnyVal {
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
    def setCollation(value: CollationDocument): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = this.set("maxTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTimeMS: Self = this.set("maxTimeMS", js.undefined)
    @scala.inline
    def setProjection(value: js.Object): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setReturnOriginal(value: Boolean): Self = this.set("returnOriginal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnOriginal: Self = this.set("returnOriginal", js.undefined)
    @scala.inline
    def setSort(value: js.Object): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
  
}

