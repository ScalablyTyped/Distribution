package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileApiResponse extends OverwatchApiResponse {
  var competitive: CompetitiveRankInfo
  var games: GameTypes
  var levelFrame: java.lang.String
  var playtime: Playtime
  var star: java.lang.String
}

object ProfileApiResponse {
  @scala.inline
  def apply(
    competitive: CompetitiveRankInfo,
    games: GameTypes,
    level: scala.Double,
    levelFrame: java.lang.String,
    playtime: Playtime,
    portrait: java.lang.String,
    `private`: scala.Boolean,
    star: java.lang.String,
    username: java.lang.String
  ): ProfileApiResponse = {
    val __obj = js.Dynamic.literal(competitive = competitive, games = games, level = level, levelFrame = levelFrame, playtime = playtime, portrait = portrait, star = star, username = username)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[ProfileApiResponse]
  }
}

