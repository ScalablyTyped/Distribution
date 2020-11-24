package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSeriesRatio extends js.Object {
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying bad service, either demanded service that was not provided or demanded
    * service that was of inadequate quality. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
    */
  var badServiceFilter: js.UndefOr[String] = js.native
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying good service provided. Must have ValueType = DOUBLE or ValueType = INT64
    * and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
    */
  var goodServiceFilter: js.UndefOr[String] = js.native
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying total demanded service. Must have ValueType = DOUBLE or ValueType =
    * INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
    */
  var totalServiceFilter: js.UndefOr[String] = js.native
}
object TimeSeriesRatio {
  
  @scala.inline
  def apply(): TimeSeriesRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesRatio]
  }
  
  @scala.inline
  implicit class TimeSeriesRatioOps[Self <: TimeSeriesRatio] (val x: Self) extends AnyVal {
    
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
    def setBadServiceFilter(value: String): Self = this.set("badServiceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadServiceFilter: Self = this.set("badServiceFilter", js.undefined)
    
    @scala.inline
    def setGoodServiceFilter(value: String): Self = this.set("goodServiceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoodServiceFilter: Self = this.set("goodServiceFilter", js.undefined)
    
    @scala.inline
    def setTotalServiceFilter(value: String): Self = this.set("totalServiceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalServiceFilter: Self = this.set("totalServiceFilter", js.undefined)
  }
}
