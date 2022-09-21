package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPeriodUpdate extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventPeriodUpdate`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The time period being covered by this update. */
  var timePeriod: js.UndefOr[EventPeriodRange] = js.undefined
  
  /** The updates being made for this time period. */
  var updates: js.UndefOr[js.Array[EventUpdateRequest]] = js.undefined
}
object EventPeriodUpdate {
  
  inline def apply(): EventPeriodUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPeriodUpdate]
  }
  
  extension [Self <: EventPeriodUpdate](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTimePeriod(value: EventPeriodRange): Self = StObject.set(x, "timePeriod", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodUndefined: Self = StObject.set(x, "timePeriod", js.undefined)
    
    inline def setUpdates(value: js.Array[EventUpdateRequest]): Self = StObject.set(x, "updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesUndefined: Self = StObject.set(x, "updates", js.undefined)
    
    inline def setUpdatesVarargs(value: EventUpdateRequest*): Self = StObject.set(x, "updates", js.Array(value*))
  }
}
