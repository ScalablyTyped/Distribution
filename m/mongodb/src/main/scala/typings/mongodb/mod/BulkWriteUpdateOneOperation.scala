package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteUpdateOneOperation[TSchema] extends BulkWriteOperation[TSchema] {
  
  var updateOne: BulkWriteUpdateOperation[TSchema] = js.native
}
object BulkWriteUpdateOneOperation {
  
  @scala.inline
  def apply[TSchema](updateOne: BulkWriteUpdateOperation[TSchema]): BulkWriteUpdateOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(updateOne = updateOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateOneOperation[TSchema]]
  }
  
  @scala.inline
  implicit class BulkWriteUpdateOneOperationMutableBuilder[Self <: BulkWriteUpdateOneOperation[_], TSchema] (val x: Self with BulkWriteUpdateOneOperation[TSchema]) extends AnyVal {
    
    @scala.inline
    def setUpdateOne(value: BulkWriteUpdateOperation[TSchema]): Self = StObject.set(x, "updateOne", value.asInstanceOf[js.Any])
  }
}
