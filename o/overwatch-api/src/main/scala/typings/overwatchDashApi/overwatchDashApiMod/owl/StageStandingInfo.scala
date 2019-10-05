package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StageStandingInfo extends PreseasonStandingInfo {
  var isPlayoffWinner: Boolean
}

object StageStandingInfo {
  @scala.inline
  def apply(
    comparisons: js.Array[StandingComparison],
    gameLoss: Double,
    gamePointsAgainst: Double,
    gamePointsFor: Double,
    gameTie: Double,
    gameWin: Double,
    isPlayoffWinner: Boolean,
    matchBye: Double,
    matchDraw: Double,
    matchLoss: Double,
    matchWin: Double,
    placement: Double
  ): StageStandingInfo = {
    val __obj = js.Dynamic.literal(comparisons = comparisons, gameLoss = gameLoss, gamePointsAgainst = gamePointsAgainst, gamePointsFor = gamePointsFor, gameTie = gameTie, gameWin = gameWin, isPlayoffWinner = isPlayoffWinner, matchBye = matchBye, matchDraw = matchDraw, matchLoss = matchLoss, matchWin = matchWin, placement = placement)
  
    __obj.asInstanceOf[StageStandingInfo]
  }
}

