package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerLeaderboardScoreListResponse extends StObject {
  
  /** The leaderboard scores. */
  var items: js.UndefOr[js.Array[PlayerLeaderboardScore]] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerLeaderboardScoreListResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The Player resources for the owner of this score. */
  var player: js.UndefOr[Player] = js.undefined
}
object PlayerLeaderboardScoreListResponse {
  
  inline def apply(): PlayerLeaderboardScoreListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerLeaderboardScoreListResponse]
  }
  
  extension [Self <: PlayerLeaderboardScoreListResponse](x: Self) {
    
    inline def setItems(value: js.Array[PlayerLeaderboardScore]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PlayerLeaderboardScore*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPlayer(value: Player): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
    
    inline def setPlayerUndefined: Self = StObject.set(x, "player", js.undefined)
  }
}
