package typings.metroTransformWorker

import typings.metroBabelTransformer.mod.CustomTransformOptions
import typings.metroBabelTransformer.mod.TransformProfile
import typings.metroSourceMap.mod.BasicSourceMap
import typings.metroTransformWorker.anon.ReadonlycodestringlineCou
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metro-transform-worker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCacheKey(config: JsTransformerConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKey")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transform(
    config: JsTransformerConfig,
    projectRoot: String,
    filename: String,
    data: Buffer,
    options: JsTransformOptions
  ): js.Promise[TransformResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(config.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransformResponse]]
  
  type BytecodeOutput = Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroTransformWorker.metroTransformWorkerStrings.jsSlashscript
    - typings.metroTransformWorker.metroTransformWorkerStrings.jsSlashmodule
    - typings.metroTransformWorker.metroTransformWorkerStrings.jsSlashmoduleSlashasset
  */
  trait JSFileType extends StObject
  object JSFileType {
    
    inline def jsSlashmodule: typings.metroTransformWorker.metroTransformWorkerStrings.jsSlashmodule = "js/module".asInstanceOf[typings.metroTransformWorker.metroTransformWorkerStrings.jsSlashmodule]
    
    inline def jsSlashmoduleSlashasset: typings.metroTransformWorker.metroTransformWorkerStrings.jsSlashmoduleSlashasset = "js/module/asset".asInstanceOf[typings.metroTransformWorker.metroTransformWorkerStrings.jsSlashmoduleSlashasset]
    
    inline def jsSlashscript: typings.metroTransformWorker.metroTransformWorkerStrings.jsSlashscript = "js/script".asInstanceOf[typings.metroTransformWorker.metroTransformWorkerStrings.jsSlashscript]
  }
  
  /* Inlined std.Readonly<{  data :std.Readonly<{  code :string,   lineCount :number,   map :std.Array<metro-source-map.metro-source-map.MetroSourceMapSegmentTuple>,   functionMap :metro-source-map.metro-source-map.FBSourceFunctionMap | undefined}>,   type :metro-transform-worker.metro-transform-worker.JSFileType}> */
  trait JsOutput extends StObject {
    
    val data: ReadonlycodestringlineCou
    
    val `type`: JSFileType
  }
  object JsOutput {
    
    inline def apply(data: ReadonlycodestringlineCou, `type`: JSFileType): JsOutput = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsOutput] (val x: Self) extends AnyVal {
      
      inline def setData(value: ReadonlycodestringlineCou): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: JSFileType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  customTransformOptions :metro-babel-transformer.metro-babel-transformer.CustomTransformOptions | undefined,   dev :boolean,   experimentalImportSupport :boolean | undefined,   hot :boolean,   inlinePlatform :boolean,   inlineRequires :boolean,   minify :boolean,   nonInlinedRequires :std.ReadonlyArray<string> | undefined,   platform :string | undefined,   runtimeBytecodeVersion :number | undefined,   type :metro-transform-worker.metro-transform-worker.Type,   unstable_disableES6Transforms :boolean | undefined,   unstable_transformProfile :metro-babel-transformer.metro-babel-transformer.TransformProfile}> */
  trait JsTransformOptions extends StObject {
    
    val customTransformOptions: js.UndefOr[CustomTransformOptions] = js.undefined
    
    val dev: Boolean
    
    val experimentalImportSupport: js.UndefOr[Boolean] = js.undefined
    
    val hot: Boolean
    
    val inlinePlatform: Boolean
    
    val inlineRequires: Boolean
    
    val minify: Boolean
    
    val nonInlinedRequires: js.UndefOr[js.Array[String]] = js.undefined
    
    val platform: js.UndefOr[String] = js.undefined
    
    val runtimeBytecodeVersion: js.UndefOr[Double] = js.undefined
    
    val `type`: Type
    
    val unstable_disableES6Transforms: js.UndefOr[Boolean] = js.undefined
    
    val unstable_transformProfile: TransformProfile
  }
  object JsTransformOptions {
    
    inline def apply(
      dev: Boolean,
      hot: Boolean,
      inlinePlatform: Boolean,
      inlineRequires: Boolean,
      minify: Boolean,
      `type`: Type,
      unstable_transformProfile: TransformProfile
    ): JsTransformOptions = {
      val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], inlinePlatform = inlinePlatform.asInstanceOf[js.Any], inlineRequires = inlineRequires.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], unstable_transformProfile = unstable_transformProfile.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsTransformOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsTransformOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomTransformOptions(value: CustomTransformOptions): Self = StObject.set(x, "customTransformOptions", value.asInstanceOf[js.Any])
      
      inline def setCustomTransformOptionsUndefined: Self = StObject.set(x, "customTransformOptions", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setExperimentalImportSupport(value: Boolean): Self = StObject.set(x, "experimentalImportSupport", value.asInstanceOf[js.Any])
      
      inline def setExperimentalImportSupportUndefined: Self = StObject.set(x, "experimentalImportSupport", js.undefined)
      
      inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setInlinePlatform(value: Boolean): Self = StObject.set(x, "inlinePlatform", value.asInstanceOf[js.Any])
      
      inline def setInlineRequires(value: Boolean): Self = StObject.set(x, "inlineRequires", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setNonInlinedRequires(value: js.Array[String]): Self = StObject.set(x, "nonInlinedRequires", value.asInstanceOf[js.Any])
      
      inline def setNonInlinedRequiresUndefined: Self = StObject.set(x, "nonInlinedRequires", js.undefined)
      
      inline def setNonInlinedRequiresVarargs(value: String*): Self = StObject.set(x, "nonInlinedRequires", js.Array(value*))
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setRuntimeBytecodeVersion(value: Double): Self = StObject.set(x, "runtimeBytecodeVersion", value.asInstanceOf[js.Any])
      
      inline def setRuntimeBytecodeVersionUndefined: Self = StObject.set(x, "runtimeBytecodeVersion", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnstable_disableES6Transforms(value: Boolean): Self = StObject.set(x, "unstable_disableES6Transforms", value.asInstanceOf[js.Any])
      
      inline def setUnstable_disableES6TransformsUndefined: Self = StObject.set(x, "unstable_disableES6Transforms", js.undefined)
      
      inline def setUnstable_transformProfile(value: TransformProfile): Self = StObject.set(x, "unstable_transformProfile", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  assetPlugins :std.ReadonlyArray<string>,   assetRegistryPath :string,   asyncRequireModulePath :string,   babelTransformerPath :string,   dynamicDepsInPackages :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DynamicRequiresBehavior * / any,   enableBabelRCLookup :boolean,   enableBabelRuntime :boolean,   experimentalImportBundleSupport :boolean,   globalPrefix :string,   hermesParser :boolean,   minifierConfig :metro-transform-worker.metro-transform-worker.MinifierConfig,   minifierPath :string,   optimizationSizeLimit :number,   publicPath :string,   allowOptionalDependencies :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowOptionalDependencies * / any,   unstable_collectDependenciesPath :string,   unstable_dependencyMapReservedName :string | undefined,   unstable_disableModuleWrapping :boolean,   unstable_disableNormalizePseudoGlobals :boolean,   unstable_compactOutput :boolean}> */
  trait JsTransformerConfig extends StObject {
    
    val allowOptionalDependencies: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AllowOptionalDependencies */ Any
    
    val assetPlugins: js.Array[String]
    
    val assetRegistryPath: String
    
    val asyncRequireModulePath: String
    
    val babelTransformerPath: String
    
    val dynamicDepsInPackages: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DynamicRequiresBehavior */ Any
    
    val enableBabelRCLookup: Boolean
    
    val enableBabelRuntime: Boolean
    
    val experimentalImportBundleSupport: Boolean
    
    val globalPrefix: String
    
    val hermesParser: Boolean
    
    val minifierConfig: MinifierConfig
    
    val minifierPath: String
    
    val optimizationSizeLimit: Double
    
    val publicPath: String
    
    val unstable_collectDependenciesPath: String
    
    val unstable_compactOutput: Boolean
    
    val unstable_dependencyMapReservedName: js.UndefOr[String] = js.undefined
    
    val unstable_disableModuleWrapping: Boolean
    
    val unstable_disableNormalizePseudoGlobals: Boolean
  }
  object JsTransformerConfig {
    
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
      globalPrefix: String,
      hermesParser: Boolean,
      minifierConfig: MinifierConfig,
      minifierPath: String,
      optimizationSizeLimit: Double,
      publicPath: String,
      unstable_collectDependenciesPath: String,
      unstable_compactOutput: Boolean,
      unstable_disableModuleWrapping: Boolean,
      unstable_disableNormalizePseudoGlobals: Boolean
    ): JsTransformerConfig = {
      val __obj = js.Dynamic.literal(allowOptionalDependencies = allowOptionalDependencies.asInstanceOf[js.Any], assetPlugins = assetPlugins.asInstanceOf[js.Any], assetRegistryPath = assetRegistryPath.asInstanceOf[js.Any], asyncRequireModulePath = asyncRequireModulePath.asInstanceOf[js.Any], babelTransformerPath = babelTransformerPath.asInstanceOf[js.Any], dynamicDepsInPackages = dynamicDepsInPackages.asInstanceOf[js.Any], enableBabelRCLookup = enableBabelRCLookup.asInstanceOf[js.Any], enableBabelRuntime = enableBabelRuntime.asInstanceOf[js.Any], experimentalImportBundleSupport = experimentalImportBundleSupport.asInstanceOf[js.Any], globalPrefix = globalPrefix.asInstanceOf[js.Any], hermesParser = hermesParser.asInstanceOf[js.Any], minifierConfig = minifierConfig.asInstanceOf[js.Any], minifierPath = minifierPath.asInstanceOf[js.Any], optimizationSizeLimit = optimizationSizeLimit.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any], unstable_collectDependenciesPath = unstable_collectDependenciesPath.asInstanceOf[js.Any], unstable_compactOutput = unstable_compactOutput.asInstanceOf[js.Any], unstable_disableModuleWrapping = unstable_disableModuleWrapping.asInstanceOf[js.Any], unstable_disableNormalizePseudoGlobals = unstable_disableNormalizePseudoGlobals.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsTransformerConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsTransformerConfig] (val x: Self) extends AnyVal {
      
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
      
      inline def setGlobalPrefix(value: String): Self = StObject.set(x, "globalPrefix", value.asInstanceOf[js.Any])
      
      inline def setHermesParser(value: Boolean): Self = StObject.set(x, "hermesParser", value.asInstanceOf[js.Any])
      
      inline def setMinifierConfig(value: MinifierConfig): Self = StObject.set(x, "minifierConfig", value.asInstanceOf[js.Any])
      
      inline def setMinifierPath(value: String): Self = StObject.set(x, "minifierPath", value.asInstanceOf[js.Any])
      
      inline def setOptimizationSizeLimit(value: Double): Self = StObject.set(x, "optimizationSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setUnstable_collectDependenciesPath(value: String): Self = StObject.set(x, "unstable_collectDependenciesPath", value.asInstanceOf[js.Any])
      
      inline def setUnstable_compactOutput(value: Boolean): Self = StObject.set(x, "unstable_compactOutput", value.asInstanceOf[js.Any])
      
      inline def setUnstable_dependencyMapReservedName(value: String): Self = StObject.set(x, "unstable_dependencyMapReservedName", value.asInstanceOf[js.Any])
      
      inline def setUnstable_dependencyMapReservedNameUndefined: Self = StObject.set(x, "unstable_dependencyMapReservedName", js.undefined)
      
      inline def setUnstable_disableModuleWrapping(value: Boolean): Self = StObject.set(x, "unstable_disableModuleWrapping", value.asInstanceOf[js.Any])
      
      inline def setUnstable_disableNormalizePseudoGlobals(value: Boolean): Self = StObject.set(x, "unstable_disableNormalizePseudoGlobals", value.asInstanceOf[js.Any])
    }
  }
  
  type MinifierConfig = Record[String, Any]
  
  trait MinifierOptions extends StObject {
    
    var code: String
    
    var config: MinifierConfig
    
    var filename: String
    
    var map: js.UndefOr[BasicSourceMap] = js.undefined
    
    var reserved: js.Array[String]
  }
  object MinifierOptions {
    
    inline def apply(code: String, config: MinifierConfig, filename: String, reserved: js.Array[String]): MinifierOptions = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], reserved = reserved.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinifierOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinifierOptions] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: MinifierConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setMap(value: BasicSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setReserved(value: js.Array[String]): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
      
      inline def setReservedVarargs(value: String*): Self = StObject.set(x, "reserved", js.Array(value*))
    }
  }
  
  trait MinifierResult extends StObject {
    
    var code: String
    
    var map: js.UndefOr[BasicSourceMap] = js.undefined
  }
  object MinifierResult {
    
    inline def apply(code: String): MinifierResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinifierResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinifierResult] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMap(value: BasicSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  dependencies :std.ReadonlyArray</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResultDependency * / any>,   output :std.ReadonlyArray<metro-transform-worker.metro-transform-worker.JsOutput | metro-transform-worker.metro-transform-worker.BytecodeOutput>}> */
  trait TransformResponse extends StObject {
    
    val dependencies: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResultDependency */ Any
      ]
    
    val output: js.Array[JsOutput | BytecodeOutput]
  }
  object TransformResponse {
    
    inline def apply(
      dependencies: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResultDependency */ Any
        ],
      output: js.Array[JsOutput | BytecodeOutput]
    ): TransformResponse = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformResponse] (val x: Self) extends AnyVal {
      
      inline def setDependencies(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResultDependency */ Any
            ]
      ): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformResultDependency */ Any)*
      ): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setOutput(value: js.Array[JsOutput | BytecodeOutput]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: (JsOutput | BytecodeOutput)*): Self = StObject.set(x, "output", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroTransformWorker.metroTransformWorkerStrings.script
    - typings.metroTransformWorker.metroTransformWorkerStrings.module
    - typings.metroTransformWorker.metroTransformWorkerStrings.asset
  */
  trait Type extends StObject
  object Type {
    
    inline def asset: typings.metroTransformWorker.metroTransformWorkerStrings.asset = "asset".asInstanceOf[typings.metroTransformWorker.metroTransformWorkerStrings.asset]
    
    inline def module: typings.metroTransformWorker.metroTransformWorkerStrings.module = "module".asInstanceOf[typings.metroTransformWorker.metroTransformWorkerStrings.module]
    
    inline def script: typings.metroTransformWorker.metroTransformWorkerStrings.script = "script".asInstanceOf[typings.metroTransformWorker.metroTransformWorkerStrings.script]
  }
}
