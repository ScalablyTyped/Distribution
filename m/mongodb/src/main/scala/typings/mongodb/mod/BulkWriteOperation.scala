package typings.mongodb.mod

import typings.mongodb.anon.Collation
import typings.mongodb.anon.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mod.BulkWriteInsertOneOperation[TSchema]
  - typings.mongodb.mod.BulkWriteUpdateOneOperation[TSchema]
  - typings.mongodb.mod.BulkWriteUpdateManyOperation[TSchema]
  - typings.mongodb.mod.BulkWriteReplaceOneOperation[TSchema]
  - typings.mongodb.mod.BulkWriteDeleteOneOperation[TSchema]
  - typings.mongodb.mod.BulkWriteDeleteManyOperation[TSchema]
*/
trait BulkWriteOperation[TSchema] extends StObject
object BulkWriteOperation {
  
  inline def BulkWriteDeleteManyOperation[TSchema](deleteMany: BulkWriteDeleteOperation[TSchema]): typings.mongodb.mod.BulkWriteDeleteManyOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteMany = deleteMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.BulkWriteDeleteManyOperation[TSchema]]
  }
  
  inline def BulkWriteDeleteOneOperation[TSchema](deleteOne: BulkWriteDeleteOperation[TSchema]): typings.mongodb.mod.BulkWriteDeleteOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteOne = deleteOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.BulkWriteDeleteOneOperation[TSchema]]
  }
  
  inline def BulkWriteInsertOneOperation[TSchema](insertOne: Document[TSchema]): typings.mongodb.mod.BulkWriteInsertOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.BulkWriteInsertOneOperation[TSchema]]
  }
  
  inline def BulkWriteReplaceOneOperation[TSchema](replaceOne: Collation[TSchema]): typings.mongodb.mod.BulkWriteReplaceOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.BulkWriteReplaceOneOperation[TSchema]]
  }
  
  inline def BulkWriteUpdateManyOperation[TSchema](updateMany: BulkWriteUpdateOperation[TSchema]): typings.mongodb.mod.BulkWriteUpdateManyOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.BulkWriteUpdateManyOperation[TSchema]]
  }
  
  inline def BulkWriteUpdateOneOperation[TSchema](updateOne: BulkWriteUpdateOperation[TSchema]): typings.mongodb.mod.BulkWriteUpdateOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.mod.BulkWriteUpdateOneOperation[TSchema]]
  }
}
