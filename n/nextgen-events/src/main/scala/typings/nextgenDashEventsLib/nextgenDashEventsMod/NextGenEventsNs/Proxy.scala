package typings
package nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  var remoteServices: org.scalablytyped.runtime.StringDictionary[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents]
  def addLocalService(name: java.lang.String, heartBeatEmitter: js.Any, options: nextgenDashEventsLib.Anon_Ack): scala.Unit
  def addRemoteService(name: java.lang.String): scala.Unit
  def destroy(): js.Any
  def push(data: js.Any): scala.Unit
  def receive(raw: js.Any): scala.Unit
  def send(message: js.Any): scala.Unit
}

object Proxy {
  @scala.inline
  def apply(
    addLocalService: (java.lang.String, js.Any, nextgenDashEventsLib.Anon_Ack) => scala.Unit,
    addRemoteService: java.lang.String => scala.Unit,
    destroy: () => js.Any,
    push: js.Any => scala.Unit,
    receive: js.Any => scala.Unit,
    remoteServices: org.scalablytyped.runtime.StringDictionary[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    send: js.Any => scala.Unit
  ): Proxy = {
    val __obj = js.Dynamic.literal(addLocalService = js.Any.fromFunction3(addLocalService), addRemoteService = js.Any.fromFunction1(addRemoteService), destroy = js.Any.fromFunction0(destroy), push = js.Any.fromFunction1(push), receive = js.Any.fromFunction1(receive), remoteServices = remoteServices, send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[Proxy]
  }
}

