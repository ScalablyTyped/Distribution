package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridFSBucketFindOptions extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.native
  var limit: js.UndefOr[scala.Double] = js.native
  var maxTimeMS: js.UndefOr[scala.Double] = js.native
  var noCursorTimeout: js.UndefOr[Boolean] = js.native
  var skip: js.UndefOr[scala.Double] = js.native
  var sort: js.UndefOr[js.Object] = js.native
}

object GridFSBucketFindOptions {
  @scala.inline
  def apply(): GridFSBucketFindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridFSBucketFindOptions]
  }
  @scala.inline
  implicit class GridFSBucketFindOptionsOps[Self <: GridFSBucketFindOptions] (val x: Self) extends AnyVal {
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
    def setBatchSize(value: scala.Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    @scala.inline
    def setLimit(value: scala.Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMaxTimeMS(value: scala.Double): Self = this.set("maxTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTimeMS: Self = this.set("maxTimeMS", js.undefined)
    @scala.inline
    def setNoCursorTimeout(value: Boolean): Self = this.set("noCursorTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCursorTimeout: Self = this.set("noCursorTimeout", js.undefined)
    @scala.inline
    def setSkip(value: scala.Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setSort(value: js.Object): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

