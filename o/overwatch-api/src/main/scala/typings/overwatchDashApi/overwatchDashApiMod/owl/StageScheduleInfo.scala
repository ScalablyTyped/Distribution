package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageScheduleInfo extends js.Object {
  var enabled: Boolean
  var id: Double
  var matches: js.Array[MatchData]
  var name: String
  var slug: String
  var tournament: js.Array[TournamentData]
  var weeks: js.Array[WeekData]
}

object StageScheduleInfo {
  @scala.inline
  def apply(
    enabled: Boolean,
    id: Double,
    matches: js.Array[MatchData],
    name: String,
    slug: String,
    tournament: js.Array[TournamentData],
    weeks: js.Array[WeekData]
  ): StageScheduleInfo = {
    val __obj = js.Dynamic.literal(enabled = enabled, id = id, matches = matches, name = name, slug = slug, tournament = tournament, weeks = weeks)
  
    __obj.asInstanceOf[StageScheduleInfo]
  }
}

