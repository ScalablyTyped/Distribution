package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TournamentData extends js.Object {
  var id: Double
  var `type`: String
}

object TournamentData {
  @scala.inline
  def apply(id: Double, `type`: String): TournamentData = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TournamentData]
  }
}

