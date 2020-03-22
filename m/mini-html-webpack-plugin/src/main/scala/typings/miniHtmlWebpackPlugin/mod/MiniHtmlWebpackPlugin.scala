package typings.miniHtmlWebpackPlugin.mod

import typings.webpack.mod.Plugin
import typings.webpack.mod.compilation.Compilation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A miniature version of html-webpack-plugin with only necessary features
  * see {@link https://www.npmjs.com/package/mini-html-webpack-plugin}
  */
@js.native
trait MiniHtmlWebpackPlugin extends Plugin {
  def plugin(compilation: Compilation, callback: js.Function0[Unit]): Unit = js.native
}

