package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchIssuesAndPullRequestsResponseData extends StObject {
  
  var incomplete_results: Boolean
  
  var items: js.Array[Labels]
  
  var total_count: Double
}
object SearchIssuesAndPullRequestsResponseData {
  
  inline def apply(incomplete_results: Boolean, items: js.Array[Labels], total_count: Double): SearchIssuesAndPullRequestsResponseData = {
    val __obj = js.Dynamic.literal(incomplete_results = incomplete_results.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIssuesAndPullRequestsResponseData]
  }
  
  extension [Self <: SearchIssuesAndPullRequestsResponseData](x: Self) {
    
    inline def setIncomplete_results(value: Boolean): Self = StObject.set(x, "incomplete_results", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Labels]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Labels*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
