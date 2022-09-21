package typings.opentelemetryCore

import typings.node.perfHooksMod.Performance_
import typings.node.timersMod.global.NodeJS.Timer
import typings.opentelemetryCore.utilsEnvironmentMod.ENVIRONMENT
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform/node", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typings.opentelemetryCore.nodeRandomIdGeneratorMod.RandomIdGenerator
  
  inline def getEnv(): Required[ENVIRONMENT] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[Required[ENVIRONMENT]]
  
  @JSImport("@opentelemetry/core/build/src/platform/node", "_globalThis")
  @js.native
  val globalThis: /* globalThis */ Any = js.native
  
  inline def hexToBase64(hexStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBase64")(hexStr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@opentelemetry/core/build/src/platform/node", "otperformance")
  @js.native
  val otperformance: Performance_ = js.native
  
  inline def unrefTimer(timer: Timer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unrefTimer")(timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
