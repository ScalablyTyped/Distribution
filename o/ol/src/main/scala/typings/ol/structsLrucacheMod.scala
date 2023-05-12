package typings.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsLrucacheMod {
  
  /**
    * @typedef {Object} Entry
    * @property {string} key_ Key.
    * @property {Object} newer Newer.
    * @property {Object} older Older.
    * @property {*} value_ Value.
    */
  /**
    * @classdesc
    * Implements a Least-Recently-Used cache where the keys do not conflict with
    * Object's properties (e.g. 'hasOwnProperty' is not allowed as a key). Expiring
    * items from the cache is the responsibility of the user.
    *
    * @fires import("../events/Event.js").default
    * @template T
    */
  @JSImport("ol/structs/LRUCache", JSImport.Default)
  @js.native
  /**
    * @param {number} [highWaterMark] High water mark.
    */
  open class default[T] ()
    extends StObject
       with LRUCache[T] {
    def this(highWaterMark: Double) = this()
  }
  
  trait Entry extends StObject {
    
    /**
      * Key.
      */
    var key_ : String
    
    /**
      * Newer.
      */
    var newer: Any
    
    /**
      * Older.
      */
    var older: Any
    
    /**
      * Value.
      */
    var value_ : Any
  }
  object Entry {
    
    inline def apply(key_ : String, newer: Any, older: Any, value_ : Any): Entry = {
      val __obj = js.Dynamic.literal(key_ = key_.asInstanceOf[js.Any], newer = newer.asInstanceOf[js.Any], older = older.asInstanceOf[js.Any], value_ = value_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setKey_(value: String): Self = StObject.set(x, "key_", value.asInstanceOf[js.Any])
      
      inline def setNewer(value: Any): Self = StObject.set(x, "newer", value.asInstanceOf[js.Any])
      
      inline def setOlder(value: Any): Self = StObject.set(x, "older", value.asInstanceOf[js.Any])
      
      inline def setValue_(value: Any): Self = StObject.set(x, "value_", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @typedef {Object} Entry
    * @property {string} key_ Key.
    * @property {Object} newer Newer.
    * @property {Object} older Older.
    * @property {*} value_ Value.
    */
  /**
    * @classdesc
    * Implements a Least-Recently-Used cache where the keys do not conflict with
    * Object's properties (e.g. 'hasOwnProperty' is not allowed as a key). Expiring
    * items from the cache is the responsibility of the user.
    *
    * @fires import("../events/Event.js").default
    * @template T
    */
  @js.native
  trait LRUCache[T] extends StObject {
    
    /**
      * @return {boolean} Can expire cache.
      */
    def canExpireCache(): Boolean = js.native
    
    /**
      * FIXME empty description for jsdoc
      */
    def clear(): Unit = js.native
    
    /**
      * @param {string} key Key.
      * @return {boolean} Contains key.
      */
    def containsKey(key: String): Boolean = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var count_ : Any = js.native
    
    /**
      * @private
      * @type {!Object<string, Entry>}
      */
    /* private */ var entries_ : Any = js.native
    
    /**
      * Expire the cache.
      * @param {!Object<string, boolean>} [keep] Keys to keep. To be implemented by subclasses.
      */
    def expireCache(): Unit = js.native
    def expireCache(keep: StringDictionary[Boolean]): Unit = js.native
    
    /**
      * @param {function(T, string, LRUCache<T>): ?} f The function
      *     to call for every entry from the oldest to the newer. This function takes
      *     3 arguments (the entry value, the entry key and the LRUCache object).
      *     The return value is ignored.
      */
    def forEach(f: js.Function3[/* arg0 */ T, /* arg1 */ String, /* arg2 */ LRUCache[T], Any]): Unit = js.native
    
    /**
      * @param {string} key Key.
      * @param {*} [options] Options (reserved for subclasses).
      * @return {T} Value.
      */
    def get(key: String): T = js.native
    def get(key: String, options: Any): T = js.native
    
    /**
      * @return {number} Count.
      */
    def getCount(): Double = js.native
    
    /**
      * @return {Array<string>} Keys.
      */
    def getKeys(): js.Array[String] = js.native
    
    /**
      * @return {Array<T>} Values.
      */
    def getValues(): js.Array[T] = js.native
    
    /**
      * Desired max cache size after expireCache(). If set to 0, no cache entries
      * will be pruned at all.
      * @type {number}
      */
    var highWaterMark: Double = js.native
    
    /**
      * @private
      * @type {?Entry}
      */
    /* private */ var newest_ : Any = js.native
    
    /**
      * @private
      * @type {?Entry}
      */
    /* private */ var oldest_ : Any = js.native
    
    /**
      * Return an entry without updating least recently used time.
      * @param {string} key Key.
      * @return {T} Value.
      */
    def peek(key: String): T = js.native
    
    /**
      * Get the key of the newest item in the cache.  Throws if the cache is empty.
      * @return {string} The newest key.
      */
    def peekFirstKey(): String = js.native
    
    /**
      * @return {T} Last value.
      */
    def peekLast(): T = js.native
    
    /**
      * @return {string} Last key.
      */
    def peekLastKey(): String = js.native
    
    /**
      * @return {T} value Value.
      */
    def pop(): T = js.native
    
    /**
      * Remove an entry from the cache.
      * @param {string} key The entry key.
      * @return {T} The removed entry.
      */
    def remove(key: String): T = js.native
    
    /**
      * @param {string} key Key.
      * @param {T} value Value.
      */
    def replace(key: String, value: T): Unit = js.native
    
    /**
      * @param {string} key Key.
      * @param {T} value Value.
      */
    def set(key: String, value: T): Unit = js.native
    
    /**
      * Set a maximum number of entries for the cache.
      * @param {number} size Cache size.
      * @api
      */
    def setSize(size: Double): Unit = js.native
  }
}
