package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteDeleteManyOperation[TSchema] extends BulkWriteOperation[TSchema] {
  
  var deleteMany: BulkWriteDeleteOperation[TSchema] = js.native
}
object BulkWriteDeleteManyOperation {
  
  @scala.inline
  def apply[TSchema](deleteMany: BulkWriteDeleteOperation[TSchema]): BulkWriteDeleteManyOperation[TSchema] = {
    val __obj = js.Dynamic.literal(deleteMany = deleteMany.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteDeleteManyOperation[TSchema]]
  }
  
  @scala.inline
  implicit class BulkWriteDeleteManyOperationOps[Self <: BulkWriteDeleteManyOperation[_], TSchema] (val x: Self with BulkWriteDeleteManyOperation[TSchema]) extends AnyVal {
    
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
    def setDeleteMany(value: BulkWriteDeleteOperation[TSchema]): Self = this.set("deleteMany", value.asInstanceOf[js.Any])
  }
}
