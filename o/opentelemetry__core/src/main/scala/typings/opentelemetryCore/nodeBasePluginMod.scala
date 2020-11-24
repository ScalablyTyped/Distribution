package typings.opentelemetryCore

import typings.opentelemetryCore.baseAbstractPluginMod.BaseAbstractPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/platform/node/BasePlugin", JSImport.Namespace)
@js.native
object nodeBasePluginMod extends js.Object {
  
  @js.native
  abstract class BasePlugin[T] () extends BaseAbstractPlugin[T] {
    
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
