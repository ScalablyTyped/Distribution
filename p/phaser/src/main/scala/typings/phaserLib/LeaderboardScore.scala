package typings
package phaserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeaderboardScore extends js.Object {
  /**
    * The developer-specified payload associated with the score, or null if one was not set.
    */
  var data: java.lang.String
  /**
    * The game's unique identifier for the player.
    */
  var playerID: java.lang.String
  /**
    * The player's localized display name.
    */
  var playerName: java.lang.String
  /**
    * A url to the player's public profile photo.
    */
  var playerPhotoURL: java.lang.String
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
  var scoreFormatted: java.lang.String
  /**
    * The Unix timestamp of when the leaderboard entry was last updated.
    */
  var timestamp: integer
}

object LeaderboardScore {
  @scala.inline
  def apply(
    data: java.lang.String,
    playerID: java.lang.String,
    playerName: java.lang.String,
    playerPhotoURL: java.lang.String,
    rank: integer,
    score: integer,
    scoreFormatted: java.lang.String,
    timestamp: integer
  ): LeaderboardScore = {
    val __obj = js.Dynamic.literal(data = data, playerID = playerID, playerName = playerName, playerPhotoURL = playerPhotoURL, rank = rank, score = score, scoreFormatted = scoreFormatted, timestamp = timestamp)
  
    __obj.asInstanceOf[LeaderboardScore]
  }
}

