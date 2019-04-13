package typings
package parcelDashBundlerLib.parcelDashBundlerMod

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
  var bundleNodeModules: js.UndefOr[
    parcelDashBundlerLib.parcelDashBundlerLibNumbers.`true` | parcelDashBundlerLib.parcelDashBundlerLibNumbers.`false`
  ] = js.undefined
  /**
    * Enabled or disables caching
    *
    * @default true
    */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The directory cache gets put in
    *
    * @default ".cache"
    */
  var cacheDir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Disable content hash from being included on the filename
    *
    * @default false
    */
  var contentHash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prints a detailed report of the bundles, assets, filesizes and times
    *
    * Reports are only printed if watch is disabled
    *
    * @default false
    */
  var detailedReport: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Expose modules as UMD under this name, disabled by default
    */
  var global: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable or disable HMR while watching
    *
    * @default false
    */
  var hmr: js.UndefOr[
    parcelDashBundlerLib.parcelDashBundlerLibNumbers.`true` | parcelDashBundlerLib.parcelDashBundlerLibNumbers.`false`
  ] = js.undefined
  /**
    * A hostname for hot module reload
    *
    * @default ""
    */
  var hmrHostname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The port the HMR socket runs on
    *
    * Defaults to a random free port (0 in node.js resolves to a random free port)
    *
    * @default 0
    */
  var hmrPort: js.UndefOr[parcelDashBundlerLib.parcelDashBundlerLibNumbers.`0` | scala.Double] = js.undefined
  /**
    * Define a custom {key, cert} pair
    *
    * Use true to generate one or false to use http
    */
  var https: js.UndefOr[
    parcelDashBundlerLib.parcelDashBundlerLibNumbers.`true` | parcelDashBundlerLib.parcelDashBundlerLibNumbers.`false` | HttpsOptions
  ] = js.undefined
  /**
    * 3 = log everything, 2 = log warnings & errors, 1 = log errors
    *
    * @default 3
    */
  var logLevel: js.UndefOr[
    parcelDashBundlerLib.parcelDashBundlerLibNumbers.`3` | parcelDashBundlerLib.parcelDashBundlerLibNumbers.`2` | parcelDashBundlerLib.parcelDashBundlerLibNumbers.`1`
  ] = js.undefined
  /**
    * Minify files
    *
    * @default process.env.NODE_ENV === 'production'
    */
  var minify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The out directory to put the build files in
    *
    * @default "./dist"
    */
  var outDir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the outputFile
    *
    * @default "index.html"
    */
  var outFile: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The url to server on
    *
    * @default "./"
    */
  var publicUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Turn on experimental scope hoisting/tree shaking flag, for smaller production bundles
    *
    * @default false
    */
  var scopeHoist: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable or disable sourcemaps
    *
    * Defaults to enabled (not supported in minified builds yet)
    *
    * @default true
    */
  var sourceMaps: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @default "browser"
    */
  var target: js.UndefOr[
    parcelDashBundlerLib.parcelDashBundlerLibStrings.browser | parcelDashBundlerLib.parcelDashBundlerLibStrings.node | parcelDashBundlerLib.parcelDashBundlerLibStrings.electron
  ] = js.undefined
  /**
    * Whether to watch the files and rebuild them on change
    *
    * @default process.env.NODE_ENV !== 'production'
    */
  var watch: js.UndefOr[scala.Boolean] = js.undefined
}

object ParcelOptions {
  @scala.inline
  def apply(
    bundleNodeModules: parcelDashBundlerLib.parcelDashBundlerLibNumbers.`true` | parcelDashBundlerLib.parcelDashBundlerLibNumbers.`false` = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    cacheDir: java.lang.String = null,
    contentHash: js.UndefOr[scala.Boolean] = js.undefined,
    detailedReport: js.UndefOr[scala.Boolean] = js.undefined,
    global: java.lang.String = null,
    hmr: parcelDashBundlerLib.parcelDashBundlerLibNumbers.`true` | parcelDashBundlerLib.parcelDashBundlerLibNumbers.`false` = null,
    hmrHostname: java.lang.String = null,
    hmrPort: parcelDashBundlerLib.parcelDashBundlerLibNumbers.`0` | scala.Double = null,
    https: parcelDashBundlerLib.parcelDashBundlerLibNumbers.`true` | parcelDashBundlerLib.parcelDashBundlerLibNumbers.`false` | HttpsOptions = null,
    logLevel: parcelDashBundlerLib.parcelDashBundlerLibNumbers.`3` | parcelDashBundlerLib.parcelDashBundlerLibNumbers.`2` | parcelDashBundlerLib.parcelDashBundlerLibNumbers.`1` = null,
    minify: js.UndefOr[scala.Boolean] = js.undefined,
    outDir: java.lang.String = null,
    outFile: java.lang.String = null,
    publicUrl: java.lang.String = null,
    scopeHoist: js.UndefOr[scala.Boolean] = js.undefined,
    sourceMaps: js.UndefOr[scala.Boolean] = js.undefined,
    target: parcelDashBundlerLib.parcelDashBundlerLibStrings.browser | parcelDashBundlerLib.parcelDashBundlerLibStrings.node | parcelDashBundlerLib.parcelDashBundlerLibStrings.electron = null,
    watch: js.UndefOr[scala.Boolean] = js.undefined
  ): ParcelOptions = {
    val __obj = js.Dynamic.literal()
    if (bundleNodeModules != null) __obj.updateDynamic("bundleNodeModules")(bundleNodeModules.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (cacheDir != null) __obj.updateDynamic("cacheDir")(cacheDir)
    if (!js.isUndefined(contentHash)) __obj.updateDynamic("contentHash")(contentHash)
    if (!js.isUndefined(detailedReport)) __obj.updateDynamic("detailedReport")(detailedReport)
    if (global != null) __obj.updateDynamic("global")(global)
    if (hmr != null) __obj.updateDynamic("hmr")(hmr.asInstanceOf[js.Any])
    if (hmrHostname != null) __obj.updateDynamic("hmrHostname")(hmrHostname)
    if (hmrPort != null) __obj.updateDynamic("hmrPort")(hmrPort.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify)
    if (outDir != null) __obj.updateDynamic("outDir")(outDir)
    if (outFile != null) __obj.updateDynamic("outFile")(outFile)
    if (publicUrl != null) __obj.updateDynamic("publicUrl")(publicUrl)
    if (!js.isUndefined(scopeHoist)) __obj.updateDynamic("scopeHoist")(scopeHoist)
    if (!js.isUndefined(sourceMaps)) __obj.updateDynamic("sourceMaps")(sourceMaps)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[ParcelOptions]
  }
}

