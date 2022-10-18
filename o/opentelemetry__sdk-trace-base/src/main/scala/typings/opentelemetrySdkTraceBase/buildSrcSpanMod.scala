package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.buildSrcCommonTimeMod.HrTime
import typings.opentelemetryApi.buildSrcCommonTimeMod.TimeInput
import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import typings.opentelemetryApi.buildSrcTraceAttributesMod.SpanAttributes
import typings.opentelemetryApi.buildSrcTraceLinkMod.Link
import typings.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import typings.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind
import typings.opentelemetryApi.buildSrcTraceStatusMod.SpanStatus
import typings.opentelemetryCore.buildSrcCommonAnchoredClockMod.Clock
import typings.opentelemetryCore.buildSrcCommonTypesMod.InstrumentationLibrary
import typings.opentelemetryResources.mod.Resource
import typings.opentelemetrySdkTraceBase.buildSrcExportReadableSpanMod.ReadableSpan
import typings.opentelemetrySdkTraceBase.buildSrcTimedEventMod.TimedEvent
import typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSpanMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/Span", "Span")
  @js.native
  open class Span protected ()
    extends StObject
       with typings.opentelemetryApi.buildSrcTraceSpanMod.Span
       with ReadableSpan {
    /**
      * Constructs a new Span instance.
      *
      * @deprecated calling Span constructor directly is not supported. Please use tracer.startSpan.
      * */
    def this(parentTracer: Tracer, context: Context, spanName: String, spanContext: SpanContext, kind: SpanKind) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: Unit,
      clock: Clock
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: TimeInput,
      clock: Clock
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: Unit,
      clock: Clock
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: TimeInput,
      clock: Clock
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: Unit,
      clock: Clock
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: TimeInput,
      clock: Clock
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: Unit,
      clock: Clock
    ) = this()
    def this(
      parentTracer: Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: TimeInput,
      clock: Clock
    ) = this()
    
    /* private */ val _attributeValueLengthLimit: Any = js.native
    
    /* private */ val _clock: Any = js.native
    
    /* private */ var _duration: Any = js.native
    
    /* private */ var _ended: Any = js.native
    
    /* private */ var _isSpanEnded: Any = js.native
    
    /* private */ val _spanContext: Any = js.native
    
    /* private */ val _spanLimits: Any = js.native
    
    /* private */ val _spanProcessor: Any = js.native
    
    /* private */ var _truncateToLimitUtil: Any = js.native
    
    /**
      * If the given attribute value is of type string and has more characters than given {@code attributeValueLengthLimit} then
      * return string with trucated to {@code attributeValueLengthLimit} characters
      *
      * If the given attribute value is array of strings then
      * return new array of strings with each element truncated to {@code attributeValueLengthLimit} characters
      *
      * Otherwise return same Attribute {@code value}
      *
      * @param value Attribute value
      * @returns truncated attribute value if required, otherwise same value
      */
    /* private */ var _truncateToSize: Any = js.native
    
    /* CompleteClass */
    override val attributes: SpanAttributes = js.native
    
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
    
    def setAttribute(key: String): this.type = js.native
    
    /**
      * Returns the {@link SpanContext} object associated with this Span.
      *
      * Get an immutable, serializable identifier for this span that can be used
      * to create new child spans. Returned SpanContext is usable even after the
      * span ends.
      *
      * @returns the SpanContext object associated with this Span.
      */
    /* InferMemberOverrides */
    override def spanContext(): SpanContext = js.native
    
    /* CompleteClass */
    override val startTime: HrTime = js.native
    
    /* CompleteClass */
    override val status: SpanStatus = js.native
  }
}
