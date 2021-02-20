package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Createdby
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchTopicsResponseData extends StObject {
  
  var incomplete_results: Boolean = js.native
  
  var items: js.Array[Createdby] = js.native
  
  var total_count: Double = js.native
}
object SearchTopicsResponseData {
  
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Createdby], total_count: Double): SearchTopicsResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTopicsResponseData]
  }
  
  @scala.inline
  implicit class SearchTopicsResponseDataMutableBuilder[Self <: SearchTopicsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncomplete_results(value: Boolean): Self = StObject.set(x, "incomplete_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[Createdby]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Createdby*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
