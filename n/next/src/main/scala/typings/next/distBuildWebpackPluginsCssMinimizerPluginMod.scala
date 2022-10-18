package typings.next

import typings.next.anon.Map
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsCssMinimizerPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/css-minimizer-plugin", "CssMinimizerPlugin")
  @js.native
  open class CssMinimizerPlugin protected () extends StObject {
    def this(options: CssMinimizerPluginOptions) = this()
    
    var __next_css_remove: Boolean = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    def optimizeAsset(file: String, asset: Any): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack-sources1.RawSource */ Any
      ] = js.native
    
    /* private */ var options: Any = js.native
  }
  
  trait CssMinimizerPluginOptions extends StObject {
    
    var postcssOptions: Map
  }
  object CssMinimizerPluginOptions {
    
    inline def apply(postcssOptions: Map): CssMinimizerPluginOptions = {
      val __obj = js.Dynamic.literal(postcssOptions = postcssOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssMinimizerPluginOptions]
    }
    
    extension [Self <: CssMinimizerPluginOptions](x: Self) {
      
      inline def setPostcssOptions(value: Map): Self = StObject.set(x, "postcssOptions", value.asInstanceOf[js.Any])
    }
  }
}
