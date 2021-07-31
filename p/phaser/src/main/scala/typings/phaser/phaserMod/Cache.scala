package typings.phaser.phaserMod

import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.Events.EventEmitter
import typings.phaser.Phaser.Structs.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cache {
  
  /**
    * The BaseCache is a base Cache class that can be used for storing references to any kind of data.
    * 
    * Data can be added, retrieved and removed based on the given keys.
    * 
    * Keys are string-based.
    */
  @JSImport("phaser", "Cache.BaseCache")
  @js.native
  class BaseCache ()
    extends StObject
       with typings.phaser.Phaser.Cache.BaseCache {
    
    /**
      * Adds an item to this cache. The item is referenced by a unique string, which you are responsible
      * for setting and keeping track of. The item can only be retrieved by using this string.
      * @param key The unique key by which the data added to the cache will be referenced.
      * @param data The data to be stored in the cache.
      */
    /* CompleteClass */
    override def add(key: String, data: js.Any): this.type = js.native
    
    /**
      * Destroys this cache and all items within it.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * The Map in which the cache objects are stored.
      * 
      * You can query the Map directly or use the BaseCache methods.
      */
    /* CompleteClass */
    var entries: Map[String, js.Any] = js.native
    
    /**
      * An instance of EventEmitter used by the cache to emit related events.
      */
    /* CompleteClass */
    var events: EventEmitter = js.native
    
    /**
      * Checks if this cache contains an item matching the given key.
      * This performs the same action as `BaseCache.has` and is called directly by the Loader.
      * @param key The unique key of the item to be checked in this cache.
      */
    /* CompleteClass */
    override def exists(key: String): Boolean = js.native
    
    /**
      * Gets an item from this cache based on the given key.
      * @param key The unique key of the item to be retrieved from this cache.
      */
    /* CompleteClass */
    override def get(key: String): js.Any = js.native
    
    /**
      * Returns all keys in use in this cache.
      */
    /* CompleteClass */
    override def getKeys(): js.Array[String] = js.native
    
    /**
      * Checks if this cache contains an item matching the given key.
      * This performs the same action as `BaseCache.exists`.
      * @param key The unique key of the item to be checked in this cache.
      */
    /* CompleteClass */
    override def has(key: String): Boolean = js.native
    
    /**
      * Removes and item from this cache based on the given key.
      * 
      * If an entry matching the key is found it is removed from the cache and a `remove` event emitted.
      * No additional checks are done on the item removed. If other systems or parts of your game code
      * are relying on this item, it is up to you to sever those relationships prior to removing the item.
      * @param key The unique key of the item to remove from the cache.
      */
    /* CompleteClass */
    override def remove(key: String): this.type = js.native
  }
  
  /**
    * The Cache Manager is the global cache owned and maintained by the Game instance.
    * 
    * Various systems, such as the file Loader, rely on this cache in order to store the files
    * it has loaded. The manager itself doesn't store any files, but instead owns multiple BaseCache
    * instances, one per type of file. You can also add your own custom caches.
    */
  @JSImport("phaser", "Cache.CacheManager")
  @js.native
  class CacheManager protected ()
    extends StObject
       with typings.phaser.Phaser.Cache.CacheManager {
    /**
      * 
      * @param game A reference to the Phaser.Game instance that owns this CacheManager.
      */
    def this(game: typings.phaser.Phaser.Game) = this()
    
    /**
      * Add your own custom Cache for storing your own files.
      * The cache will be available under `Cache.custom.key`.
      * The cache will only be created if the key is not already in use.
      * @param key The unique key of your custom cache.
      */
    /* CompleteClass */
    override def addCustom(key: String): typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * A Cache storing all non-streaming audio files, typically added via the Loader.
      */
    /* CompleteClass */
    var audio: typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * A Cache storing all binary files, typically added via the Loader.
      */
    /* CompleteClass */
    var binary: typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * A Cache storing all bitmap font data files, typically added via the Loader.
      * Only the font data is stored in this cache, the textures are part of the Texture Manager.
      */
    /* CompleteClass */
    var bitmapFont: typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * An object that contains your own custom BaseCache entries.
      * Add to this via the `addCustom` method.
      */
    /* CompleteClass */
    var custom: StringDictionary[typings.phaser.Phaser.Cache.BaseCache] = js.native
    
    /**
      * Removes all entries from all BaseCaches and destroys all custom caches.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * A reference to the Phaser.Game instance that owns this CacheManager.
      */
    /* CompleteClass */
    var game: typings.phaser.Phaser.Game = js.native
    
    /**
      * A Cache storing all html files, typically added via the Loader.
      */
    /* CompleteClass */
    var html: typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * A Cache storing all JSON data files, typically added via the Loader.
      */
    /* CompleteClass */
    var json: typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * A Cache storing all WaveFront OBJ files, typically added via the Loader.
      */
    /* CompleteClass */
    var obj: typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * A Cache storing all physics data files, typically added via the Loader.
      */
    /* CompleteClass */
    var physics: typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * A Cache storing all shader source files, typically added via the Loader.
      */
    /* CompleteClass */
    var shader: typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * A Cache storing all text files, typically added via the Loader.
      */
    /* CompleteClass */
    var text: typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * A Cache storing all tilemap data files, typically added via the Loader.
      * Only the data is stored in this cache, the textures are part of the Texture Manager.
      */
    /* CompleteClass */
    var tilemap: typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * A Cache storing all non-streaming video files, typically added via the Loader.
      */
    /* CompleteClass */
    var video: typings.phaser.Phaser.Cache.BaseCache = js.native
    
    /**
      * A Cache storing all xml data files, typically added via the Loader.
      */
    /* CompleteClass */
    var xml: typings.phaser.Phaser.Cache.BaseCache = js.native
  }
  
  object Events {
    
    /**
      * The Cache Add Event.
      * 
      * This event is dispatched by any Cache that extends the BaseCache each time a new object is added to it.
      */
    @JSImport("phaser", "Cache.Events.ADD")
    @js.native
    val ADD: js.Any = js.native
    
    /**
      * The Cache Remove Event.
      * 
      * This event is dispatched by any Cache that extends the BaseCache each time an object is removed from it.
      */
    @JSImport("phaser", "Cache.Events.REMOVE")
    @js.native
    val REMOVE: js.Any = js.native
  }
}
