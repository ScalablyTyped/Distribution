package typings.mongodb.mod

import typings.mongodb.anon.Collation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteReplaceOneOperation[T] extends BulkWriteOperation[T] {
  var replaceOne: Collation[T]
}

object BulkWriteReplaceOneOperation {
  @scala.inline
  def apply[T](replaceOne: Collation[T]): BulkWriteReplaceOneOperation[T] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteReplaceOneOperation[T]]
  }
}

