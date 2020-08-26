package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameHighScore extends js.Object {
  var position: Double = js.native
  var score: Double = js.native
  var user: User = js.native
}

object GameHighScore {
  @scala.inline
  def apply(position: Double, score: Double, user: User): GameHighScore = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameHighScore]
  }
  @scala.inline
  implicit class GameHighScoreOps[Self <: GameHighScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

