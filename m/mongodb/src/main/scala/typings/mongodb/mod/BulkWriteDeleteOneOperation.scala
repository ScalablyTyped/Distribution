package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteDeleteOneOperation[TSchema] extends BulkWriteOperation[TSchema] {
  var deleteOne: BulkWriteDeleteOperation[TSchema]
}

object BulkWriteDeleteOneOperation {
  @scala.inline
  def apply[TSchema](deleteOne: BulkWriteDeleteOperation[TSchema]): BulkWriteDeleteOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteOne = deleteOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteOneOperation[TSchema]]
  }
}

