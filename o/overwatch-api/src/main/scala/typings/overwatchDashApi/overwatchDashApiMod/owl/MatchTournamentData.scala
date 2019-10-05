package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchTournamentData extends js.Object {
  var id: Double
  var location: String
  var `type`: String
}

object MatchTournamentData {
  @scala.inline
  def apply(id: Double, location: String, `type`: String): MatchTournamentData = {
    val __obj = js.Dynamic.literal(id = id, location = location)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MatchTournamentData]
  }
}

