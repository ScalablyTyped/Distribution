package typings.opentelemetryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeShutdownNotifierMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/node/ShutdownNotifier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def invokeGlobalShutdown(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_invokeGlobalShutdown")().asInstanceOf[Unit]
  
  inline def notifyOnGlobalShutdown(cb: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("notifyOnGlobalShutdown")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
}
