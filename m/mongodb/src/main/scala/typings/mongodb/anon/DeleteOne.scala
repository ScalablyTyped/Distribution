package typings.mongodb.anon

import typings.bson.mod.Document
import typings.mongodb.mod.AnyBulkWriteOperation
import typings.mongodb.mod.DeleteOneModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOne[TSchema /* <: Document */]
  extends StObject
     with AnyBulkWriteOperation[TSchema] {
  
  var deleteOne: DeleteOneModel[TSchema]
}
object DeleteOne {
  
  inline def apply[TSchema /* <: Document */](deleteOne: DeleteOneModel[TSchema]): DeleteOne[TSchema] = {
    val __obj = js.Dynamic.literal(deleteOne = deleteOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOne[TSchema]]
  }
  
  extension [Self <: DeleteOne[?], TSchema /* <: Document */](x: Self & DeleteOne[TSchema]) {
    
    inline def setDeleteOne(value: DeleteOneModel[TSchema]): Self = StObject.set(x, "deleteOne", value.asInstanceOf[js.Any])
  }
}
