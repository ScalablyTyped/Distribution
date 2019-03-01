package typings
package messengerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messenger extends js.Object {
  /**
    * Hides all messages.
    */
  def hideAll(): scala.Unit
  /**
    * Posts a message.
    */
  def post(options: MessageOptions): Message
}

object Messenger {
  @scala.inline
  def apply(hideAll: js.Function0[scala.Unit], post: js.Function1[MessageOptions, Message]): Messenger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hideAll")(hideAll)
    __obj.updateDynamic("post")(post)
    __obj.asInstanceOf[Messenger]
  }
}

