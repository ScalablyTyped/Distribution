package typings.opentelemetryApi

import typings.opentelemetryApi.traceStateMod.TraceState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalUtilsMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/internal/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTraceState(): TraceState = ^.asInstanceOf[js.Dynamic].applyDynamic("createTraceState")().asInstanceOf[TraceState]
  inline def createTraceState(rawTraceState: String): TraceState = ^.asInstanceOf[js.Dynamic].applyDynamic("createTraceState")(rawTraceState.asInstanceOf[js.Any]).asInstanceOf[TraceState]
}
