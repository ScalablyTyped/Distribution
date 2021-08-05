package typings.opentelemetryCore

import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanMod.Span
import typings.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("@opentelemetry/core/build/src/context/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/context", "ACTIVE_SPAN_KEY")
  @js.native
  val ACTIVE_SPAN_KEY: js.Symbol = js.native
  
  @JSImport("@opentelemetry/core/build/src/context/context", "SUPPRESS_INSTRUMENTATION_KEY")
  @js.native
  val SUPPRESS_INSTRUMENTATION_KEY: js.Symbol = js.native
  
  inline def getActiveSpan(context: Context): js.UndefOr[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSpan")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Span]]
  
  inline def getExtractedSpanContext(context: Context): js.UndefOr[SpanContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtractedSpanContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SpanContext]]
  
  inline def getParentSpanContext(context: Context): js.UndefOr[SpanContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentSpanContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SpanContext]]
  
  inline def isInstrumentationSuppressed(context: Context): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstrumentationSuppressed")(context.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def setActiveSpan(context: Context, span: Span): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("setActiveSpan")(context.asInstanceOf[js.Any], span.asInstanceOf[js.Any])).asInstanceOf[Context]
  
  inline def setExtractedSpanContext(context: Context, spanContext: SpanContext): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("setExtractedSpanContext")(context.asInstanceOf[js.Any], spanContext.asInstanceOf[js.Any])).asInstanceOf[Context]
  
  inline def suppressInstrumentation(context: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressInstrumentation")(context.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  inline def unsuppressInstrumentation(context: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("unsuppressInstrumentation")(context.asInstanceOf[js.Any]).asInstanceOf[Context]
}
