package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationReport extends StObject {
  
  // Overview of an attack simulation and training campaign.
  var overview: js.UndefOr[NullableOption[SimulationReportOverview]] = js.undefined
  
  // The tenant users and their online actions in an attack simulation and training campaign.
  var simulationUsers: js.UndefOr[NullableOption[js.Array[UserSimulationDetails]]] = js.undefined
}
object SimulationReport {
  
  inline def apply(): SimulationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationReport] (val x: Self) extends AnyVal {
    
    inline def setOverview(value: NullableOption[SimulationReportOverview]): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewNull: Self = StObject.set(x, "overview", null)
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setSimulationUsers(value: NullableOption[js.Array[UserSimulationDetails]]): Self = StObject.set(x, "simulationUsers", value.asInstanceOf[js.Any])
    
    inline def setSimulationUsersNull: Self = StObject.set(x, "simulationUsers", null)
    
    inline def setSimulationUsersUndefined: Self = StObject.set(x, "simulationUsers", js.undefined)
    
    inline def setSimulationUsersVarargs(value: UserSimulationDetails*): Self = StObject.set(x, "simulationUsers", js.Array(value*))
  }
}
