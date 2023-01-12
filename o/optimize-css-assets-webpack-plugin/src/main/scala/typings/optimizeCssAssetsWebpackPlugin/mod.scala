package typings.optimizeCssAssetsWebpackPlugin

import typings.optimizeCssAssetsWebpackPlugin.anon.Process
import typings.webpack.mod.Compiler
import typings.webpack.mod.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("optimize-css-assets-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with OptimizeCssAssetsPlugin {
    def this(options: Options) = this()
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  trait OptimizeCssAssetsPlugin
    extends StObject
       with WebpackPluginInstance
  object OptimizeCssAssetsPlugin {
    
    inline def apply(apply: Compiler => Unit): OptimizeCssAssetsPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[OptimizeCssAssetsPlugin]
    }
  }
  
  trait Options extends StObject {
    
    /**
      * A regular expression that indicates the names of the assets that should
      * be optimized \ minimized. The regular expression provided is run against
      * the filenames of the files exported by the `ExtractTextPlugin` instances
      * in your configuration, not the filenames of your source CSS files
      *
      * @default /\.css$/g
      */
    var assetNameRegExp: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * A boolean indicating if the plugin can print messages to the console.
      *
      * @default true
      */
    var canPrint: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The CSS processor used to optimize \ minimize the CSS. This should be a
      * function that follows `cssnano.process` interface (receives a CSS and
      * options parameters and returns a Promise).
      *
      * @default cssnano
      */
    var cssProcessor: js.UndefOr[Process] = js.undefined
    
    /**
      * The options passed to the `cssProcessor`.
      *
      * @default {}
      */
    var cssProcessorOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The plugin options passed to the `cssProcessor`.
      *
      * @default {}
      */
    var cssProcessorPluginOptions: js.UndefOr[js.Object] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAssetNameRegExp(value: js.RegExp): Self = StObject.set(x, "assetNameRegExp", value.asInstanceOf[js.Any])
      
      inline def setAssetNameRegExpUndefined: Self = StObject.set(x, "assetNameRegExp", js.undefined)
      
      inline def setCanPrint(value: Boolean): Self = StObject.set(x, "canPrint", value.asInstanceOf[js.Any])
      
      inline def setCanPrintUndefined: Self = StObject.set(x, "canPrint", js.undefined)
      
      inline def setCssProcessor(value: Process): Self = StObject.set(x, "cssProcessor", value.asInstanceOf[js.Any])
      
      inline def setCssProcessorOptions(value: js.Object): Self = StObject.set(x, "cssProcessorOptions", value.asInstanceOf[js.Any])
      
      inline def setCssProcessorOptionsUndefined: Self = StObject.set(x, "cssProcessorOptions", js.undefined)
      
      inline def setCssProcessorPluginOptions(value: js.Object): Self = StObject.set(x, "cssProcessorPluginOptions", value.asInstanceOf[js.Any])
      
      inline def setCssProcessorPluginOptionsUndefined: Self = StObject.set(x, "cssProcessorPluginOptions", js.undefined)
      
      inline def setCssProcessorUndefined: Self = StObject.set(x, "cssProcessor", js.undefined)
    }
  }
}
