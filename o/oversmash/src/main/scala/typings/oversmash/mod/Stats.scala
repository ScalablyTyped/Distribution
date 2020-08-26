package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var achievements: js.Array[Achievement] = js.native
  var competitive: GameMode = js.native
  var competitiveRank: CompetitiveRank = js.native
  var competitive_rank: CompetitiveRank = js.native
  var endorsementLevel: Double = js.native
  var endorsement_level: Double = js.native
  var gamesWon: Double = js.native
  var games_won: Double = js.native
  var quickplay: GameMode = js.native
}

object Stats {
  @scala.inline
  def apply(
    achievements: js.Array[Achievement],
    competitive: GameMode,
    competitiveRank: CompetitiveRank,
    competitive_rank: CompetitiveRank,
    endorsementLevel: Double,
    endorsement_level: Double,
    gamesWon: Double,
    games_won: Double,
    quickplay: GameMode
  ): Stats = {
    val __obj = js.Dynamic.literal(achievements = achievements.asInstanceOf[js.Any], competitive = competitive.asInstanceOf[js.Any], competitiveRank = competitiveRank.asInstanceOf[js.Any], competitive_rank = competitive_rank.asInstanceOf[js.Any], endorsementLevel = endorsementLevel.asInstanceOf[js.Any], endorsement_level = endorsement_level.asInstanceOf[js.Any], gamesWon = gamesWon.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
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
    def setAchievementsVarargs(value: Achievement*): Self = this.set("achievements", js.Array(value :_*))
    @scala.inline
    def setAchievements(value: js.Array[Achievement]): Self = this.set("achievements", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompetitive(value: GameMode): Self = this.set("competitive", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompetitiveRank(value: CompetitiveRank): Self = this.set("competitiveRank", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompetitive_rank(value: CompetitiveRank): Self = this.set("competitive_rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndorsementLevel(value: Double): Self = this.set("endorsementLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndorsement_level(value: Double): Self = this.set("endorsement_level", value.asInstanceOf[js.Any])
    @scala.inline
    def setGamesWon(value: Double): Self = this.set("gamesWon", value.asInstanceOf[js.Any])
    @scala.inline
    def setGames_won(value: Double): Self = this.set("games_won", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuickplay(value: GameMode): Self = this.set("quickplay", value.asInstanceOf[js.Any])
  }
  
}

