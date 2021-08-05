package typings.poi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.connectHistoryApiFallback.mod.Options
import typings.express.mod.Application_
import typings.node.httpsMod.ServerOptions
import typings.poi.anon.PartialOptionsentrystring
import typings.poi.mod.Config.Assets
import typings.poi.mod.Config.Babel
import typings.poi.mod.Config.Babel.NamedImportsOptions
import typings.poi.mod.Config.ChainWebpack
import typings.poi.mod.Config.ConfigureWebpack
import typings.poi.mod.Config.Constants
import typings.poi.mod.Config.Css
import typings.poi.mod.Config.Css.LoaderOptions
import typings.poi.mod.Config.DevServer
import typings.poi.mod.Config.Entry
import typings.poi.mod.Config.Envs
import typings.poi.mod.Config.Output
import typings.poi.mod.Config.Output.FileNames
import typings.poi.mod.Config.Output.Html
import typings.poi.mod.Config.Pages
import typings.poi.mod.Config.Plugins
import typings.poi.mod.Config.PublicFolder
import typings.poi.poiStrings.`async-node`
import typings.poi.poiStrings.`electron-main`
import typings.poi.poiStrings.`electron-renderer`
import typings.poi.poiStrings.`node-webkit`
import typings.poi.poiStrings.cjs
import typings.poi.poiStrings.electron
import typings.poi.poiStrings.iife
import typings.poi.poiStrings.node
import typings.poi.poiStrings.umd
import typings.poi.poiStrings.web
import typings.poi.poiStrings.webworker
import typings.webpackDevServer.mod.ProxyConfigArray
import typings.webpackDevServer.mod.ProxyConfigArrayItem
import typings.webpackDevServer.mod.ProxyConfigMap
import typings.webpackDevServer.mod.WebpackDevServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://poi.js.org/config.html
  */
trait Config extends StObject {
  
  var assets: js.UndefOr[Assets] = js.undefined
  
  var babel: js.UndefOr[Babel] = js.undefined
  
  var chainWebpack: js.UndefOr[ChainWebpack] = js.undefined
  
  var configureWebpack: js.UndefOr[ConfigureWebpack] = js.undefined
  
  var constants: js.UndefOr[Constants] = js.undefined
  
  var css: js.UndefOr[Css] = js.undefined
  
  var devServer: js.UndefOr[DevServer] = js.undefined
  
  var entry: js.UndefOr[Entry] = js.undefined
  
  var envs: js.UndefOr[Envs] = js.undefined
  
  var output: js.UndefOr[Output] = js.undefined
  
  var pages: js.UndefOr[Pages] = js.undefined
  
  var plugins: js.UndefOr[Plugins] = js.undefined
  
  var publicFolder: js.UndefOr[PublicFolder] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  trait Assets extends StObject {
    
    var inlineImageMaxSize: js.UndefOr[Double] = js.undefined
  }
  object Assets {
    
