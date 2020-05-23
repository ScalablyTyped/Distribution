package typings.mongodb.mod

import typings.mongodb.anon.Collation
import typings.mongodb.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mod.BulkWriteInsertOneOperation[T]
  - typings.mongodb.mod.BulkWriteUpdateOneOperation[T]
  - typings.mongodb.mod.BulkWriteUpdateManyOperation[T]
  - typings.mongodb.mod.BulkWriteReplaceOneOperation[T]
  - typings.mongodb.mod.BulkWriteDeleteOneOperation[T]
  - typings.mongodb.mod.BulkWriteDeleteManyOperation[T]
*/
trait BulkWriteOperation[T] extends js.Object

object BulkWriteOperation {
  @scala.inline
  def BulkWriteDeleteOneOperation[T](deleteOne: BulkWriteDeleteOperation[T]): BulkWriteOperation[T] = {
    val __obj = js.Dynamic.literal(deleteOne = deleteOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[T]]
  }
  @scala.inline
  def BulkWriteUpdateOneOperation[T](updateOne: BulkWriteUpdateOperation[T]): BulkWriteOperation[T] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[T]]
  }
  @scala.inline
  def BulkWriteUpdateManyOperation[T](updateMany: BulkWriteUpdateOperation[T]): BulkWriteOperation[T] = {
    val __obj = js.Dynamic.literal(updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[T]]
  }
  @scala.inline
  def BulkWriteReplaceOneOperation[T](replaceOne: Collation[T]): BulkWriteOperation[T] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[T]]
  }
  @scala.inline
  def BulkWriteDeleteManyOperation[T](deleteMany: BulkWriteDeleteOperation[T]): BulkWriteOperation[T] = {
    val __obj = js.Dynamic.literal(deleteMany = deleteMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[T]]
  }
  @scala.inline
  def BulkWriteInsertOneOperation[T](insertOne: Document[T]): BulkWriteOperation[T] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperation[T]]
  }
}

