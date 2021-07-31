package typings.opentelemetryApi

import typings.opentelemetryApi.spanContextMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spancontextUtilsMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", "INVALID_SPANID")
  @js.native
  val INVALID_SPANID: /* "0000000000000000" */ String = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", "INVALID_SPAN_CONTEXT")
  @js.native
  val INVALID_SPAN_CONTEXT: SpanContext = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", "INVALID_TRACEID")
  @js.native
  val INVALID_TRACEID: /* "00000000000000000000000000000000" */ String = js.native
  
  @scala.inline
  def isSpanContextValid(spanContext: SpanContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpanContextValid")(spanContext.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidSpanId(spanId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidSpanId")(spanId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidTraceId(traceId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTraceId")(traceId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
