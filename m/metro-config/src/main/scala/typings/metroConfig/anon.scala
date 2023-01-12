package typings.metroConfig

import org.scalablytyped.runtime.StringDictionary
import typings.metroConfig.configTypesMod.ExtraTransformOptions
import typings.metroConfig.configTypesMod.GetTransformOptionsOpts
import typings.metroConfig.configTypesMod.Middleware
import typings.metroConfig.metroConfigBooleans.`true`
import typings.metroResolver.typesMod.CustomResolver
import typings.metroResolver.typesMod.Resolution
import typings.metroResolver.typesMod.ResolutionContext
import typings.metroSourceMap.mod.MixedSourceMap
import typings.metroTransformWorker.mod.MinifierConfig
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BlockList extends StObject {
    
    var blockList: StringDictionary[`true`]
  }
  object BlockList {
    
    inline def apply(blockList: StringDictionary[`true`]): BlockList = {
      val __obj = js.Dynamic.literal(blockList = blockList.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockList] (val x: Self) extends AnyVal {
      
      inline def setBlockList(value: StringDictionary[`true`]): Self = StObject.set(x, "blockList", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: Buffer | String
    
    var map: MixedSourceMap
    
    var outFileName: String
  }
  object Code {
    
    inline def apply(code: Buffer | String, map: MixedSourceMap, outFileName: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], outFileName = outFileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Buffer | String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMap(value: MixedSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setOutFileName(value: String): Self = StObject.set(x, "outFileName", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodeMap extends StObject {
    
    var code: String
    
    var map: String
  }
  object CodeMap {
    
    inline def apply(code: String, map: String): CodeMap = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeMap] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
  
  trait Collapse extends StObject {
    
    val collapse: js.UndefOr[Boolean] = js.undefined
  }
  object Collapse {
    
    inline def apply(): Collapse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Collapse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Collapse] (val x: Self) extends AnyVal {
      
      inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    }
  }
  
  trait Column extends StObject {
    
    val column: js.UndefOr[Double] = js.undefined
    
    val file: js.UndefOr[String] = js.undefined
    
    val lineNumber: js.UndefOr[Double] = js.undefined
    
    val methodName: js.UndefOr[String] = js.undefined
  }
  object Column {
    
    inline def apply(): Column = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    }
  }
  
  trait ExperimentalImportSupport extends StObject {
    
    val experimentalImportSupport: Boolean
    
    val inlineRequires: BlockList | Boolean
    
    val nonInlinedRequires: js.UndefOr[js.Array[String]] = js.undefined
    
    val unstable_disableES6Transforms: js.UndefOr[Boolean] = js.undefined
  }
  object ExperimentalImportSupport {
    
    inline def apply(experimentalImportSupport: Boolean, inlineRequires: BlockList | Boolean): ExperimentalImportSupport = {
      val __obj = js.Dynamic.literal(experimentalImportSupport = experimentalImportSupport.asInstanceOf[js.Any], inlineRequires = inlineRequires.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExperimentalImportSupport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExperimentalImportSupport] (val x: Self) extends AnyVal {
      
      inline def setExperimentalImportSupport(value: Boolean): Self = StObject.set(x, "experimentalImportSupport", value.asInstanceOf[js.Any])
      
      inline def setInlineRequires(value: BlockList | Boolean): Self = StObject.set(x, "inlineRequires", value.asInstanceOf[js.Any])
      
      inline def setNonInlinedRequires(value: js.Array[String]): Self = StObject.set(x, "nonInlinedRequires", value.asInstanceOf[js.Any])
      
      inline def setNonInlinedRequiresUndefined: Self = StObject.set(x, "nonInlinedRequires", js.undefined)
      
      inline def setNonInlinedRequiresVarargs(value: String*): Self = StObject.set(x, "nonInlinedRequires", js.Array(value*))
      
      inline def setUnstable_disableES6Transforms(value: Boolean): Self = StObject.set(x, "unstable_disableES6Transforms", value.asInstanceOf[js.Any])
      
      inline def setUnstable_disableES6TransformsUndefined: Self = StObject.set(x, "unstable_disableES6Transforms", js.undefined)
    }
  }
  
  trait Map extends StObject {
    
    var code: Buffer | String
    
    var map: MixedSourceMap | String
  }
  object Map {
    
    inline def apply(code: Buffer | String, map: MixedSourceMap | String): Map = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Buffer | String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMap(value: MixedSourceMap | String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    }
  }
  
  trait Platform extends StObject {
    
    var platform: js.UndefOr[String] = js.undefined
  }
  object Platform {
    
    inline def apply(): Platform = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Platform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Platform] (val x: Self) extends AnyVal {
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<metro-config.metro-config/configTypes.ResolverConfigT> */
  trait ReadonlyResolverConfigT extends StObject {
    
    val assetExts: js.Array[String]
    
    val assetResolutions: js.Array[String]
    
    val blacklistRE: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
    
    val blockList: js.RegExp | js.Array[js.RegExp]
    
    val dependencyExtractor: js.UndefOr[String] = js.undefined
    
    val extraNodeModules: StringDictionary[String]
    
    val hasteImplModulePath: js.UndefOr[String] = js.undefined
    
    val nodeModulesPaths: js.Array[String]
    
    val platforms: js.Array[String]
    
    val resolveRequest: js.UndefOr[CustomResolver] = js.undefined
    
    val resolverMainFields: js.Array[String]
    
    val sourceExts: js.Array[String]
    
    val useWatchman: Boolean
  }
  object ReadonlyResolverConfigT {
    
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
    ): ReadonlyResolverConfigT = {
      val __obj = js.Dynamic.literal(assetExts = assetExts.asInstanceOf[js.Any], assetResolutions = assetResolutions.asInstanceOf[js.Any], blockList = blockList.asInstanceOf[js.Any], extraNodeModules = extraNodeModules.asInstanceOf[js.Any], nodeModulesPaths = nodeModulesPaths.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], resolverMainFields = resolverMainFields.asInstanceOf[js.Any], sourceExts = sourceExts.asInstanceOf[js.Any], useWatchman = useWatchman.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyResolverConfigT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyResolverConfigT] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined std.Readonly<metro-config.metro-config/configTypes.SerializerConfigT> */
  @js.native
  trait ReadonlySerializerConfigT extends StObject {
    
    def createModuleIdFactory(): js.Function1[/* path */ String, Double] = js.native
    
    val customSerializer: js.UndefOr[
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
    
    val polyfillModuleNames: js.Array[String] = js.native
    
    def postProcessBundleSourcemap(args: Code): Map = js.native
    
    def processModuleFilter(
      modules: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ Any
    ): Boolean = js.native
  }
  
  /* Inlined std.Readonly<metro-config.metro-config/configTypes.ServerConfigT> */
  trait ReadonlyServerConfigT extends StObject {
    
    def enhanceMiddleware(
      middleware: Middleware,
      server: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Server */ Any
    ): Middleware
    
    val port: Double
    
    def rewriteRequestUrl(url: String): String
    
    val runInspectorProxy: Boolean
    
    val useGlobalHotkey: Boolean
    
    val verifyConnections: Boolean
  }
  object ReadonlyServerConfigT {
    
    inline def apply(
      enhanceMiddleware: (Middleware, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Server */ Any) => Middleware,
      port: Double,
      rewriteRequestUrl: String => String,
      runInspectorProxy: Boolean,
      useGlobalHotkey: Boolean,
      verifyConnections: Boolean
    ): ReadonlyServerConfigT = {
      val __obj = js.Dynamic.literal(enhanceMiddleware = js.Any.fromFunction2(enhanceMiddleware), port = port.asInstanceOf[js.Any], rewriteRequestUrl = js.Any.fromFunction1(rewriteRequestUrl), runInspectorProxy = runInspectorProxy.asInstanceOf[js.Any], useGlobalHotkey = useGlobalHotkey.asInstanceOf[js.Any], verifyConnections = verifyConnections.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyServerConfigT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyServerConfigT] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined std.Readonly<metro-config.metro-config/configTypes.SymbolicatorConfigT> */
  trait ReadonlySymbolicatorConfi extends StObject {
    
    def customizeFrame(frame: Column): js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]
  }
  object ReadonlySymbolicatorConfi {
    
    inline def apply(customizeFrame: Column => js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]): ReadonlySymbolicatorConfi = {
      val __obj = js.Dynamic.literal(customizeFrame = js.Any.fromFunction1(customizeFrame))
      __obj.asInstanceOf[ReadonlySymbolicatorConfi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlySymbolicatorConfi] (val x: Self) extends AnyVal {
      
      inline def setCustomizeFrame(value: Column => js.UndefOr[Collapse | (js.Promise[Collapse | Unit])]): Self = StObject.set(x, "customizeFrame", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<metro-config.metro-config/configTypes.TransformerConfigT> */
  trait ReadonlyTransformerConfig extends StObject {
    
    val allowOptionalDependencies: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowOptionalDependencies */ Any
    
    val assetPlugins: js.Array[String]
    
    val assetRegistryPath: String
    
    val asyncRequireModulePath: String
    
    val babelTransformerPath: String
    
    val dynamicDepsInPackages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DynamicRequiresBehavior */ Any
    
    val enableBabelRCLookup: Boolean
    
    val enableBabelRuntime: Boolean
    
    val experimentalImportBundleSupport: Boolean
    
    def getTransformOptions(
      entryPoints: js.Array[String],
      options: GetTransformOptionsOpts,
      getDependenciesOf: js.Function1[/* filePath */ String, js.Promise[js.Array[String]]]
    ): js.Promise[ExtraTransformOptions]
    
    val globalPrefix: String
    
    val hermesParser: Boolean
    
    val minifierConfig: MinifierConfig
    
    val minifierPath: String
    
    val optimizationSizeLimit: Double
    
    val publicPath: String
    
    val transformVariants: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformVariants */ Any
    
    val unstable_collectDependenciesPath: String
    
    val unstable_compactOutput: Boolean
    
    val unstable_dependencyMapReservedName: js.UndefOr[String] = js.undefined
    
    val unstable_disableModuleWrapping: Boolean
    
    val unstable_disableNormalizePseudoGlobals: Boolean
    
    val workerPath: String
  }
  object ReadonlyTransformerConfig {
    
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
      getTransformOptions: (js.Array[String], GetTransformOptionsOpts, js.Function1[/* filePath */ String, js.Promise[js.Array[String]]]) => js.Promise[ExtraTransformOptions],
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
    ): ReadonlyTransformerConfig = {
      val __obj = js.Dynamic.literal(allowOptionalDependencies = allowOptionalDependencies.asInstanceOf[js.Any], assetPlugins = assetPlugins.asInstanceOf[js.Any], assetRegistryPath = assetRegistryPath.asInstanceOf[js.Any], asyncRequireModulePath = asyncRequireModulePath.asInstanceOf[js.Any], babelTransformerPath = babelTransformerPath.asInstanceOf[js.Any], dynamicDepsInPackages = dynamicDepsInPackages.asInstanceOf[js.Any], enableBabelRCLookup = enableBabelRCLookup.asInstanceOf[js.Any], enableBabelRuntime = enableBabelRuntime.asInstanceOf[js.Any], experimentalImportBundleSupport = experimentalImportBundleSupport.asInstanceOf[js.Any], getTransformOptions = js.Any.fromFunction3(getTransformOptions), globalPrefix = globalPrefix.asInstanceOf[js.Any], hermesParser = hermesParser.asInstanceOf[js.Any], minifierConfig = minifierConfig.asInstanceOf[js.Any], minifierPath = minifierPath.asInstanceOf[js.Any], optimizationSizeLimit = optimizationSizeLimit.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any], transformVariants = transformVariants.asInstanceOf[js.Any], unstable_collectDependenciesPath = unstable_collectDependenciesPath.asInstanceOf[js.Any], unstable_compactOutput = unstable_compactOutput.asInstanceOf[js.Any], unstable_disableModuleWrapping = unstable_disableModuleWrapping.asInstanceOf[js.Any], unstable_disableNormalizePseudoGlobals = unstable_disableNormalizePseudoGlobals.asInstanceOf[js.Any], workerPath = workerPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyTransformerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyTransformerConfig] (val x: Self) extends AnyVal {
      
      inline def setAllowOptionalDependencies(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowOptionalDependencies */ Any
      ): Self = StObject.set(x, "allowOptionalDependencies", value.asInstanceOf[js.Any])
      
      inline def setAssetPlugins(value: js.Array[String]): Self = StObject.set(x, "assetPlugins", value.asInstanceOf[js.Any])
      
      inline def setAssetPluginsVarargs(value: String*): Self = StObject.set(x, "assetPlugins", js.Array(value*))
      
      inline def setAssetRegistryPath(value: String): Self = StObject.set(x, "assetRegistryPath", value.asInstanceOf[js.Any])
      
      inline def setAsyncRequireModulePath(value: String): Self = StObject.set(x, "asyncRequireModulePath", value.asInstanceOf[js.Any])
      
      inline def setBabelTransformerPath(value: String): Self = StObject.set(x, "babelTransformerPath", value.asInstanceOf[js.Any])
      
      inline def setDynamicDepsInPackages(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DynamicRequiresBehavior */ Any
      ): Self = StObject.set(x, "dynamicDepsInPackages", value.asInstanceOf[js.Any])
      
      inline def setEnableBabelRCLookup(value: Boolean): Self = StObject.set(x, "enableBabelRCLookup", value.asInstanceOf[js.Any])
      
      inline def setEnableBabelRuntime(value: Boolean): Self = StObject.set(x, "enableBabelRuntime", value.asInstanceOf[js.Any])
      
      inline def setExperimentalImportBundleSupport(value: Boolean): Self = StObject.set(x, "experimentalImportBundleSupport", value.asInstanceOf[js.Any])
      
      inline def setGetTransformOptions(
        value: (js.Array[String], GetTransformOptionsOpts, js.Function1[/* filePath */ String, js.Promise[js.Array[String]]]) => js.Promise[ExtraTransformOptions]
      ): Self = StObject.set(x, "getTransformOptions", js.Any.fromFunction3(value))
      
      inline def setGlobalPrefix(value: String): Self = StObject.set(x, "globalPrefix", value.asInstanceOf[js.Any])
      
      inline def setHermesParser(value: Boolean): Self = StObject.set(x, "hermesParser", value.asInstanceOf[js.Any])
      
      inline def setMinifierConfig(value: MinifierConfig): Self = StObject.set(x, "minifierConfig", value.asInstanceOf[js.Any])
      
      inline def setMinifierPath(value: String): Self = StObject.set(x, "minifierPath", value.asInstanceOf[js.Any])
      
      inline def setOptimizationSizeLimit(value: Double): Self = StObject.set(x, "optimizationSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setTransformVariants(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformVariants */ Any
      ): Self = StObject.set(x, "transformVariants", value.asInstanceOf[js.Any])
      
      inline def setUnstable_collectDependenciesPath(value: String): Self = StObject.set(x, "unstable_collectDependenciesPath", value.asInstanceOf[js.Any])
      
      inline def setUnstable_compactOutput(value: Boolean): Self = StObject.set(x, "unstable_compactOutput", value.asInstanceOf[js.Any])
      
      inline def setUnstable_dependencyMapReservedName(value: String): Self = StObject.set(x, "unstable_dependencyMapReservedName", value.asInstanceOf[js.Any])
      
      inline def setUnstable_dependencyMapReservedNameUndefined: Self = StObject.set(x, "unstable_dependencyMapReservedName", js.undefined)
      
      inline def setUnstable_disableModuleWrapping(value: Boolean): Self = StObject.set(x, "unstable_disableModuleWrapping", value.asInstanceOf[js.Any])
      
      inline def setUnstable_disableNormalizePseudoGlobals(value: Boolean): Self = StObject.set(x, "unstable_disableNormalizePseudoGlobals", value.asInstanceOf[js.Any])
      
      inline def setWorkerPath(value: String): Self = StObject.set(x, "workerPath", value.asInstanceOf[js.Any])
    }
  }
}
