package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteDeleteOneOperation[TSchema] extends BulkWriteOperation[TSchema] {
  
  var deleteOne: BulkWriteDeleteOperation[TSchema] = js.native
}
object BulkWriteDeleteOneOperation {
  
  @scala.inline
  def apply[TSchema](deleteOne: BulkWriteDeleteOperation[TSchema]): BulkWriteDeleteOneOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteOne = deleteOne.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteOneOperation[TSchema]]
  }
  
  @scala.inline
  implicit class BulkWriteDeleteOneOperationOps[Self <: BulkWriteDeleteOneOperation[_], TSchema] (val x: Self with BulkWriteDeleteOneOperation[TSchema]) extends AnyVal {
    
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
    def setDeleteOne(value: BulkWriteDeleteOperation[TSchema]): Self = this.set("deleteOne", value.asInstanceOf[js.Any])
  }
}
