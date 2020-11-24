package typings.opentelemetryTracing

import typings.opentelemetryApi.linkMod.Link
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanKindMod.SpanKind
import typings.opentelemetryApi.timeMod.TimeInput
import typings.opentelemetryCore.typesMod.InstrumentationLibrary
import typings.opentelemetryTracing.spanExporterMod.SpanExporter
import typings.opentelemetryTracing.typesMod.BufferConfig
import typings.opentelemetryTracing.typesMod.TracerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/tracing", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class BasicTracerProvider ()
    extends typings.opentelemetryTracing.basicTracerProviderMod.BasicTracerProvider {
    def this(config: TracerConfig) = this()
  }
  
  @js.native
  class BatchSpanProcessor protected ()
    extends typings.opentelemetryTracing.batchSpanProcessorMod.BatchSpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
  
  @js.native
  class ConsoleSpanExporter ()
    extends typings.opentelemetryTracing.consoleSpanExporterMod.ConsoleSpanExporter
  
  @js.native
  class InMemorySpanExporter ()
    extends typings.opentelemetryTracing.inMemorySpanExporterMod.InMemorySpanExporter
  
  @js.native
  class SimpleSpanProcessor protected ()
    extends typings.opentelemetryTracing.simpleSpanProcessorMod.SimpleSpanProcessor {
    def this(_exporter: SpanExporter) = this()
  }
  
  @js.native
  class Span protected ()
    extends typings.opentelemetryTracing.spanMod.Span {
    /** Constructs a new Span instance. */
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind
    ) = this()
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String
    ) = this()
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.UndefOr[scala.Nothing],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: js.UndefOr[scala.Nothing],
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.UndefOr[scala.Nothing],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
  }
  
  @js.native
  class Tracer protected ()
    extends typings.opentelemetryTracing.tracerMod.Tracer {
    /**
      * Constructs a new Tracer instance.
      */
    def this(
      instrumentationLibrary: InstrumentationLibrary,
      config: TracerConfig,
      _tracerProvider: typings.opentelemetryTracing.basicTracerProviderMod.BasicTracerProvider
    ) = this()
  }
}
