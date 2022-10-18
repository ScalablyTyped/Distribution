package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncompleteresultsItemsTotalcount extends StObject {
  
  var incomplete_results: Boolean
  
  var items: js.Array[Contributorsurl]
  
  var total_count: Double
}
object IncompleteresultsItemsTotalcount {
  
  inline def apply(incomplete_results: Boolean, items: js.Array[Contributorsurl], total_count: Double): IncompleteresultsItemsTotalcount = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncompleteresultsItemsTotalcount]
  }
  
  extension [Self <: IncompleteresultsItemsTotalcount](x: Self) {
    
    inline def setIncomplete_results(value: Boolean): Self = StObject.set(x, "incomplete_results", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Contributorsurl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Contributorsurl*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
