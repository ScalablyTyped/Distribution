package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.change
import typings.ol.olStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsLrucacheMod {
  
  @JSImport("ol/structs/LRUCache", JSImport.Default)
  @js.native
  open class default[T] ()
    extends StObject
       with LRUCache[T] {
    def this(opt_highWaterMark: Double) = this()
  }
  
  trait Entry extends StObject {
    
    var key_ : String
    
    var newer: Any
    
    var older: Any
    
    var value_ : Any
  }
  object Entry {
    
    inline def apply(key_ : String, newer: Any, older: Any, value_ : Any): Entry = {
      val __obj = js.Dynamic.literal(key_ = key_.asInstanceOf[js.Any], newer = newer.asInstanceOf[js.Any], older = older.asInstanceOf[js.Any], value_ = value_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setKey_(value: String): Self = StObject.set(x, "key_", value.asInstanceOf[js.Any])
      
      inline def setNewer(value: Any): Self = StObject.set(x, "newer", value.asInstanceOf[js.Any])
      
      inline def setOlder(value: Any): Self = StObject.set(x, "older", value.asInstanceOf[js.Any])
      
      inline def setValue_(value: Any): Self = StObject.set(x, "value_", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LRUCache[T] extends StObject {
    
    def canExpireCache(): Boolean = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    def clear(): Unit = js.native
    
    def containsKey(key: String): Boolean = js.native
    
    def forEach(f: js.Function3[/* p0 */ T, /* p1 */ String, /* p2 */ LRUCache[T], Any]): Unit = js.native
    
    def get(key: String): T = js.native
    def get(key: String, opt_options: Any): T = js.native
    
    def getCount(): Double = js.native
    
    def getKeys(): js.Array[String] = js.native
    
    def getValues(): js.Array[T] = js.native
    
    def on(`type`: String, listener: js.Function1[/* p0 */ Any, Any]): EventsKey | js.Array[EventsKey] = js.native
    def on(`type`: js.Array[String], listener: js.Function1[/* p0 */ Any, Any]): EventsKey | js.Array[EventsKey] = js.native
    @JSName("on")
    def on_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_error(`type`: error, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    
    def once(`type`: String, listener: js.Function1[/* p0 */ Any, Any]): EventsKey | js.Array[EventsKey] = js.native
    def once(`type`: js.Array[String], listener: js.Function1[/* p0 */ Any, Any]): EventsKey | js.Array[EventsKey] = js.native
    @JSName("once")
    def once_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_error(`type`: error, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    
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
    
    def un(`type`: String, listener: js.Function1[/* p0 */ Any, Any]): Unit = js.native
    def un(`type`: js.Array[String], listener: js.Function1[/* p0 */ Any, Any]): Unit = js.native
    @JSName("un")
    def un_change(`type`: change, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_error(`type`: error, listener: js.Function1[/* evt */ typings.ol.eventsEventMod.default, Unit]): Unit = js.native
  }
}
