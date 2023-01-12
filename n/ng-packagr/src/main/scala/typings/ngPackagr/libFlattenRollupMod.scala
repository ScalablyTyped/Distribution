package typings.ngPackagr

import typings.ngPackagr.anon.Cache
import typings.ngPackagr.libNgPackageNodesMod.OutputFileCache
import typings.ngPackagr.ngPackagrBooleans.`false`
import typings.rollup.mod.RollupCache
import typings.rollup.mod.TransformHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFlattenRollupMod {
  
  @JSImport("ng-packagr/lib/flatten/rollup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rollupBundleFile(opts: RollupOptions): js.Promise[Cache] = ^.asInstanceOf[js.Dynamic].applyDynamic("rollupBundleFile")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cache]]
  
  trait RollupOptions extends StObject {
    
    var cache: js.UndefOr[RollupCache] = js.undefined
    
    var cacheDirectory: js.UndefOr[String | `false`] = js.undefined
    
    var cacheKey: String
    
    var dest: String
    
    var entry: String
    
    var fileCache: OutputFileCache
    
    var moduleName: String
    
    var sourceRoot: String
    
    var transform: js.UndefOr[TransformHook] = js.undefined
  }
  object RollupOptions {
    
    inline def apply(
      cacheKey: String,
      dest: String,
      entry: String,
      fileCache: OutputFileCache,
      moduleName: String,
      sourceRoot: String
    ): RollupOptions = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], fileCache = fileCache.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[RollupOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RollupOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: RollupCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectory(value: String | `false`): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setEntry(value: String): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setFileCache(value: OutputFileCache): Self = StObject.set(x, "fileCache", value.asInstanceOf[js.Any])
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: TransformHook): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
