package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollOption extends js.Object {
  var text: String = js.native
  var voter_count: Double = js.native
}

object PollOption {
  @scala.inline
  def apply(text: String, voter_count: Double): PollOption = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], voter_count = voter_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollOption]
  }
  @scala.inline
  implicit class PollOptionOps[Self <: PollOption] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setVoter_count(value: Double): Self = this.set("voter_count", value.asInstanceOf[js.Any])
  }
  
}

