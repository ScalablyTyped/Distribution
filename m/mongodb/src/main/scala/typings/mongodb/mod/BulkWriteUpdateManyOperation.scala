package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteUpdateManyOperation[TSchema]
  extends StObject
     with BulkWriteOperation[TSchema] {
  
  var updateMany: BulkWriteUpdateOperation[TSchema]
}
object BulkWriteUpdateManyOperation {
  
  @scala.inline
  def apply[TSchema](updateMany: BulkWriteUpdateOperation[TSchema]): BulkWriteUpdateManyOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateMany = updateMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateManyOperation[TSchema]]
  }
  
  @scala.inline
  implicit class BulkWriteUpdateManyOperationMutableBuilder[Self <: BulkWriteUpdateManyOperation[?], TSchema] (val x: Self & BulkWriteUpdateManyOperation[TSchema]) extends AnyVal {
    
    @scala.inline
    def setUpdateMany(value: BulkWriteUpdateOperation[TSchema]): Self = StObject.set(x, "updateMany", value.asInstanceOf[js.Any])
  }
}
