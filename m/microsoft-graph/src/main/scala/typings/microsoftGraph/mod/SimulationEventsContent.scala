package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationEventsContent extends StObject {
  
  // Actual percentage of users who fell for the simulated attack in an attack simulation and training campaign.
  var compromisedRate: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // List of simulation events in an attack simulation and training campaign.
  var events: js.UndefOr[NullableOption[js.Array[SimulationEvent]]] = js.undefined
}
object SimulationEventsContent {
  
  inline def apply(): SimulationEventsContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationEventsContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationEventsContent] (val x: Self) extends AnyVal {
    
    inline def setCompromisedRate(value: NullableOption[Double]): Self = StObject.set(x, "compromisedRate", value.asInstanceOf[js.Any])
    
    inline def setCompromisedRateNull: Self = StObject.set(x, "compromisedRate", null)
    
    inline def setCompromisedRateUndefined: Self = StObject.set(x, "compromisedRate", js.undefined)
    
    inline def setEvents(value: NullableOption[js.Array[SimulationEvent]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsNull: Self = StObject.set(x, "events", null)
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: SimulationEvent*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
