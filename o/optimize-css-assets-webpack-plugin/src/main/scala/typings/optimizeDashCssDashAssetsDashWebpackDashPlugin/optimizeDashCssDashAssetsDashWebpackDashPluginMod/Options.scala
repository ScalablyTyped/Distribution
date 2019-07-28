package typings.optimizeDashCssDashAssetsDashWebpackDashPlugin.optimizeDashCssDashAssetsDashWebpackDashPluginMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var assetNameRegExp: js.UndefOr[RegExp] = js.undefined
  var canPrint: js.UndefOr[Boolean] = js.undefined
  var cssProcessor: js.UndefOr[js.Any] = js.undefined
  var cssProcessorOptions: js.UndefOr[js.Any] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    assetNameRegExp: RegExp = null,
    canPrint: js.UndefOr[Boolean] = js.undefined,
    cssProcessor: js.Any = null,
    cssProcessorOptions: js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (assetNameRegExp != null) __obj.updateDynamic("assetNameRegExp")(assetNameRegExp)
    if (!js.isUndefined(canPrint)) __obj.updateDynamic("canPrint")(canPrint)
    if (cssProcessor != null) __obj.updateDynamic("cssProcessor")(cssProcessor)
    if (cssProcessorOptions != null) __obj.updateDynamic("cssProcessorOptions")(cssProcessorOptions)
    __obj.asInstanceOf[Options]
  }
}

