package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Game extends js.Object {
  var gamesLost: Double
  var gamesPlayed: Double
  var gamesTied: Double
  var gamesWon: Double
  var games_lost: Double
  var games_played: Double
  var games_tied: Double
  var games_won: Double
  var timePlayed: String
  var time_played: String
}

object Game {
  @scala.inline
  def apply(
    gamesLost: Double,
    gamesPlayed: Double,
    gamesTied: Double,
    gamesWon: Double,
    games_lost: Double,
    games_played: Double,
    games_tied: Double,
    games_won: Double,
    timePlayed: String,
    time_played: String
  ): Game = {
    val __obj = js.Dynamic.literal(gamesLost = gamesLost.asInstanceOf[js.Any], gamesPlayed = gamesPlayed.asInstanceOf[js.Any], gamesTied = gamesTied.asInstanceOf[js.Any], gamesWon = gamesWon.asInstanceOf[js.Any], games_lost = games_lost.asInstanceOf[js.Any], games_played = games_played.asInstanceOf[js.Any], games_tied = games_tied.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], timePlayed = timePlayed.asInstanceOf[js.Any], time_played = time_played.asInstanceOf[js.Any])
    __obj.asInstanceOf[Game]
  }
}

