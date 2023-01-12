package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerLeaderboardScore extends StObject {
  
  /** The rank of the score in the friends collection for this leaderboard. */
  var friendsRank: js.UndefOr[LeaderboardScoreRank] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerLeaderboardScore`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The ID of the leaderboard this score is in. */
  var leaderboard_id: js.UndefOr[String] = js.undefined
  
  /** The public rank of the score in this leaderboard. This object will not be present if the user is not sharing their scores publicly. */
  var publicRank: js.UndefOr[LeaderboardScoreRank] = js.undefined
  
  /** The formatted value of this score. */
  var scoreString: js.UndefOr[String] = js.undefined
  
  /** Additional information about the score. Values must contain no more than 64 URI-safe characters as defined by section 2.3 of RFC 3986. */
  var scoreTag: js.UndefOr[String] = js.undefined
  
  /** The numerical value of this score. */
  var scoreValue: js.UndefOr[String] = js.undefined
  
  /** The social rank of the score in this leaderboard. */
  var socialRank: js.UndefOr[LeaderboardScoreRank] = js.undefined
  
  /** The time span of this score. */
  var timeSpan: js.UndefOr[String] = js.undefined
  
  /** The timestamp at which this score was recorded, in milliseconds since the epoch in UTC. */
  var writeTimestamp: js.UndefOr[String] = js.undefined
}
object PlayerLeaderboardScore {
  
  inline def apply(): PlayerLeaderboardScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerLeaderboardScore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerLeaderboardScore] (val x: Self) extends AnyVal {
    
    inline def setFriendsRank(value: LeaderboardScoreRank): Self = StObject.set(x, "friendsRank", value.asInstanceOf[js.Any])
    
    inline def setFriendsRankUndefined: Self = StObject.set(x, "friendsRank", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLeaderboard_id(value: String): Self = StObject.set(x, "leaderboard_id", value.asInstanceOf[js.Any])
    
    inline def setLeaderboard_idUndefined: Self = StObject.set(x, "leaderboard_id", js.undefined)
    
    inline def setPublicRank(value: LeaderboardScoreRank): Self = StObject.set(x, "publicRank", value.asInstanceOf[js.Any])
    
    inline def setPublicRankUndefined: Self = StObject.set(x, "publicRank", js.undefined)
    
    inline def setScoreString(value: String): Self = StObject.set(x, "scoreString", value.asInstanceOf[js.Any])
    
    inline def setScoreStringUndefined: Self = StObject.set(x, "scoreString", js.undefined)
    
    inline def setScoreTag(value: String): Self = StObject.set(x, "scoreTag", value.asInstanceOf[js.Any])
    
    inline def setScoreTagUndefined: Self = StObject.set(x, "scoreTag", js.undefined)
    
    inline def setScoreValue(value: String): Self = StObject.set(x, "scoreValue", value.asInstanceOf[js.Any])
    
    inline def setScoreValueUndefined: Self = StObject.set(x, "scoreValue", js.undefined)
    
    inline def setSocialRank(value: LeaderboardScoreRank): Self = StObject.set(x, "socialRank", value.asInstanceOf[js.Any])
    
    inline def setSocialRankUndefined: Self = StObject.set(x, "socialRank", js.undefined)
    
    inline def setTimeSpan(value: String): Self = StObject.set(x, "timeSpan", value.asInstanceOf[js.Any])
    
    inline def setTimeSpanUndefined: Self = StObject.set(x, "timeSpan", js.undefined)
    
    inline def setWriteTimestamp(value: String): Self = StObject.set(x, "writeTimestamp", value.asInstanceOf[js.Any])
    
    inline def setWriteTimestampUndefined: Self = StObject.set(x, "writeTimestamp", js.undefined)
  }
}
