package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.asc
import typings.octokitTypes.octokitTypesStrings.created
import typings.octokitTypes.octokitTypesStrings.desc
import typings.octokitTypes.octokitTypesStrings.updated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchLabelsEndpoint extends StObject {
  
  /**
    * Determines whether the first search result returned is the highest number of matches (`desc`) or lowest number of matches (`asc`). This parameter is ignored unless you provide `sort`.
    */
  var order: js.UndefOr[desc | asc] = js.undefined
  
  /**
    * The search keywords. This endpoint does not accept qualifiers in the query. To learn more about the format of the query, see [Constructing a search query](https://developer.github.com/v3/search/#constructing-a-search-query).
    */
  var q: String
  
  /**
    * The id of the repository.
    */
  var repository_id: Double
  
  /**
    * Sorts the results of your query by when the label was `created` or `updated`. Default: [best match](https://developer.github.com/v3/search/#ranking-search-results)
    */
  var sort: js.UndefOr[created | updated] = js.undefined
}
object SearchLabelsEndpoint {
  
  @scala.inline
  def apply(q: String, repository_id: Double): SearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchLabelsEndpoint]
  }
  
  @scala.inline
  implicit class SearchLabelsEndpointMutableBuilder[Self <: SearchLabelsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrder(value: desc | asc): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: created | updated): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
