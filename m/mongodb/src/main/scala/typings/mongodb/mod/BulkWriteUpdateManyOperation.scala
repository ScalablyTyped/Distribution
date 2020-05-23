package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteUpdateManyOperation[T] extends BulkWriteOperation[T] {
  var updateMany: BulkWriteUpdateOperation[T]
}

object BulkWriteUpdateManyOperation {
  @scala.inline
  def apply[T](updateMany: BulkWriteUpdateOperation[T]): BulkWriteUpdateManyOperation[T] = {
    val __obj = js.Dynamic.literal(updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateManyOperation[T]]
  }
}

