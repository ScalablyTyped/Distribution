package typings
package nodeDashNotifierLib.notifiersGrowlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Growl extends js.Object {
  def notify(notification: nodeDashNotifierLib.notifiersGrowlMod.GrowlNs.Notification): Growl = js.native
  def notify(
    notification: nodeDashNotifierLib.notifiersGrowlMod.GrowlNs.Notification,
    callback: nodeDashNotifierLib.nodeDashNotifierMod.nodeNotifierNs.NotificationCallback
  ): Growl = js.native
}

