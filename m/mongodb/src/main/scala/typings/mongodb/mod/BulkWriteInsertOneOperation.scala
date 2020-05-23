package typings.mongodb.mod

import typings.mongodb.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteInsertOneOperation[T] extends BulkWriteOperation[T] {
  var insertOne: Document[T]
}

object BulkWriteInsertOneOperation {
  @scala.inline
  def apply[T](insertOne: Document[T]): BulkWriteInsertOneOperation[T] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteInsertOneOperation[T]]
  }
}

