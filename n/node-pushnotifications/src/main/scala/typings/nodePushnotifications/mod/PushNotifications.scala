package typings.nodePushnotifications.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushNotifications extends js.Object {
  def send(registrationIds: js.Array[RegistrationId], data: Data): js.Promise[js.Array[Result]] = js.native
  def send(registrationIds: js.Array[RegistrationId], data: Data, cb: Callback): Unit = js.native
  def send(registrationIds: RegistrationId, data: Data): js.Promise[js.Array[Result]] = js.native
  def send(registrationIds: RegistrationId, data: Data, cb: Callback): Unit = js.native
  def sendWith(method: PushMethod, regIds: js.Array[String], data: Data, cb: Callback): Unit = js.native
  def setOptions(opts: Settings): Unit = js.native
}

