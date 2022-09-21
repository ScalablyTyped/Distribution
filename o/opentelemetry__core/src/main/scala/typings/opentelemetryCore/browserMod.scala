package typings.opentelemetryCore

import typings.opentelemetryCore.utilsEnvironmentMod.ENVIRONMENT
import typings.std.Performance
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typings.opentelemetryCore.randomIdGeneratorMod.RandomIdGenerator
  
  inline def getEnv(): Required[ENVIRONMENT] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[Required[ENVIRONMENT]]
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", "_globalThis")
  @js.native
  val globalThis: /* globalThis */ Any = js.native
  
  inline def hexToBase64(hexStr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBase64")(hexStr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@opentelemetry/core/build/src/platform/browser", "otperformance")
  @js.native
  val otperformance: Performance = js.native
  
  inline def unrefTimer(_timer: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unrefTimer")(_timer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
