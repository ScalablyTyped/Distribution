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

