package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

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
    val __obj = js.Dynamic.literal(text = text, voter_count = voter_count)
  
    __obj.asInstanceOf[PollOption]
  }
}

