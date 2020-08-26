package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollAnswer extends js.Object {
  var option_ids: js.Array[Double] = js.native
  var poll_id: String = js.native
  var user: User = js.native
}

object PollAnswer {
  @scala.inline
  def apply(option_ids: js.Array[Double], poll_id: String, user: User): PollAnswer = {
    val __obj = js.Dynamic.literal(option_ids = option_ids.asInstanceOf[js.Any], poll_id = poll_id.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollAnswer]
  }
  @scala.inline
  implicit class PollAnswerOps[Self <: PollAnswer] (val x: Self) extends AnyVal {
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
    def setOption_idsVarargs(value: Double*): Self = this.set("option_ids", js.Array(value :_*))
    @scala.inline
    def setOption_ids(value: js.Array[Double]): Self = this.set("option_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoll_id(value: String): Self = this.set("poll_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: User): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

