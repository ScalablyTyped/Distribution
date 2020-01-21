package typings.nodeObserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer extends js.Object {
  var subscribers: js.Array[js.Object]
  /**
    * triggering event
    * @param targetObj objects that subscribe to events
    * @param eventName the event name
    * @param data passed to the callback function when the event is fired
    */
  def send(targetObj: js.Object, eventName: String, data: js.Any): Unit
  /**
    * subscirpt event
    * @param targetObj objects that subscribe to events
    * @param eventName the event name
    * @param callback callback function executed when an event is fired
    */
  def subscribe(targetObj: js.Object, eventName: String, callback: js.Any): Unit
  /**
    * unsubscript event
    * @param targetObj objects that subscribe to events
    * @param eventName the event name
    */
  def unsubscribe(targetObj: js.Object, eventName: String): Unit
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
}

