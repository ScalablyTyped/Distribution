package typings
package meteorLib.DDPNs

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
  def subscribe(name: java.lang.String, rest: js.Any*): meteorLib.MeteorNs.SubscriptionHandle
}

object DDPStatic {
  @scala.inline
  def apply(
    apply: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit],
    call: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit],
    disconnect: js.Function0[scala.Unit],
    methods: js.Function1[js.Any, js.Any],
    onReconnect: js.Function0[scala.Unit],
    reconnect: js.Function0[scala.Unit],
    status: js.Function0[DDPStatus],
    subscribe: js.Function2[java.lang.String, /* repeated */ js.Any, meteorLib.MeteorNs.SubscriptionHandle]
  ): DDPStatic = {
    val __obj = js.Dynamic.literal(apply = apply, call = call, disconnect = disconnect, methods = methods, onReconnect = onReconnect, reconnect = reconnect, status = status, subscribe = subscribe)
  
    __obj.asInstanceOf[DDPStatic]
  }
}

