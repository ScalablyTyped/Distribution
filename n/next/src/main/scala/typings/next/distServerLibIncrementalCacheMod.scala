package typings.next

import typings.next.anon.FlushToDisk
import typings.next.distBuildMod.PrerenderManifest
import typings.next.distServerResponseCacheTypesMod.IncrementalCacheEntry
import typings.next.distServerResponseCacheTypesMod.IncrementalCacheValue
import typings.next.distSharedLibUtilsMod.CacheFs
import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibIncrementalCacheMod {
  
  @JSImport("next/dist/server/lib/incremental-cache", "CacheHandler")
  @js.native
  open class CacheHandler protected () extends StObject {
    def this(_ctx: CacheHandlerContext) = this()
    
    def get(_key: String): js.Promise[CacheHandlerValue | Null] = js.native
    
    def set(_key: String): js.Promise[Unit] = js.native
    def set(_key: String, _data: IncrementalCacheValue): js.Promise[Unit] = js.native
  }
  
  @JSImport("next/dist/server/lib/incremental-cache", "IncrementalCache")
  @js.native
  open class IncrementalCache protected () extends StObject {
    def this(param0: FlushToDisk) = this()
    
    def _getPathname(pathname: String): String = js.native
    
    var cacheHandler: CacheHandler = js.native
    
    /* private */ var calculateRevalidate: Any = js.native
    
    var dev: js.UndefOr[Boolean] = js.native
    
    def get(pathname: String): js.Promise[IncrementalCacheEntry | Null] = js.native
    
    var prerenderManifest: PrerenderManifest = js.native
    
    def set(pathname: String): js.Promise[Unit] = js.native
    def set(pathname: String, data: Null, revalidateSeconds: Double): js.Promise[Unit] = js.native
    def set(pathname: String, data: IncrementalCacheValue): js.Promise[Unit] = js.native
    def set(pathname: String, data: IncrementalCacheValue, revalidateSeconds: Double): js.Promise[Unit] = js.native
    @JSName("set")
    def set_false(pathname: String, data: Null, revalidateSeconds: `false`): js.Promise[Unit] = js.native
    @JSName("set")
    def set_false(pathname: String, data: IncrementalCacheValue, revalidateSeconds: `false`): js.Promise[Unit] = js.native
  }
  
  trait CacheHandlerContext extends StObject {
    
    var _appDir: js.UndefOr[Boolean] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var flushToDisk: js.UndefOr[Boolean] = js.undefined
    
    var fs: CacheFs
    
    var maxMemoryCacheSize: js.UndefOr[Double] = js.undefined
    
    var serverDistDir: String
  }
  object CacheHandlerContext {
    
    inline def apply(fs: CacheFs, serverDistDir: String): CacheHandlerContext = {
      val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], serverDistDir = serverDistDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheHandlerContext]
    }
    
    extension [Self <: CacheHandlerContext](x: Self) {
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setFlushToDisk(value: Boolean): Self = StObject.set(x, "flushToDisk", value.asInstanceOf[js.Any])
      
      inline def setFlushToDiskUndefined: Self = StObject.set(x, "flushToDisk", js.undefined)
      
      inline def setFs(value: CacheFs): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setMaxMemoryCacheSize(value: Double): Self = StObject.set(x, "maxMemoryCacheSize", value.asInstanceOf[js.Any])
      
      inline def setMaxMemoryCacheSizeUndefined: Self = StObject.set(x, "maxMemoryCacheSize", js.undefined)
      
      inline def setServerDistDir(value: String): Self = StObject.set(x, "serverDistDir", value.asInstanceOf[js.Any])
      
      inline def set_appDir(value: Boolean): Self = StObject.set(x, "_appDir", value.asInstanceOf[js.Any])
      
      inline def set_appDirUndefined: Self = StObject.set(x, "_appDir", js.undefined)
    }
  }
  
  trait CacheHandlerValue extends StObject {
    
    var lastModified: js.UndefOr[Double] = js.undefined
    
    var value: IncrementalCacheValue | Null
  }
  object CacheHandlerValue {
    
    inline def apply(): CacheHandlerValue = {
      val __obj = js.Dynamic.literal(value = null)
      __obj.asInstanceOf[CacheHandlerValue]
    }
    
    extension [Self <: CacheHandlerValue](x: Self) {
      
      inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
      
      inline def setValue(value: IncrementalCacheValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
}
