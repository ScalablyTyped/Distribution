package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsApiResponse extends OverwatchApiResponse {
  var stats: StatsCategories
}

object StatsApiResponse {
  @scala.inline
  def apply(
    level: scala.Double,
    portrait: java.lang.String,
    `private`: scala.Boolean,
    stats: StatsCategories,
    username: java.lang.String
  ): StatsApiResponse = {
    val __obj = js.Dynamic.literal(`private` = `private`)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("portrait")(portrait)
    __obj.updateDynamic("stats")(stats)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[StatsApiResponse]
  }
}

