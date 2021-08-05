package typings.meteor.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayFilters extends StObject {
  
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[js.Any]]] = js.undefined
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object ArrayFilters {
  
  inline def apply(): ArrayFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayFilters]
  }
  
  extension [Self <: ArrayFilters](x: Self) {
    
    inline def setArrayFilters(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    inline def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    inline def setArrayFiltersVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "arrayFilters", js.Array(value :_*))
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
