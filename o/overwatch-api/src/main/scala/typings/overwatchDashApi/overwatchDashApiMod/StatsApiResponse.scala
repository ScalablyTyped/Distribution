package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsApiResponse extends OverwatchApiResponse {
  var stats: StatsCategories
}

object StatsApiResponse {
  @scala.inline
  def apply(level: Double, portrait: String, `private`: Boolean, stats: StatsCategories, username: String): StatsApiResponse = {
    val __obj = js.Dynamic.literal(level = level, portrait = portrait, stats = stats, username = username)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[StatsApiResponse]
  }
}

