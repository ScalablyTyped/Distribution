package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationAutomationRun
  extends StObject
     with Entity {
  
  // Date and time when the run ends in an attack simulation automation.
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier for the attack simulation campaign initiated in the attack simulation automation run.
  var simulationId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time when the run starts in an attack simulation automation.
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Status of the attack simulation automation run. The possible values are: unknown, running, succeeded, failed, skipped,
    * unknownFutureValue.
    */
  var status: js.UndefOr[NullableOption[SimulationAutomationRunStatus]] = js.undefined
}
object SimulationAutomationRun {
  
  inline def apply(): SimulationAutomationRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationAutomationRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationAutomationRun] (val x: Self) extends AnyVal {
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setSimulationId(value: NullableOption[String]): Self = StObject.set(x, "simulationId", value.asInstanceOf[js.Any])
    
    inline def setSimulationIdNull: Self = StObject.set(x, "simulationId", null)
    
    inline def setSimulationIdUndefined: Self = StObject.set(x, "simulationId", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[SimulationAutomationRunStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
