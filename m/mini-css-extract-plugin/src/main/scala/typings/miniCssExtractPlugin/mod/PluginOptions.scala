package typings.miniCssExtractPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  var chunkFilename: js.UndefOr[String] = js.undefined
  /**
    * By default, mini-css-extract-plugin generates JS modules that use the CommonJS
    * modules syntax. There are some cases in which using ES modules is beneficial,
    * like in the case of module concatenation and tree shaking.
    */
  var esModule: js.UndefOr[Boolean] = js.undefined
  /**
    * Options similar to the same options in webpackOptions.output, both options are optional
    * May contain `[name]`, `[id]`, `hash` and `[chunkhash]`
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * For projects where CSS ordering has been mitigated through consistent
    * use of scoping or naming conventions, the CSS order warnings can be
    * disabled by setting this flag to true for the plugin.
    */
  var ignoreOrder: js.UndefOr[Boolean] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(
    chunkFilename: String = null,
    esModule: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    ignoreOrder: js.UndefOr[Boolean] = js.undefined
  ): PluginOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkFilename != null) __obj.updateDynamic("chunkFilename")(chunkFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(esModule)) __obj.updateDynamic("esModule")(esModule.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreOrder)) __obj.updateDynamic("ignoreOrder")(ignoreOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptions]
  }
}

