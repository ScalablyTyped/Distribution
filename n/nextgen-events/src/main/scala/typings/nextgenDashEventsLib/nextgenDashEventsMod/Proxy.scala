package typings
package nextgenDashEventsLib.nextgenDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nextgen-events", "Proxy")
@js.native
class Proxy () extends js.Object {
  var remoteServices: org.scalablytyped.runtime.StringDictionary[NextGenEvents] = js.native
  def addLocalService(name: java.lang.String, heartBeatEmitter: js.Any, options: nextgenDashEventsLib.Anon_Ack): scala.Unit = js.native
  def addRemoteService(name: java.lang.String): scala.Unit = js.native
  def destroy(): js.Any = js.native
  def push(data: js.Any): scala.Unit = js.native
  def receive(raw: js.Any): scala.Unit = js.native
  def send(message: js.Any): scala.Unit = js.native
}

