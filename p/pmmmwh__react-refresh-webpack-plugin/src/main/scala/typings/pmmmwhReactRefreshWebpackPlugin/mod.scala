package typings.pmmmwhReactRefreshWebpackPlugin

import typings.pmmmwhReactRefreshWebpackPlugin.typesMod.NormalizedPluginOptions
import typings.pmmmwhReactRefreshWebpackPlugin.typesMod.ReactRefreshPluginOptions
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pmmmwh/react-refresh-webpack-plugin", JSImport.Namespace)
  @js.native
  /**
    * @param {import('./types').ReactRefreshPluginOptions} [options] Options for react-refresh-plugin.
    */
  open class ^ () extends ReactRefreshPlugin {
    def this(options: ReactRefreshPluginOptions) = this()
  }
  
  @JSImport("@pmmmwh/react-refresh-webpack-plugin", "ReactRefreshPlugin")
  @js.native
  /**
    * @param {import('./types').ReactRefreshPluginOptions} [options] Options for react-refresh-plugin.
    */
  open class ReactRefreshPlugin () extends StObject {
    def this(options: ReactRefreshPluginOptions) = this()
    
    /**
      * Applies the plugin.
      * @param {import('webpack').Compiler} compiler A webpack compiler object.
      * @returns {void}
      */
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /**
      * @readonly
      * @type {import('./types').NormalizedPluginOptions}
      */
    val options: NormalizedPluginOptions = js.native
  }
}
