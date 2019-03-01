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
    apply: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit],
    call: js.Function2[java.lang.String, /* repeated */ js.Any, scala.Unit],
    disconnect: js.Function0[scala.Unit],
    methods: js.Function1[js.Any, js.Any],
    onReconnect: js.Function0[scala.Unit],
    reconnect: js.Function0[scala.Unit],
    status: js.Function0[DDPStatus],
    subscribe: js.Function2[
      java.lang.String, 
      /* repeated */ js.Any, 
      meteorDashTypingsLib.MeteorNs.SubscriptionHandle
    ]
  ): DDPStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(apply)
    __obj.updateDynamic("call")(call)
    __obj.updateDynamic("disconnect")(disconnect)
    __obj.updateDynamic("methods")(methods)
    __obj.updateDynamic("onReconnect")(onReconnect)
    __obj.updateDynamic("reconnect")(reconnect)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.asInstanceOf[DDPStatic]
  }
}

