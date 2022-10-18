package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel
import typings.opentelemetryApi.buildSrcDiagTypesMod.DiagLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDiagInternalLogLevelLoggerMod {
  
  @JSImport("@opentelemetry/api/build/src/diag/internal/logLevelLogger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLogLevelDiagLogger(maxLevel: DiagLogLevel, logger: DiagLogger): DiagLogger = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogLevelDiagLogger")(maxLevel.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[DiagLogger]
}
