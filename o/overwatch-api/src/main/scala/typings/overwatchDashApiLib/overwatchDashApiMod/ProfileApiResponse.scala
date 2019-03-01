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
    val __obj = js.Dynamic.literal(`private` = `private`)
    __obj.updateDynamic("competitive")(competitive)
    __obj.updateDynamic("games")(games)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("levelFrame")(levelFrame)
    __obj.updateDynamic("playtime")(playtime)
    __obj.updateDynamic("portrait")(portrait)
    __obj.updateDynamic("star")(star)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ProfileApiResponse]
  }
}

