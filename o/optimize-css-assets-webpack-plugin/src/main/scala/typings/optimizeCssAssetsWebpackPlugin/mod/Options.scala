package typings.optimizeCssAssetsWebpackPlugin.mod

import typings.optimizeCssAssetsWebpackPlugin.AnonCss
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A regular expression that indicates the names of the assets that should
    * be optimized \ minimized. The regular expression provided is run against
    * the filenames of the files exported by the `ExtractTextPlugin` instances
    * in your configuration, not the filenames of your source CSS files
    *
    * @default /\.css$/g
    */
  var assetNameRegExp: js.UndefOr[RegExp] = js.undefined
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
  var cssProcessor: js.UndefOr[AnonCss] = js.undefined
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
  @scala.inline
  def apply(
    assetNameRegExp: RegExp = null,
    canPrint: js.UndefOr[Boolean] = js.undefined,
    cssProcessor: AnonCss = null,
    cssProcessorOptions: js.Object = null,
    cssProcessorPluginOptions: js.Object = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (assetNameRegExp != null) __obj.updateDynamic("assetNameRegExp")(assetNameRegExp.asInstanceOf[js.Any])
    if (!js.isUndefined(canPrint)) __obj.updateDynamic("canPrint")(canPrint.asInstanceOf[js.Any])
    if (cssProcessor != null) __obj.updateDynamic("cssProcessor")(cssProcessor.asInstanceOf[js.Any])
    if (cssProcessorOptions != null) __obj.updateDynamic("cssProcessorOptions")(cssProcessorOptions.asInstanceOf[js.Any])
    if (cssProcessorPluginOptions != null) __obj.updateDynamic("cssProcessorPluginOptions")(cssProcessorPluginOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

