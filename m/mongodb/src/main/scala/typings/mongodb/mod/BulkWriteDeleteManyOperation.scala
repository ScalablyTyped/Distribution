package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteDeleteManyOperation[TSchema]
  extends StObject
     with BulkWriteOperation[TSchema] {
  
  var deleteMany: BulkWriteDeleteOperation[TSchema]
}
object BulkWriteDeleteManyOperation {
  
  @scala.inline
  def apply[TSchema](deleteMany: BulkWriteDeleteOperation[TSchema]): BulkWriteDeleteManyOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteMany = deleteMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteManyOperation[TSchema]]
  }
  
  @scala.inline
  implicit class BulkWriteDeleteManyOperationMutableBuilder[Self <: BulkWriteDeleteManyOperation[?], TSchema] (val x: Self & BulkWriteDeleteManyOperation[TSchema]) extends AnyVal {
    
    @scala.inline
    def setDeleteMany(value: BulkWriteDeleteOperation[TSchema]): Self = StObject.set(x, "deleteMany", value.asInstanceOf[js.Any])
  }
}
