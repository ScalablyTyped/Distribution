package typings.meteor.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayFilters extends StObject {
  
  /**
    * Used in combination with MongoDB [filtered positional operator](https://docs.mongodb.com/manual/reference/operator/update/positional-filtered/) to specify which elements to
    * modify in an array field.
    */
  var arrayFilters: js.UndefOr[js.Array[StringDictionary[Any]]] = js.undefined
  
  /** True to modify all matching documents; false to only modify one of the matching documents (the default). */
  var multi: js.UndefOr[Boolean] = js.undefined
  
  /** True to insert a document if no matching documents are found. */
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object ArrayFilters {
  
  inline def apply(): ArrayFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayFilters] (val x: Self) extends AnyVal {
    
    inline def setArrayFilters(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    inline def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    inline def setArrayFiltersVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "arrayFilters", js.Array(value*))
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
