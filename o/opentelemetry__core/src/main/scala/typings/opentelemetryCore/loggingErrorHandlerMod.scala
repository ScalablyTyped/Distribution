package typings.opentelemetryCore

import typings.opentelemetryCore.typesMod.ErrorHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingErrorHandlerMod {
  
  @JSImport("@opentelemetry/core/build/src/common/logging-error-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loggingErrorHandler(): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingErrorHandler")().asInstanceOf[ErrorHandler]
}
