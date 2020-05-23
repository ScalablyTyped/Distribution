package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteDeleteManyOperation[T] extends BulkWriteOperation[T] {
  var deleteMany: BulkWriteDeleteOperation[T]
}

object BulkWriteDeleteManyOperation {
  @scala.inline
  def apply[T](deleteMany: BulkWriteDeleteOperation[T]): BulkWriteDeleteManyOperation[T] = {
    val __obj = js.Dynamic.literal(deleteMany = deleteMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteManyOperation[T]]
  }
}

