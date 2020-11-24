package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryTimeSeriesResponse extends js.Object {
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this
    * method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Query execution errors that may have caused the time series data returned to be incomplete. The available data will be available in the response. */
  var partialErrors: js.UndefOr[js.Array[Status]] = js.native
  
  /** The time series data. */
  var timeSeriesData: js.UndefOr[js.Array[TimeSeriesData]] = js.native
  
  /** The descriptor for the time series data. */
  var timeSeriesDescriptor: js.UndefOr[TimeSeriesDescriptor] = js.native
}
object QueryTimeSeriesResponse {
  
  @scala.inline
  def apply(): QueryTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTimeSeriesResponse]
  }
  
  @scala.inline
  implicit class QueryTimeSeriesResponseOps[Self <: QueryTimeSeriesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPartialErrorsVarargs(value: Status*): Self = this.set("partialErrors", js.Array(value :_*))
    
    @scala.inline
    def setPartialErrors(value: js.Array[Status]): Self = this.set("partialErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialErrors: Self = this.set("partialErrors", js.undefined)
    
    @scala.inline
    def setTimeSeriesDataVarargs(value: TimeSeriesData*): Self = this.set("timeSeriesData", js.Array(value :_*))
    
    @scala.inline
    def setTimeSeriesData(value: js.Array[TimeSeriesData]): Self = this.set("timeSeriesData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeriesData: Self = this.set("timeSeriesData", js.undefined)
    
    @scala.inline
    def setTimeSeriesDescriptor(value: TimeSeriesDescriptor): Self = this.set("timeSeriesDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSeriesDescriptor: Self = this.set("timeSeriesDescriptor", js.undefined)
  }
}
