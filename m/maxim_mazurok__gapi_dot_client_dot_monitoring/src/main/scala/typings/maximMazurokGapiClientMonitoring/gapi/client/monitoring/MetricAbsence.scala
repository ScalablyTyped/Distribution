package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricAbsence extends StObject {
  
  /**
    * Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each
    * resource to a single stream for each resource or when aggregating streams across all members of a group of resrouces). Multiple aggregations are applied in the order specified.This
    * field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the
    * ListTimeSeries method when debugging this field.
    */
  var aggregations: js.UndefOr[js.Array[Aggregation]] = js.undefined
  
  /**
    * The amount of time that a time series must fail to report new data to be considered failing. Currently, only values that are a multiple of a minute--e.g. 60, 120, or 300
    * seconds--are supported. If an invalid value is given, an error will be returned. The Duration.nanos field is ignored.
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /**
    * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is
    * specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be
    * retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048
    * Unicode characters in length.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true
    * for any of the time series that have been identified by filter and aggregations.
    */
  var trigger: js.UndefOr[Trigger] = js.undefined
}
object MetricAbsence {
  
  @scala.inline
  def apply(): MetricAbsence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAbsence]
  }
  
  @scala.inline
  implicit class MetricAbsenceMutableBuilder[Self <: MetricAbsence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregations(value: js.Array[Aggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    @scala.inline
    def setAggregationsVarargs(value: Aggregation*): Self = StObject.set(x, "aggregations", js.Array(value :_*))
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
