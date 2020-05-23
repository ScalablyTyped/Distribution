package typings.phaser.Phaser.Cache

import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Structs.Map
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
trait BaseCache extends js.Object {
  /**
    * The Map in which the cache objects are stored.
    * 
    * You can query the Map directly or use the BaseCache methods.
    */
  var entries: Map[String, _]
  /**
    * An instance of EventEmitter used by the cache to emit related events.
    */
  var events: EventEmitter
  /**
    * Adds an item to this cache. The item is referenced by a unique string, which you are responsible
    * for setting and keeping track of. The item can only be retrieved by using this string.
    * @param key The unique key by which the data added to the cache will be referenced.
    * @param data The data to be stored in the cache.
    */
  def add(key: String, data: js.Any): this.type
  /**
    * Destroys this cache and all items within it.
    */
  def destroy(): Unit
  /**
    * Checks if this cache contains an item matching the given key.
    * This performs the same action as `BaseCache.has` and is called directly by the Loader.
    * @param key The unique key of the item to be checked in this cache.
    */
  def exists(key: String): Boolean
  /**
    * Gets an item from this cache based on the given key.
    * @param key The unique key of the item to be retrieved from this cache.
    */
  def get(key: String): js.Any
  /**
    * Returns all keys in use in this cache.
    */
  def getKeys(): js.Array[String]
  /**
    * Checks if this cache contains an item matching the given key.
    * This performs the same action as `BaseCache.exists`.
    * @param key The unique key of the item to be checked in this cache.
    */
  def has(key: String): Boolean
  /**
    * Removes and item from this cache based on the given key.
    * 
    * If an entry matching the key is found it is removed from the cache and a `remove` event emitted.
    * No additional checks are done on the item removed. If other systems or parts of your game code
    * are relying on this item, it is up to you to sever those relationships prior to removing the item.
    * @param key The unique key of the item to remove from the cache.
    */
  def remove(key: String): this.type
}

object BaseCache {
  @scala.inline
  def apply(
    add: (String, js.Any) => BaseCache,
    destroy: () => Unit,
    entries: Map[String, _],
    events: EventEmitter,
    exists: String => Boolean,
    get: String => js.Any,
    getKeys: () => js.Array[String],
    has: String => Boolean,
    remove: String => BaseCache
  ): BaseCache = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), destroy = js.Any.fromFunction0(destroy), entries = entries.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], exists = js.Any.fromFunction1(exists), get = js.Any.fromFunction1(get), getKeys = js.Any.fromFunction0(getKeys), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[BaseCache]
  }
}

