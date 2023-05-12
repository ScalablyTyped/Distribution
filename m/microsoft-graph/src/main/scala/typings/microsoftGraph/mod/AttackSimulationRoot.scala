package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackSimulationRoot
  extends StObject
     with Entity {
  
  // Represents simulation automation created to run on a tenant.
  var simulationAutomations: js.UndefOr[NullableOption[js.Array[SimulationAutomation]]] = js.undefined
  
  // Represents an attack simulation training campaign in a tenant.
  var simulations: js.UndefOr[NullableOption[js.Array[Simulation]]] = js.undefined
}
object AttackSimulationRoot {
  
  inline def apply(): AttackSimulationRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackSimulationRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttackSimulationRoot] (val x: Self) extends AnyVal {
    
    inline def setSimulationAutomations(value: NullableOption[js.Array[SimulationAutomation]]): Self = StObject.set(x, "simulationAutomations", value.asInstanceOf[js.Any])
    
    inline def setSimulationAutomationsNull: Self = StObject.set(x, "simulationAutomations", null)
    
    inline def setSimulationAutomationsUndefined: Self = StObject.set(x, "simulationAutomations", js.undefined)
    
    inline def setSimulationAutomationsVarargs(value: SimulationAutomation*): Self = StObject.set(x, "simulationAutomations", js.Array(value*))
    
    inline def setSimulations(value: NullableOption[js.Array[Simulation]]): Self = StObject.set(x, "simulations", value.asInstanceOf[js.Any])
    
    inline def setSimulationsNull: Self = StObject.set(x, "simulations", null)
    
    inline def setSimulationsUndefined: Self = StObject.set(x, "simulations", js.undefined)
    
    inline def setSimulationsVarargs(value: Simulation*): Self = StObject.set(x, "simulations", js.Array(value*))
  }
}
