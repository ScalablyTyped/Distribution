package typings.opentelemetryCore

import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanMod.Span
import typings.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("@opentelemetry/core/build/src/context/context", "ACTIVE_SPAN_KEY")
  @js.native
  val ACTIVE_SPAN_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/context", "SUPPRESS_INSTRUMENTATION_KEY")
  @js.native
  val SUPPRESS_INSTRUMENTATION_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/context", "getActiveSpan")
  @js.native
  def getActiveSpan(context: Context): js.UndefOr[Span] = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/context", "getExtractedSpanContext")
  @js.native
  def getExtractedSpanContext(context: Context): js.UndefOr[SpanContext] = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/context", "getParentSpanContext")
  @js.native
  def getParentSpanContext(context: Context): js.UndefOr[SpanContext] = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/context", "isInstrumentationSuppressed")
  @js.native
  def isInstrumentationSuppressed(context: Context): Boolean = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/context", "setActiveSpan")
  @js.native
  def setActiveSpan(context: Context, span: Span): Context = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/context", "setExtractedSpanContext")
  @js.native
  def setExtractedSpanContext(context: Context, spanContext: SpanContext): Context = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/context", "suppressInstrumentation")
  @js.native
  def suppressInstrumentation(context: Context): Context = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/context", "unsuppressInstrumentation")
  @js.native
  def unsuppressInstrumentation(context: Context): Context = js.native
}
