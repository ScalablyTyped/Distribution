package typings.ngPackagr.anon

import typings.ngPackagr.libFileSystemFileCacheMod.FileCache
import typings.ngPackagr.libNgPackageNgccCacheMod.NgccProcessingCache
import typings.typescript.mod.ModuleResolutionCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobCache extends StObject {
  
  var globCache: typings.ngPackagr.libNgPackageNodesMod.GlobCache
  
  var moduleResolutionCache: ModuleResolutionCache
  
  var ngccProcessingCache: NgccProcessingCache
  
  var sourcesFileCache: FileCache
}
object GlobCache {
  
  inline def apply(
    globCache: typings.ngPackagr.libNgPackageNodesMod.GlobCache,
    moduleResolutionCache: ModuleResolutionCache,
    ngccProcessingCache: NgccProcessingCache,
    sourcesFileCache: FileCache
  ): GlobCache = {
    val __obj = js.Dynamic.literal(globCache = globCache.asInstanceOf[js.Any], moduleResolutionCache = moduleResolutionCache.asInstanceOf[js.Any], ngccProcessingCache = ngccProcessingCache.asInstanceOf[js.Any], sourcesFileCache = sourcesFileCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobCache]
  }
  
  extension [Self <: GlobCache](x: Self) {
    
    inline def setGlobCache(value: typings.ngPackagr.libNgPackageNodesMod.GlobCache): Self = StObject.set(x, "globCache", value.asInstanceOf[js.Any])
    
    inline def setModuleResolutionCache(value: ModuleResolutionCache): Self = StObject.set(x, "moduleResolutionCache", value.asInstanceOf[js.Any])
    
    inline def setNgccProcessingCache(value: NgccProcessingCache): Self = StObject.set(x, "ngccProcessingCache", value.asInstanceOf[js.Any])
    
    inline def setSourcesFileCache(value: FileCache): Self = StObject.set(x, "sourcesFileCache", value.asInstanceOf[js.Any])
  }
}
