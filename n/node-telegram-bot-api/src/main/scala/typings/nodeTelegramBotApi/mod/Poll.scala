package typings.nodeTelegramBotApi.mod

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], is_closed = is_closed.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Poll]
  }
}

