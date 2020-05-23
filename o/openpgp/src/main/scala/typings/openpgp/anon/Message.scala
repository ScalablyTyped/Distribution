package typings.openpgp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var message: typings.openpgp.mod.message.Message
}

object Message {
  @scala.inline
  def apply(message: typings.openpgp.mod.message.Message): Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

