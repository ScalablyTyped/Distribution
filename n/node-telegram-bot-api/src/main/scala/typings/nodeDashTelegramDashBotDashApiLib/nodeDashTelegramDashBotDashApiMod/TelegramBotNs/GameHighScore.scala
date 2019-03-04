package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameHighScore extends js.Object {
  var position: scala.Double
  var score: scala.Double
  var user: User
}

object GameHighScore {
  @scala.inline
  def apply(position: scala.Double, score: scala.Double, user: User): GameHighScore = {
    val __obj = js.Dynamic.literal(position = position, score = score, user = user)
  
    __obj.asInstanceOf[GameHighScore]
  }
}

