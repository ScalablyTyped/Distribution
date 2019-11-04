package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Poll extends js.Object {
  var id: String
  var is_closed: Boolean
  var options: js.Array[PollOption]
  var question: String
}

object Poll {
  @scala.inline
  def apply(id: String, is_closed: Boolean, options: js.Array[PollOption], question: String): Poll = {
    val __obj = js.Dynamic.literal(id = id, is_closed = is_closed, options = options, question = question)
  
    __obj.asInstanceOf[Poll]
  }
}

