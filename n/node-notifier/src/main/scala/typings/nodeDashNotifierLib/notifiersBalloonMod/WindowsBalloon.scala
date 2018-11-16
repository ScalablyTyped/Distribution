package typings
package nodeDashNotifierLib.notifiersBalloonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsBalloon extends js.Object {
  def notify(notification: nodeDashNotifierLib.notifiersBalloonMod.WindowsBalloonNs.Notification): WindowsBalloon = js.native
  def notify(
    notification: nodeDashNotifierLib.notifiersBalloonMod.WindowsBalloonNs.Notification,
    callback: nodeDashNotifierLib.nodeDashNotifierMod.nodeNotifierNs.NotificationCallback
  ): WindowsBalloon = js.native
}

