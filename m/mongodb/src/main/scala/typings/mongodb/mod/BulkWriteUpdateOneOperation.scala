package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteUpdateOneOperation[T] extends BulkWriteOperation[T] {
  var updateOne: BulkWriteUpdateOperation[T]
}

object BulkWriteUpdateOneOperation {
  @scala.inline
  def apply[T](updateOne: BulkWriteUpdateOperation[T]): BulkWriteUpdateOneOperation[T] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateOneOperation[T]]
  }
}

