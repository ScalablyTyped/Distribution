package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteDeleteOneOperation[TSchema]
  extends StObject
     with BulkWriteOperation[TSchema] {
  
  var deleteOne: BulkWriteDeleteOperation[TSchema]
}
object BulkWriteDeleteOneOperation {
  
  @scala.inline
  def apply[TSchema](deleteOne: BulkWriteDeleteOperation[TSchema]): BulkWriteDeleteOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteOne = deleteOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteOneOperation[TSchema]]
  }
  
  @scala.inline
  implicit class BulkWriteDeleteOneOperationMutableBuilder[Self <: BulkWriteDeleteOneOperation[?], TSchema] (val x: Self & BulkWriteDeleteOneOperation[TSchema]) extends AnyVal {
    
    @scala.inline
    def setDeleteOne(value: BulkWriteDeleteOperation[TSchema]): Self = StObject.set(x, "deleteOne", value.asInstanceOf[js.Any])
  }
}
