package typings.metroConfig.srcConfigTypesMod

import typings.metroConfig.anon.PartialResolverConfigT
import typings.metroConfig.anon.PartialSerializerConfigT
import typings.metroConfig.anon.PartialServerConfigT
import typings.metroConfig.anon.PartialSymbolicatorConfig
import typings.metroConfig.anon.PartialWatcherInputConfig
import typings.metroConfig.metroConfigStrings.BUNDLING_REQUEST
import typings.metroConfig.metroConfigStrings.HMR
import typings.metroConfig.metroConfigStrings.START_UP
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Omit<metro-config.metro-config/src/configTypes.MetalConfigT, 'cacheStores'>> */
trait InputConfigT extends StObject {
  
  val cacheStores: js.UndefOr[
    (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any
    ]) | (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroCache */ /* metroCache */ Any, 
      js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any
      ]
    ])
  ] = js.undefined
  
  var cacheVersion: js.UndefOr[String] = js.undefined
  
  var fileMapCacheDirectory: js.UndefOr[String] = js.undefined
  
  var hasteMapCacheDirectory: js.UndefOr[String] = js.undefined
  
  var maxWorkers: js.UndefOr[Double] = js.undefined
  
  var projectRoot: js.UndefOr[String] = js.undefined
  
  var reporter: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any
  ] = js.undefined
  
  var resetCache: js.UndefOr[Boolean] = js.undefined
  
  val resolver: js.UndefOr[PartialResolverConfigT] = js.undefined
  
  val serializer: js.UndefOr[PartialSerializerConfigT] = js.undefined
  
  val server: js.UndefOr[PartialServerConfigT] = js.undefined
  
  var stickyWorkers: js.UndefOr[Boolean] = js.undefined
  
  val symbolicator: js.UndefOr[PartialSymbolicatorConfig] = js.undefined
  
  val transformer: js.UndefOr[Partial[TransformerConfigT]] = js.undefined
  
  var transformerPath: js.UndefOr[String] = js.undefined
  
  var unstable_perfLoggerFactory: js.UndefOr[PerfLoggerFactory | Null] = js.undefined
  
  var watchFolders: js.UndefOr[js.Array[String]] = js.undefined
  
  val watcher: js.UndefOr[PartialWatcherInputConfig] = js.undefined
}
object InputConfigT {
  
  inline def apply(): InputConfigT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputConfigT]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputConfigT] (val x: Self) extends AnyVal {
    
    inline def setCacheStores(
      value: (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any
        ]) | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroCache */ /* metroCache */ Any, 
          js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any
          ]
        ])
    ): Self = StObject.set(x, "cacheStores", value.asInstanceOf[js.Any])
    
    inline def setCacheStoresFunction1(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroCache */ /* metroCache */ Any => js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any
        ]
    ): Self = StObject.set(x, "cacheStores", js.Any.fromFunction1(value))
    
    inline def setCacheStoresUndefined: Self = StObject.set(x, "cacheStores", js.undefined)
    
    inline def setCacheStoresVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CacheStore<TransformResult> */ Any)*
    ): Self = StObject.set(x, "cacheStores", js.Array(value*))
    
    inline def setCacheVersion(value: String): Self = StObject.set(x, "cacheVersion", value.asInstanceOf[js.Any])
    
    inline def setCacheVersionUndefined: Self = StObject.set(x, "cacheVersion", js.undefined)
    
    inline def setFileMapCacheDirectory(value: String): Self = StObject.set(x, "fileMapCacheDirectory", value.asInstanceOf[js.Any])
    
    inline def setFileMapCacheDirectoryUndefined: Self = StObject.set(x, "fileMapCacheDirectory", js.undefined)
    
    inline def setHasteMapCacheDirectory(value: String): Self = StObject.set(x, "hasteMapCacheDirectory", value.asInstanceOf[js.Any])
    
    inline def setHasteMapCacheDirectoryUndefined: Self = StObject.set(x, "hasteMapCacheDirectory", js.undefined)
    
    inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
    
    inline def setReporter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any
    ): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
    
    inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
    
    inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
    
    inline def setResetCacheUndefined: Self = StObject.set(x, "resetCache", js.undefined)
    
    inline def setResolver(value: PartialResolverConfigT): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    inline def setResolverUndefined: Self = StObject.set(x, "resolver", js.undefined)
    
    inline def setSerializer(value: PartialSerializerConfigT): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
    
    inline def setSerializerUndefined: Self = StObject.set(x, "serializer", js.undefined)
    
    inline def setServer(value: PartialServerConfigT): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setStickyWorkers(value: Boolean): Self = StObject.set(x, "stickyWorkers", value.asInstanceOf[js.Any])
    
    inline def setStickyWorkersUndefined: Self = StObject.set(x, "stickyWorkers", js.undefined)
    
    inline def setSymbolicator(value: PartialSymbolicatorConfig): Self = StObject.set(x, "symbolicator", value.asInstanceOf[js.Any])
    
    inline def setSymbolicatorUndefined: Self = StObject.set(x, "symbolicator", js.undefined)
    
    inline def setTransformer(value: Partial[TransformerConfigT]): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
    
    inline def setTransformerPath(value: String): Self = StObject.set(x, "transformerPath", value.asInstanceOf[js.Any])
    
    inline def setTransformerPathUndefined: Self = StObject.set(x, "transformerPath", js.undefined)
    
    inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
    
    inline def setUnstable_perfLoggerFactory(
      value: (/* type */ START_UP | BUNDLING_REQUEST | HMR, /* opts */ js.UndefOr[PerfLoggerFactoryOptions]) => RootPerfLogger
    ): Self = StObject.set(x, "unstable_perfLoggerFactory", js.Any.fromFunction2(value))
    
    inline def setUnstable_perfLoggerFactoryNull: Self = StObject.set(x, "unstable_perfLoggerFactory", null)
    
    inline def setUnstable_perfLoggerFactoryUndefined: Self = StObject.set(x, "unstable_perfLoggerFactory", js.undefined)
    
    inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
    
    inline def setWatchFoldersUndefined: Self = StObject.set(x, "watchFolders", js.undefined)
    
    inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
    
    inline def setWatcher(value: PartialWatcherInputConfig): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
    
    inline def setWatcherUndefined: Self = StObject.set(x, "watcher", js.undefined)
  }
}
