package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollOption extends js.Object {
  var text: String
  var voter_count: Double
}

object PollOption {
  @scala.inline
  def apply(text: String, voter_count: Double): PollOption = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], voter_count = voter_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollOption]
  }
}

