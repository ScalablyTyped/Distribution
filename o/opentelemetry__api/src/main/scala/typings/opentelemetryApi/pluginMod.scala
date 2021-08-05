package typings.opentelemetryApi

import org.scalablytyped.runtime.StringDictionary
import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryApi.tracerProviderMod.TracerProvider
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  @js.native
  trait Plugin[T] extends StObject {
    
    /** Method to disable the instrumentation  */
    def disable(): Unit = js.native
    
    /**
      * Method that enables the instrumentation patch.
      * @param moduleExports The value of the `module.exports` property that would
      *     normally be exposed by the required module. ex: `http`, `https` etc.
      * @param TracerProvider a tracer provider.
      * @param logger a logger instance.
      * @param [config] an object to configure the plugin.
      */
    def enable(moduleExports: T, TracerProvider: TracerProvider, logger: Logger): T = js.native
    def enable(moduleExports: T, TracerProvider: TracerProvider, logger: Logger, config: PluginConfig): T = js.native
    
    /**
      * Name of the module that the plugin instrument.
      */
    var moduleName: String = js.native
    
    /**
      * Contains all supported versions.
      * All versions must be compatible with [semver](https://semver.org/spec/v2.0.0.html) format.
      * If the version is not supported, we won't apply instrumentation patch (see `enable` method).
      * If omitted, all versions of the module will be patched.
      */
    var supportedVersions: js.UndefOr[js.Array[String]] = js.native
  }
  
  trait PluginConfig extends StObject {
    
    /**
      * Whether to enable the plugin.
      * @default true
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, additional information about query parameters and
      * results will be attached (as `attributes`) to spans representing
      * database operations.
      */
    var enhancedDatabaseReporting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Request methods that match any string in ignoreMethods will not be traced.
      */
    var ignoreMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * URLs that partially match any regex in ignoreUrls will not be traced.
      * In addition, URLs that are _exact matches_ of strings in ignoreUrls will
      * also not be traced.
      */
    var ignoreUrls: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    /**
      * List of internal files that need patch and are not exported by
      * default.
      */
    var internalFilesExports: js.UndefOr[PluginInternalFiles] = js.undefined
    
    /**
      * Path of the trace plugin to load.
      * @default '@opentelemetry/plugin-http' in case of http.
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object PluginConfig {
    
    inline def apply(): PluginConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginConfig]
    }
    
    extension [Self <: PluginConfig](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEnhancedDatabaseReporting(value: Boolean): Self = StObject.set(x, "enhancedDatabaseReporting", value.asInstanceOf[js.Any])
      
      inline def setEnhancedDatabaseReportingUndefined: Self = StObject.set(x, "enhancedDatabaseReporting", js.undefined)
      
      inline def setIgnoreMethods(value: js.Array[String]): Self = StObject.set(x, "ignoreMethods", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMethodsUndefined: Self = StObject.set(x, "ignoreMethods", js.undefined)
      
      inline def setIgnoreMethodsVarargs(value: String*): Self = StObject.set(x, "ignoreMethods", js.Array(value :_*))
      
      inline def setIgnoreUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "ignoreUrls", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUrlsUndefined: Self = StObject.set(x, "ignoreUrls", js.undefined)
      
      inline def setIgnoreUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignoreUrls", js.Array(value :_*))
      
      inline def setInternalFilesExports(value: PluginInternalFiles): Self = StObject.set(x, "internalFilesExports", value.asInstanceOf[js.Any])
      
      inline def setInternalFilesExportsUndefined: Self = StObject.set(x, "internalFilesExports", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type PluginInternalFiles = StringDictionary[PluginInternalFilesVersion]
  
  type PluginInternalFilesVersion = StringDictionary[String]
}
