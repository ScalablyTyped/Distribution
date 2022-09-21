package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetryApi.linkMod.Link
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanKindMod.SpanKind
import typings.opentelemetryApi.timeMod.TimeInput
import typings.opentelemetryCore.anchoredClockMod.Clock
import typings.opentelemetryCore.typesMod.InstrumentationLibrary
import typings.opentelemetrySdkTraceBase.basicTracerProviderMod.EXPORTER_FACTORY
import typings.opentelemetrySdkTraceBase.basicTracerProviderMod.PROPAGATOR_FACTORY
import typings.opentelemetrySdkTraceBase.parentBasedSamplerMod.ParentBasedSamplerConfig
import typings.opentelemetrySdkTraceBase.spanExporterMod.SpanExporter
import typings.opentelemetrySdkTraceBase.typesMod.BufferConfig
import typings.opentelemetrySdkTraceBase.typesMod.TracerConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/sdk-trace-base", "AlwaysOffSampler")
  @js.native
  open class AlwaysOffSampler ()
    extends typings.opentelemetrySdkTraceBase.alwaysOffSamplerMod.AlwaysOffSampler
  
  @JSImport("@opentelemetry/sdk-trace-base", "AlwaysOnSampler")
  @js.native
  open class AlwaysOnSampler ()
    extends typings.opentelemetrySdkTraceBase.alwaysOnSamplerMod.AlwaysOnSampler
  
  @JSImport("@opentelemetry/sdk-trace-base", "BasicTracerProvider")
  @js.native
  open class BasicTracerProvider ()
    extends typings.opentelemetrySdkTraceBase.basicTracerProviderMod.BasicTracerProvider {
    def this(config: TracerConfig) = this()
  }
  /* static members */
  object BasicTracerProvider {
    
    @JSImport("@opentelemetry/sdk-trace-base", "BasicTracerProvider._registeredExporters")
    @js.native
    val _registeredExporters: Map[String, EXPORTER_FACTORY] = js.native
    
    @JSImport("@opentelemetry/sdk-trace-base", "BasicTracerProvider._registeredPropagators")
    @js.native
    val _registeredPropagators: Map[String, PROPAGATOR_FACTORY] = js.native
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "BatchSpanProcessor")
  @js.native
  open class BatchSpanProcessor protected ()
    extends typings.opentelemetrySdkTraceBase.platformMod.BatchSpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "ConsoleSpanExporter")
  @js.native
  open class ConsoleSpanExporter ()
    extends typings.opentelemetrySdkTraceBase.consoleSpanExporterMod.ConsoleSpanExporter
  
  @JSImport("@opentelemetry/sdk-trace-base", "ForceFlushState")
  @js.native
  object ForceFlushState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.opentelemetrySdkTraceBase.basicTracerProviderMod.ForceFlushState & Double
      ] = js.native
    
    /* 2 */ val error: typings.opentelemetrySdkTraceBase.basicTracerProviderMod.ForceFlushState.error & Double = js.native
    
    /* 0 */ val resolved: typings.opentelemetrySdkTraceBase.basicTracerProviderMod.ForceFlushState.resolved & Double = js.native
    
    /* 1 */ val timeout: typings.opentelemetrySdkTraceBase.basicTracerProviderMod.ForceFlushState.timeout & Double = js.native
    
    /* 3 */ val unresolved: typings.opentelemetrySdkTraceBase.basicTracerProviderMod.ForceFlushState.unresolved & Double = js.native
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "InMemorySpanExporter")
  @js.native
  open class InMemorySpanExporter ()
    extends typings.opentelemetrySdkTraceBase.inMemorySpanExporterMod.InMemorySpanExporter
  
  @JSImport("@opentelemetry/sdk-trace-base", "NoopSpanProcessor")
  @js.native
  open class NoopSpanProcessor ()
    extends typings.opentelemetrySdkTraceBase.noopSpanProcessorMod.NoopSpanProcessor
  
  @JSImport("@opentelemetry/sdk-trace-base", "ParentBasedSampler")
  @js.native
  open class ParentBasedSampler protected ()
    extends typings.opentelemetrySdkTraceBase.parentBasedSamplerMod.ParentBasedSampler {
    def this(config: ParentBasedSamplerConfig) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typings.opentelemetrySdkTraceBase.platformMod.RandomIdGenerator
  
  @JSImport("@opentelemetry/sdk-trace-base", "SamplingDecision")
  @js.native
  object SamplingDecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetrySdkTraceBase.samplerMod.SamplingDecision & Double] = js.native
    
    /* 0 */ val NOT_RECORD: typings.opentelemetrySdkTraceBase.samplerMod.SamplingDecision.NOT_RECORD & Double = js.native
    
    /* 1 */ val RECORD: typings.opentelemetrySdkTraceBase.samplerMod.SamplingDecision.RECORD & Double = js.native
    
    /* 2 */ val RECORD_AND_SAMPLED: typings.opentelemetrySdkTraceBase.samplerMod.SamplingDecision.RECORD_AND_SAMPLED & Double = js.native
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "SimpleSpanProcessor")
  @js.native
  open class SimpleSpanProcessor protected ()
    extends typings.opentelemetrySdkTraceBase.simpleSpanProcessorMod.SimpleSpanProcessor {
    def this(_exporter: SpanExporter) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "Span")
  @js.native
  open class Span protected ()
    extends typings.opentelemetrySdkTraceBase.spanMod.Span {
    /**
      * Constructs a new Span instance.
      *
      * @deprecated calling Span constructor directly is not supported. Please use tracer.startSpan.
      * */
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
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
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
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
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
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
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
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
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
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
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
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
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
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
      parentTracer: typings.opentelemetrySdkTraceBase.tracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: TimeInput,
      clock: Clock
    ) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "TraceIdRatioBasedSampler")
  @js.native
  open class TraceIdRatioBasedSampler ()
    extends typings.opentelemetrySdkTraceBase.traceIdRatioBasedSamplerMod.TraceIdRatioBasedSampler {
    def this(_ratio: Double) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-base", "Tracer")
  @js.native
  open class Tracer protected ()
    extends typings.opentelemetrySdkTraceBase.tracerMod.Tracer {
    /**
      * Constructs a new Tracer instance.
      */
    def this(
      instrumentationLibrary: InstrumentationLibrary,
      config: TracerConfig,
      _tracerProvider: typings.opentelemetrySdkTraceBase.basicTracerProviderMod.BasicTracerProvider
    ) = this()
  }
}
