package typings.opentelemetryCore

import typings.opentelemetryApi.buildSrcCommonExceptionMod.Exception
import typings.opentelemetryCore.buildSrcCommonTypesMod.ErrorHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCommonGlobalErrorHandlerMod {
  
  @JSImport("@opentelemetry/core/build/src/common/global-error-handler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def globalErrorHandler(ex: Exception): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("globalErrorHandler")(ex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setGlobalErrorHandler(handler: ErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalErrorHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
