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

