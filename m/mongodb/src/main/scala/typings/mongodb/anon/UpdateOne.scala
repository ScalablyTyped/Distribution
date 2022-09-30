package typings.mongodb.anon

import typings.bson.mod.Document
import typings.mongodb.mod.AnyBulkWriteOperation
import typings.mongodb.mod.UpdateOneModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOne[TSchema /* <: Document */]
  extends StObject
     with AnyBulkWriteOperation[TSchema] {
  
  var updateOne: UpdateOneModel[TSchema]
}
object UpdateOne {
  
  inline def apply[TSchema /* <: Document */](updateOne: UpdateOneModel[TSchema]): UpdateOne[TSchema] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOne[TSchema]]
  }
  
  extension [Self <: UpdateOne[?], TSchema /* <: Document */](x: Self & UpdateOne[TSchema]) {
    
    inline def setUpdateOne(value: UpdateOneModel[TSchema]): Self = StObject.set(x, "updateOne", value.asInstanceOf[js.Any])
  }
}
