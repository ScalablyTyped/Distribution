package typings.mongoose.mod

import typings.mongodb.mod.ReadPreferenceMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryFindOptions extends QueryFindBaseOptions {
  var batchSize: js.UndefOr[Double] = js.native
  var comment: js.UndefOr[js.Any] = js.native
  var hint: js.UndefOr[js.Any] = js.native
  var limit: js.UndefOr[Double] = js.native
  var maxscan: js.UndefOr[Double] = js.native
  var readPreference: js.UndefOr[ReadPreferenceMode] = js.native
  var skip: js.UndefOr[Double] = js.native
  var snapshot: js.UndefOr[js.Any] = js.native
  var sort: js.UndefOr[js.Any] = js.native
  var tailable: js.UndefOr[js.Any] = js.native
}

object QueryFindOptions {
  @scala.inline
  def apply(): QueryFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryFindOptions]
  }
  @scala.inline
  implicit class QueryFindOptionsOps[Self <: QueryFindOptions] (val x: Self) extends AnyVal {
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    @scala.inline
    def setComment(value: js.Any): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setHint(value: js.Any): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMaxscan(value: Double): Self = this.set("maxscan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxscan: Self = this.set("maxscan", js.undefined)
    @scala.inline
    def setReadPreference(value: ReadPreferenceMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSnapshot(value: js.Any): Self = this.set("snapshot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshot: Self = this.set("snapshot", js.undefined)
    @scala.inline
    def setSort(value: js.Any): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTailable(value: js.Any): Self = this.set("tailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTailable: Self = this.set("tailable", js.undefined)
  }
  
}

