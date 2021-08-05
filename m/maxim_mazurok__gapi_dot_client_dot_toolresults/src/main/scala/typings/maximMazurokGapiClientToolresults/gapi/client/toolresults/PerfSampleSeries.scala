package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerfSampleSeries extends StObject {
  
  /** Basic series represented by a line chart */
  var basicPerfSampleSeries: js.UndefOr[BasicPerfSampleSeries] = js.undefined
  
  /** A tool results execution ID. @OutputOnly */
  var executionId: js.UndefOr[String] = js.undefined
  
  /** A tool results history ID. @OutputOnly */
  var historyId: js.UndefOr[String] = js.undefined
  
  /** The cloud project @OutputOnly */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** A sample series id @OutputOnly */
  var sampleSeriesId: js.UndefOr[String] = js.undefined
  
  /** A tool results step ID. @OutputOnly */
  var stepId: js.UndefOr[String] = js.undefined
}
object PerfSampleSeries {
  
  inline def apply(): PerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfSampleSeries]
  }
  
  extension [Self <: PerfSampleSeries](x: Self) {
    
    inline def setBasicPerfSampleSeries(value: BasicPerfSampleSeries): Self = StObject.set(x, "basicPerfSampleSeries", value.asInstanceOf[js.Any])
    
    inline def setBasicPerfSampleSeriesUndefined: Self = StObject.set(x, "basicPerfSampleSeries", js.undefined)
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSampleSeriesId(value: String): Self = StObject.set(x, "sampleSeriesId", value.asInstanceOf[js.Any])
    
    inline def setSampleSeriesIdUndefined: Self = StObject.set(x, "sampleSeriesId", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
