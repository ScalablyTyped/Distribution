package typings.overwatchDashApi.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameType extends js.Object {
  var played: Double
  var won: Double
}

object GameType {
  @scala.inline
  def apply(played: Double, won: Double): GameType = {
    val __obj = js.Dynamic.literal(played = played, won = won)
  
    __obj.asInstanceOf[GameType]
  }
}

