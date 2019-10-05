package typings.ol

import typings.ol.eventsEventMod.default
import typings.ol.eventsMod.EventsKey
import typings.ol.eventsMod.ListenerFunction
import typings.ol.eventsTargetMod.EventTargetLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  @js.native
  trait EventsKey extends js.Object {
    var bindTo: js.UndefOr[js.Any] = js.native
    var boundListener: js.UndefOr[ListenerFunction] = js.native
    var callOnce: Boolean = js.native
    var deleteIndex: js.UndefOr[Double] = js.native
    @JSName("listener")
    var listener_Original: ListenerFunction = js.native
    var target: EventTargetLike = js.native
    var `type`: String = js.native
    def listener(p0: default): Boolean = js.native
  }
  
  def bindListener(listenerObj: EventsKey): ListenerFunction = js.native
  def findListener(listeners: js.Array[EventsKey], listener: js.Function0[Unit]): js.UndefOr[EventsKey] = js.native
  def findListener(listeners: js.Array[EventsKey], listener: js.Function0[Unit], opt_this: js.Any): js.UndefOr[EventsKey] = js.native
  def findListener(
    listeners: js.Array[EventsKey],
    listener: js.Function0[Unit],
    opt_this: js.Any,
    opt_setDeleteIndex: Boolean
  ): js.UndefOr[EventsKey] = js.native
  def getListeners(target: EventTargetLike, `type`: String): js.UndefOr[js.Array[EventsKey]] = js.native
  def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction): EventsKey = js.native
  def listen(target: EventTargetLike, `type`: String, listener: ListenerFunction, opt_this: js.Any): EventsKey = js.native
  def listen(
    target: EventTargetLike,
    `type`: String,
    listener: ListenerFunction,
    opt_this: js.Any,
    opt_once: Boolean
  ): EventsKey = js.native
  def listenOnce(target: EventTargetLike, `type`: String, listener: ListenerFunction): EventsKey = js.native
  def listenOnce(target: EventTargetLike, `type`: String, listener: ListenerFunction, opt_this: js.Any): EventsKey = js.native
  def unlisten(target: EventTargetLike, `type`: String, listener: ListenerFunction): Unit = js.native
  def unlisten(target: EventTargetLike, `type`: String, listener: ListenerFunction, opt_this: js.Any): Unit = js.native
  def unlistenAll(target: EventTargetLike): Unit = js.native
  def unlistenByKey(key: EventsKey): Unit = js.native
  type ListenerFunction = js.Function1[/* p0 */ default, Boolean]
}

