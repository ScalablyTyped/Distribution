package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTimeSeriesResponse extends StObject {
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this
    * method.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Query execution errors that may have caused the time series data returned to be incomplete. The available data will be available in the response. */
  var partialErrors: js.UndefOr[js.Array[Status]] = js.undefined
  
  /** The time series data. */
  var timeSeriesData: js.UndefOr[js.Array[TimeSeriesData]] = js.undefined
  
  /** The descriptor for the time series data. */
  var timeSeriesDescriptor: js.UndefOr[TimeSeriesDescriptor] = js.undefined
}
object QueryTimeSeriesResponse {
  
  inline def apply(): QueryTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTimeSeriesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryTimeSeriesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPartialErrors(value: js.Array[Status]): Self = StObject.set(x, "partialErrors", value.asInstanceOf[js.Any])
    
    inline def setPartialErrorsUndefined: Self = StObject.set(x, "partialErrors", js.undefined)
    
    inline def setPartialErrorsVarargs(value: Status*): Self = StObject.set(x, "partialErrors", js.Array(value*))
    
    inline def setTimeSeriesData(value: js.Array[TimeSeriesData]): Self = StObject.set(x, "timeSeriesData", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesDataUndefined: Self = StObject.set(x, "timeSeriesData", js.undefined)
    
    inline def setTimeSeriesDataVarargs(value: TimeSeriesData*): Self = StObject.set(x, "timeSeriesData", js.Array(value*))
    
    inline def setTimeSeriesDescriptor(value: TimeSeriesDescriptor): Self = StObject.set(x, "timeSeriesDescriptor", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesDescriptorUndefined: Self = StObject.set(x, "timeSeriesDescriptor", js.undefined)
  }
}
