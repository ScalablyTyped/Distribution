package typings
package messengerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  /**
    * If the message is associated with an ajax request or is counting down to retry, cancel it.
    */
  def cancel(): scala.Unit
  /**
    * Hide the message, if it's hidden.
    */
  def hide(): scala.Unit
  /**
    * Show the message, if it's hidden.
    */
  def show(): scala.Unit
  /**
    * Update the message with the provided options.
    */
  def update(options: MessageOptions): scala.Unit
}

object Message {
  @scala.inline
  def apply(
    cancel: js.Function0[scala.Unit],
    hide: js.Function0[scala.Unit],
    show: js.Function0[scala.Unit],
    update: js.Function1[MessageOptions, scala.Unit]
  ): Message = {
    val __obj = js.Dynamic.literal(cancel = cancel, hide = hide, show = show, update = update)
  
    __obj.asInstanceOf[Message]
  }
}

