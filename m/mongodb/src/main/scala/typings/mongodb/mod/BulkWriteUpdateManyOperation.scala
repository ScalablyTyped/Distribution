package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteUpdateManyOperation[TSchema] extends BulkWriteOperation[TSchema] {
  var updateMany: BulkWriteUpdateOperation[TSchema]
}

object BulkWriteUpdateManyOperation {
  @scala.inline
  def apply[TSchema](updateMany: BulkWriteUpdateOperation[TSchema]): BulkWriteUpdateManyOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateManyOperation[TSchema]]
  }
}

