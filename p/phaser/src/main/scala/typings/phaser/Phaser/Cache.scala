package typings.phaser.Phaser

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Structs.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Cache")
@js.native
object Cache extends js.Object {
  /**
    * The BaseCache is a base Cache class that can be used for storing references to any kind of data.
    * 
    * Data can be added, retrieved and removed based on the given keys.
    * 
    * Keys are string-based.
    */
  @js.native
  class BaseCache () extends js.Object {
    /**
      * The Map in which the cache objects are stored.
      * 
      * You can query the Map directly or use the BaseCache methods.
      */
    var entries: Map[String, _] = js.native
    /**
      * An instance of EventEmitter used by the cache to emit related events.
      */
    var events: EventEmitter = js.native
    /**
      * Adds an item to this cache. The item is referenced by a unique string, which you are responsible
      * for setting and keeping track of. The item can only be retrieved by using this string.
      * @param key The unique key by which the data added to the cache will be referenced.
      * @param data The data to be stored in the cache.
      */
    def add(key: String, data: js.Any): BaseCache = js.native
    /**
      * Destroys this cache and all items within it.
      */
    def destroy(): Unit = js.native
    /**
      * Checks if this cache contains an item matching the given key.
      * This performs the same action as `BaseCache.has` and is called directly by the Loader.
      * @param key The unique key of the item to be checked in this cache.
      */
    def exists(key: String): Boolean = js.native
    /**
      * Gets an item from this cache based on the given key.
      * @param key The unique key of the item to be retrieved from this cache.
      */
    def get(key: String): js.Any = js.native
    /**
      * Returns all keys in use in this cache.
      */
    def getKeys(): js.Array[String] = js.native
    /**
      * Checks if this cache contains an item matching the given key.
      * This performs the same action as `BaseCache.exists`.
      * @param key The unique key of the item to be checked in this cache.
      */
    def has(key: String): Boolean = js.native
    /**
      * Removes and item from this cache based on the given key.
      * 
      * If an entry matching the key is found it is removed from the cache and a `remove` event emitted.
      * No additional checks are done on the item removed. If other systems or parts of your game code
      * are relying on this item, it is up to you to sever those relationships prior to removing the item.
      * @param key The unique key of the item to remove from the cache.
      */
    def remove(key: String): BaseCache = js.native
  }
  
  /**
    * The Cache Manager is the global cache owned and maintained by the Game instance.
    * 
    * Various systems, such as the file Loader, rely on this cache in order to store the files
    * it has loaded. The manager itself doesn't store any files, but instead owns multiple BaseCache
    * instances, one per type of file. You can also add your own custom caches.
    */
  @js.native
  class CacheManager protected () extends js.Object {
    /**
      * 
      * @param game A reference to the Phaser.Game instance that owns this CacheManager.
      */
    def this(game: Game) = this()
    /**
      * A Cache storing all non-streaming audio files, typically added via the Loader.
      */
    var audio: BaseCache = js.native
    /**
      * A Cache storing all binary files, typically added via the Loader.
      */
    var binary: BaseCache = js.native
    /**
      * A Cache storing all bitmap font data files, typically added via the Loader.
      * Only the font data is stored in this cache, the textures are part of the Texture Manager.
      */
    var bitmapFont: BaseCache = js.native
    /**
      * An object that contains your own custom BaseCache entries.
      * Add to this via the `addCustom` method.
      */
    var custom: StringDictionary[BaseCache] = js.native
    /**
      * A reference to the Phaser.Game instance that owns this CacheManager.
      */
    var game: Game = js.native
    /**
      * A Cache storing all html files, typically added via the Loader.
      */
    var html: BaseCache = js.native
    /**
      * A Cache storing all JSON data files, typically added via the Loader.
      */
    var json: BaseCache = js.native
    /**
      * A Cache storing all WaveFront OBJ files, typically added via the Loader.
      */
    var obj: BaseCache = js.native
    /**
      * A Cache storing all physics data files, typically added via the Loader.
      */
    var physics: BaseCache = js.native
    /**
      * A Cache storing all shader source files, typically added via the Loader.
      */
    var shader: BaseCache = js.native
    /**
      * A Cache storing all text files, typically added via the Loader.
      */
    var text: BaseCache = js.native
    /**
      * A Cache storing all tilemap data files, typically added via the Loader.
      * Only the data is stored in this cache, the textures are part of the Texture Manager.
      */
    var tilemap: BaseCache = js.native
    /**
      * A Cache storing all non-streaming video files, typically added via the Loader.
      */
    var video: BaseCache = js.native
    /**
      * A Cache storing all xml data files, typically added via the Loader.
      */
    var xml: BaseCache = js.native
    /**
      * Add your own custom Cache for storing your own files.
      * The cache will be available under `Cache.custom.key`.
      * The cache will only be created if the key is not already in use.
      * @param key The unique key of your custom cache.
      */
    def addCustom(key: String): BaseCache = js.native
    /**
      * Removes all entries from all BaseCaches and destroys all custom caches.
      */
    def destroy(): Unit = js.native
  }
  
  @js.native
  object Events extends js.Object {
    /**
      * The Cache Add Event.
      * 
      * This event is dispatched by any Cache that extends the BaseCache each time a new object is added to it.
      */
    val ADD: js.Any = js.native
    /**
      * The Cache Remove Event.
      * 
      * This event is dispatched by any Cache that extends the BaseCache each time an object is removed from it.
      */
    val REMOVE: js.Any = js.native
  }
  
}

