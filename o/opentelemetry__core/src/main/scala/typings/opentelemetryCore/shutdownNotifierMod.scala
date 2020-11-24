package typings.opentelemetryCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/platform/browser/ShutdownNotifier", JSImport.Namespace)
@js.native
object shutdownNotifierMod extends js.Object {
  
  @JSName("_invokeGlobalShutdown")
  def invokeGlobalShutdown(): Unit = js.native
  
  def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = js.native
}
