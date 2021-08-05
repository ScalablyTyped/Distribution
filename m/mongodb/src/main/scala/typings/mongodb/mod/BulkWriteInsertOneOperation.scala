package typings.mongodb.mod

import typings.mongodb.anon.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteInsertOneOperation[TSchema]
  extends StObject
     with BulkWriteOperation[TSchema] {
  
  var insertOne: Document[TSchema]
}
object BulkWriteInsertOneOperation {
  
  inline def apply[TSchema](insertOne: Document[TSchema]): BulkWriteInsertOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(insertOne = insertOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteInsertOneOperation[TSchema]]
  }
  
  extension [Self <: BulkWriteInsertOneOperation[?], TSchema](x: Self & BulkWriteInsertOneOperation[TSchema]) {
    
    inline def setInsertOne(value: Document[TSchema]): Self = StObject.set(x, "insertOne", value.asInstanceOf[js.Any])
  }
}
