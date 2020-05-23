package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var achievements: js.Array[Achievement]
  var competitive: GameMode
  var competitiveRank: CompetitiveRank
  var competitive_rank: CompetitiveRank
  var endorsementLevel: Double
  var endorsement_level: Double
  var gamesWon: Double
  var games_won: Double
  var quickplay: GameMode
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
}

