package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLogMetricsResponse extends StObject {
  
  /** A list of logs-based metrics. */
  var metrics: js.UndefOr[js.Array[LogMetric]] = js.undefined
  
  /**
    * If there might be more results than appear in this response, then nextPageToken is included. To get the next set of results, call this method again using the value of nextPageToken
    * as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListLogMetricsResponse {
  
  inline def apply(): ListLogMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLogMetricsResponse]
  }
  
  extension [Self <: ListLogMetricsResponse](x: Self) {
    
    inline def setMetrics(value: js.Array[LogMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: LogMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
