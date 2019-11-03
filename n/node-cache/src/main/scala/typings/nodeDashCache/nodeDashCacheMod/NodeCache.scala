package typings.nodeDashCache.nodeDashCacheMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeCache extends EventEmitter {
  /** container for cached data */
  var data: Data = js.native
  /** module options */
  var options: Options = js.native
  /** statistics container */
  var stats: Stats = js.native
  /**
  	 * This will clear the interval timeout which is set on checkperiod option.
  	 */
  def close(): Unit = js.native
  def del(keys: js.Array[Key]): Double = js.native
  /**
  	 * remove keys
  	 * @param keys cache key to delete or a array of cache keys
  	 * @param cb Callback function
  	 * @returns Number of deleted keys
  	 */
  def del(keys: Key): Double = js.native
  /**
  	 * flush the whole data and reset the stats
  	 */
  def flushAll(): Unit = js.native
  /**
  	 * get a cached key and change the stats
  	 *
  	 * @param key cache key or an array of keys
  	 * @param cb Callback function
  	 */
  def get[T](key: Key): js.UndefOr[T] = js.native
  /**
  	 * get the stats
  	 *
  	 * @returns Stats data
  	 */
  def getStats(): Stats = js.native
  def getTtl(key: Key): js.UndefOr[Double] = js.native
  @JSName("getTtl")
  def getTtl_Boolean(key: Key): Boolean = js.native
  /**
  	 * Check if a key is cached
  	 * @param key cache key to check
  	 * @returns Boolean indicating if the key is cached or not
  	 */
  def has(key: Key): Boolean = js.native
  /**
  	 * list all keys within this cache
  	 * @returns An array of all keys
  	 */
  def keys(): js.Array[String] = js.native
  /**
  	 * get multiple cached keys at once and change the stats
  	 *
  	 * @param keys an array of keys
  	 * @param cb Callback function
  	 */
  def mget[T](keys: js.Array[Key]): StringDictionary[T] = js.native
  /**
  	 * set multiple cached keys at once and change the stats
  	 *
  	 * @param keyValueSet  an array of object which includes key,value and ttl
  	 */
  def mset[T](keyValueSet: js.Array[ValueSetItem[T]]): Boolean = js.native
  def set[T](key: Key, value: T): Boolean = js.native
  def set[T](key: Key, value: T, ttl: String): Boolean = js.native
  /**
  	 * set a cached key and change the stats
  	 *
  	 * @param key cache key
  	 * @param value A element to cache. If the option `option.forceString` is `true` the module trys to translate
  	 * it to a serialized JSON
  	 * @param ttl The time to live in seconds.
  	 * @param cb Callback function
  	 */
  def set[T](key: Key, value: T, ttl: Double): Boolean = js.native
  def ttl(key: Key): Boolean = js.native
  /**
  	 * reset or redefine the ttl of a key. If `ttl` is not passed or set to 0 it's similar to `.del()`
  	 */
  def ttl(key: Key, ttl: Double): Boolean = js.native
}

