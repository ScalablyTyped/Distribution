package typings.mongodb.mod

import typings.mongodb.anon.Collation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkWriteReplaceOneOperation[TSchema] extends BulkWriteOperation[TSchema] {
  var replaceOne: Collation[TSchema]
}

object BulkWriteReplaceOneOperation {
  @scala.inline
  def apply[TSchema](replaceOne: Collation[TSchema]): BulkWriteReplaceOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteReplaceOneOperation[TSchema]]
  }
}

