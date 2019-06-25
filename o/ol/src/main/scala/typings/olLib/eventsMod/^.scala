package typings
package olLib.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bindListener(listenerObj: EventsKey): ListenerFunction = js.native
  def findListener(listeners: js.Array[EventsKey], listener: js.Function0[scala.Unit]): EventsKey = js.native
  def findListener(listeners: js.Array[EventsKey], listener: js.Function0[scala.Unit], opt_this: js.Any): EventsKey = js.native
  def findListener(
    listeners: js.Array[EventsKey],
    listener: js.Function0[scala.Unit],
    opt_this: js.Any,
    opt_setDeleteIndex: scala.Boolean
  ): EventsKey = js.native
  def getListeners(target: olLib.eventsTargetMod.EventTargetLike, `type`: java.lang.String): js.Array[EventsKey] = js.native
  def listen(
    target: olLib.eventsTargetMod.EventTargetLike,
    `type`: java.lang.String,
    listener: ListenerFunction
  ): EventsKey = js.native
  def listen(
    target: olLib.eventsTargetMod.EventTargetLike,
    `type`: java.lang.String,
    listener: ListenerFunction,
    opt_this: js.Any
  ): EventsKey = js.native
  def listen(
    target: olLib.eventsTargetMod.EventTargetLike,
    `type`: java.lang.String,
    listener: ListenerFunction,
    opt_this: js.Any,
    opt_once: scala.Boolean
  ): EventsKey = js.native
  def listenOnce(
    target: olLib.eventsTargetMod.EventTargetLike,
    `type`: java.lang.String,
    listener: ListenerFunction
  ): EventsKey = js.native
  def listenOnce(
    target: olLib.eventsTargetMod.EventTargetLike,
    `type`: java.lang.String,
    listener: ListenerFunction,
    opt_this: js.Any
  ): EventsKey = js.native
  def unlisten(
    target: olLib.eventsTargetMod.EventTargetLike,
    `type`: java.lang.String,
    listener: ListenerFunction
  ): scala.Unit = js.native
  def unlisten(
    target: olLib.eventsTargetMod.EventTargetLike,
    `type`: java.lang.String,
    listener: ListenerFunction,
    opt_this: js.Any
  ): scala.Unit = js.native
  def unlistenAll(target: olLib.eventsTargetMod.EventTargetLike): scala.Unit = js.native
  def unlistenByKey(key: EventsKey): scala.Unit = js.native
}

