package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileApiResponse extends OverwatchApiResponse {
  var competitive: CompetitiveRankInfo
  var games: GameTypes
  var levelFrame: String
  var playtime: Playtime
  var star: String
}

object ProfileApiResponse {
  @scala.inline
  def apply(
    competitive: CompetitiveRankInfo,
    games: GameTypes,
    level: Double,
    levelFrame: String,
    playtime: Playtime,
    portrait: String,
    `private`: Boolean,
    star: String,
    username: String
  ): ProfileApiResponse = {
    val __obj = js.Dynamic.literal(competitive = competitive, games = games, level = level, levelFrame = levelFrame, playtime = playtime, portrait = portrait, star = star, username = username)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[ProfileApiResponse]
  }
}

