package typings.ol.collectionMod

import typings.ol.eventsMod.EventsKey
import typings.ol.objectMod.ObjectEvent
import typings.ol.olStrings.add
import typings.ol.olStrings.changeColonlength
import typings.ol.olStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T]
  extends typings.ol.objectMod.default {
  def clear(): Unit = js.native
  def extend(arr: js.Array[T]): Collection[T] = js.native
  def forEach(f: js.Function3[/* p0 */ T, /* p1 */ Double, /* p2 */ js.Array[T], _]): Unit = js.native
  def getArray(): js.Array[T] = js.native
  def getLength(): Double = js.native
  def insertAt(index: Double, elem: T): Unit = js.native
  def item(index: Double): T = js.native
  @JSName("on")
  def on_add(`type`: add, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): EventsKey = js.native
  @JSName("on")
  def on_changelength(`type`: changeColonlength, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_remove(`type`: remove, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): EventsKey = js.native
  @JSName("once")
  def once_add(`type`: add, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): EventsKey = js.native
  @JSName("once")
  def once_changelength(`type`: changeColonlength, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_remove(`type`: remove, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): EventsKey = js.native
  def pop(): js.UndefOr[T] = js.native
  def push(elem: T): Double = js.native
  def remove(elem: T): js.UndefOr[T] = js.native
  def removeAt(index: Double): js.UndefOr[T] = js.native
  def setAt(index: Double, elem: T): Unit = js.native
  @JSName("un")
  def un_add(`type`: add, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): Unit = js.native
  @JSName("un")
  def un_changelength(`type`: changeColonlength, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_remove(`type`: remove, listener: js.Function1[/* evt */ CollectionEvent[T], Unit]): Unit = js.native
}

