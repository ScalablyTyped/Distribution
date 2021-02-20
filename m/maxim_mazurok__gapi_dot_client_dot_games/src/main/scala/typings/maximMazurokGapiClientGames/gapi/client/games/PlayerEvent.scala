package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerEvent extends StObject {
  
  /** The ID of the event definition. */
  var definitionId: js.UndefOr[String] = js.native
  
  /** The current number of times this event has occurred, as a string. The formatting of this string depends on the configuration of your event in the Play Games Developer Console. */
  var formattedNumEvents: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerEvent`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The current number of times this event has occurred. */
  var numEvents: js.UndefOr[String] = js.native
  
  /** The ID of the player. */
  var playerId: js.UndefOr[String] = js.native
}
object PlayerEvent {
  
  @scala.inline
  def apply(): PlayerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerEvent]
  }
  
  @scala.inline
  implicit class PlayerEventMutableBuilder[Self <: PlayerEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    @scala.inline
    def setFormattedNumEvents(value: String): Self = StObject.set(x, "formattedNumEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedNumEventsUndefined: Self = StObject.set(x, "formattedNumEvents", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNumEvents(value: String): Self = StObject.set(x, "numEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumEventsUndefined: Self = StObject.set(x, "numEvents", js.undefined)
    
    @scala.inline
    def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
  }
}
