package typings.opentelemetryCore

import org.scalablytyped.runtime.StringDictionary
import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryApi.pluginMod.Plugin
import typings.opentelemetryApi.pluginMod.PluginConfig
import typings.opentelemetryApi.pluginMod.PluginInternalFiles
import typings.opentelemetryApi.tracerMod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseAbstractPluginMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/BaseAbstractPlugin", "BaseAbstractPlugin")
  @js.native
  abstract class BaseAbstractPlugin[T] protected () extends Plugin[T] {
    def this(_tracerName: String) = this()
    def this(_tracerName: String, _tracerVersion: String) = this()
    
    val _basedir: js.UndefOr[String] = js.native
    
    var _config: PluginConfig = js.native
    
    var _internalFilesExports: StringDictionary[js.Any] = js.native
    
    val _internalFilesList: js.UndefOr[PluginInternalFiles] = js.native
    
    var _logger: Logger = js.native
    
    var _moduleExports: T = js.native
    
    var _tracer: Tracer = js.native
    
    val _tracerName: String = js.native
    
    val _tracerVersion: js.UndefOr[String] = js.native
    
    /* protected */ def patch(): T = js.native
    
    /* protected */ def unpatch(): Unit = js.native
    
    val version: js.UndefOr[String] = js.native
  }
}
