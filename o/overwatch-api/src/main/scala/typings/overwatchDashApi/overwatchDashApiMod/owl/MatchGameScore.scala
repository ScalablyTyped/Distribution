package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchGameScore extends js.Object {
  var team1: Double
  var team2: Double
}

object MatchGameScore {
  @scala.inline
  def apply(team1: Double, team2: Double): MatchGameScore = {
    val __obj = js.Dynamic.literal(team1 = team1, team2 = team2)
  
    __obj.asInstanceOf[MatchGameScore]
  }
}

