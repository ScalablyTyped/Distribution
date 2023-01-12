package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopedPlayerIds extends StObject {
  
  /**
    * Identifier of the player across all games of the given developer. Every player has the same developer_player_key in all games of one developer. Developer player key changes for the
    * game if the game is transferred to another developer. Note that game_player_id will stay unchanged.
    */
  var developerPlayerKey: js.UndefOr[String] = js.undefined
  
  /** Game-scoped player identifier. This is the same id that is returned in GetPlayer game_player_id field. */
  var gamePlayerId: js.UndefOr[String] = js.undefined
}
object ScopedPlayerIds {
  
  inline def apply(): ScopedPlayerIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopedPlayerIds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScopedPlayerIds] (val x: Self) extends AnyVal {
    
    inline def setDeveloperPlayerKey(value: String): Self = StObject.set(x, "developerPlayerKey", value.asInstanceOf[js.Any])
    
    inline def setDeveloperPlayerKeyUndefined: Self = StObject.set(x, "developerPlayerKey", js.undefined)
    
    inline def setGamePlayerId(value: String): Self = StObject.set(x, "gamePlayerId", value.asInstanceOf[js.Any])
    
    inline def setGamePlayerIdUndefined: Self = StObject.set(x, "gamePlayerId", js.undefined)
  }
}
