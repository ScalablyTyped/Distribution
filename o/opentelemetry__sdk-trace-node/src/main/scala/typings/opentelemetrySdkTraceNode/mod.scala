package typings.opentelemetrySdkTraceNode

import typings.opentelemetryApi.buildSrcCommonTimeMod.TimeInput
import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import typings.opentelemetryApi.buildSrcTraceLinkMod.Link
import typings.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import typings.opentelemetryApi.buildSrcTraceSpanKindMod.SpanKind
import typings.opentelemetryCore.buildSrcCommonTypesMod.InstrumentationLibrary
import typings.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.EXPORTER_FACTORY
import typings.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.PROPAGATOR_FACTORY
import typings.opentelemetrySdkTraceBase.buildSrcExportSpanExporterMod.SpanExporter
import typings.opentelemetrySdkTraceBase.buildSrcSamplerParentBasedSamplerMod.ParentBasedSamplerConfig
import typings.opentelemetrySdkTraceBase.buildSrcTypesMod.BufferConfig
import typings.opentelemetrySdkTraceBase.buildSrcTypesMod.TracerConfig
import typings.opentelemetrySdkTraceNode.buildSrcConfigMod.NodeTracerConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/sdk-trace-node", "AlwaysOffSampler")
  @js.native
  open class AlwaysOffSampler ()
    extends typings.opentelemetrySdkTraceBase.mod.AlwaysOffSampler
  
  @JSImport("@opentelemetry/sdk-trace-node", "AlwaysOnSampler")
  @js.native
  open class AlwaysOnSampler ()
    extends typings.opentelemetrySdkTraceBase.mod.AlwaysOnSampler
  
  @JSImport("@opentelemetry/sdk-trace-node", "BasicTracerProvider")
  @js.native
  open class BasicTracerProvider ()
    extends typings.opentelemetrySdkTraceBase.mod.BasicTracerProvider {
    def this(config: TracerConfig) = this()
  }
  /* static members */
  object BasicTracerProvider {
    
    @JSImport("@opentelemetry/sdk-trace-node", "BasicTracerProvider._registeredExporters")
    @js.native
    val _registeredExporters: Map[String, EXPORTER_FACTORY] = js.native
    
    @JSImport("@opentelemetry/sdk-trace-node", "BasicTracerProvider._registeredPropagators")
    @js.native
    val _registeredPropagators: Map[String, PROPAGATOR_FACTORY] = js.native
  }
  
  @JSImport("@opentelemetry/sdk-trace-node", "BatchSpanProcessor")
  @js.native
  open class BatchSpanProcessor protected ()
    extends typings.opentelemetrySdkTraceBase.mod.BatchSpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-node", "ConsoleSpanExporter")
  @js.native
  open class ConsoleSpanExporter ()
    extends typings.opentelemetrySdkTraceBase.mod.ConsoleSpanExporter
  
  @JSImport("@opentelemetry/sdk-trace-node", "ForceFlushState")
  @js.native
  object ForceFlushState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.ForceFlushState & Double
      ] = js.native
    
    /* 2 */ val error: typings.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.ForceFlushState.error & Double = js.native
    
    /* 0 */ val resolved: typings.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.ForceFlushState.resolved & Double = js.native
    
    /* 1 */ val timeout: typings.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.ForceFlushState.timeout & Double = js.native
    
    /* 3 */ val unresolved: typings.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.ForceFlushState.unresolved & Double = js.native
  }
  
  @JSImport("@opentelemetry/sdk-trace-node", "InMemorySpanExporter")
  @js.native
  open class InMemorySpanExporter ()
    extends typings.opentelemetrySdkTraceBase.mod.InMemorySpanExporter
  
  @JSImport("@opentelemetry/sdk-trace-node", "NodeTracerProvider")
  @js.native
  open class NodeTracerProvider ()
    extends typings.opentelemetrySdkTraceNode.buildSrcNodeTracerProviderMod.NodeTracerProvider {
    def this(config: NodeTracerConfig) = this()
  }
  /* static members */
  object NodeTracerProvider {
    
    @JSImport("@opentelemetry/sdk-trace-node", "NodeTracerProvider._registeredPropagators")
    @js.native
    val _registeredPropagators: Map[String, PROPAGATOR_FACTORY] = js.native
  }
  
  @JSImport("@opentelemetry/sdk-trace-node", "NoopSpanProcessor")
  @js.native
  open class NoopSpanProcessor ()
    extends typings.opentelemetrySdkTraceBase.mod.NoopSpanProcessor
  
  @JSImport("@opentelemetry/sdk-trace-node", "ParentBasedSampler")
  @js.native
  open class ParentBasedSampler protected ()
    extends typings.opentelemetrySdkTraceBase.mod.ParentBasedSampler {
    def this(config: ParentBasedSamplerConfig) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-node", "RandomIdGenerator")
  @js.native
  open class RandomIdGenerator ()
    extends typings.opentelemetrySdkTraceBase.mod.RandomIdGenerator
  
  @JSImport("@opentelemetry/sdk-trace-node", "SamplingDecision")
  @js.native
  object SamplingDecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetrySdkTraceBase.buildSrcSamplerMod.SamplingDecision & Double] = js.native
    
    /* 0 */ val NOT_RECORD: typings.opentelemetrySdkTraceBase.buildSrcSamplerMod.SamplingDecision.NOT_RECORD & Double = js.native
    
    /* 1 */ val RECORD: typings.opentelemetrySdkTraceBase.buildSrcSamplerMod.SamplingDecision.RECORD & Double = js.native
    
    /* 2 */ val RECORD_AND_SAMPLED: typings.opentelemetrySdkTraceBase.buildSrcSamplerMod.SamplingDecision.RECORD_AND_SAMPLED & Double = js.native
  }
  
  @JSImport("@opentelemetry/sdk-trace-node", "SimpleSpanProcessor")
  @js.native
  open class SimpleSpanProcessor protected ()
    extends typings.opentelemetrySdkTraceBase.mod.SimpleSpanProcessor {
    def this(_exporter: SpanExporter) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-node", "Span")
  @js.native
  open class Span protected ()
    extends typings.opentelemetrySdkTraceBase.mod.Span {
    /**
      * Constructs a new Span instance.
      *
      * @deprecated calling Span constructor directly is not supported. Please use tracer.startSpan.
      * */
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: Unit,
      _deprecatedClock: Any
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: TimeInput,
      _deprecatedClock: Any
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: Unit,
      _deprecatedClock: Any
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: TimeInput,
      _deprecatedClock: Any
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: Unit,
      _deprecatedClock: Any
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: TimeInput,
      _deprecatedClock: Any
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: Unit,
      _deprecatedClock: Any
    ) = this()
    def this(
      parentTracer: typings.opentelemetrySdkTraceBase.buildSrcTracerMod.Tracer,
      context: Context,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: TimeInput,
      _deprecatedClock: Any
    ) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-node", "TraceIdRatioBasedSampler")
  @js.native
  open class TraceIdRatioBasedSampler ()
    extends typings.opentelemetrySdkTraceBase.mod.TraceIdRatioBasedSampler {
    def this(_ratio: Double) = this()
  }
  
  @JSImport("@opentelemetry/sdk-trace-node", "Tracer")
  @js.native
  open class Tracer protected ()
    extends typings.opentelemetrySdkTraceBase.mod.Tracer {
    /**
      * Constructs a new Tracer instance.
      */
    def this(
      instrumentationLibrary: InstrumentationLibrary,
      config: TracerConfig,
      _tracerProvider: typings.opentelemetrySdkTraceBase.buildSrcBasicTracerProviderMod.BasicTracerProvider
    ) = this()
  }
}
