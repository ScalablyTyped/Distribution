package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAnalyticsQueryResponse extends StObject {
  
  /** How the results were aggregated. */
  var responseAggregationType: js.UndefOr[String] = js.undefined
  
  /** A list of rows grouped by the key values in the order given in the query. */
  var rows: js.UndefOr[js.Array[ApiDataRow]] = js.undefined
}
object SearchAnalyticsQueryResponse {
  
  inline def apply(): SearchAnalyticsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAnalyticsQueryResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchAnalyticsQueryResponse] (val x: Self) extends AnyVal {
    
    inline def setResponseAggregationType(value: String): Self = StObject.set(x, "responseAggregationType", value.asInstanceOf[js.Any])
    
    inline def setResponseAggregationTypeUndefined: Self = StObject.set(x, "responseAggregationType", js.undefined)
    
    inline def setRows(value: js.Array[ApiDataRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: ApiDataRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
