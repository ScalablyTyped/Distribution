package typings
package olLib.collectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T]
  extends olLib.objectMod.default {
  def clear(): scala.Unit = js.native
  def extend(arr: js.Array[T]): Collection[T] = js.native
  def forEach(f: js.Function3[/* p0 */ T, /* p1 */ scala.Double, /* p2 */ js.Array[T], scala.Unit]): scala.Unit = js.native
  def getArray(): js.Array[T] = js.native
  def getLength(): scala.Double = js.native
  def insertAt(index: scala.Double, elem: T): scala.Unit = js.native
  def item(index: scala.Double): T = js.native
  @JSName("on")
  def on_add(`type`: olLib.olLibStrings.add, listener: js.Function1[/* evt */ CollectionEvent[T], scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_changelength(
    `type`: olLib.olLibStrings.`change:length`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_remove(
    `type`: olLib.olLibStrings.remove,
    listener: js.Function1[/* evt */ CollectionEvent[T], scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_add(`type`: olLib.olLibStrings.add, listener: js.Function1[/* evt */ CollectionEvent[T], scala.Unit]): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_changelength(
    `type`: olLib.olLibStrings.`change:length`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_remove(
    `type`: olLib.olLibStrings.remove,
    listener: js.Function1[/* evt */ CollectionEvent[T], scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def pop(): T = js.native
  def push(elem: T): scala.Double = js.native
  def remove(elem: T): T = js.native
  def removeAt(index: scala.Double): T = js.native
  def setAt(index: scala.Double, elem: T): scala.Unit = js.native
  @JSName("un")
  def un_add(`type`: olLib.olLibStrings.add, listener: js.Function1[/* evt */ CollectionEvent[T], scala.Unit]): scala.Unit = js.native
  @JSName("un")
  def un_changelength(
    `type`: olLib.olLibStrings.`change:length`,
    listener: js.Function1[/* evt */ olLib.objectMod.ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_remove(
    `type`: olLib.olLibStrings.remove,
    listener: js.Function1[/* evt */ CollectionEvent[T], scala.Unit]
  ): scala.Unit = js.native
}

