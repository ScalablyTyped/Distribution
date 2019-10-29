package typings.overwatchDashApi.overwatchDashApiMod

import typings.overwatchDashApi.Anon_Assists
import typings.overwatchDashApi.Anon_Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var endorsement: Anon_Frame
  var level: Double
  var portrait: String
  var `private`: Boolean
  var stats: Anon_Assists
  var username: String
}

object Stats {
  @scala.inline
  def apply(
    endorsement: Anon_Frame,
    level: Double,
    portrait: String,
    `private`: Boolean,
    stats: Anon_Assists,
    username: String
  ): Stats = {
    val __obj = js.Dynamic.literal(endorsement = endorsement, level = level, portrait = portrait, stats = stats, username = username)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[Stats]
  }
}

