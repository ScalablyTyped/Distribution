package typings.mongodb.mod

import typings.mongodb.anon.Collation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteReplaceOneOperation[TSchema] extends BulkWriteOperation[TSchema] {
  var replaceOne: Collation[TSchema] = js.native
}

object BulkWriteReplaceOneOperation {
  @scala.inline
  def apply[TSchema](replaceOne: Collation[TSchema]): BulkWriteReplaceOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteReplaceOneOperation[TSchema]]
  }
  @scala.inline
  implicit class BulkWriteReplaceOneOperationOps[Self <: BulkWriteReplaceOneOperation[_], TSchema] (val x: Self with BulkWriteReplaceOneOperation[TSchema]) extends AnyVal {
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
    def setReplaceOne(value: Collation[TSchema]): Self = this.set("replaceOne", value.asInstanceOf[js.Any])
  }
  
}

