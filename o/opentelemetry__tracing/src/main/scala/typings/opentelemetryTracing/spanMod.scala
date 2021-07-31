package typings.opentelemetryTracing

import typings.opentelemetryApi.attributesMod.Attributes
import typings.opentelemetryApi.linkMod.Link
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanKindMod.SpanKind
import typings.opentelemetryApi.statusMod.Status
import typings.opentelemetryApi.timeMod.HrTime
import typings.opentelemetryApi.timeMod.TimeInput
import typings.opentelemetryApi.timedEventMod.TimedEvent
import typings.opentelemetryCore.typesMod.InstrumentationLibrary
import typings.opentelemetryResources.mod.Resource
import typings.opentelemetryTracing.readableSpanMod.ReadableSpan
import typings.opentelemetryTracing.tracerMod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanMod {
  
  @JSImport("@opentelemetry/tracing/build/src/Span", "Span")
  @js.native
  class Span protected ()
    extends StObject
       with typings.opentelemetryApi.spanMod.Span
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
      parentSpanId: String,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link]
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
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: TimeInput
    ) = this()
    
    var _duration: js.Any = js.native
    
    var _ended: js.Any = js.native
    
    var _isSpanEnded: js.Any = js.native
    
    val _logger: js.Any = js.native
    
    val _spanProcessor: js.Any = js.native
    
    val _traceParams: js.Any = js.native
    
    /* CompleteClass */
    override val attributes: Attributes = js.native
    
    /* CompleteClass */
    override val duration: HrTime = js.native
    
    /* CompleteClass */
    override val endTime: HrTime = js.native
    
    /* CompleteClass */
    override val ended: Boolean = js.native
    
    /* CompleteClass */
    override val events: js.Array[TimedEvent] = js.native
    
    /* CompleteClass */
    override val instrumentationLibrary: InstrumentationLibrary = js.native
    
    /* CompleteClass */
    override val kind: SpanKind = js.native
    
    /* CompleteClass */
    override val links: js.Array[Link] = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    
    /* CompleteClass */
    override val resource: Resource = js.native
    
    /* CompleteClass */
    override val spanContext: SpanContext = js.native
    
    /* CompleteClass */
    override val startTime: HrTime = js.native
    
    /* CompleteClass */
    override val status: Status = js.native
  }
}
