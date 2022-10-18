package typings.miniCssExtractPlugin

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.miniCssExtractPlugin.anon.FnCall
import typings.miniCssExtractPlugin.miniCssExtractPluginBooleans.`false`
import typings.miniCssExtractPlugin.miniCssExtractPluginStrings.`mini-css-extract-plugin`
import typings.miniCssExtractPlugin.miniCssExtractPluginStrings.textSlashcss
import typings.node.bufferMod.global.Buffer
import typings.std.HTMLLinkElement
import typings.std.Map
import typings.std.Record
import typings.webpack.mod.CallbackWebpack
import typings.webpack.mod.MultiCompiler
import typings.webpack.mod.MultiCompilerOptions
import typings.webpack.mod.MultiStats
import typings.webpack.mod.PathData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mini-css-extract-plugin", JSImport.Namespace)
  @js.native
  /**
    * @param {PluginOptions} [options]
    */
  open class ^ ()
    extends StObject
       with MiniCssExtractPlugin {
    def this(options: PluginOptions) = this()
    
    /**
      * @private
      * @type {WeakMap<Chunk, Set<CssModule>>}
      * @private
      */
    /* private */ /* CompleteClass */
    var _sortedModulesCache: Any = js.native
    
    /**
      * @param {Compiler} compiler
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /**
      * @private
      * @param {Chunk} chunk
      * @param {ChunkGraph} chunkGraph
      * @returns {Iterable<Module>}
      */
    /* private */ /* CompleteClass */
    var getChunkModules: Any = js.native
    
    /**
      * @private
      * @type {NormalizedPluginOptions}
      */
    /* private */ /* CompleteClass */
    var options: Any = js.native
    
    /**
      * @private
      * @param {Compiler} compiler
      * @param {Compilation} compilation
      * @param {Chunk} chunk
      * @param {CssModule[]} modules
      * @param {Compiler["requestShortener"]} requestShortener
      * @param {string} filenameTemplate
      * @param {Parameters<Exclude<Required<Configuration>['output']['filename'], string | undefined>>[0]} pathData
      * @returns {Source}
      */
    /* private */ /* CompleteClass */
    var renderContentAsset: Any = js.native
    
    /**
      * @private
      * @type {RuntimeOptions}
      */
    /* private */ /* CompleteClass */
    var runtimeOptions: Any = js.native
    
    /**
      * @private
      * @param {Compilation} compilation
      * @param {Chunk} chunk
      * @param {CssModule[]} modules
      * @param {Compilation["requestShortener"]} requestShortener
      * @returns {Set<CssModule>}
      */
    /* private */ /* CompleteClass */
    var sortModules: Any = js.native
  }
  @JSImport("mini-css-extract-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {Compiler["webpack"]} webpack
    * @returns {CssDependencyConstructor}
    */
  /* static member */
  inline def getCssDependency(
    webpack: (js.Function2[
      /* options */ js.Array[typings.webpack.mod.Configuration] & MultiCompilerOptions, 
      /* callback */ js.UndefOr[CallbackWebpack[MultiStats]], 
      MultiCompiler
    ]) & FnCall
  ): CssDependencyConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getCssDependency")(webpack.asInstanceOf[js.Any]).asInstanceOf[CssDependencyConstructor]
  
  /**
    * @param {Compiler["webpack"]} webpack
    * @returns {CssModuleConstructor}
    */
  /* static member */
  inline def getCssModule(
    webpack: (js.Function2[
      /* options */ js.Array[typings.webpack.mod.Configuration] & MultiCompilerOptions, 
      /* callback */ js.UndefOr[CallbackWebpack[MultiStats]], 
      MultiCompiler
    ]) & FnCall
  ): CssModuleConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getCssModule")(webpack.asInstanceOf[js.Any]).asInstanceOf[CssModuleConstructor]
  
  @JSImport("mini-css-extract-plugin", "loader")
  @js.native
  def loader: String = js.native
  inline def loader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loader")(x.asInstanceOf[js.Any])
  
  /** @typedef {import("schema-utils/declarations/validate").Schema} Schema */
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").Compilation} Compilation */
  /** @typedef {import("webpack").ChunkGraph} ChunkGraph */
  /** @typedef {import("webpack").Chunk} Chunk */
  /** @typedef {Parameters<import("webpack").Chunk["isInGroup"]>[0]} ChunkGroup */
  /** @typedef {import("webpack").Module} Module */
  /** @typedef {import("webpack").Dependency} Dependency */
  /** @typedef {import("webpack").sources.Source} Source */
  /** @typedef {import("webpack").Configuration} Configuration */
  /** @typedef {import("webpack").WebpackError} WebpackError */
  /** @typedef {import("webpack").AssetInfo} AssetInfo */
  /** @typedef {import("./loader.js").Dependency} LoaderDependency */
  /**
    * @typedef {Object} LoaderOptions
    * @property {string | ((resourcePath: string, rootContext: string) => string)} [publicPath]
    * @property {boolean} [emit]
    * @property {boolean} [esModule]
    * @property {string} [layer]
    */
  /**
    * @typedef {Object} PluginOptions
    * @property {Required<Configuration>['output']['filename']} [filename]
    * @property {Required<Configuration>['output']['chunkFilename']} [chunkFilename]
    * @property {boolean} [ignoreOrder]
    * @property {string | ((linkTag: HTMLLinkElement) => void)} [insert]
    * @property {Record<string, string>} [attributes]
    * @property {string | false | 'text/css'} [linkType]
    * @property {boolean} [runtime]
    * @property {boolean} [experimentalUseImportModule]
    */
  /**
    * @typedef {Object} NormalizedPluginOptions
    * @property {Required<Configuration>['output']['filename']} filename
    * @property {Required<Configuration>['output']['chunkFilename']} [chunkFilename]
    * @property {boolean} ignoreOrder
    * @property {string | ((linkTag: HTMLLinkElement) => void)} [insert]
    * @property {Record<string, string>} [attributes]
    * @property {string | false | 'text/css'} [linkType]
    * @property {boolean} runtime
    * @property {boolean} [experimentalUseImportModule]
    */
  /**
    * @typedef {Object} RuntimeOptions
    * @property {string | ((linkTag: HTMLLinkElement) => void) | undefined} insert
    * @property {string | false | 'text/css'} linkType
    * @property {Record<string, string> | undefined} attributes
    */
  /** @typedef {any} TODO */
  @JSImport("mini-css-extract-plugin", "pluginName")
  @js.native
  val pluginName: `mini-css-extract-plugin` = js.native
  
  @JSImport("mini-css-extract-plugin", "pluginSymbol")
  @js.native
  val pluginSymbol: js.Symbol = js.native
  
  type AssetInfo = typings.webpack.mod.AssetInfo
  
  type Chunk = typings.webpack.mod.Chunk
  
  type ChunkGraph = typings.webpack.mod.ChunkGraph
  
  type ChunkGroup = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(chunkGroup : webpack.webpack.ChunkGroup): boolean>[0] */ js.Any
  
  type Compilation = typings.webpack.mod.Compilation
  
  type Compiler = typings.webpack.mod.Compiler
  
  type Configuration = typings.webpack.mod.Configuration
  
  @js.native
  trait CssDependency
    extends StObject
       with typings.webpack.mod.Dependency
       with CssModuleDependency
  
  type CssDependencyConstructor = Instantiable3[
    /* loaderDependency */ CssDependencyOptions, 
    /* context */ String | Null, 
    /* identifierIndex */ Double, 
    CssDependency
  ]
  
  /* Inlined std.Omit<mini-css-extract-plugin.mini-css-extract-plugin.LoaderDependency, 'context'> */
  trait CssDependencyOptions extends StObject {
    
    var content: Buffer
    
    var identifier: String
    
    var layer: js.UndefOr[String] = js.undefined
    
    var media: String
    
    var sourceMap: js.UndefOr[Buffer] = js.undefined
    
    var supports: js.UndefOr[String] = js.undefined
  }
  object CssDependencyOptions {
    
    inline def apply(content: Buffer, identifier: String, media: String): CssDependencyOptions = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssDependencyOptions]
    }
    
    extension [Self <: CssDependencyOptions](x: Self) {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setSourceMap(value: Buffer): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setSupports(value: String): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
      
      inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
    }
  }
  
  @js.native
  trait CssModule
    extends typings.webpack.mod.Module {
    
    var assets: js.UndefOr[StringDictionary[Any]] = js.native
    
    var assetsInfo: js.UndefOr[Map[String, typings.webpack.mod.AssetInfo]] = js.native
    
    var content: Buffer = js.native
    
    @JSName("layer")
    var layer_CssModule: js.UndefOr[String] = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var sourceMap: js.UndefOr[Buffer] = js.native
    
    var supports: js.UndefOr[String] = js.native
  }
  
  type CssModuleConstructor = Instantiable1[/* dependency */ CssModuleDependency, CssModule]
  
  trait CssModuleDependency extends StObject {
    
    var assets: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var assetsInfo: js.UndefOr[Map[String, typings.webpack.mod.AssetInfo]] = js.undefined
    
    var content: Buffer
    
    var context: String | Null
    
    var identifier: String
    
    var identifierIndex: Double
    
    var layer: js.UndefOr[TODO] = js.undefined
    
    var media: js.UndefOr[String] = js.undefined
    
    var sourceMap: js.UndefOr[Buffer] = js.undefined
    
    var supports: js.UndefOr[String] = js.undefined
  }
  object CssModuleDependency {
    
    inline def apply(content: Buffer, identifier: String, identifierIndex: Double): CssModuleDependency = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], identifierIndex = identifierIndex.asInstanceOf[js.Any], context = null)
      __obj.asInstanceOf[CssModuleDependency]
    }
    
    extension [Self <: CssModuleDependency](x: Self) {
      
      inline def setAssets(value: StringDictionary[Any]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
      
      inline def setAssetsInfo(value: Map[String, typings.webpack.mod.AssetInfo]): Self = StObject.set(x, "assetsInfo", value.asInstanceOf[js.Any])
      
      inline def setAssetsInfoUndefined: Self = StObject.set(x, "assetsInfo", js.undefined)
      
      inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextNull: Self = StObject.set(x, "context", null)
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierIndex(value: Double): Self = StObject.set(x, "identifierIndex", value.asInstanceOf[js.Any])
      
      inline def setLayer(value: TODO): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setSourceMap(value: Buffer): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setSupports(value: String): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
      
      inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
    }
  }
  
  type Dependency = typings.webpack.mod.Dependency
  
  type LoaderDependency = typings.miniCssExtractPlugin.typesLoaderMod.Dependency
  
  trait LoaderOptions extends StObject {
    
    var emit: js.UndefOr[Boolean] = js.undefined
    
    var esModule: js.UndefOr[Boolean] = js.undefined
    
    var layer: js.UndefOr[String] = js.undefined
    
    var publicPath: js.UndefOr[
        String | (js.Function2[/* resourcePath */ String, /* rootContext */ String, String])
      ] = js.undefined
  }
  object LoaderOptions {
    
    inline def apply(): LoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderOptions]
    }
    
    extension [Self <: LoaderOptions](x: Self) {
      
      inline def setEmit(value: Boolean): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
      
      inline def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
      
      inline def setEsModule(value: Boolean): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
      
      inline def setEsModuleUndefined: Self = StObject.set(x, "esModule", js.undefined)
      
      inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
      
      inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
      
      inline def setPublicPath(value: String | (js.Function2[/* resourcePath */ String, /* rootContext */ String, String])): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPathFunction2(value: (/* resourcePath */ String, /* rootContext */ String) => String): Self = StObject.set(x, "publicPath", js.Any.fromFunction2(value))
      
      inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    }
  }
  
  trait MiniCssExtractPlugin extends StObject {
    
    /**
      * @private
      * @type {WeakMap<Chunk, Set<CssModule>>}
      * @private
      */
    /* private */ var _sortedModulesCache: Any
    
    /**
      * @param {Compiler} compiler
      */
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    /**
      * @private
      * @param {Chunk} chunk
      * @param {ChunkGraph} chunkGraph
      * @returns {Iterable<Module>}
      */
    /* private */ var getChunkModules: Any
    
    /**
      * @private
      * @type {NormalizedPluginOptions}
      */
    /* private */ var options: Any
    
    /**
      * @private
      * @param {Compiler} compiler
      * @param {Compilation} compilation
      * @param {Chunk} chunk
      * @param {CssModule[]} modules
      * @param {Compiler["requestShortener"]} requestShortener
      * @param {string} filenameTemplate
      * @param {Parameters<Exclude<Required<Configuration>['output']['filename'], string | undefined>>[0]} pathData
      * @returns {Source}
      */
    /* private */ var renderContentAsset: Any
    
    /**
      * @private
      * @type {RuntimeOptions}
      */
    /* private */ var runtimeOptions: Any
    
    /**
      * @private
      * @param {Compilation} compilation
      * @param {Chunk} chunk
      * @param {CssModule[]} modules
      * @param {Compilation["requestShortener"]} requestShortener
      * @returns {Set<CssModule>}
      */
    /* private */ var sortModules: Any
  }
  object MiniCssExtractPlugin {
    
    inline def apply(
      _sortedModulesCache: Any,
      apply: Compiler => Unit,
      getChunkModules: Any,
      options: Any,
      renderContentAsset: Any,
      runtimeOptions: Any,
      sortModules: Any
    ): MiniCssExtractPlugin = {
      val __obj = js.Dynamic.literal(_sortedModulesCache = _sortedModulesCache.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), getChunkModules = getChunkModules.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], renderContentAsset = renderContentAsset.asInstanceOf[js.Any], runtimeOptions = runtimeOptions.asInstanceOf[js.Any], sortModules = sortModules.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiniCssExtractPlugin]
    }
    
    extension [Self <: MiniCssExtractPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setGetChunkModules(value: Any): Self = StObject.set(x, "getChunkModules", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRenderContentAsset(value: Any): Self = StObject.set(x, "renderContentAsset", value.asInstanceOf[js.Any])
      
      inline def setRuntimeOptions(value: Any): Self = StObject.set(x, "runtimeOptions", value.asInstanceOf[js.Any])
      
      inline def setSortModules(value: Any): Self = StObject.set(x, "sortModules", value.asInstanceOf[js.Any])
      
      inline def set_sortedModulesCache(value: Any): Self = StObject.set(x, "_sortedModulesCache", value.asInstanceOf[js.Any])
    }
  }
  
  type Module = typings.webpack.mod.Module
  
  trait NormalizedPluginOptions extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var chunkFilename: js.UndefOr[
        String | (js.Function2[
          /* pathData */ PathData, 
          /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo], 
          String
        ])
      ] = js.undefined
    
    var experimentalUseImportModule: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[
        String | (js.Function2[
          /* pathData */ PathData, 
          /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo], 
          String
        ])
      ] = js.undefined
    
    var ignoreOrder: Boolean
    
    var insert: js.UndefOr[String | (js.Function1[/* linkTag */ HTMLLinkElement, Unit])] = js.undefined
    
    var linkType: js.UndefOr[String | `false`] = js.undefined
    
    var runtime: Boolean
  }
  object NormalizedPluginOptions {
    
    inline def apply(ignoreOrder: Boolean, runtime: Boolean): NormalizedPluginOptions = {
      val __obj = js.Dynamic.literal(ignoreOrder = ignoreOrder.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedPluginOptions]
    }
    
    extension [Self <: NormalizedPluginOptions](x: Self) {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setChunkFilename(
        value: String | (js.Function2[
              /* pathData */ PathData, 
              /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo], 
              String
            ])
      ): Self = StObject.set(x, "chunkFilename", value.asInstanceOf[js.Any])
      
      inline def setChunkFilenameFunction2(
        value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo]) => String
      ): Self = StObject.set(x, "chunkFilename", js.Any.fromFunction2(value))
      
      inline def setChunkFilenameUndefined: Self = StObject.set(x, "chunkFilename", js.undefined)
      
      inline def setExperimentalUseImportModule(value: Boolean): Self = StObject.set(x, "experimentalUseImportModule", value.asInstanceOf[js.Any])
      
      inline def setExperimentalUseImportModuleUndefined: Self = StObject.set(x, "experimentalUseImportModule", js.undefined)
      
      inline def setFilename(
        value: String | (js.Function2[
              /* pathData */ PathData, 
              /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo], 
              String
            ])
      ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameFunction2(
        value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo]) => String
      ): Self = StObject.set(x, "filename", js.Any.fromFunction2(value))
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setIgnoreOrder(value: Boolean): Self = StObject.set(x, "ignoreOrder", value.asInstanceOf[js.Any])
      
      inline def setInsert(value: String | (js.Function1[/* linkTag */ HTMLLinkElement, Unit])): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertFunction1(value: /* linkTag */ HTMLLinkElement => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setLinkType(value: String | `false`): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
      
      inline def setRuntime(value: Boolean): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    }
  }
  
  trait PluginOptions extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var chunkFilename: js.UndefOr[
        String | (js.Function2[
          /* pathData */ PathData, 
          /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo], 
          String
        ])
      ] = js.undefined
    
    var experimentalUseImportModule: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[
        String | (js.Function2[
          /* pathData */ PathData, 
          /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo], 
          String
        ])
      ] = js.undefined
    
    var ignoreOrder: js.UndefOr[Boolean] = js.undefined
    
    var insert: js.UndefOr[String | (js.Function1[/* linkTag */ HTMLLinkElement, Unit])] = js.undefined
    
    var linkType: js.UndefOr[String | `false`] = js.undefined
    
    var runtime: js.UndefOr[Boolean] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setChunkFilename(
        value: String | (js.Function2[
              /* pathData */ PathData, 
              /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo], 
              String
            ])
      ): Self = StObject.set(x, "chunkFilename", value.asInstanceOf[js.Any])
      
      inline def setChunkFilenameFunction2(
        value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo]) => String
      ): Self = StObject.set(x, "chunkFilename", js.Any.fromFunction2(value))
      
      inline def setChunkFilenameUndefined: Self = StObject.set(x, "chunkFilename", js.undefined)
      
      inline def setExperimentalUseImportModule(value: Boolean): Self = StObject.set(x, "experimentalUseImportModule", value.asInstanceOf[js.Any])
      
      inline def setExperimentalUseImportModuleUndefined: Self = StObject.set(x, "experimentalUseImportModule", js.undefined)
      
      inline def setFilename(
        value: String | (js.Function2[
              /* pathData */ PathData, 
              /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo], 
              String
            ])
      ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameFunction2(
        value: (/* pathData */ PathData, /* assetInfo */ js.UndefOr[typings.webpack.mod.AssetInfo]) => String
      ): Self = StObject.set(x, "filename", js.Any.fromFunction2(value))
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setIgnoreOrder(value: Boolean): Self = StObject.set(x, "ignoreOrder", value.asInstanceOf[js.Any])
      
      inline def setIgnoreOrderUndefined: Self = StObject.set(x, "ignoreOrder", js.undefined)
      
      inline def setInsert(value: String | (js.Function1[/* linkTag */ HTMLLinkElement, Unit])): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertFunction1(value: /* linkTag */ HTMLLinkElement => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setLinkType(value: String | `false`): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
      
      inline def setRuntime(value: Boolean): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
      
      inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    }
  }
  
  trait RuntimeOptions extends StObject {
    
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    var insert: js.UndefOr[String | (js.Function1[/* linkTag */ HTMLLinkElement, Unit])] = js.undefined
    
    var linkType: String | `false` | textSlashcss
  }
  object RuntimeOptions {
    
    inline def apply(linkType: String | `false` | textSlashcss): RuntimeOptions = {
      val __obj = js.Dynamic.literal(linkType = linkType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeOptions]
    }
    
    extension [Self <: RuntimeOptions](x: Self) {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setInsert(value: String | (js.Function1[/* linkTag */ HTMLLinkElement, Unit])): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertFunction1(value: /* linkTag */ HTMLLinkElement => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setLinkType(value: String | `false` | textSlashcss): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    }
  }
  
  type Schema = typings.schemaUtils.declarationsValidateMod.Schema
  
  type Source = typings.webpack.mod.Source
  
  type TODO = Any
  
  type WebpackError = typings.webpack.mod.WebpackError
}
