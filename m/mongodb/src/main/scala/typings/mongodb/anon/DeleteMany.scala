package typings.mongodb.anon

import typings.bson.mod.Document
import typings.mongodb.mod.AnyBulkWriteOperation
import typings.mongodb.mod.DeleteManyModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMany[TSchema /* <: Document */]
  extends StObject
     with AnyBulkWriteOperation[TSchema] {
  
  var deleteMany: DeleteManyModel[TSchema]
}
object DeleteMany {
  
  inline def apply[TSchema /* <: Document */](deleteMany: DeleteManyModel[TSchema]): DeleteMany[TSchema] = {
    val __obj = js.Dynamic.literal(deleteMany = deleteMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMany[TSchema]]
  }
  
  extension [Self <: DeleteMany[?], TSchema /* <: Document */](x: Self & DeleteMany[TSchema]) {
    
    inline def setDeleteMany(value: DeleteManyModel[TSchema]): Self = StObject.set(x, "deleteMany", value.asInstanceOf[js.Any])
  }
}
