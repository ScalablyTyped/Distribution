package typings.opentelemetryApi

import typings.opentelemetryApi.diagTypesMod.DiagLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopLoggerMod {
  
  @JSImport("@opentelemetry/api/build/src/diag/internal/noopLogger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNoopDiagLogger(): DiagLogger = ^.asInstanceOf[js.Dynamic].applyDynamic("createNoopDiagLogger")().asInstanceOf[DiagLogger]
}
