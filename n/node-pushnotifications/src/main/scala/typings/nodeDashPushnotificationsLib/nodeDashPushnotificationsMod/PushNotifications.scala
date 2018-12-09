package typings
package nodeDashPushnotificationsLib.nodeDashPushnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotifications extends js.Object {
  def send(
    registrationIds: js.Array[java.lang.String],
    data: nodeDashPushnotificationsLib.nodeDashPushnotificationsMod.PushNotificationsNs.Data
  ): js.Promise[_] = js.native
  def send(
    registrationIds: js.Array[java.lang.String],
    data: nodeDashPushnotificationsLib.nodeDashPushnotificationsMod.PushNotificationsNs.Data,
    cb: nodeDashPushnotificationsLib.nodeDashPushnotificationsMod.PushNotificationsNs.Callback
  ): scala.Unit = js.native
  def sendWith(
    method: nodeDashPushnotificationsLib.nodeDashPushnotificationsMod.PushNotificationsNs.PushMethod,
    regIds: js.Array[java.lang.String],
    data: nodeDashPushnotificationsLib.nodeDashPushnotificationsMod.PushNotificationsNs.Data,
    cb: nodeDashPushnotificationsLib.nodeDashPushnotificationsMod.PushNotificationsNs.Callback
  ): scala.Unit = js.native
  def setOptions(opts: nodeDashPushnotificationsLib.nodeDashPushnotificationsMod.PushNotificationsNs.Settings): scala.Unit = js.native
}

