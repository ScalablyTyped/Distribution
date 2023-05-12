package typings.metroConfig.srcConfigTypesMod

import typings.metroConfig.metroConfigStrings.BUNDLING_REQUEST
import typings.metroConfig.metroConfigStrings.HMR
import typings.metroConfig.metroConfigStrings.START_UP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetalConfigT extends StObject {
  
  var cacheStores: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any
  ]
  
  var cacheVersion: String
  
  var fileMapCacheDirectory: js.UndefOr[String] = js.undefined
  
  /** Deprecated, alias of fileMapCacheDirectory */
  var hasteMapCacheDirectory: js.UndefOr[String] = js.undefined
  
  var maxWorkers: Double
  
  var projectRoot: String
  
  var reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any
  
  var resetCache: Boolean
  
  var stickyWorkers: Boolean
  
  var transformerPath: String
  
  var unstable_perfLoggerFactory: js.UndefOr[PerfLoggerFactory | Null] = js.undefined
  
  var watchFolders: js.Array[String]
}
object MetalConfigT {
  
  inline def apply(
    cacheStores: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any
    ],
    cacheVersion: String,
    maxWorkers: Double,
    projectRoot: String,
    reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any,
    resetCache: Boolean,
    stickyWorkers: Boolean,
    transformerPath: String,
    watchFolders: js.Array[String]
  ): MetalConfigT = {
    val __obj = js.Dynamic.literal(cacheStores = cacheStores.asInstanceOf[js.Any], cacheVersion = cacheVersion.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], resetCache = resetCache.asInstanceOf[js.Any], stickyWorkers = stickyWorkers.asInstanceOf[js.Any], transformerPath = transformerPath.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetalConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetalConfigT] (val x: Self) extends AnyVal {
    
    inline def setCacheStores(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any
        ]
    ): Self = StObject.set(x, "cacheStores", value.asInstanceOf[js.Any])
    
    inline def setCacheStoresVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any)*
    ): Self = StObject.set(x, "cacheStores", js.Array(value*))
    
    inline def setCacheVersion(value: String): Self = StObject.set(x, "cacheVersion", value.asInstanceOf[js.Any])
    
    inline def setFileMapCacheDirectory(value: String): Self = StObject.set(x, "fileMapCacheDirectory", value.asInstanceOf[js.Any])
    
    inline def setFileMapCacheDirectoryUndefined: Self = StObject.set(x, "fileMapCacheDirectory", js.undefined)
    
    inline def setHasteMapCacheDirectory(value: String): Self = StObject.set(x, "hasteMapCacheDirectory", value.asInstanceOf[js.Any])
    
    inline def setHasteMapCacheDirectoryUndefined: Self = StObject.set(x, "hasteMapCacheDirectory", js.undefined)
    
    inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setReporter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any
    ): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
    
    inline def setStickyWorkers(value: Boolean): Self = StObject.set(x, "stickyWorkers", value.asInstanceOf[js.Any])
    
    inline def setTransformerPath(value: String): Self = StObject.set(x, "transformerPath", value.asInstanceOf[js.Any])
    
    inline def setUnstable_perfLoggerFactory(
      value: (/* type */ START_UP | BUNDLING_REQUEST | HMR, /* opts */ js.UndefOr[PerfLoggerFactoryOptions]) => RootPerfLogger
    ): Self = StObject.set(x, "unstable_perfLoggerFactory", js.Any.fromFunction2(value))
    
    inline def setUnstable_perfLoggerFactoryNull: Self = StObject.set(x, "unstable_perfLoggerFactory", null)
    
    inline def setUnstable_perfLoggerFactoryUndefined: Self = StObject.set(x, "unstable_perfLoggerFactory", js.undefined)
    
    inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
    
    inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
  }
}
