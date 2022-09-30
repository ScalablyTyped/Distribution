package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.anon.InsertOne[TSchema]
  - typings.mongodb.anon.ReplaceOne[TSchema]
  - typings.mongodb.anon.UpdateOne[TSchema]
  - typings.mongodb.anon.UpdateMany[TSchema]
  - typings.mongodb.anon.DeleteOne[TSchema]
  - typings.mongodb.anon.DeleteMany[TSchema]
*/
trait AnyBulkWriteOperation[TSchema /* <: Document */] extends StObject
object AnyBulkWriteOperation {
  
  inline def DeleteMany[TSchema /* <: Document */](deleteMany: DeleteManyModel[TSchema]): typings.mongodb.anon.DeleteMany[TSchema] = {
    val __obj = js.Dynamic.literal(deleteMany = deleteMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.anon.DeleteMany[TSchema]]
  }
  
  inline def DeleteOne[TSchema /* <: Document */](deleteOne: DeleteOneModel[TSchema]): typings.mongodb.anon.DeleteOne[TSchema] = {
    val __obj = js.Dynamic.literal(deleteOne = deleteOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.anon.DeleteOne[TSchema]]
  }
  
  inline def InsertOne[TSchema /* <: Document */](insertOne: InsertOneModel[TSchema]): typings.mongodb.anon.InsertOne[TSchema] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.anon.InsertOne[TSchema]]
  }
  
  inline def ReplaceOne[TSchema /* <: Document */](replaceOne: ReplaceOneModel[TSchema]): typings.mongodb.anon.ReplaceOne[TSchema] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.anon.ReplaceOne[TSchema]]
  }
  
  inline def UpdateMany[TSchema /* <: Document */](updateMany: UpdateManyModel[TSchema]): typings.mongodb.anon.UpdateMany[TSchema] = {
    val __obj = js.Dynamic.literal(updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.anon.UpdateMany[TSchema]]
  }
  
  inline def UpdateOne[TSchema /* <: Document */](updateOne: UpdateOneModel[TSchema]): typings.mongodb.anon.UpdateOne[TSchema] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mongodb.anon.UpdateOne[TSchema]]
  }
}
