package typings.opentelemetryCore

import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanMod.Span
import typings.opentelemetryContextBase.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/context/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
  val ACTIVE_SPAN_KEY: js.Symbol = js.native
  
  val SUPPRESS_INSTRUMENTATION_KEY: js.Symbol = js.native
  
  def getActiveSpan(context: Context): js.UndefOr[Span] = js.native
  
  def getExtractedSpanContext(context: Context): js.UndefOr[SpanContext] = js.native
  
  def getParentSpanContext(context: Context): js.UndefOr[SpanContext] = js.native
  
  def isInstrumentationSuppressed(context: Context): Boolean = js.native
  
  def setActiveSpan(context: Context, span: Span): Context = js.native
  
  def setExtractedSpanContext(context: Context, spanContext: SpanContext): Context = js.native
  
  def suppressInstrumentation(context: Context): Context = js.native
  
  def unsuppressInstrumentation(context: Context): Context = js.native
}
