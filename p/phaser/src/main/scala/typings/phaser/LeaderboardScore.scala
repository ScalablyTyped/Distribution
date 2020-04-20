package typings.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardScore extends js.Object {
  /**
    * The developer-specified payload associated with the score, or null if one was not set.
    */
  var data: String
  /**
    * The game's unique identifier for the player.
    */
  var playerID: String
  /**
    * The player's localized display name.
    */
  var playerName: String
  /**
    * A url to the player's public profile photo.
    */
  var playerPhotoURL: String
  /**
    * The entry's leaderboard ranking.
    */
  var rank: integer
  /**
    * An integer score value.
    */
  var score: integer
  /**
    * The score value, formatted with the score format associated with the leaderboard.
    */
  var scoreFormatted: String
  /**
    * The Unix timestamp of when the leaderboard entry was last updated.
    */
  var timestamp: integer
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
}

