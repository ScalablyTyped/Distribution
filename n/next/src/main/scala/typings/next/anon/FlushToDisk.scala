package typings.next.anon

import typings.next.distBuildMod.PrerenderManifest
import typings.next.distSharedLibUtilsMod.CacheFs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlushToDisk extends StObject {
  
  var appDir: js.UndefOr[Boolean] = js.undefined
  
  var dev: Boolean
  
  var flushToDisk: js.UndefOr[Boolean] = js.undefined
  
  var fs: CacheFs
  
  def getPrerenderManifest(): PrerenderManifest
  
  var incrementalCacheHandlerPath: js.UndefOr[String] = js.undefined
  
  var maxMemoryCacheSize: js.UndefOr[Double] = js.undefined
  
  var serverDistDir: String
}
object FlushToDisk {
  
  inline def apply(dev: Boolean, fs: CacheFs, getPrerenderManifest: () => PrerenderManifest, serverDistDir: String): FlushToDisk = {
    val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], getPrerenderManifest = js.Any.fromFunction0(getPrerenderManifest), serverDistDir = serverDistDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushToDisk]
  }
  
  extension [Self <: FlushToDisk](x: Self) {
    
    inline def setAppDir(value: Boolean): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setAppDirUndefined: Self = StObject.set(x, "appDir", js.undefined)
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setFlushToDisk(value: Boolean): Self = StObject.set(x, "flushToDisk", value.asInstanceOf[js.Any])
    
    inline def setFlushToDiskUndefined: Self = StObject.set(x, "flushToDisk", js.undefined)
    
    inline def setFs(value: CacheFs): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setGetPrerenderManifest(value: () => PrerenderManifest): Self = StObject.set(x, "getPrerenderManifest", js.Any.fromFunction0(value))
    
    inline def setIncrementalCacheHandlerPath(value: String): Self = StObject.set(x, "incrementalCacheHandlerPath", value.asInstanceOf[js.Any])
    
    inline def setIncrementalCacheHandlerPathUndefined: Self = StObject.set(x, "incrementalCacheHandlerPath", js.undefined)
    
    inline def setMaxMemoryCacheSize(value: Double): Self = StObject.set(x, "maxMemoryCacheSize", value.asInstanceOf[js.Any])
    
    inline def setMaxMemoryCacheSizeUndefined: Self = StObject.set(x, "maxMemoryCacheSize", js.undefined)
    
    inline def setServerDistDir(value: String): Self = StObject.set(x, "serverDistDir", value.asInstanceOf[js.Any])
  }
}
