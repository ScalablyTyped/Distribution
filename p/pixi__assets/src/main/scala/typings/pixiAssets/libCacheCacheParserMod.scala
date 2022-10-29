package typings.pixiAssets

import typings.pixiExtensions.mod.ExtensionMetadata
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCacheCacheParserMod {
  
  trait CacheParser[T] extends StObject {
    
    /** A config to adjust the parser */
    var config: js.UndefOr[Record[String, Any]] = js.undefined
    
    var `extension`: js.UndefOr[ExtensionMetadata] = js.undefined
    
    /**
      * If the test passes, this function is called to get the cacheable assets
      * an example may be that a spritesheet object will return all the sub textures it has so they can
      * be cached.
      * @param keys - The keys to cache the assets under
      * @param asset - The asset to get the cacheable assets from
      * @returns A key-value pair of cacheable assets
      */
    def getCacheableAssets(keys: js.Array[String], asset: T): Record[String, Any]
    
    /**
      * Gets called by the cache when a dev caches an asset
      * @param asset - the asset to test
      */
    def test(asset: T): Boolean
  }
  object CacheParser {
    
    inline def apply[T](getCacheableAssets: (js.Array[String], T) => Record[String, Any], test: T => Boolean): CacheParser[T] = {
      val __obj = js.Dynamic.literal(getCacheableAssets = js.Any.fromFunction2(getCacheableAssets), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[CacheParser[T]]
    }
    
    extension [Self <: CacheParser[?], T](x: Self & CacheParser[T]) {
      
      inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setExtension(value: ExtensionMetadata): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setGetCacheableAssets(value: (js.Array[String], T) => Record[String, Any]): Self = StObject.set(x, "getCacheableAssets", js.Any.fromFunction2(value))
      
      inline def setTest(value: T => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    }
  }
}
