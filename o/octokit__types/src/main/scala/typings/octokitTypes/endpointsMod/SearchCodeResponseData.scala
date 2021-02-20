package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Giturl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchCodeResponseData extends StObject {
  
  var incomplete_results: Boolean = js.native
  
  var items: js.Array[Giturl] = js.native
  
  var total_count: Double = js.native
}
object SearchCodeResponseData {
  
  @scala.inline
  def apply(incomplete_results: Boolean, items: js.Array[Giturl], total_count: Double): SearchCodeResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchCodeResponseData]
  }
  
  @scala.inline
  implicit class SearchCodeResponseDataMutableBuilder[Self <: SearchCodeResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncomplete_results(value: Boolean): Self = StObject.set(x, "incomplete_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[Giturl]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Giturl*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
