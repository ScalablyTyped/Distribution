package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteUpdateOneOperation[TSchema]
  extends StObject
     with BulkWriteOperation[TSchema] {
  
  var updateOne: BulkWriteUpdateOperation[TSchema]
}
object BulkWriteUpdateOneOperation {
  
  inline def apply[TSchema](updateOne: BulkWriteUpdateOperation[TSchema]): BulkWriteUpdateOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateOneOperation[TSchema]]
  }
  
  extension [Self <: BulkWriteUpdateOneOperation[?], TSchema](x: Self & BulkWriteUpdateOneOperation[TSchema]) {
    
    inline def setUpdateOne(value: BulkWriteUpdateOperation[TSchema]): Self = StObject.set(x, "updateOne", value.asInstanceOf[js.Any])
  }
}
