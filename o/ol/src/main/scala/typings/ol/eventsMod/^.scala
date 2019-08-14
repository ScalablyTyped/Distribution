package typings.ol.eventsMod

import typings.ol.eventsTargetMod.EventTargetLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
}

