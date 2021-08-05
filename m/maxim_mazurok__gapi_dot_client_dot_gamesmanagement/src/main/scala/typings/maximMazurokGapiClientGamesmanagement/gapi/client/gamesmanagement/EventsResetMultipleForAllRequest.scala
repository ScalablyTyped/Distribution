package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsResetMultipleForAllRequest extends StObject {
  
  /** The IDs of events to reset. */
  var event_ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#eventsResetMultipleForAllRequest`. */
  var kind: js.UndefOr[String] = js.undefined
}
object EventsResetMultipleForAllRequest {
  
  inline def apply(): EventsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsResetMultipleForAllRequest]
  }
  
  extension [Self <: EventsResetMultipleForAllRequest](x: Self) {
    
    inline def setEvent_ids(value: js.Array[String]): Self = StObject.set(x, "event_ids", value.asInstanceOf[js.Any])
    
    inline def setEvent_idsUndefined: Self = StObject.set(x, "event_ids", js.undefined)
    
    inline def setEvent_idsVarargs(value: String*): Self = StObject.set(x, "event_ids", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
