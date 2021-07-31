package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSeriesRatio extends StObject {
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying bad service, either demanded service that was not provided or demanded
    * service that was of inadequate quality. Must have ValueType = DOUBLE or ValueType = INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
    */
  var badServiceFilter: js.UndefOr[String] = js.undefined
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying good service provided. Must have ValueType = DOUBLE or ValueType = INT64
    * and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
    */
  var goodServiceFilter: js.UndefOr[String] = js.undefined
  
  /**
    * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries quantifying total demanded service. Must have ValueType = DOUBLE or ValueType =
    * INT64 and must have MetricKind = DELTA or MetricKind = CUMULATIVE.
    */
  var totalServiceFilter: js.UndefOr[String] = js.undefined
}
object TimeSeriesRatio {
  
  @scala.inline
  def apply(): TimeSeriesRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSeriesRatio]
  }
  
  @scala.inline
  implicit class TimeSeriesRatioMutableBuilder[Self <: TimeSeriesRatio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadServiceFilter(value: String): Self = StObject.set(x, "badServiceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadServiceFilterUndefined: Self = StObject.set(x, "badServiceFilter", js.undefined)
    
    @scala.inline
    def setGoodServiceFilter(value: String): Self = StObject.set(x, "goodServiceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoodServiceFilterUndefined: Self = StObject.set(x, "goodServiceFilter", js.undefined)
    
    @scala.inline
    def setTotalServiceFilter(value: String): Self = StObject.set(x, "totalServiceFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalServiceFilterUndefined: Self = StObject.set(x, "totalServiceFilter", js.undefined)
  }
}
