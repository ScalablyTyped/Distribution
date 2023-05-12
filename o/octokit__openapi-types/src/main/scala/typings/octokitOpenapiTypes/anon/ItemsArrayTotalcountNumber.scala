package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsArrayTotalcountNumber extends StObject {
  
  var incomplete_results: Boolean
  
  var items: js.Array[CommitCommitter]
  
  var total_count: Double
}
object ItemsArrayTotalcountNumber {
  
  inline def apply(incomplete_results: Boolean, items: js.Array[CommitCommitter], total_count: Double): ItemsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsArrayTotalcountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsArrayTotalcountNumber] (val x: Self) extends AnyVal {
    
    inline def setIncomplete_results(value: Boolean): Self = StObject.set(x, "incomplete_results", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[CommitCommitter]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: CommitCommitter*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
