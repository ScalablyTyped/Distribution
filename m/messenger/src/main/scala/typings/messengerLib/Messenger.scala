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
  def apply(hideAll: () => scala.Unit, post: MessageOptions => Message): Messenger = {
    val __obj = js.Dynamic.literal(hideAll = js.Any.fromFunction0(hideAll), post = js.Any.fromFunction1(post))
  
    __obj.asInstanceOf[Messenger]
  }
}

