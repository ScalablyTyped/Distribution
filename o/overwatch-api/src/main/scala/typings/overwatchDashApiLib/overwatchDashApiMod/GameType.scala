package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameType extends js.Object {
  var played: scala.Double
  var won: scala.Double
}

object GameType {
  @scala.inline
  def apply(played: scala.Double, won: scala.Double): GameType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("played")(played)
    __obj.updateDynamic("won")(won)
    __obj.asInstanceOf[GameType]
  }
}

