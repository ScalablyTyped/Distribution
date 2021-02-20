package typings.optimizeCssAssetsWebpackPlugin

import typings.optimizeCssAssetsWebpackPlugin.anon.Process
import typings.std.Plugin
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("optimize-css-assets-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin {
    def this(options: Options) = this()
  }
  
  type OptimizeCssAssetsPlugin = Plugin
  
  @js.native
  trait Options extends StObject {
    
    /**
      * A regular expression that indicates the names of the assets that should
      * be optimized \ minimized. The regular expression provided is run against
      * the filenames of the files exported by the `ExtractTextPlugin` instances
      * in your configuration, not the filenames of your source CSS files
      *
      * @default /\.css$/g
      */
    var assetNameRegExp: js.UndefOr[RegExp] = js.native
    
    /**
      * A boolean indicating if the plugin can print messages to the console.
      *
      * @default true
      */
    var canPrint: js.UndefOr[Boolean] = js.native
    
    /**
      * The CSS processor used to optimize \ minimize the CSS. This should be a
      * function that follows `cssnano.process` interface (receives a CSS and
      * options parameters and returns a Promise).
      *
      * @default cssnano
      */
    var cssProcessor: js.UndefOr[Process] = js.native
    
    /**
      * The options passed to the `cssProcessor`.
      *
      * @default {}
      */
    var cssProcessorOptions: js.UndefOr[js.Object] = js.native
    
    /**
      * The plugin options passed to the `cssProcessor`.
      *
      * @default {}
      */
    var cssProcessorPluginOptions: js.UndefOr[js.Object] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssetNameRegExp(value: RegExp): Self = StObject.set(x, "assetNameRegExp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetNameRegExpUndefined: Self = StObject.set(x, "assetNameRegExp", js.undefined)
      
      @scala.inline
      def setCanPrint(value: Boolean): Self = StObject.set(x, "canPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanPrintUndefined: Self = StObject.set(x, "canPrint", js.undefined)
      
      @scala.inline
      def setCssProcessor(value: Process): Self = StObject.set(x, "cssProcessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssProcessorOptions(value: js.Object): Self = StObject.set(x, "cssProcessorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssProcessorOptionsUndefined: Self = StObject.set(x, "cssProcessorOptions", js.undefined)
      
      @scala.inline
      def setCssProcessorPluginOptions(value: js.Object): Self = StObject.set(x, "cssProcessorPluginOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssProcessorPluginOptionsUndefined: Self = StObject.set(x, "cssProcessorPluginOptions", js.undefined)
      
      @scala.inline
      def setCssProcessorUndefined: Self = StObject.set(x, "cssProcessor", js.undefined)
    }
  }
}
