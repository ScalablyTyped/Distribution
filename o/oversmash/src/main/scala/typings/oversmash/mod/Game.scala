package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Game extends js.Object {
  var gamesLost: Double = js.native
  var gamesPlayed: Double = js.native
  var gamesTied: Double = js.native
  var gamesWon: Double = js.native
  var games_lost: Double = js.native
  var games_played: Double = js.native
  var games_tied: Double = js.native
  var games_won: Double = js.native
  var timePlayed: String = js.native
  var time_played: String = js.native
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
  @scala.inline
  implicit class GameOps[Self <: Game] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGamesLost(value: Double): Self = this.set("gamesLost", value.asInstanceOf[js.Any])
    @scala.inline
    def setGamesPlayed(value: Double): Self = this.set("gamesPlayed", value.asInstanceOf[js.Any])
    @scala.inline
    def setGamesTied(value: Double): Self = this.set("gamesTied", value.asInstanceOf[js.Any])
    @scala.inline
    def setGamesWon(value: Double): Self = this.set("gamesWon", value.asInstanceOf[js.Any])
    @scala.inline
    def setGames_lost(value: Double): Self = this.set("games_lost", value.asInstanceOf[js.Any])
    @scala.inline
    def setGames_played(value: Double): Self = this.set("games_played", value.asInstanceOf[js.Any])
    @scala.inline
    def setGames_tied(value: Double): Self = this.set("games_tied", value.asInstanceOf[js.Any])
    @scala.inline
    def setGames_won(value: Double): Self = this.set("games_won", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimePlayed(value: String): Self = this.set("timePlayed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime_played(value: String): Self = this.set("time_played", value.asInstanceOf[js.Any])
  }
  
}

