package typings.metroConfig

import org.scalablytyped.runtime.StringDictionary
import typings.metroCache.mod.MetroCache
import typings.metroCache.typesMod.CacheStore
import typings.metroConfig.anon.Code
import typings.metroConfig.anon.CodeMap
import typings.metroConfig.anon.Collapse
import typings.metroConfig.anon.Column
import typings.metroConfig.anon.ExperimentalImportSupport
import typings.metroConfig.anon.Map
import typings.metroConfig.anon.Platform
import typings.metroConfig.anon.ReadonlyResolverConfigT
import typings.metroConfig.anon.ReadonlySerializerConfigT
import typings.metroConfig.anon.ReadonlyServerConfigT
import typings.metroConfig.anon.ReadonlySymbolicatorConfi
import typings.metroConfig.anon.ReadonlyTransformerConfig
import typings.metroConfig.metroConfigBooleans.`false`
import typings.metroConfig.metroConfigBooleans.`true`
import typings.metroResolver.typesMod.CustomResolver
import typings.metroResolver.typesMod.Resolution
import typings.metroResolver.typesMod.ResolutionContext
import typings.metroTransformWorker.mod.JsTransformerConfig
import typings.metroTransformWorker.mod.MinifierConfig
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configTypesMod {
  
  /* Inlined parent std.Readonly<metro-config.metro-config/configTypes.MetalConfigT> */
  trait ConfigT extends StObject {
    
    val cacheStores: js.Array[
        CacheStore[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
        ]
      ]
    
    val cacheVersion: String
    
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
    
    val transformer: ReadonlyTransformerConfig
    
    val transformerPath: String
    
    val watchFolders: js.Array[String]
  }
  object ConfigT {
    
    inline def apply(
      cacheStores: js.Array[
          CacheStore[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
          ]
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
      transformer: ReadonlyTransformerConfig,
      transformerPath: String,
      watchFolders: js.Array[String]
    ): ConfigT = {
      val __obj = js.Dynamic.literal(cacheStores = cacheStores.asInstanceOf[js.Any], cacheVersion = cacheVersion.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], resetCache = resetCache.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], stickyWorkers = stickyWorkers.asInstanceOf[js.Any], symbolicator = symbolicator.asInstanceOf[js.Any], transformer = transformer.asInstanceOf[js.Any], transformerPath = transformerPath.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigT] (val x: Self) extends AnyVal {
      
      inline def setCacheStores(
        value: js.Array[
              CacheStore[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
              ]
            ]
      ): Self = StObject.set(x, "cacheStores", value.asInstanceOf[js.Any])
      
      inline def setCacheStoresVarargs(
        value: (CacheStore[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
            ])*
      ): Self = StObject.set(x, "cacheStores", js.Array(value*))
      
      inline def setCacheVersion(value: String): Self = StObject.set(x, "cacheVersion", value.asInstanceOf[js.Any])
      
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
      
      inline def setTransformer(value: ReadonlyTransformerConfig): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
      
      inline def setTransformerPath(value: String): Self = StObject.set(x, "transformerPath", value.asInstanceOf[js.Any])
      
      inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<{ readonly preloadedModules :{[path: string] : true} | false,  readonly ramGroups :std.Array<string>,  readonly transform :{ readonly experimentalImportSupport :boolean,  readonly inlineRequires :{  blockList :{[path: string] : true}} | boolean,  readonly nonInlinedRequires :std.ReadonlyArray<string> | undefined,  readonly unstable_disableES6Transforms :boolean | undefined}}> */
  trait ExtraTransformOptions extends StObject {
    
    var preloadedModules: js.UndefOr[StringDictionary[`true`] | `false`] = js.undefined
    
    var ramGroups: js.UndefOr[js.Array[String]] = js.undefined
    
    var transform: js.UndefOr[ExperimentalImportSupport] = js.undefined
  }
  object ExtraTransformOptions {
    
    inline def apply(): ExtraTransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtraTransformOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtraTransformOptions] (val x: Self) extends AnyVal {
      
      inline def setPreloadedModules(value: StringDictionary[`true`] | `false`): Self = StObject.set(x, "preloadedModules", value.asInstanceOf[js.Any])
      
      inline def setPreloadedModulesUndefined: Self = StObject.set(x, "preloadedModules", js.undefined)
      
      inline def setRamGroups(value: js.Array[String]): Self = StObject.set(x, "ramGroups", value.asInstanceOf[js.Any])
      
      inline def setRamGroupsUndefined: Self = StObject.set(x, "ramGroups", js.undefined)
      
      inline def setRamGroupsVarargs(value: String*): Self = StObject.set(x, "ramGroups", js.Array(value*))
      
      inline def setTransform(value: ExperimentalImportSupport): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type GetTransformOptions = js.Function3[
    /* entryPoints */ js.Array[String], 
    /* options */ GetTransformOptionsOpts, 
    /* getDependenciesOf */ js.Function1[/* filePath */ String, js.Promise[js.Array[String]]], 
    js.Promise[ExtraTransformOptions]
  ]
  
  trait GetTransformOptionsOpts extends StObject {
    
    var dev: Boolean
    
    var hot: Boolean
    
    var platform: js.UndefOr[String] = js.undefined
  }
  object GetTransformOptionsOpts {
    
    inline def apply(dev: Boolean, hot: Boolean): GetTransformOptionsOpts = {
      val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTransformOptionsOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetTransformOptionsOpts] (val x: Self) extends AnyVal {
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<metro-config.metro-config/configTypes.MetalConfigT, 'cacheStores'> */
  trait InputConfigT extends StObject {
    
    val cacheStores: (js.Array[
        CacheStore[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
        ]
      ]) | (js.Function1[
        /* metroCache */ MetroCache, 
        js.Array[
          CacheStore[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
          ]
        ]
      ])
    
    var cacheVersion: String
    
    var hasteMapCacheDirectory: js.UndefOr[String] = js.undefined
    
    var maxWorkers: Double
    
    var projectRoot: String
    
    var reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any
    
    var resetCache: Boolean
    
    val resolver: ResolverConfigT
    
    val serializer: SerializerConfigT
    
    val server: ServerConfigT
    
    var stickyWorkers: Boolean
    
    val symbolicator: SymbolicatorConfigT
    
    val transformer: TransformerConfigT
    
    var transformerPath: String
    
    var watchFolders: js.Array[String]
  }
  object InputConfigT {
    
    inline def apply(
      cacheStores: (js.Array[
          CacheStore[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
          ]
        ]) | (js.Function1[
          /* metroCache */ MetroCache, 
          js.Array[
            CacheStore[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
            ]
          ]
        ]),
      cacheVersion: String,
      maxWorkers: Double,
      projectRoot: String,
      reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any,
      resetCache: Boolean,
      resolver: ResolverConfigT,
      serializer: SerializerConfigT,
      server: ServerConfigT,
      stickyWorkers: Boolean,
      symbolicator: SymbolicatorConfigT,
      transformer: TransformerConfigT,
      transformerPath: String,
      watchFolders: js.Array[String]
    ): InputConfigT = {
      val __obj = js.Dynamic.literal(cacheStores = cacheStores.asInstanceOf[js.Any], cacheVersion = cacheVersion.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], resetCache = resetCache.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], stickyWorkers = stickyWorkers.asInstanceOf[js.Any], symbolicator = symbolicator.asInstanceOf[js.Any], transformer = transformer.asInstanceOf[js.Any], transformerPath = transformerPath.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputConfigT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputConfigT] (val x: Self) extends AnyVal {
      
      inline def setCacheStores(
        value: (js.Array[
              CacheStore[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
              ]
            ]) | (js.Function1[
              /* metroCache */ MetroCache, 
              js.Array[
                CacheStore[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
                ]
              ]
            ])
      ): Self = StObject.set(x, "cacheStores", value.asInstanceOf[js.Any])
      
      inline def setCacheStoresFunction1(
        value: /* metroCache */ MetroCache => js.Array[
              CacheStore[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
              ]
            ]
      ): Self = StObject.set(x, "cacheStores", js.Any.fromFunction1(value))
      
      inline def setCacheStoresVarargs(
        value: (CacheStore[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
            ])*
      ): Self = StObject.set(x, "cacheStores", js.Array(value*))
      
      inline def setCacheVersion(value: String): Self = StObject.set(x, "cacheVersion", value.asInstanceOf[js.Any])
      
      inline def setHasteMapCacheDirectory(value: String): Self = StObject.set(x, "hasteMapCacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setHasteMapCacheDirectoryUndefined: Self = StObject.set(x, "hasteMapCacheDirectory", js.undefined)
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setReporter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any
      ): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
      
      inline def setResolver(value: ResolverConfigT): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setSerializer(value: SerializerConfigT): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
      
      inline def setServer(value: ServerConfigT): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setStickyWorkers(value: Boolean): Self = StObject.set(x, "stickyWorkers", value.asInstanceOf[js.Any])
      
      inline def setSymbolicator(value: SymbolicatorConfigT): Self = StObject.set(x, "symbolicator", value.asInstanceOf[js.Any])
      
      inline def setTransformer(value: TransformerConfigT): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
      
      inline def setTransformerPath(value: String): Self = StObject.set(x, "transformerPath", value.asInstanceOf[js.Any])
      
      inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
    }
  }
  
  trait IntermediateConfigT
    extends StObject
       with MetalConfigT {
    
    var resolver: ResolverConfigT
    
    var serializer: SerializerConfigT
    
    var server: ServerConfigT
    
    var symbolicator: SymbolicatorConfigT
    
    var transformer: TransformerConfigT
  }
  object IntermediateConfigT {
    
    inline def apply(
      cacheStores: js.Array[
          CacheStore[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
          ]
        ],
      cacheVersion: String,
      maxWorkers: Double,
      projectRoot: String,
      reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any,
      resetCache: Boolean,
      resolver: ResolverConfigT,
      serializer: SerializerConfigT,
      server: ServerConfigT,
      stickyWorkers: Boolean,
      symbolicator: SymbolicatorConfigT,
      transformer: TransformerConfigT,
      transformerPath: String,
      watchFolders: js.Array[String]
    ): IntermediateConfigT = {
      val __obj = js.Dynamic.literal(cacheStores = cacheStores.asInstanceOf[js.Any], cacheVersion = cacheVersion.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], resetCache = resetCache.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], stickyWorkers = stickyWorkers.asInstanceOf[js.Any], symbolicator = symbolicator.asInstanceOf[js.Any], transformer = transformer.asInstanceOf[js.Any], transformerPath = transformerPath.asInstanceOf[js.Any], watchFolders = watchFolders.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntermediateConfigT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntermediateConfigT] (val x: Self) extends AnyVal {
      
      inline def setResolver(value: ResolverConfigT): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
      
      inline def setSerializer(value: SerializerConfigT): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
      
      inline def setServer(value: ServerConfigT): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setSymbolicator(value: SymbolicatorConfigT): Self = StObject.set(x, "symbolicator", value.asInstanceOf[js.Any])
      
      inline def setTransformer(value: TransformerConfigT): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetalConfigT extends StObject {
    
    var cacheStores: js.Array[
        CacheStore[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
        ]
      ]
    
    var cacheVersion: String
    
    var hasteMapCacheDirectory: js.UndefOr[String] = js.undefined
    
    var maxWorkers: Double
    
    var projectRoot: String
    
    var reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Reporter */ Any
    
    var resetCache: Boolean
    
    var stickyWorkers: Boolean
    
    var transformerPath: String
    
    var watchFolders: js.Array[String]
  }
  object MetalConfigT {
    
    inline def apply(
      cacheStores: js.Array[
          CacheStore[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
          ]
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
              CacheStore[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
              ]
            ]
      ): Self = StObject.set(x, "cacheStores", value.asInstanceOf[js.Any])
      
      inline def setCacheStoresVarargs(
        value: (CacheStore[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResult */ Any
            ])*
      ): Self = StObject.set(x, "cacheStores", js.Array(value*))
      
      inline def setCacheVersion(value: String): Self = StObject.set(x, "cacheVersion", value.asInstanceOf[js.Any])
      
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
      
      inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
    }
  }
  
  type Middleware = js.Function3[
    /* incomingMessage */ IncomingMessage, 
    /* serverResponse */ ServerResponse[IncomingMessage], 
    /* error */ js.Function1[/* e */ js.UndefOr[js.Error], Any], 
    Any
  ]
  
  type PostProcessBundleSourcemap = js.Function1[/* args */ Code, Map]
  
  trait ResolverConfigT extends StObject {
    
    var assetExts: js.Array[String]
    
    var assetResolutions: js.Array[String]
    
    var blacklistRE: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
    
    var blockList: js.RegExp | js.Array[js.RegExp]
    
    var dependencyExtractor: js.UndefOr[String] = js.undefined
    
    var extraNodeModules: StringDictionary[String]
    
    var hasteImplModulePath: js.UndefOr[String] = js.undefined
    
    var nodeModulesPaths: js.Array[String]
    
    var platforms: js.Array[String]
    
    var resolveRequest: js.UndefOr[CustomResolver] = js.undefined
    
    var resolverMainFields: js.Array[String]
    
    var sourceExts: js.Array[String]
    
    var useWatchman: Boolean
  }
  object ResolverConfigT {
    
    inline def apply(
      assetExts: js.Array[String],
      assetResolutions: js.Array[String],
      blockList: js.RegExp | js.Array[js.RegExp],
      extraNodeModules: StringDictionary[String],
      nodeModulesPaths: js.Array[String],
      platforms: js.Array[String],
      resolverMainFields: js.Array[String],
      sourceExts: js.Array[String],
      useWatchman: Boolean
    ): ResolverConfigT = {
      val __obj = js.Dynamic.literal(assetExts = assetExts.asInstanceOf[js.Any], assetResolutions = assetResolutions.asInstanceOf[js.Any], blockList = blockList.asInstanceOf[js.Any], extraNodeModules = extraNodeModules.asInstanceOf[js.Any], nodeModulesPaths = nodeModulesPaths.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], resolverMainFields = resolverMainFields.asInstanceOf[js.Any], sourceExts = sourceExts.asInstanceOf[js.Any], useWatchman = useWatchman.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolverConfigT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolverConfigT] (val x: Self) extends AnyVal {
      
      inline def setAssetExts(value: js.Array[String]): Self = StObject.set(x, "assetExts", value.asInstanceOf[js.Any])
      
      inline def setAssetExtsVarargs(value: String*): Self = StObject.set(x, "assetExts", js.Array(value*))
      
      inline def setAssetResolutions(value: js.Array[String]): Self = StObject.set(x, "assetResolutions", value.asInstanceOf[js.Any])
      
      inline def setAssetResolutionsVarargs(value: String*): Self = StObject.set(x, "assetResolutions", js.Array(value*))
      
      inline def setBlacklistRE(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "blacklistRE", value.asInstanceOf[js.Any])
      
      inline def setBlacklistREUndefined: Self = StObject.set(x, "blacklistRE", js.undefined)
      
      inline def setBlacklistREVarargs(value: js.RegExp*): Self = StObject.set(x, "blacklistRE", js.Array(value*))
      
      inline def setBlockList(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "blockList", value.asInstanceOf[js.Any])
      
      inline def setBlockListVarargs(value: js.RegExp*): Self = StObject.set(x, "blockList", js.Array(value*))
      
      inline def setDependencyExtractor(value: String): Self = StObject.set(x, "dependencyExtractor", value.asInstanceOf[js.Any])
      
      inline def setDependencyExtractorUndefined: Self = StObject.set(x, "dependencyExtractor", js.undefined)
      
      inline def setExtraNodeModules(value: StringDictionary[String]): Self = StObject.set(x, "extraNodeModules", value.asInstanceOf[js.Any])
      
      inline def setHasteImplModulePath(value: String): Self = StObject.set(x, "hasteImplModulePath", value.asInstanceOf[js.Any])
      
      inline def setHasteImplModulePathUndefined: Self = StObject.set(x, "hasteImplModulePath", js.undefined)
      
      inline def setNodeModulesPaths(value: js.Array[String]): Self = StObject.set(x, "nodeModulesPaths", value.asInstanceOf[js.Any])
      
      inline def setNodeModulesPathsVarargs(value: String*): Self = StObject.set(x, "nodeModulesPaths", js.Array(value*))
      
      inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
      
      inline def setResolveRequest(
        value: (/* context */ ResolutionContext, /* realModuleName */ String, /* platform */ String | Null, /* moduleName */ String | Null) => Resolution
      ): Self = StObject.set(x, "resolveRequest", js.Any.fromFunction4(value))
      
      inline def setResolveRequestUndefined: Self = StObject.set(x, "resolveRequest", js.undefined)
      
      inline def setResolverMainFields(value: js.Array[String]): Self = StObject.set(x, "resolverMainFields", value.asInstanceOf[js.Any])
      
      inline def setResolverMainFieldsVarargs(value: String*): Self = StObject.set(x, "resolverMainFields", js.Array(value*))
      
      inline def setSourceExts(value: js.Array[String]): Self = StObject.set(x, "sourceExts", value.asInstanceOf[js.Any])
      
      inline def setSourceExtsVarargs(value: String*): Self = StObject.set(x, "sourceExts", js.Array(value*))
      
      inline def setUseWatchman(value: Boolean): Self = StObject.set(x, "useWatchman", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SerializerConfigT extends StObject {
    
    def createModuleIdFactory(): js.Function1[/* path */ String, Double] = js.native
    
    var customSerializer: js.UndefOr[
        js.Function4[
          /* entryPoint */ String, 
          /* preModules */ js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ Any
          ], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Graph */ /* graph */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SerializerOptions */ /* options */ Any, 
          js.Promise[String | CodeMap]
        ]
      ] = js.native
    
    def experimentalSerializerHook(
      graph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Graph */ Any,
      delta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeltaResult */ Any
    ): Any = js.native
    
    def getModulesRunBeforeMainModule(entryFilePath: String): js.Array[String] = js.native
    
    def getPolyfills(options: Platform): js.Array[String] = js.native
    
    def getRunModuleStatement(moduleId: String): String = js.native
    def getRunModuleStatement(moduleId: Double): String = js.native
    
    var polyfillModuleNames: js.Array[String] = js.native
    
    def postProcessBundleSourcemap(args: Code): Map = js.native
    @JSName("postProcessBundleSourcemap")
    var postProcessBundleSourcemap_Original: PostProcessBundleSourcemap = js.native
    
    def processModuleFilter(
      modules: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ Any
    ): Boolean = js.native
  }
  
  trait ServerConfigT extends StObject {
    
    def enhanceMiddleware(
      middleware: Middleware,
      server: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Server */ Any
    ): Middleware
    
    var port: Double
    
    def rewriteRequestUrl(url: String): String
    
    var runInspectorProxy: Boolean
    
    var useGlobalHotkey: Boolean
    
    var verifyConnections: Boolean
  }
  object ServerConfigT {
    
    inline def apply(
      enhanceMiddleware: (Middleware, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Server */ Any) => Middleware,
      port: Double,
      rewriteRequestUrl: String => String,
      runInspectorProxy: Boolean,
      useGlobalHotkey: Boolean,
      verifyConnections: Boolean
    ): ServerConfigT = {
      val __obj = js.Dynamic.literal(enhanceMiddleware = js.Any.fromFunction2(enhanceMiddleware), port = port.asInstanceOf[js.Any], rewriteRequestUrl = js.Any.fromFunction1(rewriteRequestUrl), runInspectorProxy = runInspectorProxy.asInstanceOf[js.Any], useGlobalHotkey = useGlobalHotkey.asInstanceOf[js.Any], verifyConnections = verifyConnections.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerConfigT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerConfigT] (val x: Self) extends AnyVal {
      
      inline def setEnhanceMiddleware(
        value: (Middleware, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Server */ Any) => Middleware
      ): Self = StObject.set(x, "enhanceMiddleware", js.Any.fromFunction2(value))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setRewriteRequestUrl(value: String => String): Self = StObject.set(x, "rewriteRequestUrl", js.Any.fromFunction1(value))
      
      inline def setRunInspectorProxy(value: Boolean): Self = StObject.set(x, "runInspectorProxy", value.asInstanceOf[js.Any])
      
      inline def setUseGlobalHotkey(value: Boolean): Self = StObject.set(x, "useGlobalHotkey", value.asInstanceOf[js.Any])
      
      inline def setVerifyConnections(value: Boolean): Self = StObject.set(x, "verifyConnections", value.asInstanceOf[js.Any])
    }
  }
  
  trait SymbolicatorConfigT extends StObject {
    
    def customizeFrame(frame: Column): js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]
  }
  object SymbolicatorConfigT {
    
    inline def apply(customizeFrame: Column => js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]): SymbolicatorConfigT = {
      val __obj = js.Dynamic.literal(customizeFrame = js.Any.fromFunction1(customizeFrame))
      __obj.asInstanceOf[SymbolicatorConfigT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SymbolicatorConfigT] (val x: Self) extends AnyVal {
      
      inline def setCustomizeFrame(value: Column => js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]): Self = StObject.set(x, "customizeFrame", js.Any.fromFunction1(value))
    }
  }
  
  trait TransformerConfigT
    extends StObject
       with JsTransformerConfig {
    
    def getTransformOptions(
      entryPoints: js.Array[String],
      options: GetTransformOptionsOpts,
      getDependenciesOf: js.Function1[/* filePath */ String, js.Promise[js.Array[String]]]
    ): js.Promise[ExtraTransformOptions]
    @JSName("getTransformOptions")
    var getTransformOptions_Original: GetTransformOptions
    
    var transformVariants: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformVariants */ Any
    
    var workerPath: String
  }
  object TransformerConfigT {
    
    inline def apply(
      allowOptionalDependencies: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowOptionalDependencies */ Any,
      assetPlugins: js.Array[String],
      assetRegistryPath: String,
      asyncRequireModulePath: String,
      babelTransformerPath: String,
      dynamicDepsInPackages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DynamicRequiresBehavior */ Any,
      enableBabelRCLookup: Boolean,
      enableBabelRuntime: Boolean,
      experimentalImportBundleSupport: Boolean,
      getTransformOptions: (/* entryPoints */ js.Array[String], /* options */ GetTransformOptionsOpts, /* getDependenciesOf */ js.Function1[/* filePath */ String, js.Promise[js.Array[String]]]) => js.Promise[ExtraTransformOptions],
      globalPrefix: String,
      hermesParser: Boolean,
      minifierConfig: MinifierConfig,
      minifierPath: String,
      optimizationSizeLimit: Double,
      publicPath: String,
      transformVariants: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformVariants */ Any,
      unstable_collectDependenciesPath: String,
      unstable_compactOutput: Boolean,
      unstable_disableModuleWrapping: Boolean,
      unstable_disableNormalizePseudoGlobals: Boolean,
      workerPath: String
    ): TransformerConfigT = {
      val __obj = js.Dynamic.literal(allowOptionalDependencies = allowOptionalDependencies.asInstanceOf[js.Any], assetPlugins = assetPlugins.asInstanceOf[js.Any], assetRegistryPath = assetRegistryPath.asInstanceOf[js.Any], asyncRequireModulePath = asyncRequireModulePath.asInstanceOf[js.Any], babelTransformerPath = babelTransformerPath.asInstanceOf[js.Any], dynamicDepsInPackages = dynamicDepsInPackages.asInstanceOf[js.Any], enableBabelRCLookup = enableBabelRCLookup.asInstanceOf[js.Any], enableBabelRuntime = enableBabelRuntime.asInstanceOf[js.Any], experimentalImportBundleSupport = experimentalImportBundleSupport.asInstanceOf[js.Any], getTransformOptions = js.Any.fromFunction3(getTransformOptions), globalPrefix = globalPrefix.asInstanceOf[js.Any], hermesParser = hermesParser.asInstanceOf[js.Any], minifierConfig = minifierConfig.asInstanceOf[js.Any], minifierPath = minifierPath.asInstanceOf[js.Any], optimizationSizeLimit = optimizationSizeLimit.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any], transformVariants = transformVariants.asInstanceOf[js.Any], unstable_collectDependenciesPath = unstable_collectDependenciesPath.asInstanceOf[js.Any], unstable_compactOutput = unstable_compactOutput.asInstanceOf[js.Any], unstable_disableModuleWrapping = unstable_disableModuleWrapping.asInstanceOf[js.Any], unstable_disableNormalizePseudoGlobals = unstable_disableNormalizePseudoGlobals.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformerConfigT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformerConfigT] (val x: Self) extends AnyVal {
      
      inline def setGetTransformOptions(
        value: (/* entryPoints */ js.Array[String], /* options */ GetTransformOptionsOpts, /* getDependenciesOf */ js.Function1[/* filePath */ String, js.Promise[js.Array[String]]]) => js.Promise[ExtraTransformOptions]
      ): Self = StObject.set(x, "getTransformOptions", js.Any.fromFunction3(value))
      
      inline def setTransformVariants(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformVariants */ Any
      ): Self = StObject.set(x, "transformVariants", value.asInstanceOf[js.Any])
      
      inline def setWorkerPath(value: String): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait YargArguments extends StObject {
    
    var assetExts: js.UndefOr[js.Array[String]] = js.undefined
    
    var config: js.UndefOr[String] = js.undefined
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var `max-workers`: js.UndefOr[String | Double] = js.undefined
    
    var maxWorkers: js.UndefOr[String | Double] = js.undefined
    
    var platforms: js.UndefOr[js.Array[String]] = js.undefined
    
    var port: js.UndefOr[String | Double] = js.undefined
    
    var projectRoot: js.UndefOr[String] = js.undefined
    
    var `reset-cache`: js.UndefOr[Boolean] = js.undefined
    
    var resetCache: js.UndefOr[Boolean] = js.undefined
    
    var runInspectorProxy: js.UndefOr[Boolean] = js.undefined
    
    var sourceExts: js.UndefOr[js.Array[String]] = js.undefined
    
    var transformer: js.UndefOr[String] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var watchFolders: js.UndefOr[js.Array[String]] = js.undefined
  }
  object YargArguments {
    
    inline def apply(): YargArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YargArguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YargArguments] (val x: Self) extends AnyVal {
      
      inline def setAssetExts(value: js.Array[String]): Self = StObject.set(x, "assetExts", value.asInstanceOf[js.Any])
      
      inline def setAssetExtsUndefined: Self = StObject.set(x, "assetExts", js.undefined)
      
      inline def setAssetExtsVarargs(value: String*): Self = StObject.set(x, "assetExts", js.Array(value*))
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def `setMax-workers`(value: String | Double): Self = StObject.set(x, "max-workers", value.asInstanceOf[js.Any])
      
      inline def `setMax-workersUndefined`: Self = StObject.set(x, "max-workers", js.undefined)
      
      inline def setMaxWorkers(value: String | Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setMaxWorkersUndefined: Self = StObject.set(x, "maxWorkers", js.undefined)
      
      inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
      
      inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setProjectRootUndefined: Self = StObject.set(x, "projectRoot", js.undefined)
      
      inline def `setReset-cache`(value: Boolean): Self = StObject.set(x, "reset-cache", value.asInstanceOf[js.Any])
      
      inline def `setReset-cacheUndefined`: Self = StObject.set(x, "reset-cache", js.undefined)
      
      inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
      
      inline def setResetCacheUndefined: Self = StObject.set(x, "resetCache", js.undefined)
      
      inline def setRunInspectorProxy(value: Boolean): Self = StObject.set(x, "runInspectorProxy", value.asInstanceOf[js.Any])
      
      inline def setRunInspectorProxyUndefined: Self = StObject.set(x, "runInspectorProxy", js.undefined)
      
      inline def setSourceExts(value: js.Array[String]): Self = StObject.set(x, "sourceExts", value.asInstanceOf[js.Any])
      
      inline def setSourceExtsUndefined: Self = StObject.set(x, "sourceExts", js.undefined)
      
      inline def setSourceExtsVarargs(value: String*): Self = StObject.set(x, "sourceExts", js.Array(value*))
      
      inline def setTransformer(value: String): Self = StObject.set(x, "transformer", value.asInstanceOf[js.Any])
      
      inline def setTransformerUndefined: Self = StObject.set(x, "transformer", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWatchFolders(value: js.Array[String]): Self = StObject.set(x, "watchFolders", value.asInstanceOf[js.Any])
      
      inline def setWatchFoldersUndefined: Self = StObject.set(x, "watchFolders", js.undefined)
      
      inline def setWatchFoldersVarargs(value: String*): Self = StObject.set(x, "watchFolders", js.Array(value*))
    }
  }
}
