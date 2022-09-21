package typings.opentelemetryApi

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetryApi.spanMod.Span
import typings.opentelemetryApi.spanOptionsMod.SpanOptions
import typings.opentelemetryApi.tracerMod.Tracer
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopTracerMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/NoopTracer", "NoopTracer")
  @js.native
  open class NoopTracer ()
    extends StObject
       with Tracer {
    
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, ReturnType[F]] */](name: String, opts: Unit, ctx: Unit, fn: F): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, ReturnType[F]] */](name: String, opts: Unit, ctx: Context, fn: F): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, ReturnType[F]] */](name: String, opts: Unit, fn: F): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, ReturnType[F]] */](name: String, opts: SpanOptions, ctx: Unit, fn: F): ReturnType[F] = js.native
  }
}
