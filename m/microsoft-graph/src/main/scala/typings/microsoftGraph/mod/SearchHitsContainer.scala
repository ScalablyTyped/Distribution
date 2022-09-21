package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchHitsContainer extends StObject {
  
  var aggregations: js.UndefOr[NullableOption[js.Array[SearchAggregation]]] = js.undefined
  
  // A collection of the search results.
  var hits: js.UndefOr[NullableOption[js.Array[SearchHit]]] = js.undefined
  
  /**
    * Provides information if more results are available. Based on this information, you can adjust the from and size
    * properties of the searchRequest accordingly.
    */
  var moreResultsAvailable: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The total number of results. Note this is not the number of results on the page, but the total number of results
    * satisfying the query.
    */
  var total: js.UndefOr[NullableOption[Double]] = js.undefined
}
object SearchHitsContainer {
  
  inline def apply(): SearchHitsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchHitsContainer]
  }
  
  extension [Self <: SearchHitsContainer](x: Self) {
    
    inline def setAggregations(value: NullableOption[js.Array[SearchAggregation]]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsNull: Self = StObject.set(x, "aggregations", null)
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggregationsVarargs(value: SearchAggregation*): Self = StObject.set(x, "aggregations", js.Array(value*))
    
    inline def setHits(value: NullableOption[js.Array[SearchHit]]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsNull: Self = StObject.set(x, "hits", null)
    
    inline def setHitsUndefined: Self = StObject.set(x, "hits", js.undefined)
    
    inline def setHitsVarargs(value: SearchHit*): Self = StObject.set(x, "hits", js.Array(value*))
    
    inline def setMoreResultsAvailable(value: NullableOption[Boolean]): Self = StObject.set(x, "moreResultsAvailable", value.asInstanceOf[js.Any])
    
    inline def setMoreResultsAvailableNull: Self = StObject.set(x, "moreResultsAvailable", null)
    
    inline def setMoreResultsAvailableUndefined: Self = StObject.set(x, "moreResultsAvailable", js.undefined)
    
    inline def setTotal(value: NullableOption[Double]): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalNull: Self = StObject.set(x, "total", null)
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
