package typings.opentelemetryApi

import typings.opentelemetryApi.boundInstrumentMod.BoundBaseObserver
import typings.opentelemetryApi.boundInstrumentMod.BoundCounter
import typings.opentelemetryApi.boundInstrumentMod.BoundValueRecorder
import typings.opentelemetryApi.contextMod.ContextAPI
import typings.opentelemetryApi.metricsMod.MetricsAPI
import typings.opentelemetryApi.propagationMod.PropagationAPI
import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.traceMod.TraceAPI
import typings.opentelemetryContextBase.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@opentelemetry/api", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api", "default.context")
    @js.native
    def context: ContextAPI = js.native
    @scala.inline
    def context_=(x: ContextAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.metrics")
    @js.native
    def metrics: MetricsAPI = js.native
    @scala.inline
    def metrics_=(x: MetricsAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metrics")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.propagation")
    @js.native
    def propagation: PropagationAPI = js.native
    @scala.inline
    def propagation_=(x: PropagationAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propagation")(x.asInstanceOf[js.Any])
    
    @JSImport("@opentelemetry/api", "default.trace")
    @js.native
    def trace: TraceAPI = js.native
    @scala.inline
    def trace_=(x: TraceAPI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trace")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@opentelemetry/api", "CanonicalCode")
  @js.native
  object CanonicalCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.statusMod.CanonicalCode & Double] = js.native
    
    /* 10 */ val ABORTED: typings.opentelemetryApi.statusMod.CanonicalCode.ABORTED & Double = js.native
    
    /* 6 */ val ALREADY_EXISTS: typings.opentelemetryApi.statusMod.CanonicalCode.ALREADY_EXISTS & Double = js.native
    
    /* 1 */ val CANCELLED: typings.opentelemetryApi.statusMod.CanonicalCode.CANCELLED & Double = js.native
    
    /* 15 */ val DATA_LOSS: typings.opentelemetryApi.statusMod.CanonicalCode.DATA_LOSS & Double = js.native
    
    /* 4 */ val DEADLINE_EXCEEDED: typings.opentelemetryApi.statusMod.CanonicalCode.DEADLINE_EXCEEDED & Double = js.native
    
    /* 9 */ val FAILED_PRECONDITION: typings.opentelemetryApi.statusMod.CanonicalCode.FAILED_PRECONDITION & Double = js.native
    
    /* 13 */ val INTERNAL: typings.opentelemetryApi.statusMod.CanonicalCode.INTERNAL & Double = js.native
    
    /* 3 */ val INVALID_ARGUMENT: typings.opentelemetryApi.statusMod.CanonicalCode.INVALID_ARGUMENT & Double = js.native
    
    /* 5 */ val NOT_FOUND: typings.opentelemetryApi.statusMod.CanonicalCode.NOT_FOUND & Double = js.native
    
    /* 0 */ val OK: typings.opentelemetryApi.statusMod.CanonicalCode.OK & Double = js.native
    
    /* 11 */ val OUT_OF_RANGE: typings.opentelemetryApi.statusMod.CanonicalCode.OUT_OF_RANGE & Double = js.native
    
    /* 7 */ val PERMISSION_DENIED: typings.opentelemetryApi.statusMod.CanonicalCode.PERMISSION_DENIED & Double = js.native
    
    /* 8 */ val RESOURCE_EXHAUSTED: typings.opentelemetryApi.statusMod.CanonicalCode.RESOURCE_EXHAUSTED & Double = js.native
    
    /* 16 */ val UNAUTHENTICATED: typings.opentelemetryApi.statusMod.CanonicalCode.UNAUTHENTICATED & Double = js.native
    
    /* 14 */ val UNAVAILABLE: typings.opentelemetryApi.statusMod.CanonicalCode.UNAVAILABLE & Double = js.native
    
    /* 12 */ val UNIMPLEMENTED: typings.opentelemetryApi.statusMod.CanonicalCode.UNIMPLEMENTED & Double = js.native
    
    /* 2 */ val UNKNOWN: typings.opentelemetryApi.statusMod.CanonicalCode.UNKNOWN & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "Context")
  @js.native
  /**
    * Construct a new context which inherits values from an optional parent context.
    *
    * @param parentContext a context from which to inherit values
    */
  class Context_ protected () extends Context
  /* static members */
  object Context_ {
    
    @JSImport("@opentelemetry/api", "Context")
    @js.native
    val ^ : js.Any = js.native
    
    /** The root context is used as the default parent context when there is no active context */
    @JSImport("@opentelemetry/api", "Context.ROOT_CONTEXT")
    @js.native
    val ROOT_CONTEXT: typings.opentelemetryContextBase.contextMod.Context = js.native
    
    /**
      * This is another identifier to the root context which allows developers to easily search the
      * codebase for direct uses of context which need to be removed in later PRs.
      *
      * It's existence is temporary and it should be removed when all references are fixed.
      */
    @JSImport("@opentelemetry/api", "Context.TODO")
    @js.native
    val TODO: typings.opentelemetryContextBase.contextMod.Context = js.native
    
    /** Get a key to uniquely identify a context value */
    @scala.inline
    def createKey(description: String): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("createKey")(description.asInstanceOf[js.Any]).asInstanceOf[js.Symbol]
  }
  
  @JSImport("@opentelemetry/api", "EntryTtl")
  @js.native
  object EntryTtl extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.entryValueMod.EntryTtl & Double] = js.native
    
    /* 0 */ val NO_PROPAGATION: typings.opentelemetryApi.entryValueMod.EntryTtl.NO_PROPAGATION & Double = js.native
    
    /* -1 */ val UNLIMITED_PROPAGATION: typings.opentelemetryApi.entryValueMod.EntryTtl.UNLIMITED_PROPAGATION & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "INVALID_SPANID")
  @js.native
  val INVALID_SPANID: /* "0000000000000000" */ String = js.native
  
  @JSImport("@opentelemetry/api", "INVALID_SPAN_CONTEXT")
  @js.native
  val INVALID_SPAN_CONTEXT: SpanContext = js.native
  
  @JSImport("@opentelemetry/api", "INVALID_TRACEID")
  @js.native
  val INVALID_TRACEID: /* "00000000000000000000000000000000" */ String = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_BATCH_OBSERVER_METRIC")
  @js.native
  val NOOP_BATCH_OBSERVER_METRIC: typings.opentelemetryApi.noopMeterMod.NoopBatchObserverMetric = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_BOUND_BASE_OBSERVER")
  @js.native
  val NOOP_BOUND_BASE_OBSERVER: typings.opentelemetryApi.noopMeterMod.NoopBoundBaseObserver = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_BOUND_COUNTER")
  @js.native
  val NOOP_BOUND_COUNTER: typings.opentelemetryApi.noopMeterMod.NoopBoundCounter = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_BOUND_VALUE_RECORDER")
  @js.native
  val NOOP_BOUND_VALUE_RECORDER: typings.opentelemetryApi.noopMeterMod.NoopBoundValueRecorder = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_COUNTER_METRIC")
  @js.native
  val NOOP_COUNTER_METRIC: typings.opentelemetryApi.noopMeterMod.NoopCounterMetric = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_METER")
  @js.native
  val NOOP_METER: typings.opentelemetryApi.noopMeterMod.NoopMeter = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_METER_PROVIDER")
  @js.native
  val NOOP_METER_PROVIDER: typings.opentelemetryApi.noopMeterProviderMod.NoopMeterProvider = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_SPAN")
  @js.native
  val NOOP_SPAN: typings.opentelemetryApi.noopSpanMod.NoopSpan = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_SUM_OBSERVER_METRIC")
  @js.native
  val NOOP_SUM_OBSERVER_METRIC: typings.opentelemetryApi.noopMeterMod.NoopBaseObserverMetric = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_TEXT_MAP_PROPAGATOR")
  @js.native
  val NOOP_TEXT_MAP_PROPAGATOR: typings.opentelemetryApi.noopTextMapPropagatorMod.NoopTextMapPropagator = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_TRACER")
  @js.native
  val NOOP_TRACER: typings.opentelemetryApi.noopTracerMod.NoopTracer = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_TRACER_PROVIDER")
  @js.native
  val NOOP_TRACER_PROVIDER: typings.opentelemetryApi.noopTracerProviderMod.NoopTracerProvider = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_UP_DOWN_SUM_OBSERVER_METRIC")
  @js.native
  val NOOP_UP_DOWN_SUM_OBSERVER_METRIC: typings.opentelemetryApi.noopMeterMod.NoopBaseObserverMetric = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_VALUE_OBSERVER_METRIC")
  @js.native
  val NOOP_VALUE_OBSERVER_METRIC: typings.opentelemetryApi.noopMeterMod.NoopBaseObserverMetric = js.native
  
  @JSImport("@opentelemetry/api", "NOOP_VALUE_RECORDER_METRIC")
  @js.native
  val NOOP_VALUE_RECORDER_METRIC: typings.opentelemetryApi.noopMeterMod.NoopValueRecorderMetric = js.native
  
  @JSImport("@opentelemetry/api", "NoopBaseObserverMetric")
  @js.native
  class NoopBaseObserverMetric protected ()
    extends typings.opentelemetryApi.noopMeterMod.NoopBaseObserverMetric {
    def this(instrument: BoundBaseObserver) = this()
  }
  
  @JSImport("@opentelemetry/api", "NoopBatchObserverMetric")
  @js.native
  class NoopBatchObserverMetric protected ()
    extends typings.opentelemetryApi.noopMeterMod.NoopBatchObserverMetric {
    def this(instrument: Unit) = this()
  }
  
  @JSImport("@opentelemetry/api", "NoopBoundBaseObserver")
  @js.native
  class NoopBoundBaseObserver ()
    extends typings.opentelemetryApi.noopMeterMod.NoopBoundBaseObserver
  
  @JSImport("@opentelemetry/api", "NoopBoundCounter")
  @js.native
  class NoopBoundCounter ()
    extends typings.opentelemetryApi.noopMeterMod.NoopBoundCounter
  
  @JSImport("@opentelemetry/api", "NoopBoundValueRecorder")
  @js.native
  class NoopBoundValueRecorder ()
    extends typings.opentelemetryApi.noopMeterMod.NoopBoundValueRecorder
  
  @JSImport("@opentelemetry/api", "NoopCounterMetric")
  @js.native
  class NoopCounterMetric protected ()
    extends typings.opentelemetryApi.noopMeterMod.NoopCounterMetric {
    def this(instrument: BoundCounter) = this()
  }
  
  @JSImport("@opentelemetry/api", "NoopMeter")
  @js.native
  class NoopMeter ()
    extends typings.opentelemetryApi.noopMeterMod.NoopMeter
  
  @JSImport("@opentelemetry/api", "NoopMeterProvider")
  @js.native
  class NoopMeterProvider ()
    extends typings.opentelemetryApi.noopMeterProviderMod.NoopMeterProvider
  
  @JSImport("@opentelemetry/api", "NoopMetric")
  @js.native
  class NoopMetric[T] protected ()
    extends typings.opentelemetryApi.noopMeterMod.NoopMetric[T] {
    def this(instrument: T) = this()
  }
  
  @JSImport("@opentelemetry/api", "NoopSpan")
  @js.native
  class NoopSpan ()
    extends typings.opentelemetryApi.noopSpanMod.NoopSpan {
    def this(_spanContext: SpanContext) = this()
  }
  
  @JSImport("@opentelemetry/api", "NoopTextMapPropagator")
  @js.native
  class NoopTextMapPropagator ()
    extends typings.opentelemetryApi.noopTextMapPropagatorMod.NoopTextMapPropagator
  
  @JSImport("@opentelemetry/api", "NoopTracer")
  @js.native
  class NoopTracer ()
    extends typings.opentelemetryApi.noopTracerMod.NoopTracer
  
  @JSImport("@opentelemetry/api", "NoopTracerProvider")
  @js.native
  class NoopTracerProvider ()
    extends typings.opentelemetryApi.noopTracerProviderMod.NoopTracerProvider
  
  @JSImport("@opentelemetry/api", "NoopValueRecorderMetric")
  @js.native
  class NoopValueRecorderMetric protected ()
    extends typings.opentelemetryApi.noopMeterMod.NoopValueRecorderMetric {
    def this(instrument: BoundValueRecorder) = this()
  }
  
  @JSImport("@opentelemetry/api", "ProxyTracer")
  @js.native
  class ProxyTracer protected ()
    extends typings.opentelemetryApi.proxyTracerMod.ProxyTracer {
    def this(_provider: typings.opentelemetryApi.proxyTracerProviderMod.ProxyTracerProvider, name: String) = this()
    def this(
      _provider: typings.opentelemetryApi.proxyTracerProviderMod.ProxyTracerProvider,
      name: String,
      version: String
    ) = this()
  }
  
  @JSImport("@opentelemetry/api", "ProxyTracerProvider")
  @js.native
  class ProxyTracerProvider ()
    extends typings.opentelemetryApi.proxyTracerProviderMod.ProxyTracerProvider
  
  @JSImport("@opentelemetry/api", "SamplingDecision")
  @js.native
  object SamplingDecision extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.samplingResultMod.SamplingDecision & Double] = js.native
    
    /* 0 */ val NOT_RECORD: typings.opentelemetryApi.samplingResultMod.SamplingDecision.NOT_RECORD & Double = js.native
    
    /* 1 */ val RECORD: typings.opentelemetryApi.samplingResultMod.SamplingDecision.RECORD & Double = js.native
    
    /* 2 */ val RECORD_AND_SAMPLED: typings.opentelemetryApi.samplingResultMod.SamplingDecision.RECORD_AND_SAMPLED & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "SpanKind")
  @js.native
  object SpanKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.spanKindMod.SpanKind & Double] = js.native
    
    /* 2 */ val CLIENT: typings.opentelemetryApi.spanKindMod.SpanKind.CLIENT & Double = js.native
    
    /* 4 */ val CONSUMER: typings.opentelemetryApi.spanKindMod.SpanKind.CONSUMER & Double = js.native
    
    /* 0 */ val INTERNAL: typings.opentelemetryApi.spanKindMod.SpanKind.INTERNAL & Double = js.native
    
    /* 3 */ val PRODUCER: typings.opentelemetryApi.spanKindMod.SpanKind.PRODUCER & Double = js.native
    
    /* 1 */ val SERVER: typings.opentelemetryApi.spanKindMod.SpanKind.SERVER & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "TraceFlags")
  @js.native
  object TraceFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.traceFlagsMod.TraceFlags & Double] = js.native
    
    /* 0 */ val NONE: typings.opentelemetryApi.traceFlagsMod.TraceFlags.NONE & Double = js.native
    
    /* 1 */ val SAMPLED: typings.opentelemetryApi.traceFlagsMod.TraceFlags.SAMPLED & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "ValueType")
  @js.native
  object ValueType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryApi.metricMod.ValueType & Double] = js.native
    
    /* 1 */ val DOUBLE: typings.opentelemetryApi.metricMod.ValueType.DOUBLE & Double = js.native
    
    /* 0 */ val INT: typings.opentelemetryApi.metricMod.ValueType.INT & Double = js.native
  }
  
  @JSImport("@opentelemetry/api", "context")
  @js.native
  val context: ContextAPI = js.native
  
  @scala.inline
  def defaultGetter(carrier: js.Any, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetter")(carrier.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def defaultSetter(carrier: js.Any, key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultSetter")(carrier.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@opentelemetry/api", "metrics")
  @js.native
  val metrics: MetricsAPI = js.native
  
  @JSImport("@opentelemetry/api", "propagation")
  @js.native
  val propagation: PropagationAPI = js.native
  
  @JSImport("@opentelemetry/api", "trace")
  @js.native
  val trace: TraceAPI = js.native
}
