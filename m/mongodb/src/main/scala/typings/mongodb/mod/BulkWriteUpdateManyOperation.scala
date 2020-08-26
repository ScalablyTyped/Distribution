package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteUpdateManyOperation[TSchema] extends BulkWriteOperation[TSchema] {
  var updateMany: BulkWriteUpdateOperation[TSchema] = js.native
}

object BulkWriteUpdateManyOperation {
  @scala.inline
  def apply[TSchema](updateMany: BulkWriteUpdateOperation[TSchema]): BulkWriteUpdateManyOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateManyOperation[TSchema]]
  }
  @scala.inline
  implicit class BulkWriteUpdateManyOperationOps[Self <: BulkWriteUpdateManyOperation[_], TSchema] (val x: Self with BulkWriteUpdateManyOperation[TSchema]) extends AnyVal {
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
    def setUpdateMany(value: BulkWriteUpdateOperation[TSchema]): Self = this.set("updateMany", value.asInstanceOf[js.Any])
  }
  
}

