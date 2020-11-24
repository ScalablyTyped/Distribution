package typings.postcssPresetEnv.mod

import typings.autoprefixer.mod.Options
import typings.postcssPresetEnv.mod.pluginOptions.features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait pluginOptions_ extends js.Object {
  
  /**
    * PostCSS Preset Env includes
    * [autoprefixer](https://github.com/postcss/autoprefixer)
    * and `browsers` option will be passed to it automatically.
    *
    * Specifying the `autoprefixer` option enables passing
    * [additional options](https://github.com/postcss/autoprefixer#options)
    * into autoprefixer.
    *
    * Passing `autoprefixer: false` disables autoprefixer.
    */
  var autoprefixer: js.UndefOr[Boolean | Options] = js.native
  
  /**
    * The browsers option determines which polyfills are required based upon
    * the browsers you are supporting.
    *
    * PostCSS Preset Env supports any standard browserslist configuration,
    * which can be a `.browserslistrc` file, a `browserslist` key in
    * `package.json`, or `browserslist` environment variables.
    *
    * The `browsers` option should only be used when a standard browserslist
    * configuration is not available.
    *
    * @default default
    */
  var browsers: js.UndefOr[String] = js.native
  
  /**
    * The `exportTo` option specifies destinations where variables like
    * Custom Media, Custom Properties, Custom Selectors, and
    * Environment Variables can be exported to, which might be
    * CSS, JS, and JSON files, functions, and directly passed objects.
    */
  var exportTo: js.UndefOr[String | js.Array[_]] = js.native
  
  /**
    * The features option enables or disables specific polyfills by ID.
    * Passing true to a specific feature ID will enable its polyfill,
    * while passing false will disable it.
    *
    * Passing an object to a specific feature ID will both enable and
    * configure it.
    *
    * Any polyfills not explicitly enabled or disabled through `features`
    * are determined by the `stage` option.
    */
  var features: js.UndefOr[features] = js.native
  
  /**
    * The `importFrom` option specifies sources where variables like
    * Custom Media, Custom Properties, Custom Selectors, and
    * Environment Variables can be imported from, which might be
    * CSS, JS, and JSON files, functions, and directly passed objects.
    */
  var importFrom: js.UndefOr[String | js.Array[_]] = js.native
  
  /**
    * The `insertAfter` keys allow you to insert other PostCSS plugins
    * into the chain. This is only useful if you are also using sugary
    * PostCSS plugins that must execute before or after certain polyfills.
    * `insertAfter` support chaining one or multiple plugins.
    */
  var insertAfter: js.UndefOr[js.Object] = js.native
  
  /**
    * The `insertBefore` keys allow you to insert other PostCSS plugins
    * into the chain. This is only useful if you are also using sugary
    * PostCSS plugins that must execute before or after certain polyfills.
    * `insertBefore` support chaining one or multiple plugins.
    */
  var insertBefore: js.UndefOr[js.Object] = js.native
  
  /**
    * The `preserve` option determines whether all plugins should receive
    * a `preserve` option, which may preserve or remove otherwise-polyfilled CSS.
    * By default, this option is not configured.
    */
  var preserve: js.UndefOr[Boolean] = js.native
  
  /**
    * The stage option determines which CSS features to polyfill,
    * based upon their stability in the process of becoming
    * implemented web standards.
    *
    * `postcssPresetEnv({ stage: 0 })`
    *
    * The `stage` can be `0` (experimental) through `4` (stable), or false.
    * Setting stage to false will disable every polyfill. Doing this would only
    * be useful if you intended to exclusively use the `features` option.
    *
    * Without any configuration options, PostCSS Preset Env enables
    * **Stage 2** features.
    */
  var stage: js.UndefOr[Double] = js.native
}
object pluginOptions_ {
  
  @scala.inline
  def apply(): pluginOptions_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluginOptions_]
  }
  
  @scala.inline
  implicit class pluginOptions_Ops[Self <: pluginOptions_] (val x: Self) extends AnyVal {
    
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
    def setAutoprefixer(value: Boolean | Options): Self = this.set("autoprefixer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoprefixer: Self = this.set("autoprefixer", js.undefined)
    
    @scala.inline
    def setBrowsers(value: String): Self = this.set("browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    
    @scala.inline
    def setExportToVarargs(value: js.Any*): Self = this.set("exportTo", js.Array(value :_*))
    
    @scala.inline
    def setExportTo(value: String | js.Array[_]): Self = this.set("exportTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportTo: Self = this.set("exportTo", js.undefined)
    
    @scala.inline
    def setFeatures(value: features): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setImportFromVarargs(value: js.Any*): Self = this.set("importFrom", js.Array(value :_*))
    
    @scala.inline
    def setImportFrom(value: String | js.Array[_]): Self = this.set("importFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportFrom: Self = this.set("importFrom", js.undefined)
    
    @scala.inline
    def setInsertAfter(value: js.Object): Self = this.set("insertAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertAfter: Self = this.set("insertAfter", js.undefined)
    
    @scala.inline
    def setInsertBefore(value: js.Object): Self = this.set("insertBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertBefore: Self = this.set("insertBefore", js.undefined)
    
    @scala.inline
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserve: Self = this.set("preserve", js.undefined)
    
    @scala.inline
    def setStage(value: Double): Self = this.set("stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
  }
}
