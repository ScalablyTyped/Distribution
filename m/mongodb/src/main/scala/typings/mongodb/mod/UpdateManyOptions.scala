package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManyOptions
  extends StObject
     with CommonOptions {
  
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object UpdateManyOptions {
  
  inline def apply(): UpdateManyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateManyOptions]
  }
  
  extension [Self <: UpdateManyOptions](x: Self) {
    
    inline def setArrayFilters(value: js.Array[js.Object]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    inline def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    inline def setArrayFiltersVarargs(value: js.Object*): Self = StObject.set(x, "arrayFilters", js.Array(value :_*))
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
