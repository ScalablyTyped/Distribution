package typings.parcelDashBundler.parcelDashBundlerMod

import typings.parcelDashBundler.parcelDashBundlerBooleans.`false`
import typings.parcelDashBundler.parcelDashBundlerBooleans.`true`
import typings.parcelDashBundler.parcelDashBundlerNumbers.`0`
import typings.parcelDashBundler.parcelDashBundlerNumbers.`1`
import typings.parcelDashBundler.parcelDashBundlerNumbers.`2`
import typings.parcelDashBundler.parcelDashBundlerNumbers.`3`
import typings.parcelDashBundler.parcelDashBundlerStrings.browser
import typings.parcelDashBundler.parcelDashBundlerStrings.electron
import typings.parcelDashBundler.parcelDashBundlerStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParcelOptions extends js.Object {
  /**
    * By default, package.json dependencies are not included when using 'node' or 'electron' with the 'target' option.
    *
    * Set to true to add them to the bundle.
    *
    * @default false
    */
  var bundleNodeModules: js.UndefOr[`true` | `false`] = js.undefined
  /**
    * Enabled or disables caching
    *
    * @default true
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * The directory cache gets put in
    *
    * @default ".cache"
    */
  var cacheDir: js.UndefOr[String] = js.undefined
  /**
    * Disable content hash from being included on the filename
    *
    * @default false
    */
  var contentHash: js.UndefOr[Boolean] = js.undefined
  /**
    * Prints a detailed report of the bundles, assets, filesizes and times
    *
    * Reports are only printed if watch is disabled
    *
    * @default false
    */
  var detailedReport: js.UndefOr[Boolean] = js.undefined
  /**
    * Expose modules as UMD under this name, disabled by default
    */
  var global: js.UndefOr[String] = js.undefined
  /**
    * Enable or disable HMR while watching
    *
    * @default false
    */
  var hmr: js.UndefOr[`true` | `false`] = js.undefined
  /**
    * A hostname for hot module reload
    *
    * @default ""
    */
  var hmrHostname: js.UndefOr[String] = js.undefined
  /**
    * The port the HMR socket runs on
    *
    * Defaults to a random free port (0 in node.js resolves to a random free port)
    *
    * @default 0
    */
  var hmrPort: js.UndefOr[`0` | Double] = js.undefined
  /**
    * Define a custom {key, cert} pair
    *
    * Use true to generate one or false to use http
    */
  var https: js.UndefOr[`true` | `false` | HttpsOptions] = js.undefined
  /**
    * 3 = log everything, 2 = log warnings & errors, 1 = log errors
    *
    * @default 3
    */
  var logLevel: js.UndefOr[`3` | `2` | `1`] = js.undefined
  /**
    * Minify files
    *
    * @default process.env.NODE_ENV === 'production'
    */
  var minify: js.UndefOr[Boolean] = js.undefined
  /**
    * The out directory to put the build files in
    *
    * @default "./dist"
    */
  var outDir: js.UndefOr[String] = js.undefined
  /**
    * The name of the outputFile
    *
    * @default "index.html"
    */
  var outFile: js.UndefOr[String] = js.undefined
  /**
    * The url to server on
    *
    * @default "./"
    */
  var publicUrl: js.UndefOr[String] = js.undefined
  /**
    * Turn on experimental scope hoisting/tree shaking flag, for smaller production bundles
    *
    * @default false
    */
  var scopeHoist: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable sourcemaps
    *
    * Defaults to enabled (not supported in minified builds yet)
    *
    * @default true
    */
  var sourceMaps: js.UndefOr[Boolean] = js.undefined
  /**
    * @default "browser"
    */
  var target: js.UndefOr[browser | node | electron] = js.undefined
  /**
    * Whether to watch the files and rebuild them on change
    *
    * @default process.env.NODE_ENV !== 'production'
    */
  var watch: js.UndefOr[Boolean] = js.undefined
}

object ParcelOptions {
  @scala.inline
  def apply(
    bundleNodeModules: `true` | `false` = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    cacheDir: String = null,
    contentHash: js.UndefOr[Boolean] = js.undefined,
    detailedReport: js.UndefOr[Boolean] = js.undefined,
    global: String = null,
    hmr: `true` | `false` = null,
    hmrHostname: String = null,
    hmrPort: `0` | Double = null,
    https: `true` | `false` | HttpsOptions = null,
    logLevel: `3` | `2` | `1` = null,
    minify: js.UndefOr[Boolean] = js.undefined,
    outDir: String = null,
    outFile: String = null,
    publicUrl: String = null,
    scopeHoist: js.UndefOr[Boolean] = js.undefined,
    sourceMaps: js.UndefOr[Boolean] = js.undefined,
    target: browser | node | electron = null,
    watch: js.UndefOr[Boolean] = js.undefined
  ): ParcelOptions = {
    val __obj = js.Dynamic.literal()
    if (bundleNodeModules != null) __obj.updateDynamic("bundleNodeModules")(bundleNodeModules.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheDir != null) __obj.updateDynamic("cacheDir")(cacheDir.asInstanceOf[js.Any])
    if (!js.isUndefined(contentHash)) __obj.updateDynamic("contentHash")(contentHash.asInstanceOf[js.Any])
    if (!js.isUndefined(detailedReport)) __obj.updateDynamic("detailedReport")(detailedReport.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (hmr != null) __obj.updateDynamic("hmr")(hmr.asInstanceOf[js.Any])
    if (hmrHostname != null) __obj.updateDynamic("hmrHostname")(hmrHostname.asInstanceOf[js.Any])
    if (hmrPort != null) __obj.updateDynamic("hmrPort")(hmrPort.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (outDir != null) __obj.updateDynamic("outDir")(outDir.asInstanceOf[js.Any])
    if (outFile != null) __obj.updateDynamic("outFile")(outFile.asInstanceOf[js.Any])
    if (publicUrl != null) __obj.updateDynamic("publicUrl")(publicUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(scopeHoist)) __obj.updateDynamic("scopeHoist")(scopeHoist.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMaps)) __obj.updateDynamic("sourceMaps")(sourceMaps.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParcelOptions]
  }
}

