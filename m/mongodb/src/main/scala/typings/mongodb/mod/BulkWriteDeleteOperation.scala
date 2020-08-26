package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteDeleteOperation[TSchema] extends js.Object {
  var collation: js.UndefOr[js.Object] = js.native
  var filter: FilterQuery[TSchema] = js.native
}

object BulkWriteDeleteOperation {
  @scala.inline
  def apply[TSchema](filter: FilterQuery[TSchema]): BulkWriteDeleteOperation[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteOperation[TSchema]]
  }
  @scala.inline
  implicit class BulkWriteDeleteOperationOps[Self <: BulkWriteDeleteOperation[_], TSchema] (val x: Self with BulkWriteDeleteOperation[TSchema]) extends AnyVal {
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
    def setFilter(value: FilterQuery[TSchema]): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollation(value: js.Object): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
  }
  
}

