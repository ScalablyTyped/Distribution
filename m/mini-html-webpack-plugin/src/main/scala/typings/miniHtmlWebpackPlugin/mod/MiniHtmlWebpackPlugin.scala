package typings.miniHtmlWebpackPlugin.mod

import typings.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A miniature version of html-webpack-plugin with only necessary features
  * see {@link https://www.npmjs.com/package/mini-html-webpack-plugin}
  */
@js.native
trait MiniHtmlWebpackPlugin extends Plugin {
  
  def plugin(
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any,
    callback: js.Function0[Unit]
  ): Unit = js.native
}
