package typings.mongodb.anon

import typings.bson.mod.Document
import typings.mongodb.mod.AnyBulkWriteOperation
import typings.mongodb.mod.ReplaceOneModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceOne[TSchema /* <: Document */]
  extends StObject
     with AnyBulkWriteOperation[TSchema] {
  
  var replaceOne: ReplaceOneModel[TSchema]
}
object ReplaceOne {
  
  inline def apply[TSchema /* <: Document */](replaceOne: ReplaceOneModel[TSchema]): ReplaceOne[TSchema] = {
    val __obj = js.Dynamic.literal(replaceOne = replaceOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceOne[TSchema]]
  }
  
  extension [Self <: ReplaceOne[?], TSchema /* <: Document */](x: Self & ReplaceOne[TSchema]) {
    
    inline def setReplaceOne(value: ReplaceOneModel[TSchema]): Self = StObject.set(x, "replaceOne", value.asInstanceOf[js.Any])
  }
}
