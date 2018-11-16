package typings
package nodeDashNotifierLib.notifiersToasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsToaster extends js.Object {
  def notify(notification: nodeDashNotifierLib.nodeDashNotifierMod.nodeNotifierNs.Notification): WindowsToaster = js.native
  def notify(
    notification: nodeDashNotifierLib.nodeDashNotifierMod.nodeNotifierNs.Notification,
    callback: nodeDashNotifierLib.nodeDashNotifierMod.nodeNotifierNs.NotificationCallback
  ): WindowsToaster = js.native
}

