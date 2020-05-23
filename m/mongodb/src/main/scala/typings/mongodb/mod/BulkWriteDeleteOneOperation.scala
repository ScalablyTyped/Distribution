package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteDeleteOneOperation[T] extends BulkWriteOperation[T] {
  var deleteOne: BulkWriteDeleteOperation[T]
}

object BulkWriteDeleteOneOperation {
  @scala.inline
  def apply[T](deleteOne: BulkWriteDeleteOperation[T]): BulkWriteDeleteOneOperation[T] = {
    val __obj = js.Dynamic.literal(deleteOne = deleteOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteOneOperation[T]]
  }
}

