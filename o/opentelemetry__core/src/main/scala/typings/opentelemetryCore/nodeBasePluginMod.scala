package typings.opentelemetryCore

import typings.opentelemetryCore.baseAbstractPluginMod.BaseAbstractPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeBasePluginMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/node/BasePlugin", "BasePlugin")
  @js.native
  abstract class BasePlugin[T] protected () extends BaseAbstractPlugin[T] {
    def this(_tracerName: String) = this()
    def this(_tracerName: String, _tracerVersion: String) = this()
    
    /**
      * @TODO: To avoid circular dependencies, internal file loading functionality currently
      * lives in BasePlugin. It is not meant to work in the browser and so this logic
      * should eventually be moved somewhere else where it makes more sense.
      * https://github.com/open-telemetry/opentelemetry-js/issues/285
      */
    var _loadInternalFilesExports: js.Any = js.native
    
    var _loadInternalModule: js.Any = js.native
    
    var _requireInternalFiles: js.Any = js.native
  }
}
