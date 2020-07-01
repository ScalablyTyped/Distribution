package typings.mongodb.mod

import typings.mongodb.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteInsertOneOperation[TSchema] extends BulkWriteOperation[TSchema] {
  var insertOne: Document[TSchema]
}

object BulkWriteInsertOneOperation {
  @scala.inline
  def apply[TSchema](insertOne: Document[TSchema]): BulkWriteInsertOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteInsertOneOperation[TSchema]]
  }
}

