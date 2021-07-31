package typings.miniCssExtractPlugin

import typings.miniCssExtractPlugin.miniCssExtractPluginStrings.textSlashcss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Lightweight CSS extraction webpack plugin
    * This plugin extract CSS into separate files. It creates a CSS file per JS file which contains CSS. It supports On-Demand-Loading of CSS and SourceMaps.
    * Configuration Detail: https://github.com/webpack-contrib/mini-css-extract-plugin#configuration
    */
  @JSImport("mini-css-extract-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with MiniCssExtractPlugin {
    def this(options: PluginOptions) = this()
    
    /**
      * Apply the plugin
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  @JSImport("mini-css-extract-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Webpack loader used always at the end of loaders list
    */
  /* static member */
  @JSImport("mini-css-extract-plugin", "loader")
  @js.native
  def loader: String = js.native
  @scala.inline
  def loader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loader")(x.asInstanceOf[js.Any])
  
  /**
    * Lightweight CSS extraction webpack plugin
    * This plugin extract CSS into separate files. It creates a CSS file per JS file which contains CSS. It supports On-Demand-Loading of CSS and SourceMaps.
    * Configuration Detail: https://github.com/webpack-contrib/mini-css-extract-plugin#configuration
    */
  trait MiniCssExtractPlugin extends StObject {
    
    /**
      * Apply the plugin
      */
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit
  }
  object MiniCssExtractPlugin {
    
    @scala.inline
    def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
    ): MiniCssExtractPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[MiniCssExtractPlugin]
    }
    
    @scala.inline
    implicit class MiniCssExtractPluginMutableBuilder[Self <: MiniCssExtractPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  trait PluginOptions extends StObject {
    
    var chunkFilename: js.UndefOr[String] = js.undefined
    
    /**
      * By default, `mini-css-extract-plugin` generates JS modules that use the ES modules syntax.
      * There are some cases in which using ES modules is beneficial,
      * like in the case of module concatenation and tree shaking.
      * @default true
      */
    var esModule: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options similar to the same options in webpackOptions.output, both options are optional
      * May contain `[name]`, `[id]`, `hash` and `[chunkhash]`
      * With the filename option you can use chunk data to customize the filename.
      * This is particularly useful when dealing with multiple entry points and wanting to get more control out of the filename for a given entry point/chunk.
      * In the example below, we'll use filename to output the generated css into a different directory.
      */
    var filename: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Required</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration * / any>['output']['filename'] */ js.Any
      ] = js.undefined
    
    /**
      * For projects where CSS ordering has been mitigated through consistent
      * use of scoping or naming conventions, the CSS order warnings can be
      * disabled by setting this flag to true for the plugin.
      */
    var ignoreOrder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This option allows loading asynchronous chunks with a custom link type, such as <link type="text/css" ...>.
      * `false` disables the link `type` attribute
      * @default `text/css`
      */
    var linkType: js.UndefOr[Boolean | textSlashcss] = js.undefined
  }
  object PluginOptions {
    
    @scala.inline
    def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit class PluginOptionsMutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChunkFilename(value: String): Self = StObject.set(x, "chunkFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkFilenameUndefined: Self = StObject.set(x, "chunkFilename", js.undefined)
      
      @scala.inline
      def setEsModule(value: Boolean): Self = StObject.set(x, "esModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEsModuleUndefined: Self = StObject.set(x, "esModule", js.undefined)
      
      @scala.inline
      def setFilename(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Required</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Configuration * / any>['output']['filename'] */ js.Any
      ): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setIgnoreOrder(value: Boolean): Self = StObject.set(x, "ignoreOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreOrderUndefined: Self = StObject.set(x, "ignoreOrder", js.undefined)
      
      @scala.inline
      def setLinkType(value: Boolean | textSlashcss): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
    }
  }
}
