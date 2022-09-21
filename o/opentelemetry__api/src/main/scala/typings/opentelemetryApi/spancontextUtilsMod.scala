package typings.opentelemetryApi

import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spancontextUtilsMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSpanContextValid(spanContext: SpanContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpanContextValid")(spanContext.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidSpanId(spanId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSpanId")(spanId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidTraceId(traceId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTraceId")(traceId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def wrapSpanContext(spanContext: SpanContext): Span = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapSpanContext")(spanContext.asInstanceOf[js.Any]).asInstanceOf[Span]
}
