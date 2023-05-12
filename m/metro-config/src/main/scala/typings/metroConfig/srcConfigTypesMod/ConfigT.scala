package typings.metroConfig.srcConfigTypesMod

import typings.metroConfig.anon.ReadonlyResolverConfigT
import typings.metroConfig.anon.ReadonlySerializerConfigT
import typings.metroConfig.anon.ReadonlyServerConfigT
import typings.metroConfig.anon.ReadonlySymbolicatorConfi
import typings.metroConfig.anon.ReadonlyWatcherConfigT
import typings.metroConfig.metroConfigStrings.BUNDLING_REQUEST
import typings.metroConfig.metroConfigStrings.HMR
import typings.metroConfig.metroConfigStrings.START_UP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<metro-config.metro-config/src/configTypes.MetalConfigT> */
trait ConfigT extends StObject {
  
  val cacheStores: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any
  ]
  
  val cacheVersion: String
  
  val fileMapCacheDirectory: js.UndefOr[String] = js.undefined
  
  val hasteMapCacheDirectory: js.UndefOr[String] = js.undefined
  
  val maxWorkers: Double
  
  val projectRoot: String
  
  val reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any
  
  val resetCache: Boolean
  
  val resolver: ReadonlyResolverConfigT
  
  val serializer: ReadonlySerializerConfigT
  
  val server: ReadonlyServerConfigT
  
  val stickyWorkers: Boolean
  
  val symbolicator: ReadonlySymbolicatorConfi
  
  val transformer: TransformerConfigT
  
  val transformerPath: String
  
  val unstable_perfLoggerFactory: js.UndefOr[PerfLoggerFactory | Null] = js.undefined
  
  val watchFolders: js.Array[String]
  
  val watcher: ReadonlyWatcherConfigT
}
object ConfigT {
  
  inline def apply(
    cacheStores: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any
    ],
    cacheVersion: String,
    maxWorkers: Double,
    projectRoot: String,
    reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any,
    resetCache: Boolean,
    resolver: ReadonlyResolverConfigT,
    serializer: ReadonlySerializerConfigT,
    server: ReadonlyServerConfigT,
    stickyWorkers: Boolean,
    symbolicator: ReadonlySymbolicatorConfi,
    transformer: TransformerConfigT,
    transformerPath: String,
    watchFolders: js.Array[String],
    watcher: ReadonlyWatcherConfigT
  ): ConfigT = {
    val __obj = js.Dynamic.literal(cacheStores = cacheStores.asInstanceOf[js.Any], cacheVersion = cacheVersion.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], resetCache = resetCache.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], stickyWorkers = stickyWorkers.asInstanceOf[js.Any], symbolicator = symbolicator.asInstanceOf[js.Any], transformer = transformer.asInstanceOf[js.Any], transformerPath = transformerPath.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any], watcher = watcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigT] (val x: Self) extends AnyVal {
    
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
    
    inline def setResolver(value: ReadonlyResolverConfigT): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setSerializer(value: ReadonlySerializerConfigT): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setServer(value: ReadonlyServerConfigT): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setStickyWorkers(value: Boolean): Self = StObject.set(x, "stickyWorkers", value.asInstanceOf[js.Any])
    
    inline def setSymbolicator(value: ReadonlySymbolicatorConfi): Self = StObject.set(x, "symbolicator", value.asInstanceOf[js.Any])
    
    inline def setTransformer(value: TransformerConfigT): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
    
    inline def setTransformerPath(value: String): Self = StObject.set(x, "transformerPath", value.asInstanceOf[js.Any])
    
    inline def setUnstable_perfLoggerFactory(
      value: (/* type */ START_UP | BUNDLING_REQUEST | HMR, /* opts */ js.UndefOr[PerfLoggerFactoryOptions]) => RootPerfLogger
    ): Self = StObject.set(x, "unstable_perfLoggerFactory", js.Any.fromFunction2(value))
    
    inline def setUnstable_perfLoggerFactoryNull: Self = StObject.set(x, "unstable_perfLoggerFactory", null)
    
    inline def setUnstable_perfLoggerFactoryUndefined: Self = StObject.set(x, "unstable_perfLoggerFactory", js.undefined)
    
    inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
    
    inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
    
    inline def setWatcher(value: ReadonlyWatcherConfigT): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
  }
}
