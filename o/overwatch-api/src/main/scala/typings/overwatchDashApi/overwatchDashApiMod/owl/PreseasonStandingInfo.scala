package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreseasonStandingInfo extends StandingInfo {
  var comparisons: js.Array[StandingComparison]
}

object PreseasonStandingInfo {
  @scala.inline
  def apply(
    comparisons: js.Array[StandingComparison],
    gameLoss: Double,
    gamePointsAgainst: Double,
    gamePointsFor: Double,
    gameTie: Double,
    gameWin: Double,
    matchBye: Double,
    matchDraw: Double,
    matchLoss: Double,
    matchWin: Double,
    placement: Double
  ): PreseasonStandingInfo = {
    val __obj = js.Dynamic.literal(comparisons = comparisons, gameLoss = gameLoss, gamePointsAgainst = gamePointsAgainst, gamePointsFor = gamePointsFor, gameTie = gameTie, gameWin = gameWin, matchBye = matchBye, matchDraw = matchDraw, matchLoss = matchLoss, matchWin = matchWin, placement = placement)
  
    __obj.asInstanceOf[PreseasonStandingInfo]
  }
}

