package typings
package nodeDashNotifierLib.nodeDashNotifierMod.nodeNotifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeNotifier
  extends nodeLib.NodeJSNs.EventEmitter {
  var Growl: nodeDashNotifierLib.notifiersGrowlMod.namespaced = js.native
  var NotificationCenter: nodeDashNotifierLib.notifiersNotificationcenterMod.namespaced = js.native
  var NotifySend: nodeDashNotifierLib.notifiersNotifysendMod.namespaced = js.native
  var WindowsBalloon: nodeDashNotifierLib.notifiersBalloonMod.namespaced = js.native
  var WindowsToaster: nodeDashNotifierLib.notifiersToasterMod.namespaced = js.native
  def notify(notification: Notification): NodeNotifier = js.native
  def notify(notification: Notification, callback: NotificationCallback): NodeNotifier = js.native
}

