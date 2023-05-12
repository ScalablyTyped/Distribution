package typings.persistentCache

import typings.node.NodeJS.ErrnoException
import typings.persistentCache.anon.Delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A simple Node module to persistently store/cache arbitrary data.
    */
  inline def apply(): Delete = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Delete]
  inline def apply(options: CacheOptions): Delete = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Delete]
  
  @JSImport("persistent-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CacheOptions extends StObject {
    
    /**
      * The base directory where `persistent-cache` will save its caches.
      *
      * Defaults to the main modules directory
      */
    var base: js.UndefOr[String] = js.undefined
    
    /**
      * The amount of milliseconds a cache entry should be valid for. If not set, cache entries are not invalidated (stay until deleted).
      *
      * Defaults to `undefined` (infinite)
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the cache should use memory caching or not (mirrors all cache data in the ram, saving disk I/O and increasing performance).
      *
      * Defaults to `true`
      */
    var memory: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the cache. Determines the name of the created folder where the data is stored, which is just `base + name`.
      *
      * Defaults to `cache`
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the cache should be persistent, aka if it should write its data to the disk for later use or not. Set this to `false` to create a memory-only cache.
      *
      * Defaults to `true`
      */
    var persist: js.UndefOr[Boolean] = js.undefined
  }
  object CacheOptions {
    
    inline def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMemory(value: Boolean): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      inline def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
    }
  }
  
  type Callback = js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[Any], Any]
}
