package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringQueryLanguageCondition extends StObject {
  
  /**
    * The amount of time that a time series must violate the threshold to be considered failing. Currently, only values that are a multiple of a minute--e.g., 0, 60, 120, or 300
    * seconds--are supported. If an invalid value is given, an error will be returned. When choosing a duration, it is useful to keep in mind the frequency of the underlying time series
    * data (which may also be affected by any alignments specified in the aggregations field); a good duration is long enough so that a single outlier does not generate spurious alerts,
    * but short enough that unhealthy states are detected and alerted on quickly.
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /** A condition control that determines how metric-threshold conditions are evaluated when data stops arriving. */
  var evaluationMissingData: js.UndefOr[String] = js.undefined
  
  /** Monitoring Query Language (https://cloud.google.com/monitoring/mql) query that outputs a boolean stream. */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true
    * for any of the time series that have been identified by filter and aggregations, or by the ratio, if denominator_filter and denominator_aggregations are specified.
    */
  var trigger: js.UndefOr[Trigger] = js.undefined
}
object MonitoringQueryLanguageCondition {
  
  inline def apply(): MonitoringQueryLanguageCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringQueryLanguageCondition]
  }
  
  extension [Self <: MonitoringQueryLanguageCondition](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEvaluationMissingData(value: String): Self = StObject.set(x, "evaluationMissingData", value.asInstanceOf[js.Any])
    
    inline def setEvaluationMissingDataUndefined: Self = StObject.set(x, "evaluationMissingData", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
