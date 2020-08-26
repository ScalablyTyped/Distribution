package typings.mongodb.mod

import typings.mongodb.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BulkWriteInsertOneOperation[TSchema] extends BulkWriteOperation[TSchema] {
  var insertOne: Document[TSchema] = js.native
}

object BulkWriteInsertOneOperation {
  @scala.inline
  def apply[TSchema](insertOne: Document[TSchema]): BulkWriteInsertOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteInsertOneOperation[TSchema]]
  }
  @scala.inline
  implicit class BulkWriteInsertOneOperationOps[Self <: BulkWriteInsertOneOperation[_], TSchema] (val x: Self with BulkWriteInsertOneOperation[TSchema]) extends AnyVal {
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
    def setInsertOne(value: Document[TSchema]): Self = this.set("insertOne", value.asInstanceOf[js.Any])
  }
  
}

