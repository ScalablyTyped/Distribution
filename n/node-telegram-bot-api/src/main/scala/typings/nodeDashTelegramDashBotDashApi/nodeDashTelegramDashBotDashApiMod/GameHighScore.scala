package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameHighScore extends js.Object {
  var position: Double
  var score: Double
  var user: User
}

object GameHighScore {
  @scala.inline
  def apply(position: Double, score: Double, user: User): GameHighScore = {
    val __obj = js.Dynamic.literal(position = position, score = score, user = user)
  
    __obj.asInstanceOf[GameHighScore]
  }
}

