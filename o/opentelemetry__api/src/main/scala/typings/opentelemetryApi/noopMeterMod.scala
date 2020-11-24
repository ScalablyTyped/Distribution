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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", JSImport.Namespace)
@js.native
object noopMeterMod extends js.Object {
  
  val NOOP_BATCH_OBSERVER_METRIC: NoopBatchObserverMetric = js.native
  
  val NOOP_BOUND_BASE_OBSERVER: NoopBoundBaseObserver = js.native
  
  val NOOP_BOUND_COUNTER: NoopBoundCounter = js.native
  
  val NOOP_BOUND_VALUE_RECORDER: NoopBoundValueRecorder = js.native
  
  val NOOP_COUNTER_METRIC: NoopCounterMetric = js.native
  
  val NOOP_METER: NoopMeter = js.native
  
  val NOOP_SUM_OBSERVER_METRIC: NoopBaseObserverMetric = js.native
  
  val NOOP_UP_DOWN_SUM_OBSERVER_METRIC: NoopBaseObserverMetric = js.native
  
  val NOOP_VALUE_OBSERVER_METRIC: NoopBaseObserverMetric = js.native
  
  val NOOP_VALUE_RECORDER_METRIC: NoopValueRecorderMetric = js.native
  
  @js.native
  class NoopBaseObserverMetric ()
    extends NoopMetric[BoundBaseObserver]
       with BaseObserver {
    
    def observation(): Value = js.native
  }
  
  @js.native
  class NoopBatchObserverMetric () extends NoopMetric[Unit]
  
  @js.native
  class NoopBoundBaseObserver () extends BoundBaseObserver
  
  @js.native
  class NoopBoundCounter () extends BoundCounter
  
  @js.native
  class NoopBoundValueRecorder () extends BoundValueRecorder {
    
    def record(value: Double, correlationContext: js.UndefOr[scala.Nothing], spanContext: SpanContext): Unit = js.native
    def record(value: Double, correlationContext: CorrelationContext): Unit = js.native
    def record(value: Double, correlationContext: CorrelationContext, spanContext: SpanContext): Unit = js.native
  }
  
  @js.native
  class NoopCounterMetric ()
    extends NoopMetric[BoundCounter]
       with Counter
  
  @js.native
  class NoopMeter () extends Meter
  
  @js.native
  class NoopMetric[T] protected () extends UnboundMetric[T] {
    def this(instrument: T) = this()
    
    val _instrument: js.Any = js.native
  }
  
  @js.native
  class NoopValueRecorderMetric ()
    extends NoopMetric[BoundValueRecorder]
       with ValueRecorder
}
