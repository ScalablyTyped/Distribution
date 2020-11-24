package typings.meteor.ddpMod.DDP

import typings.meteor.Meteor.SubscriptionHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DDPStatic extends js.Object {
  
  @JSName("apply")
  def apply(method: String, parameters: js.Any*): js.Any = js.native
  
  def call(method: String, parameters: js.Any*): js.Any = js.native
  
  def disconnect(): Unit = js.native
  
  def methods(IMeteorMethodsDictionary: js.Any): js.Any = js.native
  
  def onReconnect(): Unit = js.native
  
  def reconnect(): Unit = js.native
  
  def status(): DDPStatus = js.native
  
  def subscribe(name: String, rest: js.Any*): SubscriptionHandle = js.native
}
object DDPStatic {
  
  @scala.inline
  def apply(
    apply: (String, /* repeated */ js.Any) => js.Any,
    call: (String, /* repeated */ js.Any) => js.Any,
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
  
  @scala.inline
  implicit class DDPStaticOps[Self <: DDPStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApply(value: (String, /* repeated */ js.Any) => js.Any): Self = this.set("apply", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCall(value: (String, /* repeated */ js.Any) => js.Any): Self = this.set("call", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMethods(value: js.Any => js.Any): Self = this.set("methods", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReconnect(value: () => Unit): Self = this.set("onReconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReconnect(value: () => Unit): Self = this.set("reconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStatus(value: () => DDPStatus): Self = this.set("status", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubscribe(value: (String, /* repeated */ js.Any) => SubscriptionHandle): Self = this.set("subscribe", js.Any.fromFunction2(value))
  }
}
