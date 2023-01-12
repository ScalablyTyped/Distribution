package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTimeSeriesRequest extends StObject {
  
  /** A positive number that is the maximum number of time_series_data to return. */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return additional results
    * from the previous method call.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /** Required. The query in the Monitoring Query Language (https://cloud.google.com/monitoring/mql/reference) format. The default time zone is in UTC. */
  var query: js.UndefOr[String] = js.undefined
}
object QueryTimeSeriesRequest {
  
  inline def apply(): QueryTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTimeSeriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryTimeSeriesRequest] (val x: Self) extends AnyVal {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
