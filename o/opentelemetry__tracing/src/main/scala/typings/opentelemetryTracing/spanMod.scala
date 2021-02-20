package typings.opentelemetryTracing

import typings.opentelemetryApi.linkMod.Link
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanKindMod.SpanKind
import typings.opentelemetryApi.timeMod.TimeInput
import typings.opentelemetryTracing.readableSpanMod.ReadableSpan
import typings.opentelemetryTracing.tracerMod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanMod {
  
  @JSImport("@opentelemetry/tracing/build/src/Span", "Span")
  @js.native
  class Span protected ()
    extends typings.opentelemetryApi.spanMod.Span
       with ReadableSpan {
    /** Constructs a new Span instance. */
    def this(parentTracer: Tracer, spanName: String, spanContext: SpanContext, kind: SpanKind) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.UndefOr[scala.Nothing],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.UndefOr[scala.Nothing],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    
    var _duration: js.Any = js.native
    
    var _ended: js.Any = js.native
    
    var _isSpanEnded: js.Any = js.native
    
    val _logger: js.Any = js.native
    
    val _spanProcessor: js.Any = js.native
    
    val _traceParams: js.Any = js.native
  }
}
