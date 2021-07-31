package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Defaultbranch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchReposResponseData extends StObject {
  
  var incomplete_results: Boolean
  
  var items: js.Array[Defaultbranch]
  
  var total_count: Double
}
object SearchReposResponseData {
  
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Defaultbranch], total_count: Double): SearchReposResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchReposResponseData]
  }
  
  @scala.inline
  implicit class SearchReposResponseDataMutableBuilder[Self <: SearchReposResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncomplete_results(value: Boolean): Self = StObject.set(x, "incomplete_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[Defaultbranch]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Defaultbranch*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
