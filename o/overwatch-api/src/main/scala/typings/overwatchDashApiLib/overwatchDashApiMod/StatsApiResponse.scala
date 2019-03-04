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
    val __obj = js.Dynamic.literal(level = level, portrait = portrait, stats = stats, username = username)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[StatsApiResponse]
  }
}

