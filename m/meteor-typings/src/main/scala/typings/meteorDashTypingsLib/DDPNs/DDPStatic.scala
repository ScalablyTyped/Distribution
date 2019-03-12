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

object DDPStatic {
  @scala.inline
  def apply(
    apply: (java.lang.String, /* repeated */ js.Any) => scala.Unit,
    call: (java.lang.String, /* repeated */ js.Any) => scala.Unit,
    disconnect: () => scala.Unit,
    methods: js.Any => js.Any,
    onReconnect: () => scala.Unit,
    reconnect: () => scala.Unit,
    status: () => DDPStatus,
    subscribe: (java.lang.String, /* repeated */ js.Any) => meteorDashTypingsLib.MeteorNs.SubscriptionHandle
  ): DDPStatic = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = js.Any.fromFunction2(call), disconnect = js.Any.fromFunction0(disconnect), methods = js.Any.fromFunction1(methods), onReconnect = js.Any.fromFunction0(onReconnect), reconnect = js.Any.fromFunction0(reconnect), status = js.Any.fromFunction0(status), subscribe = js.Any.fromFunction2(subscribe))
  
    __obj.asInstanceOf[DDPStatic]
  }
}

