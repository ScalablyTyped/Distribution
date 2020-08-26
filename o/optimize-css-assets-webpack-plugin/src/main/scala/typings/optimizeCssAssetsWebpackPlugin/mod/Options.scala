package typings.optimizeCssAssetsWebpackPlugin.mod

import typings.optimizeCssAssetsWebpackPlugin.anon.Process
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * A regular expression that indicates the names of the assets that should
    * be optimized \ minimized. The regular expression provided is run against
    * the filenames of the files exported by the `ExtractTextPlugin` instances
    * in your configuration, not the filenames of your source CSS files
    *
    * @default /\.css$/g
    */
  var assetNameRegExp: js.UndefOr[RegExp] = js.native
  /**
    * A boolean indicating if the plugin can print messages to the console.
    *
    * @default true
    */
  var canPrint: js.UndefOr[Boolean] = js.native
  /**
    * The CSS processor used to optimize \ minimize the CSS. This should be a
    * function that follows `cssnano.process` interface (receives a CSS and
    * options parameters and returns a Promise).
    *
    * @default cssnano
    */
  var cssProcessor: js.UndefOr[Process] = js.native
  /**
    * The options passed to the `cssProcessor`.
    *
    * @default {}
    */
  var cssProcessorOptions: js.UndefOr[js.Object] = js.native
  /**
    * The plugin options passed to the `cssProcessor`.
    *
    * @default {}
    */
  var cssProcessorPluginOptions: js.UndefOr[js.Object] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssetNameRegExp(value: RegExp): Self = this.set("assetNameRegExp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetNameRegExp: Self = this.set("assetNameRegExp", js.undefined)
    @scala.inline
    def setCanPrint(value: Boolean): Self = this.set("canPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanPrint: Self = this.set("canPrint", js.undefined)
    @scala.inline
    def setCssProcessor(value: Process): Self = this.set("cssProcessor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssProcessor: Self = this.set("cssProcessor", js.undefined)
    @scala.inline
    def setCssProcessorOptions(value: js.Object): Self = this.set("cssProcessorOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssProcessorOptions: Self = this.set("cssProcessorOptions", js.undefined)
    @scala.inline
    def setCssProcessorPluginOptions(value: js.Object): Self = this.set("cssProcessorPluginOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssProcessorPluginOptions: Self = this.set("cssProcessorPluginOptions", js.undefined)
  }
  
}

