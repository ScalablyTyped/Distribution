package typings.phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaderboardScore extends StObject {
  
  /**
    * The developer-specified payload associated with the score, or null if one was not set.
    */
  var data: String = js.native
  
  /**
    * The game's unique identifier for the player.
    */
  var playerID: String = js.native
  
  /**
    * The player's localized display name.
    */
  var playerName: String = js.native
  
  /**
    * A url to the player's public profile photo.
    */
  var playerPhotoURL: String = js.native
  
  /**
    * The entry's leaderboard ranking.
    */
  var rank: integer = js.native
  
  /**
    * An integer score value.
    */
  var score: integer = js.native
  
  /**
    * The score value, formatted with the score format associated with the leaderboard.
    */
  var scoreFormatted: String = js.native
  
  /**
    * The Unix timestamp of when the leaderboard entry was last updated.
    */
  var timestamp: integer = js.native
}
object LeaderboardScore {
  
  @scala.inline
  def apply(
    data: String,
    playerID: String,
    playerName: String,
    playerPhotoURL: String,
    rank: integer,
    score: integer,
    scoreFormatted: String,
    timestamp: integer
  ): LeaderboardScore = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], playerID = playerID.asInstanceOf[js.Any], playerName = playerName.asInstanceOf[js.Any], playerPhotoURL = playerPhotoURL.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], scoreFormatted = scoreFormatted.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeaderboardScore]
  }
  
  @scala.inline
  implicit class LeaderboardScoreMutableBuilder[Self <: LeaderboardScore] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerID(value: String): Self = StObject.set(x, "playerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerName(value: String): Self = StObject.set(x, "playerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerPhotoURL(value: String): Self = StObject.set(x, "playerPhotoURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: integer): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: integer): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreFormatted(value: String): Self = StObject.set(x, "scoreFormatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: integer): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
