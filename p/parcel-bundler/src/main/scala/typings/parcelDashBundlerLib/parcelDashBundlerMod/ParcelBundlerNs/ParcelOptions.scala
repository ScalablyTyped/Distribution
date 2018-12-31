package typings
package parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParcelOptions extends js.Object {
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
    parcelDashBundlerLib.parcelDashBundlerLibNumbers.`true` | parcelDashBundlerLib.parcelDashBundlerLibNumbers.`false` | parcelDashBundlerLib.Anon_Key
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

