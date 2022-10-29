package typings.pixiAssets

import typings.pixiAssets.libCacheCacheParserMod.CacheParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCacheCacheMod {
  
  @JSImport("@pixi/assets/lib/cache/Cache", "Cache")
  @js.native
  val Cache: CacheClass = js.native
  
  /**
    * A single Cache for all assets.
    *
    * When assets are added to the cache via set they normally are added to the cache as key-value pairs.
    *
    * With this cache, you can add parsers that will take the object and convert it to a list of assets that can be cached.
    * for example a cacheSprite Sheet parser will add all of the textures found within its sprite sheet directly to the cache.
    *
    * This gives devs the flexibility to cache any type of object however we want.
    *
    * It is not intended that this class is created by developers - it is part of the Asset package.
    * This is the first major system of PixiJS' main Assets class.
    * @memberof PIXI
    * @class Cache
    */
  @js.native
  trait CacheClass extends StObject {
    
    /* private */ val _cache: Any = js.native
    
    /* private */ val _cacheMap: Any = js.native
    
    /* private */ var _parsers: Any = js.native
    
    /**
      * Fetch entry by key
      * @param key - The key of the entry to get
      */
    def get[T](key: String): T = js.native
    
    /**
      * Check if the key exists
      * @param key - The key to check
      */
    def has(key: String): Boolean = js.native
    
    /** All loader parsers registered */
    def parsers: js.Array[CacheParser[Any]] = js.native
    
    /**
      * Remove entry by key
      *
      * This function will also remove any associated alias from the cache also.
      * @param key - The key of the entry to remove
      */
    def remove(key: String): Unit = js.native
    
    /** Clear all entries. */
    def reset(): Unit = js.native
    
    /**
      * Set a value by key or keys name
      * @param key - The key or keys to set
      * @param value - The value to store in the cache or from which cacheable assets will be derived.
      */
    def set(key: String, value: Any): Unit = js.native
    def set(key: js.Array[String], value: Any): Unit = js.native
  }
}
