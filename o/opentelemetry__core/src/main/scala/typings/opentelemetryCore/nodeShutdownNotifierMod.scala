package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeShutdownNotifierMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/node/ShutdownNotifier", "_invokeGlobalShutdown")
  @js.native
  def invokeGlobalShutdown(): Unit = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform/node/ShutdownNotifier", "notifyOnGlobalShutdown")
  @js.native
  def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = js.native
}
