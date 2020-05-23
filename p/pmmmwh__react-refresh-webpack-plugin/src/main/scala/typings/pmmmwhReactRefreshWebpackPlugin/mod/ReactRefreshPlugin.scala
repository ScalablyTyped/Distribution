package typings.pmmmwhReactRefreshWebpackPlugin.mod

import typings.pmmmwhReactRefreshWebpackPlugin.typesMod.NormalizedPluginOptions
import typings.pmmmwhReactRefreshWebpackPlugin.typesMod.ReactRefreshPluginOptions
import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pmmmwh/react-refresh-webpack-plugin", "ReactRefreshPlugin")
@js.native
/**
  * @param {import('./types').ReactRefreshPluginOptions} [options] Options for react-refresh-plugin.
  */
class ReactRefreshPlugin () extends js.Object {
  def this(options: ReactRefreshPluginOptions) = this()
  /**
    * @readonly
    * @type {import('./types').NormalizedPluginOptions}
    */
  val options: NormalizedPluginOptions = js.native
  /**
    * Applies the plugin.
    * @param {import('webpack').Compiler} compiler A webpack compiler object.
    * @returns {void}
    */
  @JSName("apply")
  def apply(compiler: Compiler_): Unit = js.native
}

