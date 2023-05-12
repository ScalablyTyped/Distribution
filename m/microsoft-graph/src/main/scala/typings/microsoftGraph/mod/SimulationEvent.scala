package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationEvent extends StObject {
  
  // Count of the simulation event occurrence in an attack simulation and training campaign.
  var count: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Name of the simulation event in an attack simulation and training campaign.
  var eventName: js.UndefOr[NullableOption[String]] = js.undefined
}
object SimulationEvent {
  
  inline def apply(): SimulationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimulationEvent] (val x: Self) extends AnyVal {
    
    inline def setCount(value: NullableOption[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEventName(value: NullableOption[String]): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameNull: Self = StObject.set(x, "eventName", null)
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
  }
}
