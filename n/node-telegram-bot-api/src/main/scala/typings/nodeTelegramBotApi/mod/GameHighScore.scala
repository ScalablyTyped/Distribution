package typings.nodeTelegramBotApi.mod

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
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameHighScore]
  }
}

