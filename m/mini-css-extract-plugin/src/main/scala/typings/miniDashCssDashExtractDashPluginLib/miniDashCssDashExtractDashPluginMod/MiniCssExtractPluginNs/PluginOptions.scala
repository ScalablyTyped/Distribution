package typings
package miniDashCssDashExtractDashPluginLib.miniDashCssDashExtractDashPluginMod.MiniCssExtractPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  var chunkFilename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Options similar to the same options in webpackOptions.output, both options are optional
    * May contain `[name]`, `[id]`, `hash` and `[chunkhash]`
    */
  var filename: js.UndefOr[java.lang.String] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(chunkFilename: java.lang.String = null, filename: java.lang.String = null): PluginOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkFilename != null) __obj.updateDynamic("chunkFilename")(chunkFilename)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    __obj.asInstanceOf[PluginOptions]
  }
}

