package typings.opentelemetryApi

import typings.opentelemetryApi.anon.Observer
import typings.opentelemetryApi.anon.Value
import typings.opentelemetryApi.boundInstrumentMod.BoundBaseObserver
import typings.opentelemetryApi.boundInstrumentMod.BoundCounter
import typings.opentelemetryApi.boundInstrumentMod.BoundValueRecorder
import typings.opentelemetryApi.correlationContextMod.CorrelationContext
import typings.opentelemetryApi.meterMod.Meter
import typings.opentelemetryApi.metricMod.BaseObserver
import typings.opentelemetryApi.metricMod.Counter
import typings.opentelemetryApi.metricMod.Labels
import typings.opentelemetryApi.metricMod.UnboundMetric
import typings.opentelemetryApi.metricMod.ValueRecorder
import typings.opentelemetryApi.spanContextMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    /**
      * Returns a Instrument associated with specified Labels.
      * It is recommended to keep a reference to the Instrument instead of always
      * calling this method for every operations.
      * @param labels key-values pairs that are associated with a specific metric
      *     that you want to record.
      */
    /* CompleteClass */
    override def bind(labels: Labels): BoundBaseObserver = js.native
    
    /**
      * Clears all bound instruments from the Metric.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    def observation(): Value = js.native
    /* CompleteClass */
    override def observation(value: Double): Observer = js.native
    
    /**
      * Removes the Instrument from the metric, if it is present.
      * @param labels key-values pairs that are associated with a specific metric.
      */
    /* CompleteClass */
    override def unbind(labels: Labels): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopBatchObserverMetric")
  @js.native
  class NoopBatchObserverMetric protected () extends NoopMetric[Unit] {
    def this(instrument: Unit) = this()
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopBoundBaseObserver")
  @js.native
  class NoopBoundBaseObserver ()
    extends StObject
       with BoundBaseObserver {
    
    /* CompleteClass */
    override def update(value: Double): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopBoundCounter")
  @js.native
  class NoopBoundCounter ()
    extends StObject
       with BoundCounter {
    
    /**
      * Adds the given value to the current value. Values cannot be negative.
      * @param value the value to add.
      */
    /* CompleteClass */
    override def add(value: Double): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopBoundValueRecorder")
  @js.native
  class NoopBoundValueRecorder ()
    extends StObject
       with BoundValueRecorder {
    
    /**
      * Records the given value to this value recorder.
      * @param value to record.
      */
    /* CompleteClass */
    override def record(value: Double): Unit = js.native
    def record(value: Double, correlationContext: Unit, spanContext: SpanContext): Unit = js.native
    def record(value: Double, correlationContext: CorrelationContext): Unit = js.native
    def record(value: Double, correlationContext: CorrelationContext, spanContext: SpanContext): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopCounterMetric")
  @js.native
  class NoopCounterMetric protected ()
    extends NoopMetric[BoundCounter]
       with Counter {
    def this(instrument: BoundCounter) = this()
    
    /**
      * Returns a Instrument associated with specified Labels.
      * It is recommended to keep a reference to the Instrument instead of always
      * calling this method for every operations.
      * @param labels key-values pairs that are associated with a specific metric
      *     that you want to record.
      */
    /* CompleteClass */
    override def bind(labels: Labels): BoundCounter = js.native
    
    /**
      * Clears all bound instruments from the Metric.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Removes the Instrument from the metric, if it is present.
      * @param labels key-values pairs that are associated with a specific metric.
      */
    /* CompleteClass */
    override def unbind(labels: Labels): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopMeter")
  @js.native
  class NoopMeter ()
    extends StObject
       with Meter
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopMetric")
  @js.native
  class NoopMetric[T] protected ()
    extends StObject
       with UnboundMetric[T] {
    def this(instrument: T) = this()
    
    /* private */ val _instrument: js.Any = js.native
    
    /**
      * Returns a Instrument associated with specified Labels.
      * It is recommended to keep a reference to the Instrument instead of always
      * calling this method for every operations.
      * @param labels key-values pairs that are associated with a specific metric
      *     that you want to record.
      */
    /* CompleteClass */
    override def bind(labels: Labels): T = js.native
    
    /**
      * Clears all bound instruments from the Metric.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Removes the Instrument from the metric, if it is present.
      * @param labels key-values pairs that are associated with a specific metric.
      */
    /* CompleteClass */
    override def unbind(labels: Labels): Unit = js.native
  }
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeter", "NoopValueRecorderMetric")
  @js.native
  class NoopValueRecorderMetric protected ()
    extends NoopMetric[BoundValueRecorder]
       with ValueRecorder {
    def this(instrument: BoundValueRecorder) = this()
    
    /**
      * Returns a Instrument associated with specified Labels.
      * It is recommended to keep a reference to the Instrument instead of always
      * calling this method for every operations.
      * @param labels key-values pairs that are associated with a specific metric
      *     that you want to record.
      */
    /* CompleteClass */
    override def bind(labels: Labels): BoundValueRecorder = js.native
    
    /**
      * Clears all bound instruments from the Metric.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Removes the Instrument from the metric, if it is present.
      * @param labels key-values pairs that are associated with a specific metric.
      */
    /* CompleteClass */
    override def unbind(labels: Labels): Unit = js.native
  }
}
