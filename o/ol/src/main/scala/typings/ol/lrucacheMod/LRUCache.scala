package typings.ol.lrucacheMod

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.change
import typings.ol.olStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LRUCache[T] extends js.Object {
  
  def canExpireCache(): Boolean = js.native
  
  /**
    * FIXME empty description for jsdoc
    */
  def clear(): Unit = js.native
  
  def containsKey(key: String): Boolean = js.native
  
  def forEach(f: js.Function3[/* p0 */ T, /* p1 */ String, /* p2 */ LRUCache[T], _]): Unit = js.native
  
  def get(key: String): T = js.native
  def get(key: String, opt_options: js.Any): T = js.native
  
  def getCount(): Double = js.native
  
  def getKeys(): js.Array[String] = js.native
  
  def getValues(): js.Array[T] = js.native
  
  def on(`type`: String, listener: js.Function1[/* p0 */ js.Any, _]): EventsKey | js.Array[EventsKey] = js.native
  def on(`type`: js.Array[String], listener: js.Function1[/* p0 */ js.Any, _]): EventsKey | js.Array[EventsKey] = js.native
  @JSName("on")
  def on_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
  @JSName("on")
  def on_error(`type`: error, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
  
  def once(`type`: String, listener: js.Function1[/* p0 */ js.Any, _]): EventsKey | js.Array[EventsKey] = js.native
  def once(`type`: js.Array[String], listener: js.Function1[/* p0 */ js.Any, _]): EventsKey | js.Array[EventsKey] = js.native
  @JSName("once")
  def once_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
  @JSName("once")
  def once_error(`type`: error, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): EventsKey = js.native
  
  /**
    * Get the key of the newest item in the cache.  Throws if the cache is empty.
    */
  def peekFirstKey(): String = js.native
  
  def peekLast(): T = js.native
  
  def peekLastKey(): String = js.native
  
  def pop(): T = js.native
  
  /**
    * Remove an entry from the cache.
    */
  def remove(key: String): T = js.native
  
  def replace(key: String, value: T): Unit = js.native
  
  def set(key: String, value: T): Unit = js.native
  
  /**
    * Set a maximum number of entries for the cache.
    */
  def setSize(size: Double): Unit = js.native
  
  def un(`type`: String, listener: js.Function1[/* p0 */ js.Any, _]): Unit = js.native
  def un(`type`: js.Array[String], listener: js.Function1[/* p0 */ js.Any, _]): Unit = js.native
  @JSName("un")
  def un_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): Unit = js.native
  @JSName("un")
  def un_error(`type`: error, listener: js.Function1[/* evt */ typings.ol.eventMod.default, Unit]): Unit = js.native
}
