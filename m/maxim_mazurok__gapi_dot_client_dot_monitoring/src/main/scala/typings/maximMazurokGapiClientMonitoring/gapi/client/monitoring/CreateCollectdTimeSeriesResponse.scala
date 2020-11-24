package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCollectdTimeSeriesResponse extends js.Object {
  
  /**
    * Records the error status for points that were not written due to an error in the request.Failed requests for which nothing is written will return an error response instead. Requests
    * where data points were rejected by the backend will set summary instead.
    */
  var payloadErrors: js.UndefOr[js.Array[CollectdPayloadError]] = js.native
  
  /**
    * Aggregate statistics from writing the payloads. This field is omitted if all points were successfully written, so that the response is empty. This is for backwards compatibility
    * with clients that log errors on any non-empty response.
    */
  var summary: js.UndefOr[CreateTimeSeriesSummary] = js.native
}
object CreateCollectdTimeSeriesResponse {
  
  @scala.inline
  def apply(): CreateCollectdTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectdTimeSeriesResponse]
  }
  
  @scala.inline
  implicit class CreateCollectdTimeSeriesResponseOps[Self <: CreateCollectdTimeSeriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPayloadErrorsVarargs(value: CollectdPayloadError*): Self = this.set("payloadErrors", js.Array(value :_*))
    
    @scala.inline
    def setPayloadErrors(value: js.Array[CollectdPayloadError]): Self = this.set("payloadErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadErrors: Self = this.set("payloadErrors", js.undefined)
    
    @scala.inline
    def setSummary(value: CreateTimeSeriesSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
