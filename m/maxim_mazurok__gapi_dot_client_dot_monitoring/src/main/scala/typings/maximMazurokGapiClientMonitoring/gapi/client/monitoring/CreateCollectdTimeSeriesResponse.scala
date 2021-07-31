package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCollectdTimeSeriesResponse extends StObject {
  
  /**
    * Records the error status for points that were not written due to an error in the request.Failed requests for which nothing is written will return an error response instead. Requests
    * where data points were rejected by the backend will set summary instead.
    */
  var payloadErrors: js.UndefOr[js.Array[CollectdPayloadError]] = js.undefined
  
  /**
    * Aggregate statistics from writing the payloads. This field is omitted if all points were successfully written, so that the response is empty. This is for backwards compatibility
    * with clients that log errors on any non-empty response.
    */
  var summary: js.UndefOr[CreateTimeSeriesSummary] = js.undefined
}
object CreateCollectdTimeSeriesResponse {
  
  @scala.inline
  def apply(): CreateCollectdTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectdTimeSeriesResponse]
  }
  
  @scala.inline
  implicit class CreateCollectdTimeSeriesResponseMutableBuilder[Self <: CreateCollectdTimeSeriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayloadErrors(value: js.Array[CollectdPayloadError]): Self = StObject.set(x, "payloadErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadErrorsUndefined: Self = StObject.set(x, "payloadErrors", js.undefined)
    
    @scala.inline
    def setPayloadErrorsVarargs(value: CollectdPayloadError*): Self = StObject.set(x, "payloadErrors", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: CreateTimeSeriesSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
  }
}
