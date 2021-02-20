package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfMetricsSummary extends StObject {
  
  var appStartTime: js.UndefOr[AppStartTime] = js.native
  
  /** A tool results execution ID. @OutputOnly */
  var executionId: js.UndefOr[String] = js.native
  
  /** Graphics statistics for the entire run. Statistics are reset at the beginning of the run and collected at the end of the run. */
  var graphicsStats: js.UndefOr[GraphicsStats] = js.native
  
  /** A tool results history ID. @OutputOnly */
  var historyId: js.UndefOr[String] = js.native
  
  /** Describes the environment in which the performance metrics were collected */
  var perfEnvironment: js.UndefOr[PerfEnvironment] = js.native
  
  /** Set of resource collected */
  var perfMetrics: js.UndefOr[js.Array[String]] = js.native
  
  /** The cloud project @OutputOnly */
  var projectId: js.UndefOr[String] = js.native
  
  /** A tool results step ID. @OutputOnly */
  var stepId: js.UndefOr[String] = js.native
}
object PerfMetricsSummary {
  
  @scala.inline
  def apply(): PerfMetricsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfMetricsSummary]
  }
  
  @scala.inline
  implicit class PerfMetricsSummaryMutableBuilder[Self <: PerfMetricsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppStartTime(value: AppStartTime): Self = StObject.set(x, "appStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStartTimeUndefined: Self = StObject.set(x, "appStartTime", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    @scala.inline
    def setGraphicsStats(value: GraphicsStats): Self = StObject.set(x, "graphicsStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicsStatsUndefined: Self = StObject.set(x, "graphicsStats", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setPerfEnvironment(value: PerfEnvironment): Self = StObject.set(x, "perfEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfEnvironmentUndefined: Self = StObject.set(x, "perfEnvironment", js.undefined)
    
    @scala.inline
    def setPerfMetrics(value: js.Array[String]): Self = StObject.set(x, "perfMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerfMetricsUndefined: Self = StObject.set(x, "perfMetrics", js.undefined)
    
    @scala.inline
    def setPerfMetricsVarargs(value: String*): Self = StObject.set(x, "perfMetrics", js.Array(value :_*))
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
