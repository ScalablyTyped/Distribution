package typings.opentelemetryCore

import typings.opentelemetryCore.buildSrcUtilsEnvironmentMod.ENVIRONMENT
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformNodeEnvironmentMod {
  
  @JSImport("@opentelemetry/core/build/src/platform/node/environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEnv(): Required[ENVIRONMENT] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnv")().asInstanceOf[Required[ENVIRONMENT]]
}
