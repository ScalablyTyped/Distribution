package typings.mongodb.anon

import typings.bson.mod.Document
import typings.mongodb.mod.AnyBulkWriteOperation
import typings.mongodb.mod.InsertOneModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertOne[TSchema /* <: Document */]
  extends StObject
     with AnyBulkWriteOperation[TSchema] {
  
  var insertOne: InsertOneModel[TSchema]
}
object InsertOne {
  
  inline def apply[TSchema /* <: Document */](insertOne: InsertOneModel[TSchema]): InsertOne[TSchema] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOne[TSchema]]
  }
  
  extension [Self <: InsertOne[?], TSchema /* <: Document */](x: Self & InsertOne[TSchema]) {
    
    inline def setInsertOne(value: InsertOneModel[TSchema]): Self = StObject.set(x, "insertOne", value.asInstanceOf[js.Any])
  }
}
