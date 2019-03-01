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
    close: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    handleEvent: js.Function1[stdLib.Event, scala.Unit],
    onClickNotification: js.Function0[scala.Unit],
    onCloseNotification: js.Function0[scala.Unit],
    onErrorNotification: js.Function0[scala.Unit],
    onShowNotification: js.Function1[stdLib.Event, scala.Unit],
    show: js.Function0[scala.Unit]
  ): Notify = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("handleEvent")(handleEvent)
    __obj.updateDynamic("onClickNotification")(onClickNotification)
    __obj.updateDynamic("onCloseNotification")(onCloseNotification)
    __obj.updateDynamic("onErrorNotification")(onErrorNotification)
    __obj.updateDynamic("onShowNotification")(onShowNotification)
    __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[Notify]
  }
}

