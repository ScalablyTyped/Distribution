package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndividualOutcome extends StObject {
  
  /** Unique int given to each step. Ranges from 0(inclusive) to total number of steps(exclusive). The primary step is 0. */
  var multistepNumber: js.UndefOr[Double] = js.undefined
  
  var outcomeSummary: js.UndefOr[String] = js.undefined
  
  /** How long it took for this step to run. */
  var runDuration: js.UndefOr[Duration] = js.undefined
  
  var stepId: js.UndefOr[String] = js.undefined
}
object IndividualOutcome {
  
  inline def apply(): IndividualOutcome = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndividualOutcome]
  }
  
  extension [Self <: IndividualOutcome](x: Self) {
    
    inline def setMultistepNumber(value: Double): Self = StObject.set(x, "multistepNumber", value.asInstanceOf[js.Any])
    
    inline def setMultistepNumberUndefined: Self = StObject.set(x, "multistepNumber", js.undefined)
    
    inline def setOutcomeSummary(value: String): Self = StObject.set(x, "outcomeSummary", value.asInstanceOf[js.Any])
    
    inline def setOutcomeSummaryUndefined: Self = StObject.set(x, "outcomeSummary", js.undefined)
    
    inline def setRunDuration(value: Duration): Self = StObject.set(x, "runDuration", value.asInstanceOf[js.Any])
    
    inline def setRunDurationUndefined: Self = StObject.set(x, "runDuration", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
