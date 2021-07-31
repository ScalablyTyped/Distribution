package typings.opentelemetryTracing

import typings.opentelemetryApi.linkMod.Link
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanKindMod.SpanKind
import typings.opentelemetryApi.timeMod.TimeInput
import typings.opentelemetryCore.typesMod.InstrumentationLibrary
import typings.opentelemetryTracing.spanExporterMod.SpanExporter
import typings.opentelemetryTracing.typesMod.BufferConfig
import typings.opentelemetryTracing.typesMod.TracerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/tracing", "BasicTracerProvider")
  @js.native
  class BasicTracerProvider ()
    extends typings.opentelemetryTracing.basicTracerProviderMod.BasicTracerProvider {
    def this(config: TracerConfig) = this()
  }
  
  @JSImport("@opentelemetry/tracing", "BatchSpanProcessor")
  @js.native
  class BatchSpanProcessor protected ()
    extends typings.opentelemetryTracing.batchSpanProcessorMod.BatchSpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
  }
  
  @JSImport("@opentelemetry/tracing", "ConsoleSpanExporter")
  @js.native
  class ConsoleSpanExporter ()
    extends typings.opentelemetryTracing.consoleSpanExporterMod.ConsoleSpanExporter
  
  @JSImport("@opentelemetry/tracing", "InMemorySpanExporter")
  @js.native
  class InMemorySpanExporter ()
    extends typings.opentelemetryTracing.inMemorySpanExporterMod.InMemorySpanExporter
  
  @JSImport("@opentelemetry/tracing", "SimpleSpanProcessor")
  @js.native
  class SimpleSpanProcessor protected ()
    extends typings.opentelemetryTracing.simpleSpanProcessorMod.SimpleSpanProcessor {
    def this(_exporter: SpanExporter) = this()
  }
  
  @JSImport("@opentelemetry/tracing", "Span")
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
      parentSpanId: String,
      links: js.Array[Link]
    ) = this()
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link]
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
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: String,
      links: Unit,
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: js.Array[Link],
      startTime: TimeInput
    ) = this()
    def this(
      parentTracer: typings.opentelemetryTracing.tracerMod.Tracer,
      spanName: String,
      spanContext: SpanContext,
      kind: SpanKind,
      parentSpanId: Unit,
      links: Unit,
      startTime: TimeInput
    ) = this()
  }
  
  @JSImport("@opentelemetry/tracing", "Tracer")
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
