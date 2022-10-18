package typings.opentelemetryCore

import typings.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeTimerUtilMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/node/timer-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unrefTimer(timer: Timer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unrefTimer")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