    inline def apply(): Assets = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Assets]
    }
    
    extension [Self <: Assets](x: Self) {
      
      inline def setInlineImageMaxSize(value: Double): Self = StObject.set(x, "inlineImageMaxSize", value.asInstanceOf[js.Any])
      
      inline def setInlineImageMaxSizeUndefined: Self = StObject.set(x, "inlineImageMaxSize", js.undefined)
    }
  }
  
  trait Babel extends StObject {
    
    var jsx: js.UndefOr[String] = js.undefined
    
    var namedImports: js.UndefOr[String | NamedImportsOptions] = js.undefined
    
    var transpileModules: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Babel {
    
    inline def apply(): Babel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Babel]
    }
    
    extension [Self <: Babel](x: Self) {
      
      inline def setJsx(value: String): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      inline def setNamedImports(value: String | NamedImportsOptions): Self = StObject.set(x, "namedImports", value.asInstanceOf[js.Any])
      
      inline def setNamedImportsUndefined: Self = StObject.set(x, "namedImports", js.undefined)
      
      inline def setTranspileModules(value: String | js.Array[String]): Self = StObject.set(x, "transpileModules", value.asInstanceOf[js.Any])
      
      inline def setTranspileModulesUndefined: Self = StObject.set(x, "transpileModules", js.undefined)
      
      inline def setTranspileModulesVarargs(value: String*): Self = StObject.set(x, "transpileModules", js.Array(value :_*))
    }
    
    type NamedImportsOptions = StringDictionary[StringDictionary[String]]
  }
  
  type ChainWebpack = js.Function2[/* config */ typings.webpackChain.mod.^, /* opts */ Opts, Unit]
  
  extension [Self <: Config](x: Self) {
    
    inline def setAssets(value: Assets): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setBabel(value: Babel): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
    
    inline def setBabelUndefined: Self = StObject.set(x, "babel", js.undefined)
    
    inline def setChainWebpack(value: (/* config */ typings.webpackChain.mod.^, /* opts */ Opts) => Unit): Self = StObject.set(x, "chainWebpack", js.Any.fromFunction2(value))
    
    inline def setChainWebpackUndefined: Self = StObject.set(x, "chainWebpack", js.undefined)
    
    inline def setConfigureWebpack(value: ConfigureWebpack): Self = StObject.set(x, "configureWebpack", value.asInstanceOf[js.Any])
    
    inline def setConfigureWebpackFunction2(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ /* config */ js.Any, /* opts */ Opts) => Unit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ js.Any)
    ): Self = StObject.set(x, "configureWebpack", js.Any.fromFunction2(value))
    
    inline def setConfigureWebpackUndefined: Self = StObject.set(x, "configureWebpack", js.undefined)
    
    inline def setConstants(value: Constants): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    
    inline def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
    
    inline def setCss(value: Css): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDevServer(value: DevServer): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
    
    inline def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
    
    inline def setEntry(value: Entry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setEnvs(value: Envs): Self = StObject.set(x, "envs", value.asInstanceOf[js.Any])
    
    inline def setEnvsUndefined: Self = StObject.set(x, "envs", js.undefined)
    
    inline def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setPages(value: Pages): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPlugins(value: Plugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: (String | PluginOption)*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    inline def setPublicFolder(value: PublicFolder): Self = StObject.set(x, "publicFolder", value.asInstanceOf[js.Any])
    
    inline def setPublicFolderUndefined: Self = StObject.set(x, "publicFolder", js.undefined)
  }
  
  type ConfigureWebpack = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ js.Any) | (js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ /* config */ js.Any, 
    /* opts */ Opts, 
    Unit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ js.Any)
  ])
  
  type Constants = StringDictionary[String]
  
  trait Css extends StObject {
    
    var extract: js.UndefOr[Boolean] = js.undefined
    
    var loaderOptions: js.UndefOr[LoaderOptions] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
  }
  object Css {
    
    inline def apply(): Css = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Css]
    }
    
    extension [Self <: Css](x: Self) {
      
      inline def setExtract(value: Boolean): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      inline def setLoaderOptions(value: LoaderOptions): Self = StObject.set(x, "loaderOptions", value.asInstanceOf[js.Any])
      
      inline def setLoaderOptionsUndefined: Self = StObject.set(x, "loaderOptions", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
    
    trait LoaderOptions extends StObject {
      
      var css: js.UndefOr[js.Any] = js.undefined
      
      var less: js.UndefOr[js.Any] = js.undefined
      
      var postcss: js.UndefOr[js.Any] = js.undefined
      
      var sass: js.UndefOr[js.Any] = js.undefined
      
      var stylus: js.UndefOr[js.Any] = js.undefined
    }
    object LoaderOptions {
      
      inline def apply(): LoaderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LoaderOptions]
      }
      
      extension [Self <: LoaderOptions](x: Self) {
        
        inline def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        
        inline def setLess(value: js.Any): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
        
        inline def setLessUndefined: Self = StObject.set(x, "less", js.undefined)
        
        inline def setPostcss(value: js.Any): Self = StObject.set(x, "postcss", value.asInstanceOf[js.Any])
        
        inline def setPostcssUndefined: Self = StObject.set(x, "postcss", js.undefined)
        
        inline def setSass(value: js.Any): Self = StObject.set(x, "sass", value.asInstanceOf[js.Any])
        
        inline def setSassUndefined: Self = StObject.set(x, "sass", js.undefined)
        
        inline def setStylus(value: js.Any): Self = StObject.set(x, "stylus", value.asInstanceOf[js.Any])
        
        inline def setStylusUndefined: Self = StObject.set(x, "stylus", js.undefined)
      }
    }
  }
  
  trait DevServer extends StObject {
    
    var after: js.UndefOr[
        js.Function3[
          /* app */ Application_, 
          /* server */ WebpackDevServer, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var before: js.UndefOr[
        js.Function3[
          /* app */ Application_, 
          /* server */ WebpackDevServer, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var historyApiFallback: js.UndefOr[Boolean | Options] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hot: js.UndefOr[Boolean] = js.undefined
    
    var hotEntries: js.UndefOr[js.Array[String]] = js.undefined
    
    var hotOnly: js.UndefOr[Boolean] = js.undefined
    
    var https: js.UndefOr[Boolean | ServerOptions] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var port: js.UndefOr[String | Double] = js.undefined
    
    var proxy: js.UndefOr[String | ProxyConfigMap | ProxyConfigArray] = js.undefined
  }
  object DevServer {
    
    inline def apply(): DevServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DevServer]
    }
    
    extension [Self <: DevServer](x: Self) {
      
      inline def setAfter(
        value: (/* app */ Application_, /* server */ WebpackDevServer, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any) => Unit
      ): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(
        value: (/* app */ Application_, /* server */ WebpackDevServer, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any) => Unit
      ): Self = StObject.set(x, "before", js.Any.fromFunction3(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHistoryApiFallback(value: Boolean | Options): Self = StObject.set(x, "historyApiFallback", value.asInstanceOf[js.Any])
      
      inline def setHistoryApiFallbackUndefined: Self = StObject.set(x, "historyApiFallback", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setHotEntries(value: js.Array[String]): Self = StObject.set(x, "hotEntries", value.asInstanceOf[js.Any])
      
      inline def setHotEntriesUndefined: Self = StObject.set(x, "hotEntries", js.undefined)
      
      inline def setHotEntriesVarargs(value: String*): Self = StObject.set(x, "hotEntries", js.Array(value :_*))
      
      inline def setHotOnly(value: Boolean): Self = StObject.set(x, "hotOnly", value.asInstanceOf[js.Any])
      
      inline def setHotOnlyUndefined: Self = StObject.set(x, "hotOnly", js.undefined)
      
      inline def setHotUndefined: Self = StObject.set(x, "hot", js.undefined)
      
      inline def setHttps(value: Boolean | ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProxy(value: String | ProxyConfigMap | ProxyConfigArray): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setProxyVarargs(value: ProxyConfigArrayItem*): Self = StObject.set(x, "proxy", js.Array(value :_*))
    }
  }
  
  type Entry = /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig * / any['entry'] */ js.Any
  
  type Envs = StringDictionary[String]
  
  trait Output extends StObject {
    
    var clean: js.UndefOr[Boolean] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var fileNames: js.UndefOr[FileNames] = js.undefined
    
    var format: js.UndefOr[iife | cjs | umd] = js.undefined
    
    var html: js.UndefOr[Html] = js.undefined
    
    var minimize: js.UndefOr[Boolean] = js.undefined
    
    var moduleName: js.UndefOr[String] = js.undefined
    
    var publicUrl: js.UndefOr[String] = js.undefined
    
    var sourceMap: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[
        web | electron | `electron-renderer` | `electron-main` | node | `node-webkit` | `async-node` | webworker
      ] = js.undefined
  }
  object Output {
    
    inline def apply(): Output = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Output]
    }
    
    trait FileNames extends StObject {
      
      var css: js.UndefOr[String] = js.undefined
      
      var font: js.UndefOr[String] = js.undefined
      
      var image: js.UndefOr[String] = js.undefined
      
      @JSName("js")
      var js_ : js.UndefOr[String] = js.undefined
    }
    object FileNames {
      
      inline def apply(): FileNames = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileNames]
      }
      
      extension [Self <: FileNames](x: Self) {
        
        inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        
        inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
        
        inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
        
        inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        inline def setJs_(value: String): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
        
        inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      }
    }
    
    type Html = Boolean | HtmlOptions
    
    trait HtmlOptions extends StObject {
      
      var filename: js.UndefOr[String] = js.undefined
      
      var inject: js.UndefOr[Boolean] = js.undefined
      
      var template: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object HtmlOptions {
      
      inline def apply(): HtmlOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HtmlOptions]
      }
      
      extension [Self <: HtmlOptions](x: Self) {
        
        inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
        
        inline def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
        
        inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
        
        inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    extension [Self <: Output](x: Self) {
      
      inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setFileNames(value: FileNames): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
      
      inline def setFileNamesUndefined: Self = StObject.set(x, "fileNames", js.undefined)
      
      inline def setFormat(value: iife | cjs | umd): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHtml(value: Html): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      inline def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
      
      inline def setPublicUrl(value: String): Self = StObject.set(x, "publicUrl", value.asInstanceOf[js.Any])
      
      inline def setPublicUrlUndefined: Self = StObject.set(x, "publicUrl", js.undefined)
      
      inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      inline def setTarget(
        value: web | electron | `electron-renderer` | `electron-main` | node | `node-webkit` | `async-node` | webworker
      ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type Pages = StringDictionary[String | PartialOptionsentrystring]
  
  trait PluginOption extends StObject {
    
    var options: js.UndefOr[js.Any] = js.undefined
    
    var resolve: String
  }
  object PluginOption {
    
    inline def apply(resolve: String): PluginOption = {
      val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginOption]
    }
    
    extension [Self <: PluginOption](x: Self) {
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setResolve(value: String): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  type Plugins = js.Array[String | PluginOption]
  
  type PublicFolder = String | Boolean
}
