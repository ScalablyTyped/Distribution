package typings
package meteorDashTypingsLib.DDPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DDPStatic extends js.Object {
  @JSName("apply")
  def apply(method: java.lang.String, parameters: js.Any*): scala.Unit
  def call(method: java.lang.String, parameters: js.Any*): scala.Unit
  def disconnect(): scala.Unit
  def methods(IMeteorMethodsDictionary: js.Any): js.Any
  def onReconnect(): scala.Unit
  def reconnect(): scala.Unit
  def status(): DDPStatus
  def subscribe(name: java.lang.String, rest: js.Any*): meteorDashTypingsLib.MeteorNs.SubscriptionHandle
}

