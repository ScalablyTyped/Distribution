package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOneOptions
  extends StObject
     with ReplaceOneOptions {
  
  var arrayFilters: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object UpdateOneOptions {
  
  inline def apply(): UpdateOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOneOptions]
  }
  
  extension [Self <: UpdateOneOptions](x: Self) {
    
    inline def setArrayFilters(value: js.Array[js.Object]): Self = StObject.set(x, "arrayFilters", value.asInstanceOf[js.Any])
    
    inline def setArrayFiltersUndefined: Self = StObject.set(x, "arrayFilters", js.undefined)
    
    inline def setArrayFiltersVarargs(value: js.Object*): Self = StObject.set(x, "arrayFilters", js.Array(value :_*))
  }
}
