package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandingInfo extends js.Object {
  var gameLoss: Double
  var gamePointsAgainst: Double
  var gamePointsFor: Double
  var gameTie: Double
  var gameWin: Double
  var matchBye: Double
  var matchDraw: Double
  var matchLoss: Double
  var matchWin: Double
  var placement: Double
}

object StandingInfo {
  @scala.inline
  def apply(
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
  ): StandingInfo = {
    val __obj = js.Dynamic.literal(gameLoss = gameLoss, gamePointsAgainst = gamePointsAgainst, gamePointsFor = gamePointsFor, gameTie = gameTie, gameWin = gameWin, matchBye = matchBye, matchDraw = matchDraw, matchLoss = matchLoss, matchWin = matchWin, placement = placement)
  
    __obj.asInstanceOf[StandingInfo]
  }
}

