package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompetitiveGameType extends GameType {
  var draw: Double
  var lost: Double
  var win_rate: Double
}

object CompetitiveGameType {
  @scala.inline
  def apply(draw: Double, lost: Double, played: Double, win_rate: Double, won: Double): CompetitiveGameType = {
    val __obj = js.Dynamic.literal(draw = draw, lost = lost, played = played, win_rate = win_rate, won = won)
  
    __obj.asInstanceOf[CompetitiveGameType]
  }
}

