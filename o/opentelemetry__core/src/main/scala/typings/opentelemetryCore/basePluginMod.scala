package typings.opentelemetryCore

import typings.opentelemetryCore.baseAbstractPluginMod.BaseAbstractPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basePluginMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/browser/BasePlugin", "BasePlugin")
  @js.native
  abstract class BasePlugin[T] protected () extends BaseAbstractPlugin[T] {
    def this(_tracerName: String) = this()
    def this(_tracerName: String, _tracerVersion: String) = this()
  }
}
