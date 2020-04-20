package typings.messenger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * If the message is associated with an ajax request or is counting down to retry, cancel it.
    */
  def cancel(): Unit
  /**
    * Hide the message, if it's hidden.
    */
  def hide(): Unit
  /**
    * Show the message, if it's hidden.
    */
  def show(): Unit
  /**
    * Update the message with the provided options.
    */
  def update(options: MessageOptions): Unit
}

object Message {
  @scala.inline
  def apply(cancel: () => Unit, hide: () => Unit, show: () => Unit, update: MessageOptions => Unit): Message = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Message]
  }
}

