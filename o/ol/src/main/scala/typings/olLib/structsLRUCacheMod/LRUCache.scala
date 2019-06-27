package typings
package olLib.structsLRUCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LRUCache[T]
  extends olLib.eventsTargetMod.default {
  def canExpireCache(): scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def containsKey(key: java.lang.String): scala.Boolean = js.native
  def forEach[S](
    f: js.ThisFunction3[
      /* this */ S, 
      /* p1 */ js.Any, 
      /* p2 */ java.lang.String, 
      /* p3 */ LRUCache[_], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def forEach[S](
    f: js.ThisFunction3[
      /* this */ S, 
      /* p1 */ js.Any, 
      /* p2 */ java.lang.String, 
      /* p3 */ LRUCache[_], 
      scala.Unit
    ],
    opt_this: S
  ): scala.Unit = js.native
  def get(key: java.lang.String): T = js.native
  def getCount(): scala.Double = js.native
  def getKeys(): js.Array[java.lang.String] = js.native
  def getValues(): js.Array[T] = js.native
  def on(`type`: java.lang.String, listener: js.Function1[/* p0 */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey | js.Array[olLib.eventsMod.EventsKey] = js.native
  def on(`type`: js.Array[java.lang.String], listener: js.Function1[/* p0 */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey | js.Array[olLib.eventsMod.EventsKey] = js.native
  @JSName("on")
  def on_change(
    `type`: olLib.olLibStrings.change,
    listener: js.Function1[/* evt */ olLib.eventsEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def once(`type`: java.lang.String, listener: js.Function1[/* p0 */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey | js.Array[olLib.eventsMod.EventsKey] = js.native
  def once(`type`: js.Array[java.lang.String], listener: js.Function1[/* p0 */ js.Any, scala.Unit]): olLib.eventsMod.EventsKey | js.Array[olLib.eventsMod.EventsKey] = js.native
  @JSName("once")
  def once_change(
    `type`: olLib.olLibStrings.change,
    listener: js.Function1[/* evt */ olLib.eventsEventMod.default, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def peekFirstKey(): java.lang.String = js.native
  def peekLast(): T = js.native
  def peekLastKey(): java.lang.String = js.native
  def pop(): T = js.native
  def prune(): scala.Unit = js.native
  def remove(key: java.lang.String): T = js.native
  def replace(key: java.lang.String, value: T): scala.Unit = js.native
  def set(key: java.lang.String, value: T): scala.Unit = js.native
  def setSize(size: scala.Double): scala.Unit = js.native
  def un(`type`: java.lang.String, listener: js.Function1[/* p0 */ js.Any, scala.Unit]): scala.Unit = js.native
  def un(`type`: js.Array[java.lang.String], listener: js.Function1[/* p0 */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("un")
  def un_change(
    `type`: olLib.olLibStrings.change,
    listener: js.Function1[/* evt */ olLib.eventsEventMod.default, scala.Unit]
  ): scala.Unit = js.native
}

