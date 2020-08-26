package typings.messenger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  /**
    * If the message is associated with an ajax request or is counting down to retry, cancel it.
    */
  def cancel(): Unit = js.native
  /**
    * Hide the message, if it's hidden.
    */
  def hide(): Unit = js.native
  /**
    * Show the message, if it's hidden.
    */
  def show(): Unit = js.native
  /**
    * Update the message with the provided options.
    */
  def update(options: MessageOptions): Unit = js.native
}

object Message {
  @scala.inline
  def apply(cancel: () => Unit, hide: () => Unit, show: () => Unit, update: MessageOptions => Unit): Message = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: MessageOptions => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

