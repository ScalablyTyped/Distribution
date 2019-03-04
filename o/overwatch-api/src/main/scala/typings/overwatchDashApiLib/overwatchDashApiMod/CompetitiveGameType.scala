package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompetitiveGameType extends GameType {
  var draw: scala.Double
  var lost: scala.Double
  var win_rate: scala.Double
}

object CompetitiveGameType {
  @scala.inline
  def apply(
    draw: scala.Double,
    lost: scala.Double,
    played: scala.Double,
    win_rate: scala.Double,
    won: scala.Double
  ): CompetitiveGameType = {
    val __obj = js.Dynamic.literal(draw = draw, lost = lost, played = played, win_rate = win_rate, won = won)
  
    __obj.asInstanceOf[CompetitiveGameType]
  }
}

