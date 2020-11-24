package typings.opentelemetryApi.pluginMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginConfig extends js.Object {
  
  /**
    * Whether to enable the plugin.
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, additional information about query parameters and
    * results will be attached (as `attributes`) to spans representing
    * database operations.
    */
  var enhancedDatabaseReporting: js.UndefOr[Boolean] = js.native
  
  /**
    * Request methods that match any string in ignoreMethods will not be traced.
    */
  var ignoreMethods: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * URLs that partially match any regex in ignoreUrls will not be traced.
    * In addition, URLs that are _exact matches_ of strings in ignoreUrls will
    * also not be traced.
    */
  var ignoreUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  /**
    * List of internal files that need patch and are not exported by
    * default.
    */
  var internalFilesExports: js.UndefOr[PluginInternalFiles] = js.native
  
  /**
    * Path of the trace plugin to load.
    * @default '@opentelemetry/plugin-http' in case of http.
    */
  var path: js.UndefOr[String] = js.native
}
object PluginConfig {
  
  @scala.inline
  def apply(): PluginConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginConfig]
  }
  
  @scala.inline
  implicit class PluginConfigOps[Self <: PluginConfig] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEnhancedDatabaseReporting(value: Boolean): Self = this.set("enhancedDatabaseReporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnhancedDatabaseReporting: Self = this.set("enhancedDatabaseReporting", js.undefined)
    
    @scala.inline
    def setIgnoreMethodsVarargs(value: String*): Self = this.set("ignoreMethods", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreMethods(value: js.Array[String]): Self = this.set("ignoreMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreMethods: Self = this.set("ignoreMethods", js.undefined)
    
    @scala.inline
    def setIgnoreUrlsVarargs(value: (String | RegExp)*): Self = this.set("ignoreUrls", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreUrls(value: js.Array[String | RegExp]): Self = this.set("ignoreUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUrls: Self = this.set("ignoreUrls", js.undefined)
    
    @scala.inline
    def setInternalFilesExports(value: PluginInternalFiles): Self = this.set("internalFilesExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalFilesExports: Self = this.set("internalFilesExports", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
