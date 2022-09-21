package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeaderboardListResponse extends StObject {
  
  /** The leaderboards. */
  var items: js.UndefOr[js.Array[Leaderboard]] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#leaderboardListResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object LeaderboardListResponse {
  
  inline def apply(): LeaderboardListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaderboardListResponse]
  }
  
  extension [Self <: LeaderboardListResponse](x: Self) {
    
    inline def setItems(value: js.Array[Leaderboard]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Leaderboard*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
