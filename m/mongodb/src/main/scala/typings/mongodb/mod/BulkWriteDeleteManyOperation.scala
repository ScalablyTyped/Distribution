package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteDeleteManyOperation[TSchema] extends BulkWriteOperation[TSchema] {
  var deleteMany: BulkWriteDeleteOperation[TSchema]
}

object BulkWriteDeleteManyOperation {
  @scala.inline
  def apply[TSchema](deleteMany: BulkWriteDeleteOperation[TSchema]): BulkWriteDeleteManyOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteMany = deleteMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteManyOperation[TSchema]]
  }
}

