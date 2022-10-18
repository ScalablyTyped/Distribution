package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import typings.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import typings.opentelemetryApi.buildSrcTraceSpanMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceContextUtilsMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/context-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteSpan(context: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteSpan")(context.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  inline def getActiveSpan(): js.UndefOr[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveSpan")().asInstanceOf[js.UndefOr[Span]]
  
  inline def getSpan(context: Context): js.UndefOr[Span] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpan")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Span]]
  
  inline def getSpanContext(context: Context): js.UndefOr[SpanContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpanContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SpanContext]]
  
  inline def setSpan(context: Context, span: Span): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("setSpan")(context.asInstanceOf[js.Any], span.asInstanceOf[js.Any])).asInstanceOf[Context]
  
  inline def setSpanContext(context: Context, spanContext: SpanContext): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("setSpanContext")(context.asInstanceOf[js.Any], spanContext.asInstanceOf[js.Any])).asInstanceOf[Context]
}
