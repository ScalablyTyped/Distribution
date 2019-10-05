package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekData extends js.Object {
  var endDate: Double
  var id: Double
  var matches: js.Array[MatchData]
  var name: String
  var startDate: Double
}

object WeekData {
  @scala.inline
  def apply(endDate: Double, id: Double, matches: js.Array[MatchData], name: String, startDate: Double): WeekData = {
    val __obj = js.Dynamic.literal(endDate = endDate, id = id, matches = matches, name = name, startDate = startDate)
  
    __obj.asInstanceOf[WeekData]
  }
}

