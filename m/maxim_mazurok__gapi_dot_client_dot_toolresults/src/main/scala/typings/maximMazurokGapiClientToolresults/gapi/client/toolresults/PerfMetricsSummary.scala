package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerfMetricsSummary extends StObject {
  
  var appStartTime: js.UndefOr[AppStartTime] = js.undefined
  
  /** A tool results execution ID. @OutputOnly */
  var executionId: js.UndefOr[String] = js.undefined
  
  /** Graphics statistics for the entire run. Statistics are reset at the beginning of the run and collected at the end of the run. */
  var graphicsStats: js.UndefOr[GraphicsStats] = js.undefined
  
  /** A tool results history ID. @OutputOnly */
  var historyId: js.UndefOr[String] = js.undefined
  
  /** Describes the environment in which the performance metrics were collected */
  var perfEnvironment: js.UndefOr[PerfEnvironment] = js.undefined
  
  /** Set of resource collected */
  var perfMetrics: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The cloud project @OutputOnly */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** A tool results step ID. @OutputOnly */
  var stepId: js.UndefOr[String] = js.undefined
}
object PerfMetricsSummary {
  
  inline def apply(): PerfMetricsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfMetricsSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerfMetricsSummary] (val x: Self) extends AnyVal {
    
    inline def setAppStartTime(value: AppStartTime): Self = StObject.set(x, "appStartTime", value.asInstanceOf[js.Any])
    
    inline def setAppStartTimeUndefined: Self = StObject.set(x, "appStartTime", js.undefined)
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setGraphicsStats(value: GraphicsStats): Self = StObject.set(x, "graphicsStats", value.asInstanceOf[js.Any])
    
    inline def setGraphicsStatsUndefined: Self = StObject.set(x, "graphicsStats", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setPerfEnvironment(value: PerfEnvironment): Self = StObject.set(x, "perfEnvironment", value.asInstanceOf[js.Any])
    
    inline def setPerfEnvironmentUndefined: Self = StObject.set(x, "perfEnvironment", js.undefined)
    
    inline def setPerfMetrics(value: js.Array[String]): Self = StObject.set(x, "perfMetrics", value.asInstanceOf[js.Any])
    
    inline def setPerfMetricsUndefined: Self = StObject.set(x, "perfMetrics", js.undefined)
    
    inline def setPerfMetricsVarargs(value: String*): Self = StObject.set(x, "perfMetrics", js.Array(value*))
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
