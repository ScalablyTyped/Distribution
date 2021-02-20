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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://poi.js.org/config.html
  */
@js.native
trait Config extends StObject {
  
  var assets: js.UndefOr[Assets] = js.native
  
  var babel: js.UndefOr[Babel] = js.native
  
  var chainWebpack: js.UndefOr[ChainWebpack] = js.native
  
  var configureWebpack: js.UndefOr[ConfigureWebpack] = js.native
  
  var constants: js.UndefOr[Constants] = js.native
  
  var css: js.UndefOr[Css] = js.native
  
  var devServer: js.UndefOr[DevServer] = js.native
  
  var entry: js.UndefOr[Entry] = js.native
  
  var envs: js.UndefOr[Envs] = js.native
  
  var output: js.UndefOr[Output] = js.native
  
  var pages: js.UndefOr[Pages] = js.native
  
  var plugins: js.UndefOr[Plugins] = js.native
  
  var publicFolder: js.UndefOr[PublicFolder] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @js.native
  trait Assets extends StObject {
    
    var inlineImageMaxSize: js.UndefOr[Double] = js.native
  }
  object Assets {
    
    @scala.inline
    def apply(): Assets = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Assets]
    }
    
    @scala.inline
    implicit class AssetsMutableBuilder[Self <: Assets] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInlineImageMaxSize(value: Double): Self = StObject.set(x, "inlineImageMaxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineImageMaxSizeUndefined: Self = StObject.set(x, "inlineImageMaxSize", js.undefined)
    }
  }
  
  @js.native
  trait Babel extends StObject {
    
    var jsx: js.UndefOr[String] = js.native
    
    var namedImports: js.UndefOr[String | NamedImportsOptions] = js.native
    
    var transpileModules: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Babel {
    
    @scala.inline
    def apply(): Babel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Babel]
    }
    
    @scala.inline
    implicit class BabelMutableBuilder[Self <: Babel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJsx(value: String): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
      
      @scala.inline
      def setNamedImports(value: String | NamedImportsOptions): Self = StObject.set(x, "namedImports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedImportsUndefined: Self = StObject.set(x, "namedImports", js.undefined)
      
      @scala.inline
      def setTranspileModules(value: String | js.Array[String]): Self = StObject.set(x, "transpileModules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspileModulesUndefined: Self = StObject.set(x, "transpileModules", js.undefined)
      
      @scala.inline
      def setTranspileModulesVarargs(value: String*): Self = StObject.set(x, "transpileModules", js.Array(value :_*))
    }
    
    type NamedImportsOptions = StringDictionary[StringDictionary[String]]
  }
  
  type ChainWebpack = js.Function2[/* config */ typings.webpackChain.mod.^, /* opts */ Opts, Unit]
  
  @scala.inline
  implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: Assets): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    @scala.inline
    def setBabel(value: Babel): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBabelUndefined: Self = StObject.set(x, "babel", js.undefined)
    
    @scala.inline
    def setChainWebpack(value: (/* config */ typings.webpackChain.mod.^, /* opts */ Opts) => Unit): Self = StObject.set(x, "chainWebpack", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChainWebpackUndefined: Self = StObject.set(x, "chainWebpack", js.undefined)
    
    @scala.inline
    def setConfigureWebpack(value: ConfigureWebpack): Self = StObject.set(x, "configureWebpack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigureWebpackFunction2(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ /* config */ js.Any, /* opts */ Opts) => Unit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ js.Any)
    ): Self = StObject.set(x, "configureWebpack", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConfigureWebpackUndefined: Self = StObject.set(x, "configureWebpack", js.undefined)
    
    @scala.inline
    def setConstants(value: Constants): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
    
    @scala.inline
    def setCss(value: Css): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setDevServer(value: DevServer): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
    
    @scala.inline
    def setEntry(value: Entry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    @scala.inline
    def setEnvs(value: Envs): Self = StObject.set(x, "envs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvsUndefined: Self = StObject.set(x, "envs", js.undefined)
    
    @scala.inline
    def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setPages(value: Pages): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    @scala.inline
    def setPlugins(value: Plugins): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (String | PluginOption)*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setPublicFolder(value: PublicFolder): Self = StObject.set(x, "publicFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicFolderUndefined: Self = StObject.set(x, "publicFolder", js.undefined)
  }
  
  type ConfigureWebpack = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ js.Any) | (js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ /* config */ js.Any, 
    /* opts */ Opts, 
    Unit | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig */ js.Any)
  ])
  
  type Constants = StringDictionary[String]
  
  @js.native
  trait Css extends StObject {
    
    var extract: js.UndefOr[Boolean] = js.native
    
    var loaderOptions: js.UndefOr[LoaderOptions] = js.native
    
    var sourceMap: js.UndefOr[Boolean] = js.native
  }
  object Css {
    
    @scala.inline
    def apply(): Css = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Css]
    }
    
    @scala.inline
    implicit class CssMutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtract(value: Boolean): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      @scala.inline
      def setLoaderOptions(value: LoaderOptions): Self = StObject.set(x, "loaderOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderOptionsUndefined: Self = StObject.set(x, "loaderOptions", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
    
    @js.native
    trait LoaderOptions extends StObject {
      
      var css: js.UndefOr[js.Any] = js.native
      
      var less: js.UndefOr[js.Any] = js.native
      
      var postcss: js.UndefOr[js.Any] = js.native
      
      var sass: js.UndefOr[js.Any] = js.native
      
      var stylus: js.UndefOr[js.Any] = js.native
    }
    object LoaderOptions {
      
      @scala.inline
      def apply(): LoaderOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LoaderOptions]
      }
      
      @scala.inline
      implicit class LoaderOptionsMutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        
        @scala.inline
        def setLess(value: js.Any): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLessUndefined: Self = StObject.set(x, "less", js.undefined)
        
        @scala.inline
        def setPostcss(value: js.Any): Self = StObject.set(x, "postcss", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostcssUndefined: Self = StObject.set(x, "postcss", js.undefined)
        
        @scala.inline
        def setSass(value: js.Any): Self = StObject.set(x, "sass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSassUndefined: Self = StObject.set(x, "sass", js.undefined)
        
        @scala.inline
        def setStylus(value: js.Any): Self = StObject.set(x, "stylus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStylusUndefined: Self = StObject.set(x, "stylus", js.undefined)
      }
    }
  }
  
  @js.native
  trait DevServer extends StObject {
    
    var after: js.UndefOr[
        js.Function3[
          /* app */ Application_, 
          /* server */ WebpackDevServer, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var before: js.UndefOr[
        js.Function3[
          /* app */ Application_, 
          /* server */ WebpackDevServer, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var historyApiFallback: js.UndefOr[Boolean | Options] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var hot: js.UndefOr[Boolean] = js.native
    
    var hotEntries: js.UndefOr[js.Array[String]] = js.native
    
    var hotOnly: js.UndefOr[Boolean] = js.native
    
    var https: js.UndefOr[Boolean | ServerOptions] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var port: js.UndefOr[String | Double] = js.native
    
    var proxy: js.UndefOr[String | ProxyConfigMap | ProxyConfigArray] = js.native
  }
  object DevServer {
    
    @scala.inline
    def apply(): DevServer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DevServer]
    }
    
    @scala.inline
    implicit class DevServerMutableBuilder[Self <: DevServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(
        value: (/* app */ Application_, /* server */ WebpackDevServer, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any) => Unit
      ): Self = StObject.set(x, "after", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(
        value: (/* app */ Application_, /* server */ WebpackDevServer, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ /* compiler */ js.Any) => Unit
      ): Self = StObject.set(x, "before", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHistoryApiFallback(value: Boolean | Options): Self = StObject.set(x, "historyApiFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryApiFallbackUndefined: Self = StObject.set(x, "historyApiFallback", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotEntries(value: js.Array[String]): Self = StObject.set(x, "hotEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotEntriesUndefined: Self = StObject.set(x, "hotEntries", js.undefined)
      
      @scala.inline
      def setHotEntriesVarargs(value: String*): Self = StObject.set(x, "hotEntries", js.Array(value :_*))
      
      @scala.inline
      def setHotOnly(value: Boolean): Self = StObject.set(x, "hotOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotOnlyUndefined: Self = StObject.set(x, "hotOnly", js.undefined)
      
      @scala.inline
      def setHotUndefined: Self = StObject.set(x, "hot", js.undefined)
      
      @scala.inline
      def setHttps(value: Boolean | ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProxy(value: String | ProxyConfigMap | ProxyConfigArray): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setProxyVarargs(value: ProxyConfigArrayItem*): Self = StObject.set(x, "proxy", js.Array(value :_*))
    }
  }
  
  type Entry = /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackConfig * / any['entry'] */ js.Any
  
  type Envs = StringDictionary[String]
  
  @js.native
  trait Output extends StObject {
    
    var clean: js.UndefOr[Boolean] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var fileNames: js.UndefOr[FileNames] = js.native
    
    var format: js.UndefOr[iife | cjs | umd] = js.native
    
    var html: js.UndefOr[Html] = js.native
    
    var minimize: js.UndefOr[Boolean] = js.native
    
    var moduleName: js.UndefOr[String] = js.native
    
    var publicUrl: js.UndefOr[String] = js.native
    
    var sourceMap: js.UndefOr[Boolean] = js.native
    
    var target: js.UndefOr[
        web | electron | `electron-renderer` | `electron-main` | node | `node-webkit` | `async-node` | webworker
      ] = js.native
  }
  object Output {
    
    @scala.inline
    def apply(): Output = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Output]
    }
    
    @js.native
    trait FileNames extends StObject {
      
      var css: js.UndefOr[String] = js.native
      
      var font: js.UndefOr[String] = js.native
      
      var image: js.UndefOr[String] = js.native
      
      @JSName("js")
      var js_ : js.UndefOr[String] = js.native
    }
    object FileNames {
      
      @scala.inline
      def apply(): FileNames = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FileNames]
      }
      
      @scala.inline
      implicit class FileNamesMutableBuilder[Self <: FileNames] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
        
        @scala.inline
        def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
        
        @scala.inline
        def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
        
        @scala.inline
        def setJs_(value: String): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
      }
    }
    
    type Html = Boolean | HtmlOptions
    
    @js.native
    trait HtmlOptions extends StObject {
      
      var filename: js.UndefOr[String] = js.native
      
      var inject: js.UndefOr[Boolean] = js.native
      
      var template: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object HtmlOptions {
      
      @scala.inline
      def apply(): HtmlOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HtmlOptions]
      }
      
      @scala.inline
      implicit class HtmlOptionsMutableBuilder[Self <: HtmlOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
        
        @scala.inline
        def setInject(value: Boolean): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
        
        @scala.inline
        def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @scala.inline
    implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setFileNames(value: FileNames): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNamesUndefined: Self = StObject.set(x, "fileNames", js.undefined)
      
      @scala.inline
      def setFormat(value: iife | cjs | umd): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHtml(value: Html): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setMinimize(value: Boolean): Self = StObject.set(x, "minimize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimizeUndefined: Self = StObject.set(x, "minimize", js.undefined)
      
      @scala.inline
      def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
      
      @scala.inline
      def setPublicUrl(value: String): Self = StObject.set(x, "publicUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicUrlUndefined: Self = StObject.set(x, "publicUrl", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
      
      @scala.inline
      def setTarget(
        value: web | electron | `electron-renderer` | `electron-main` | node | `node-webkit` | `async-node` | webworker
      ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type Pages = StringDictionary[String | PartialOptionsentrystring]
  
  @js.native
  trait PluginOption extends StObject {
    
    var options: js.UndefOr[js.Any] = js.native
    
    var resolve: String = js.native
  }
  object PluginOption {
    
    @scala.inline
    def apply(resolve: String): PluginOption = {
      val __obj = js.Dynamic.literal(resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginOption]
    }
    
    @scala.inline
    implicit class PluginOptionMutableBuilder[Self <: PluginOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setResolve(value: String): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
  
  type Plugins = js.Array[String | PluginOption]
  
  type PublicFolder = String | Boolean
}
