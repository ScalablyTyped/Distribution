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
    addLocalService: js.Function3[java.lang.String, js.Any, nextgenDashEventsLib.Anon_Ack, scala.Unit],
    addRemoteService: js.Function1[java.lang.String, scala.Unit],
    destroy: js.Function0[js.Any],
    push: js.Function1[js.Any, scala.Unit],
    receive: js.Function1[js.Any, scala.Unit],
    remoteServices: org.scalablytyped.runtime.StringDictionary[nextgenDashEventsLib.nextgenDashEventsMod.NextGenEvents],
    send: js.Function1[js.Any, scala.Unit]
  ): Proxy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addLocalService")(addLocalService)
    __obj.updateDynamic("addRemoteService")(addRemoteService)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("receive")(receive)
    __obj.updateDynamic("remoteServices")(remoteServices)
    __obj.updateDynamic("send")(send)
    __obj.asInstanceOf[Proxy]
  }
}

