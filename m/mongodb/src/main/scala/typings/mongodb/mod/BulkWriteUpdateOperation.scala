package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkWriteUpdateOperation[TSchema] extends StObject {
  
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
  implicit class BulkWriteUpdateOperationMutableBuilder[Self <: BulkWriteUpdateOperation[_], TSchema] (val x: Self with BulkWriteUpdateOperation[TSchema]) extends AnyVal {
    
    @scala.inline
    def setArrayFilters(value: js.Array[js.Object]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    @scala.inline
    def setArrayFiltersVarargs(value: js.Object*): Self = StObject.set(x, "arrayFilters", js.Array(value :_*))
    
    @scala.inline
    def setCollation(value: js.Object): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    @scala.inline
    def setFilter(value: FilterQuery[TSchema]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHint(value: String | js.Object): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setUpdate(value: UpdateQuery[TSchema]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
