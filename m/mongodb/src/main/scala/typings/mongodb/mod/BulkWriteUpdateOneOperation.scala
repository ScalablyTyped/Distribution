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
  
  @scala.inline
  def apply[TSchema](updateOne: BulkWriteUpdateOperation[TSchema]): BulkWriteUpdateOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateOneOperation[TSchema]]
  }
  
  @scala.inline
  implicit class BulkWriteUpdateOneOperationMutableBuilder[Self <: BulkWriteUpdateOneOperation[?], TSchema] (val x: Self & BulkWriteUpdateOneOperation[TSchema]) extends AnyVal {
    
    @scala.inline
    def setUpdateOne(value: BulkWriteUpdateOperation[TSchema]): Self = StObject.set(x, "updateOne", value.asInstanceOf[js.Any])
  }
}
