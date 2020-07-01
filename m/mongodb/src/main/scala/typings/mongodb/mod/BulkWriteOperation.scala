package typings.mongodb.mod

import typings.mongodb.anon.Collation
import typings.mongodb.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mod.BulkWriteInsertOneOperation[TSchema]
  - typings.mongodb.mod.BulkWriteUpdateOneOperation[TSchema]
  - typings.mongodb.mod.BulkWriteUpdateManyOperation[TSchema]
  - typings.mongodb.mod.BulkWriteReplaceOneOperation[TSchema]
  - typings.mongodb.mod.BulkWriteDeleteOneOperation[TSchema]
  - typings.mongodb.mod.BulkWriteDeleteManyOperation[TSchema]
*/
trait BulkWriteOperation[TSchema] extends js.Object

object BulkWriteOperation {
  @scala.inline
  def BulkWriteDeleteManyOperation[TSchema](deleteMany: BulkWriteDeleteOperation[TSchema]): BulkWriteOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteMany = deleteMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[TSchema]]
  }
  @scala.inline
  def BulkWriteInsertOneOperation[TSchema](insertOne: Document[TSchema]): BulkWriteOperation[TSchema] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[TSchema]]
  }
  @scala.inline
  def BulkWriteReplaceOneOperation[TSchema](replaceOne: Collation[TSchema]): BulkWriteOperation[TSchema] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[TSchema]]
  }
  @scala.inline
  def BulkWriteUpdateOneOperation[TSchema](updateOne: BulkWriteUpdateOperation[TSchema]): BulkWriteOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[TSchema]]
  }
  @scala.inline
  def BulkWriteDeleteOneOperation[TSchema](deleteOne: BulkWriteDeleteOperation[TSchema]): BulkWriteOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteOne = deleteOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[TSchema]]
  }
  @scala.inline
  def BulkWriteUpdateManyOperation[TSchema](updateMany: BulkWriteUpdateOperation[TSchema]): BulkWriteOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[TSchema]]
  }
}

