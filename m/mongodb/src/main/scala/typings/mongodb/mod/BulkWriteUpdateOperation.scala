package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteUpdateOperation[TSchema] extends StObject {
  
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var collation: js.UndefOr[js.Object] = js.undefined
  
  var filter: FilterQuery[TSchema]
  
  var hint: js.UndefOr[String | js.Object] = js.undefined
  
  var update: UpdateQuery[TSchema]
  
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object BulkWriteUpdateOperation {
  
  inline def apply[TSchema](filter: FilterQuery[TSchema], update: UpdateQuery[TSchema]): BulkWriteUpdateOperation[TSchema] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteUpdateOperation[TSchema]]
  }
  
  extension [Self <: BulkWriteUpdateOperation[?], TSchema](x: Self & BulkWriteUpdateOperation[TSchema]) {
    
    inline def setArrayFilters(value: js.Array[js.Object]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    inline def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    inline def setArrayFiltersVarargs(value: js.Object*): Self = StObject.set(x, "arrayFilters", js.Array(value :_*))
    
    inline def setCollation(value: js.Object): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setCollationUndefined: Self = StObject.set(x, "collation", js.undefined)
    
    inline def setFilter(value: FilterQuery[TSchema]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setHint(value: String | js.Object): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setUpdate(value: UpdateQuery[TSchema]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
