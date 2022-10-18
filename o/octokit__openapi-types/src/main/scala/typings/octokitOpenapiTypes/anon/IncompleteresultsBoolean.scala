package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncompleteresultsBoolean extends StObject {
  
  var incomplete_results: Boolean
  
  var items: js.Array[Createdby]
  
  var total_count: Double
}
object IncompleteresultsBoolean {
  
  inline def apply(incomplete_results: Boolean, items: js.Array[Createdby], total_count: Double): IncompleteresultsBoolean = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncompleteresultsBoolean]
  }
  
  extension [Self <: IncompleteresultsBoolean](x: Self) {
    
    inline def setIncomplete_results(value: Boolean): Self = StObject.set(x, "incomplete_results", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Createdby]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Createdby*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
