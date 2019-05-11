package typings
package phaserLib.PhaserNs.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The BaseCache is a base Cache class that can be used for storing references to any kind of data.
  * 
  * Data can be added, retrieved and removed based on the given keys.
  * 
  * Keys are string-based.
  */
@JSGlobal("Phaser.Cache.BaseCache")
@js.native
class BaseCache () extends js.Object {
  /**
    * The Map in which the cache objects are stored.
    * 
    * You can query the Map directly or use the BaseCache methods.
    */
  var entries: phaserLib.PhaserNs.StructsNs.Map[java.lang.String, _] = js.native
  /**
    * An instance of EventEmitter used by the cache to emit related events.
    */
  var events: phaserLib.PhaserNs.EventsNs.EventEmitter = js.native
  /**
    * Adds an item to this cache. The item is referenced by a unique string, which you are responsible
    * for setting and keeping track of. The item can only be retrieved by using this string.
    * @param key The unique key by which the data added to the cache will be referenced.
    * @param data The data to be stored in the cache.
    */
  def add(key: java.lang.String, data: js.Any): BaseCache = js.native
  /**
    * Destroys this cache and all items within it.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Checks if this cache contains an item matching the given key.
    * This performs the same action as `BaseCache.has` and is called directly by the Loader.
    * @param key The unique key of the item to be checked in this cache.
    */
  def exists(key: java.lang.String): scala.Boolean = js.native
  /**
    * Gets an item from this cache based on the given key.
    * @param key The unique key of the item to be retrieved from this cache.
    */
  def get(key: java.lang.String): js.Any = js.native
  /**
    * Returns all keys in use in this cache.
    */
  def getKeys(): js.Array[java.lang.String] = js.native
  /**
    * Checks if this cache contains an item matching the given key.
    * This performs the same action as `BaseCache.exists`.
    * @param key The unique key of the item to be checked in this cache.
    */
  def has(key: java.lang.String): scala.Boolean = js.native
  /**
    * Removes and item from this cache based on the given key.
    * 
    * If an entry matching the key is found it is removed from the cache and a `remove` event emitted.
    * No additional checks are done on the item removed. If other systems or parts of your game code
    * are relying on this item, it is up to you to sever those relationships prior to removing the item.
    * @param key The unique key of the item to remove from the cache.
    */
  def remove(key: java.lang.String): BaseCache = js.native
}

