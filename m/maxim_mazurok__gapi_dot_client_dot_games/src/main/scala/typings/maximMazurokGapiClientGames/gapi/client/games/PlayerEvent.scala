package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerEvent extends StObject {
  
  /** The ID of the event definition. */
  var definitionId: js.UndefOr[String] = js.undefined
  
  /** The current number of times this event has occurred, as a string. The formatting of this string depends on the configuration of your event in the Play Games Developer Console. */
  var formattedNumEvents: js.UndefOr[String] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerEvent`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The current number of times this event has occurred. */
  var numEvents: js.UndefOr[String] = js.undefined
  
  /** The ID of the player. */
  var playerId: js.UndefOr[String] = js.undefined
}
object PlayerEvent {
  
  inline def apply(): PlayerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerEvent]
  }
  
  extension [Self <: PlayerEvent](x: Self) {
    
    inline def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    inline def setFormattedNumEvents(value: String): Self = StObject.set(x, "formattedNumEvents", value.asInstanceOf[js.Any])
    
    inline def setFormattedNumEventsUndefined: Self = StObject.set(x, "formattedNumEvents", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNumEvents(value: String): Self = StObject.set(x, "numEvents", value.asInstanceOf[js.Any])
    
    inline def setNumEventsUndefined: Self = StObject.set(x, "numEvents", js.undefined)
    
    inline def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
  }
}
