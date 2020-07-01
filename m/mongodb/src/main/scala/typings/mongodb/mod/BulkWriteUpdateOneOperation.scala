package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteUpdateOneOperation[TSchema] extends BulkWriteOperation[TSchema] {
  var updateOne: BulkWriteUpdateOperation[TSchema]
}

object BulkWriteUpdateOneOperation {
  @scala.inline
  def apply[TSchema](updateOne: BulkWriteUpdateOperation[TSchema]): BulkWriteUpdateOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateOneOperation[TSchema]]
  }
}

