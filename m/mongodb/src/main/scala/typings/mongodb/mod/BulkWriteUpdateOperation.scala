package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteUpdateOperation[TSchema] extends js.Object {
  
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.native
  
  var collation: js.UndefOr[js.Object] = js.native
  
  var filter: FilterQuery[TSchema] = js.native
  
  var hint: js.UndefOr[String | js.Object] = js.native
  
  var update: UpdateQuery[TSchema] = js.native
  
  var upsert: js.UndefOr[Boolean] = js.native
}
object BulkWriteUpdateOperation {
  
  @scala.inline
  def apply[TSchema](filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): BulkWriteUpdateOperation[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateOperation[TSchema]]
  }
  
  @scala.inline
  implicit class BulkWriteUpdateOperationOps[Self <: BulkWriteUpdateOperation[_], TSchema] (val x: Self with BulkWriteUpdateOperation[TSchema]) extends AnyVal {
    
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
    def setFilter(value: FilterQuery[TSchema]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: UpdateQuery[TSchema]): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayFiltersVarargs(value: js.Object*): Self = this.set("arrayFilters", js.Array(value :_*))
    
    @scala.inline
    def setArrayFilters(value: js.Array[js.Object]): Self = this.set("arrayFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayFilters: Self = this.set("arrayFilters", js.undefined)
    
    @scala.inline
    def setCollation(value: js.Object): Self = this.set("collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
    
    @scala.inline
    def setHint(value: String | js.Object): Self = this.set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    
    @scala.inline
    def setUpsert(value: Boolean): Self = this.set("upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
  }
}
