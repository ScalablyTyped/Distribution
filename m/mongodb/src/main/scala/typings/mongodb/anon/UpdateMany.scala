package typings.mongodb.anon

import typings.bson.mod.Document
import typings.mongodb.mod.AnyBulkWriteOperation
import typings.mongodb.mod.UpdateManyModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMany[TSchema /* <: Document */]
  extends StObject
     with AnyBulkWriteOperation[TSchema] {
  
  var updateMany: UpdateManyModel[TSchema]
}
object UpdateMany {
  
  inline def apply[TSchema /* <: Document */](updateMany: UpdateManyModel[TSchema]): UpdateMany[TSchema] = {
    val __obj = js.Dynamic.literal(updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMany[TSchema]]
  }
  
  extension [Self <: UpdateMany[?], TSchema /* <: Document */](x: Self & UpdateMany[TSchema]) {
    
    inline def setUpdateMany(value: UpdateManyModel[TSchema]): Self = StObject.set(x, "updateMany", value.asInstanceOf[js.Any])
  }
}
