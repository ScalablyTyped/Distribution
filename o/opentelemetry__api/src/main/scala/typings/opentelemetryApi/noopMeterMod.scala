package typings.opentelemetryApi

import typings.opentelemetryApi.anon.Value
import typings.opentelemetryApi.boundInstrumentMod.BoundBaseObserver
import typings.opentelemetryApi.boundInstrumentMod.BoundCounter
import typings.opentelemetryApi.boundInstrumentMod.BoundValueRecorder
import typings.opentelemetryApi.correlationContextMod.CorrelationContext
import typings.opentelemetryApi.meterMod.Meter
import typings.opentelemetryApi.metricMod.BaseObserver
import typings.opentelemetryApi.metricMod.Counter
import typings.opentelemetryApi.metricMod.UnboundMetric
import typings.opentelemetryApi.metricMod.ValueRecorder
import typings.opentelemetryApi.spanContextMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopMeterMod {
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_BATCH_OBSERVER_METRIC")
  @js.native
  val NOOP_BATCH_OBSERVER_METRIC: NoopBatchObserverMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_BOUND_BASE_OBSERVER")
  @js.native
  val NOOP_BOUND_BASE_OBSERVER: NoopBoundBaseObserver = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_BOUND_COUNTER")
  @js.native
  val NOOP_BOUND_COUNTER: NoopBoundCounter = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_BOUND_VALUE_RECORDER")
  @js.native
  val NOOP_BOUND_VALUE_RECORDER: NoopBoundValueRecorder = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_COUNTER_METRIC")
  @js.native
  val NOOP_COUNTER_METRIC: NoopCounterMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_METER")
  @js.native
  val NOOP_METER: NoopMeter = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_SUM_OBSERVER_METRIC")
  @js.native
  val NOOP_SUM_OBSERVER_METRIC: NoopBaseObserverMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_UP_DOWN_SUM_OBSERVER_METRIC")
  @js.native
  val NOOP_UP_DOWN_SUM_OBSERVER_METRIC: NoopBaseObserverMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_VALUE_OBSERVER_METRIC")
  @js.native
  val NOOP_VALUE_OBSERVER_METRIC: NoopBaseObserverMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NOOP_VALUE_RECORDER_METRIC")
  @js.native
  val NOOP_VALUE_RECORDER_METRIC: NoopValueRecorderMetric = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopBaseObserverMetric")
  @js.native
  class NoopBaseObserverMetric protected ()
    extends NoopMetric[BoundBaseObserver]
       with BaseObserver {
    def this(instrument: BoundBaseObserver) = this()
    
    def observation(): Value = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopBatchObserverMetric")
  @js.native
  class NoopBatchObserverMetric protected () extends NoopMetric[Unit] {
    def this(instrument: Unit) = this()
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopBoundBaseObserver")
  @js.native
  class NoopBoundBaseObserver () extends BoundBaseObserver
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopBoundCounter")
  @js.native
  class NoopBoundCounter () extends BoundCounter
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopBoundValueRecorder")
  @js.native
  class NoopBoundValueRecorder () extends BoundValueRecorder {
    
    def record(value: Double, correlationContext: js.UndefOr[scala.Nothing], spanContext: SpanContext): Unit = js.native
    def record(value: Double, correlationContext: CorrelationContext): Unit = js.native
    def record(value: Double, correlationContext: CorrelationContext, spanContext: SpanContext): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopCounterMetric")
  @js.native
  class NoopCounterMetric protected ()
    extends NoopMetric[BoundCounter]
       with Counter {
    def this(instrument: BoundCounter) = this()
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopMeter")
  @js.native
  class NoopMeter () extends Meter
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopMetric")
  @js.native
  class NoopMetric[T] protected () extends UnboundMetric[T] {
    def this(instrument: T) = this()
    
    val _instrument: js.Any = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopValueRecorderMetric")
  @js.native
  class NoopValueRecorderMetric protected ()
    extends NoopMetric[BoundValueRecorder]
       with ValueRecorder {
    def this(instrument: BoundValueRecorder) = this()
  }
}
