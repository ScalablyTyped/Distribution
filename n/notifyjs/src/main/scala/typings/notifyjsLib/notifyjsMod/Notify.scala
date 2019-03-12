package typings
package notifyjsLib.notifyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notify extends js.Object {
  /**
    * Close the notification.
    */
  def close(): scala.Unit
  /**
    * Remove all event listener.
    */
  def destroy(): scala.Unit
  def handleEvent(e: stdLib.Event): scala.Unit
  def onClickNotification(): scala.Unit
  def onCloseNotification(): scala.Unit
  def onErrorNotification(): scala.Unit
  def onShowNotification(e: stdLib.Event): scala.Unit
  /**
    * Show the notification.
    */
  def show(): scala.Unit
}

object Notify {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    destroy: () => scala.Unit,
    handleEvent: stdLib.Event => scala.Unit,
    onClickNotification: () => scala.Unit,
    onCloseNotification: () => scala.Unit,
    onErrorNotification: () => scala.Unit,
    onShowNotification: stdLib.Event => scala.Unit,
    show: () => scala.Unit
  ): Notify = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), handleEvent = js.Any.fromFunction1(handleEvent), onClickNotification = js.Any.fromFunction0(onClickNotification), onCloseNotification = js.Any.fromFunction0(onCloseNotification), onErrorNotification = js.Any.fromFunction0(onErrorNotification), onShowNotification = js.Any.fromFunction1(onShowNotification), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Notify]
  }
}

