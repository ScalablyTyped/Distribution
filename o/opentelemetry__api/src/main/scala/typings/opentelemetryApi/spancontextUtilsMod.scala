package typings.opentelemetryApi

import typings.opentelemetryApi.spanContextMod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/trace/spancontext-utils", JSImport.Namespace)
@js.native
object spancontextUtilsMod extends js.Object {
  
  val INVALID_SPANID: /* "0000000000000000" */ String = js.native
  
  val INVALID_SPAN_CONTEXT: SpanContext = js.native
  
  val INVALID_TRACEID: /* "00000000000000000000000000000000" */ String = js.native
  
  def isSpanContextValid(spanContext: SpanContext): Boolean = js.native
  
  def isValidSpanId(spanId: String): Boolean = js.native
  
  def isValidTraceId(traceId: String): Boolean = js.native
}
