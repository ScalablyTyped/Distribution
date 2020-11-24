package typings.mongodb.mod

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
  implicit class BulkWriteUpdateOneOperationOps[Self <: BulkWriteUpdateOneOperation[_], TSchema] (val x: Self with BulkWriteUpdateOneOperation[TSchema]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUpdateOne(value: BulkWriteUpdateOperation[TSchema]): Self = this.set("updateOne", value.asInstanceOf[js.Any])
  }
}
