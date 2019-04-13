package typings
package nodeDashPushnotificationsLib.nodeDashPushnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotifications extends js.Object {
  def send(registrationIds: js.Array[java.lang.String], data: Data): js.Promise[_] = js.native
  def send(registrationIds: js.Array[java.lang.String], data: Data, cb: Callback): scala.Unit = js.native
  def sendWith(method: PushMethod, regIds: js.Array[java.lang.String], data: Data, cb: Callback): scala.Unit = js.native
  def setOptions(opts: Settings): scala.Unit = js.native
}

