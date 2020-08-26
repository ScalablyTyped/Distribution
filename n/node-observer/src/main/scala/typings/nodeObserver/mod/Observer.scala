package typings.nodeObserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer extends js.Object {
  var subscribers: js.Array[js.Object] = js.native
  /**
    * triggering event
    * @param targetObj objects that subscribe to events
    * @param eventName the event name
    * @param data passed to the callback function when the event is fired
    */
  def send(targetObj: js.Object, eventName: String, data: js.Any): Unit = js.native
  /**
    * subscirpt event
    * @param targetObj objects that subscribe to events
    * @param eventName the event name
    * @param callback callback function executed when an event is fired
    */
  def subscribe(targetObj: js.Object, eventName: String, callback: js.Any): Unit = js.native
  /**
    * unsubscript event
    * @param targetObj objects that subscribe to events
    * @param eventName the event name
    */
  def unsubscribe(targetObj: js.Object, eventName: String): Unit = js.native
}

object Observer {
  @scala.inline
  def apply(
    send: (js.Object, String, js.Any) => Unit,
    subscribe: (js.Object, String, js.Any) => Unit,
    subscribers: js.Array[js.Object],
    unsubscribe: (js.Object, String) => Unit
  ): Observer = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction3(send), subscribe = js.Any.fromFunction3(subscribe), subscribers = subscribers.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.asInstanceOf[Observer]
  }
  @scala.inline
  implicit class ObserverOps[Self <: Observer] (val x: Self) extends AnyVal {
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
    def setSend(value: (js.Object, String, js.Any) => Unit): Self = this.set("send", js.Any.fromFunction3(value))
    @scala.inline
    def setSubscribe(value: (js.Object, String, js.Any) => Unit): Self = this.set("subscribe", js.Any.fromFunction3(value))
    @scala.inline
    def setSubscribersVarargs(value: js.Object*): Self = this.set("subscribers", js.Array(value :_*))
    @scala.inline
    def setSubscribers(value: js.Array[js.Object]): Self = this.set("subscribers", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsubscribe(value: (js.Object, String) => Unit): Self = this.set("unsubscribe", js.Any.fromFunction2(value))
  }
  
}

