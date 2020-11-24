package typings.parcelBundler.mod

import typings.parcelBundler.parcelBundlerBooleans.`false`
import typings.parcelBundler.parcelBundlerBooleans.`true`
import typings.parcelBundler.parcelBundlerNumbers.`0`
import typings.parcelBundler.parcelBundlerNumbers.`1`
import typings.parcelBundler.parcelBundlerNumbers.`2`
import typings.parcelBundler.parcelBundlerNumbers.`3`
import typings.parcelBundler.parcelBundlerStrings.browser
import typings.parcelBundler.parcelBundlerStrings.electron
import typings.parcelBundler.parcelBundlerStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParcelOptions extends js.Object {
  
  /**
    * By default, package.json dependencies are not included when using 'node' or 'electron' with the 'target' option.
    *
    * Set to true to add them to the bundle.
    *
    * @default false
    */
  var bundleNodeModules: js.UndefOr[`true` | `false`] = js.native
  
  /**
    * Enabled or disables caching
    *
    * @default true
    */
  var cache: js.UndefOr[Boolean] = js.native
  
  /**
    * The directory cache gets put in
    *
    * @default ".cache"
    */
  var cacheDir: js.UndefOr[String] = js.native
  
  /**
    * Disable content hash from being included on the filename
    *
    * @default false
    */
  var contentHash: js.UndefOr[Boolean] = js.native
  
  /**
    * Prints a detailed report of the bundles, assets, filesizes and times
    *
    * Reports are only printed if watch is disabled
    *
    * @default false
    */
  var detailedReport: js.UndefOr[Boolean] = js.native
  
  /**
    * Expose modules as UMD under this name, disabled by default
    */
  var global: js.UndefOr[String] = js.native
  
  /**
    * Enable or disable HMR while watching
    *
    * @default false
    */
  var hmr: js.UndefOr[`true` | `false`] = js.native
  
  /**
    * A hostname for hot module reload
    *
    * @default ""
    */
  var hmrHostname: js.UndefOr[String] = js.native
  
  /**
    * The port the HMR socket runs on
    *
    * Defaults to a random free port (0 in node.js resolves to a random free port)
    *
    * @default 0
    */
  var hmrPort: js.UndefOr[`0` | Double] = js.native
  
  /**
    * Define a custom {key, cert} pair
    *
    * Use true to generate one or false to use http
    */
  var https: js.UndefOr[`true` | `false` | HttpsOptions] = js.native
  
  /**
    * 3 = log everything, 2 = log warnings & errors, 1 = log errors
    *
    * @default 3
    */
  var logLevel: js.UndefOr[`3` | `2` | `1`] = js.native
  
  /**
    * Minify files
    *
    * @default process.env.NODE_ENV === 'production'
    */
  var minify: js.UndefOr[Boolean] = js.native
  
  /**
    * The out directory to put the build files in
    *
    * @default "./dist"
    */
  var outDir: js.UndefOr[String] = js.native
  
  /**
    * The name of the outputFile
    *
    * @default "index.html"
    */
  var outFile: js.UndefOr[String] = js.native
  
  /**
    * The url to server on
    *
    * @default "./"
    */
  var publicUrl: js.UndefOr[String] = js.native
  
  /**
    * Turn on experimental scope hoisting/tree shaking flag, for smaller production bundles
    *
    * @default false
    */
  var scopeHoist: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable or disable sourcemaps
    *
    * Defaults to enabled (not supported in minified builds yet)
    *
    * @default true
    */
  var sourceMaps: js.UndefOr[Boolean] = js.native
  
  /**
    * @default "browser"
    */
  var target: js.UndefOr[browser | node | electron] = js.native
  
  /**
    * Whether to watch the files and rebuild them on change
    *
    * @default process.env.NODE_ENV !== 'production'
    */
  var watch: js.UndefOr[Boolean] = js.native
}
object ParcelOptions {
  
  @scala.inline
  def apply(): ParcelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParcelOptions]
  }
  
  @scala.inline
  implicit class ParcelOptionsOps[Self <: ParcelOptions] (val x: Self) extends AnyVal {
    
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
    def setBundleNodeModules(value: `true` | `false`): Self = this.set("bundleNodeModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleNodeModules: Self = this.set("bundleNodeModules", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheDir(value: String): Self = this.set("cacheDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDir: Self = this.set("cacheDir", js.undefined)
    
    @scala.inline
    def setContentHash(value: Boolean): Self = this.set("contentHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentHash: Self = this.set("contentHash", js.undefined)
    
    @scala.inline
    def setDetailedReport(value: Boolean): Self = this.set("detailedReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailedReport: Self = this.set("detailedReport", js.undefined)
    
    @scala.inline
    def setGlobal(value: String): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setHmr(value: `true` | `false`): Self = this.set("hmr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHmr: Self = this.set("hmr", js.undefined)
    
    @scala.inline
    def setHmrHostname(value: String): Self = this.set("hmrHostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHmrHostname: Self = this.set("hmrHostname", js.undefined)
    
    @scala.inline
    def setHmrPort(value: `0` | Double): Self = this.set("hmrPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHmrPort: Self = this.set("hmrPort", js.undefined)
    
    @scala.inline
    def setHttps(value: `true` | `false` | HttpsOptions): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setLogLevel(value: `3` | `2` | `1`): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setMinify(value: Boolean): Self = this.set("minify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    
    @scala.inline
    def setOutDir(value: String): Self = this.set("outDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutDir: Self = this.set("outDir", js.undefined)
    
    @scala.inline
    def setOutFile(value: String): Self = this.set("outFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutFile: Self = this.set("outFile", js.undefined)
    
    @scala.inline
    def setPublicUrl(value: String): Self = this.set("publicUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicUrl: Self = this.set("publicUrl", js.undefined)
    
    @scala.inline
    def setScopeHoist(value: Boolean): Self = this.set("scopeHoist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeHoist: Self = this.set("scopeHoist", js.undefined)
    
    @scala.inline
    def setSourceMaps(value: Boolean): Self = this.set("sourceMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMaps: Self = this.set("sourceMaps", js.undefined)
    
    @scala.inline
    def setTarget(value: browser | node | electron): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
}
