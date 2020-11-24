package typings.nodeRedEditorClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comms extends js.Object {
  
  def connect(): Unit = js.native
  
  def subscribe(topic: String, callback: CommSubscriber): Unit = js.native
  
  def unsubscribe(topic: String, callback: CommSubscriber): Unit = js.native
}
object Comms {
  
  @scala.inline
  def apply(
    connect: () => Unit,
    subscribe: (String, CommSubscriber) => Unit,
    unsubscribe: (String, CommSubscriber) => Unit
  ): Comms = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.asInstanceOf[Comms]
  }
  
  @scala.inline
  implicit class CommsOps[Self <: Comms] (val x: Self) extends AnyVal {
    
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
    def setConnect(value: () => Unit): Self = this.set("connect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubscribe(value: (String, CommSubscriber) => Unit): Self = this.set("subscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnsubscribe(value: (String, CommSubscriber) => Unit): Self = this.set("unsubscribe", js.Any.fromFunction2(value))
  }
}
