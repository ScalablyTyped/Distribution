package typings.meteorDashTypings.meteorDdpMod.DDP

import typings.meteorDashTypings.Meteor.SubscriptionHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DDPStatic extends js.Object {
  @JSName("apply")
  def apply(method: String, parameters: js.Any*): Unit
  def call(method: String, parameters: js.Any*): Unit
  def disconnect(): Unit
  def methods(IMeteorMethodsDictionary: js.Any): js.Any
  def onReconnect(): Unit
  def reconnect(): Unit
  def status(): DDPStatus
  def subscribe(name: String, rest: js.Any*): SubscriptionHandle
}

object DDPStatic {
  @scala.inline
  def apply(
    apply: (String, /* repeated */ js.Any) => Unit,
    call: (String, /* repeated */ js.Any) => Unit,
    disconnect: () => Unit,
    methods: js.Any => js.Any,
    onReconnect: () => Unit,
    reconnect: () => Unit,
    status: () => DDPStatus,
    subscribe: (String, /* repeated */ js.Any) => SubscriptionHandle
  ): DDPStatic = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = js.Any.fromFunction2(call), disconnect = js.Any.fromFunction0(disconnect), methods = js.Any.fromFunction1(methods), onReconnect = js.Any.fromFunction0(onReconnect), reconnect = js.Any.fromFunction0(reconnect), status = js.Any.fromFunction0(status), subscribe = js.Any.fromFunction2(subscribe))
  
    __obj.asInstanceOf[DDPStatic]
  }
}

