package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventUpdateRequest extends StObject {
  
  /** The ID of the event being modified in this update. */
  var definitionId: js.UndefOr[String] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventUpdateRequest`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The number of times this event occurred in this time period. */
  var updateCount: js.UndefOr[String] = js.undefined
}
object EventUpdateRequest {
  
  inline def apply(): EventUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventUpdateRequest]
  }
  
  extension [Self <: EventUpdateRequest](x: Self) {
    
    inline def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setUpdateCount(value: String): Self = StObject.set(x, "updateCount", value.asInstanceOf[js.Any])
    
    inline def setUpdateCountUndefined: Self = StObject.set(x, "updateCount", js.undefined)
  }
}
