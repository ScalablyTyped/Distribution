package typings.nextgenDashEvents.nextgenDashEventsMod

import org.scalablytyped.runtime.StringDictionary
import typings.nextgenDashEvents.Anon_Ack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nextgen-events", "Proxy")
@js.native
class Proxy () extends js.Object {
  var remoteServices: StringDictionary[NextGenEvents] = js.native
  def addLocalService(name: String, heartBeatEmitter: js.Any, options: Anon_Ack): Unit = js.native
  def addRemoteService(name: String): Unit = js.native
  def destroy(): js.Any = js.native
  def push(data: js.Any): Unit = js.native
  def receive(raw: js.Any): Unit = js.native
  def send(message: js.Any): Unit = js.native
}

