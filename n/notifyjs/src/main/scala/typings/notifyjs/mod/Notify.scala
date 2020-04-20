package typings.notifyjs.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notify extends js.Object {
  /**
    * Close the notification.
    */
  def close(): Unit
  /**
    * Remove all event listener.
    */
  def destroy(): Unit
  def handleEvent(e: Event_): Unit
  def onClickNotification(): Unit
  def onCloseNotification(): Unit
  def onErrorNotification(): Unit
  def onShowNotification(e: Event_): Unit
  /**
    * Show the notification.
    */
  def show(): Unit
}

object Notify {
  @scala.inline
  def apply(
    close: () => Unit,
    destroy: () => Unit,
    handleEvent: Event_ => Unit,
    onClickNotification: () => Unit,
    onCloseNotification: () => Unit,
    onErrorNotification: () => Unit,
    onShowNotification: Event_ => Unit,
    show: () => Unit
  ): Notify = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), handleEvent = js.Any.fromFunction1(handleEvent), onClickNotification = js.Any.fromFunction0(onClickNotification), onCloseNotification = js.Any.fromFunction0(onCloseNotification), onErrorNotification = js.Any.fromFunction0(onErrorNotification), onShowNotification = js.Any.fromFunction1(onShowNotification), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Notify]
  }
}

