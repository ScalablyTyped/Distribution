package typings.opentelemetryApi

import typings.opentelemetryApi.spanContextMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spancontextUtilsMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", "INVALID_SPANID")
  @js.native
  val INVALID_SPANID: /* "0000000000000000" */ String = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", "INVALID_SPAN_CONTEXT")
  @js.native
  val INVALID_SPAN_CONTEXT: SpanContext = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", "INVALID_TRACEID")
  @js.native
  val INVALID_TRACEID: /* "00000000000000000000000000000000" */ String = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", "isSpanContextValid")
  @js.native
  def isSpanContextValid(spanContext: SpanContext): Boolean = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", "isValidSpanId")
  @js.native
  def isValidSpanId(spanId: String): Boolean = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", "isValidTraceId")
  @js.native
  def isValidTraceId(traceId: String): Boolean = js.native
}
